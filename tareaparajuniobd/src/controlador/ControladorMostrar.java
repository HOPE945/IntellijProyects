
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.FrmMostrar;

// despues de crear la clase y hacer los implements importar los metodos abstractos 
public class ControladorMostrar implements ActionListener, WindowListener{

    FrmMostrar vMo = new FrmMostrar();
    PaisVO pvo =new PaisVO();
    PaisDAO pdao = new PaisDAO();

    public ControladorMostrar(FrmMostrar vMo, PaisVO pvo, PaisDAO pdao) {
        this.vMo = vMo;
        this.pvo = pvo;
        this.pdao = pdao;
        
        //escuchadores para boton y ventana
        vMo.btnCancelar.addActionListener(this);
        vMo.addWindowListener(this);
    }
    
    //meotodo que va a interactuar 
    private void mostrar() {
        DefaultTableModel m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        m.setColumnCount(0);
        //Estos son los encabezados de mi tabla pais
        m.addColumn("Id del País");
        m.addColumn("Nombre del País");
        m.addColumn("Capital del País");
        m.addColumn("Población del País");
        
        //este es de las filas
       //aqui fue donde me dio error
        for(PaisVO pvo : pdao.consultar()){
            m.addRow(new Object[]{pvo.getIdPais(), pvo.getNombrePais(), 
                pvo.getCapitalPais(), pvo.getPoblacionPais() });
        }
       
        //definiendo medidas de las columnas
        vMo.tblMostrar.setModel(m);
        TableColumn cCero = vMo.tblMostrar.getColumnModel().getColumn(0);
        cCero.setMaxWidth(75);
        cCero.setMinWidth(75);
        
        TableColumn cUno = vMo.tblMostrar.getColumnModel().getColumn(1);
        cUno.setMaxWidth(145);
        cUno.setMinWidth(145);
        
        TableColumn cDos = vMo.tblMostrar.getColumnModel().getColumn(2);
        cDos.setMaxWidth(150);
        cDos.setMinWidth(145);
        
        TableColumn cTres = vMo.tblMostrar.getColumnModel().getColumn(3);
        cTres.setMaxWidth(150);
        cTres.setMinWidth(150);
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vMo.btnCancelar){
            vMo.dispose();
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
       this.mostrar();
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
