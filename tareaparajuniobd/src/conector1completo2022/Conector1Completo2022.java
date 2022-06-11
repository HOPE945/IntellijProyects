package conector1completo2022;

import conexion.Conector;
import controlador.ControladorActualizar;
import controlador.ControladorEliminar;
import controlador.ControladorInsertar;
import controlador.ControladorMenu;
import controlador.ControladorMostrar;
import modelo.Extras;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.FrmActualizar;
import vista.FrmEliminar;
import vista.FrmInsertar;
import vista.FrmMenu;
import vista.FrmMostrar;


public class Conector1Completo2022 {

    public static void main(String[] args) {
        // TODO code application logic here
        //creando el metodo conector para importar la clase conecction
        Conector c = new Conector();
        c.conectar();        
        
        // prueba de conexion        
        //Conector cn = new Conector();
        
        //Vistas
        FrmMenu fm = new FrmMenu();
        FrmInsertar fi = new FrmInsertar();
        FrmMostrar fmo = new FrmMostrar();
        FrmActualizar fma = new FrmActualizar();
        FrmEliminar fme = new FrmEliminar();
        
        //modelo
        PaisVO pvo = new PaisVO();
        PaisDAO pdao = new PaisDAO();
        Extras ex = new Extras();
        
        

        //controladores
        //1. controlador de menu
        ControladorMenu cm = new ControladorMenu(fm, fi, fmo, fma, fme);
        //2. controlador de insertar
        ControladorInsertar ci = new ControladorInsertar(fi, pvo, pdao);
        //3. controlador de mostrar
        ControladorMostrar cmo = new ControladorMostrar(fmo, pvo, pdao);
        //4. controlador de actualizar
        ControladorActualizar ca = new ControladorActualizar(fma, pvo, pdao);
        //5. controlador de eliminar
        ControladorEliminar celi = new ControladorEliminar(fme, pvo, pdao);
        
        
        
        // menu        
        fm.setVisible(true);
        fm.setLocationRelativeTo(null);
        fm.setResizable(false);

    }

}
