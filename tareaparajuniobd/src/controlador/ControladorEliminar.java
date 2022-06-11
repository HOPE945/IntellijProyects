
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.DefaultButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.FrmEliminar;


public class ControladorEliminar implements WindowListener, MouseListener{
    FrmEliminar vEli = new FrmEliminar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();
    
    public ControladorEliminar(FrmEliminar vEli, PaisVO pvo, PaisDAO pdao){
    this.vEli = vEli;
    this.pvo = pvo;
    this.pdao = pdao;
    
    vEli.addWindowListener(this);
    vEli.tblEliminar.addMouseListener(this);
    }
    
    private void mostrar(){
        DefaultTableModel m = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column){
        return false;
        }
    };
        m.setColumnCount(0);
        m.addColumn("Id del País");
        m.addColumn("Nombre del País");
        m.addColumn("Capital del País");
        m.addColumn("Población del País");
        
        for (PaisVO pvo: pdao.consultar()){
        m.addRow(new Object[]{
            pvo.getIdPais(),
            pvo.getNombrePais(),
            pvo.getCapitalPais(),
            pvo.getPoblacionPais()});
        } 
        vEli.tblEliminar.setModel(m);
    }
    
    private void setDatosEliminar(){
     int selecRow, selecCol;        
        selecRow = vEli.tblEliminar.getSelectedRow();
        pvo.setIdPais(Integer.parseInt(String.valueOf(vEli.tblEliminar.getValueAt(selecRow, 0))));
        int idPais = vEli.jopEliminar.showConfirmDialog(
                vEli, "Esta a punto de eliminar el ID  "
               +vEli.tblEliminar.getValueAt(selecRow, 0)+" Los datos se perderan ¿Esta seguro? ");
        if(idPais == vEli.jopEliminar.YES_OPTION){
        this.eliminar();
        vEli.jopEliminar.showMessageDialog(vEli, "Pais eliminado correctamente");
        }else{
        vEli.jopEliminar.showMessageDialog(vEli, "No se eliminado ningun dato");
        }
    }
    
    private void eliminar(){
    pvo.getIdPais();
    pdao.eliminar(pvo);
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
    this.mostrar();
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

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getClickCount() == 2){
        this.setDatosEliminar();
        
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
    
}
