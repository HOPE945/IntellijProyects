package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.event.MenuDragMouseListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.Extras;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.FrmActualizar;

public class ControladorActualizar implements ActionListener, MouseListener, WindowListener {

    FrmActualizar vAct = new FrmActualizar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();
    Extras ext = new Extras(); //

    //
    public ControladorActualizar(FrmActualizar vAct, PaisVO pvo, PaisDAO pdao) {
        this.vAct = vAct;
        this.pvo = pvo;
        this.pdao = pdao;

        //accion 
        vAct.btnActualizarIPais.addActionListener(this);
        vAct.addWindowListener(this);
        vAct.tblActualizar.addMouseListener(this);

    }

    private void mostrar() {
        DefaultTableModel m = new DefaultTableModel() {
//isCellEditable es para que no se puedan editas la f y c 
//tambien se puede hacer facil en el custom code, pero se rompe la logica          
//solo empiezo a escribir isCell y se me crea todo ;)
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
       //lo que agregue aqui es lo que muestra mi tabla
        m.setColumnCount(0);
        m.addColumn("Id del País");
        m.addColumn("Nombre del País");
        m.addColumn("Capital del País");
        m.addColumn("Población del País"); 
        m.addColumn("Fecha ingreso del Pais");
        m.addColumn("Fecha actualizacion pais");
        
            
        for (PaisVO pvo : pdao.consultar()) {
            m.addRow(new Object[]{
                pvo.getIdPais(), 
                pvo.getNombrePais(), 
                pvo.getCapitalPais(), 
                pvo.getPoblacionPais(), 
                pvo.getFechaIngPais(),
                pvo.getFechaActPais()});
       
        }        
         vAct.tblActualizar.setModel(m);
         
         
    }    
        //getSelectedRow 
    private void setDatosPais() {
        //capturando los datos de la tabla
        int selecRow, selecCol;        
        selecRow = vAct.tblActualizar.getSelectedRow();      
        vAct.txtIdActualizarPais.setText(String.valueOf(vAct.tblActualizar.getValueAt(selecRow , 0)));
        vAct.txtActualizarNombrePais.setText(String.valueOf(vAct.tblActualizar.getValueAt(selecRow, 1)));
        vAct.txtCapitalPaisActualizar.setText(String.valueOf(vAct.tblActualizar.getValueAt(selecRow, 2)));
        vAct.txtPoblacionActualizar.setText(String.valueOf(vAct.tblActualizar.getValueAt(selecRow, 3)));        
        //intentos por mostrar la fecha ingreso ya
        pvo.setFechaIngPais(String.valueOf(vAct.tblActualizar.getValueAt(selecRow, 4)));  
        //fecha actualizacion YA
        pvo.setFechaActPais(Extras.fechaHoy());
       
    }
     
    private void actualizar(){
    pvo.setIdPais(Integer.parseInt(vAct.txtIdActualizarPais.getText()));
    pvo.setNombrePais(vAct.txtActualizarNombrePais.getText());
    pvo.setCapitalPais(vAct.txtCapitalPaisActualizar.getText());
    pvo.setPoblacionPais(Long.parseLong(vAct.txtPoblacionActualizar.getText()));
    pvo.getFechaIngPais();
    pvo.getFechaActPais();
    
    if(pdao.actualizar(pvo) == true) {
        vAct.jOpActualizar.showMessageDialog(vAct, "Datos actualizados correctamente");
        vAct.txtActualizarNombrePais.setText("");
        vAct.txtCapitalPaisActualizar.setText("");
        vAct.txtPoblacionActualizar.setText("");
        pvo.getFechaIngPais();       
         pdao.actualizar(pvo);
       
    } else{
    vAct.jOpActualizar.showMessageDialog(vAct, "Error no se ha realizado la actualizacion ");
        vAct.txtActualizarNombrePais.setText("");
        vAct.txtCapitalPaisActualizar.setText("");
        vAct.txtPoblacionActualizar.setText("");
        
        
    }
    
    }
   
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vAct.btnActualizarIPais)) {
            if(!vAct.txtIdActualizarPais.getText().equals(" ")){
            this.actualizar();  
            this.mostrar();
            }else{
            vAct.jOpActualizar.showMessageDialog(vAct, "Debe elegir un pais para actualizar");
        }
      } 

    }



    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
           this.setDatosPais();
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {
        this.mostrar();
    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

}
