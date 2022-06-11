package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.FrmActualizar;
import vista.FrmEliminar;

import vista.FrmInsertar;
import vista.FrmMenu;
import vista.FrmMostrar;

public class ControladorMenu implements ActionListener {
    //1. Añadir todas mis pantallas aqui
    FrmMenu vMe = new FrmMenu();
    FrmInsertar vIn = new FrmInsertar();
    FrmMostrar vMo = new FrmMostrar();
    FrmActualizar vAct = new FrmActualizar();
    FrmEliminar vEli = new FrmEliminar();
   
    
    
//2. tambien añadir la nueva pantalla aqui
    public ControladorMenu(FrmMenu vMe, FrmInsertar vIn, FrmMostrar vMo, FrmActualizar vAct, FrmEliminar vEli) {
       this.vMe = vMe;
       this.vIn = vIn;
       this.vMo = vMo;
       this.vAct = vAct;
       this.vEli = vEli; 
       
              
        //3. accion a los botones del menu
        vMe.btnInsertar.addActionListener(this);
        vMe.btnMostrar.addActionListener(this);
        vMe.btnActualizar.addActionListener(this);
        vMe.btnEliminar.addActionListener(this);
     }
       
//4. agregarlo 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.vMe.btnInsertar){
            this.vIn.setVisible(true);
            this.vIn.setLocationRelativeTo(vMe);
            this.vIn.setResizable(false);
        }
        
        if(e.getSource() == this.vMe.btnMostrar){
            this.vMo.setVisible(true);
            this.vMo.setLocationRelativeTo(vMe);
            this.vMo.setResizable(false);
        } 
        
         if(e.getSource() == this.vMe.btnActualizar){
            this.vAct.setVisible(true);
            this.vAct.setLocationRelativeTo(vMe);
            this.vAct.setResizable(false);
        } 
        
         if(e.getSource() == this.vMe.btnEliminar){
            this.vEli.setVisible(true);
            this.vEli.setLocationRelativeTo(vMe);
            this.vEli.setResizable(false);
        } 
        
        
        
    }

}