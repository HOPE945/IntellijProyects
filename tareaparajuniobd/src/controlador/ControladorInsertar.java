package controlador;
//todas las importaciones revisarlas que esten todas
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import modelo.Extras;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.FrmInsertar;

public class ControladorInsertar implements ActionListener{
//creacion de obejetos que voy autilizar
    FrmInsertar vIn = new  FrmInsertar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new  PaisDAO();
    
//aqui defino la interaccion que va a tener la vista con la logica ya estan unidas
    public ControladorInsertar(FrmInsertar vIn, PaisVO pvo, PaisDAO pdao) {
   this.vIn = vIn;
   this.pvo= pvo;
   this.pdao = pdao;
   
   vIn.btnRgistrar.addActionListener(this);
   vIn.btnCancelarRegistro.addActionListener(this);
    }
      //cracion de mis metodos del lado del controlador
    private void registrarPais(){
        //utilizar los metodos set 
        pvo.setNombrePais(vIn.txtNombrePais.getText());
        pvo.setCapitalPais(vIn.txtCapital.getText());
        pvo.setPoblacionPais(Long.parseLong(this.vIn.txtPoblacion.getText()));
        pvo.setFechaIngPais(Extras.fechaHoy());       
        if(pdao.insertar(pvo) == true){
            vIn.jopMensaje.showMessageDialog(vIn, "Datos registrados correctamente");
            this.vIn.txtNombrePais.setText("");
            this.vIn.txtCapital.setText("");
            this.vIn.txtPoblacion.setText("");
        }
        else{
        vIn.jopMensaje.showMessageDialog(vIn,"Error, no fue posible iregistrar los datos");
        this.vIn.txtNombrePais.setText("");
        this.vIn.txtCapital.setText("");
        this.vIn.txtPoblacion.setText("");
        }
    } 
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == vIn.btnRgistrar){
           if(!this.vIn.txtNombrePais.getText().equals("")&&
                !this.vIn.txtCapital.getText().equals("")&&
                !this.vIn.txtNombrePais.getText().equals("")){           
       this.registrarPais();
       }
           else{
           this.vIn.jopMensaje.showMessageDialog(vIn, "Debe llenar todos los campos");
           }
       }
       if(e.getSource() == vIn.btnCancelarRegistro){
       vIn.dispose();
       }
        
    }
    
}
