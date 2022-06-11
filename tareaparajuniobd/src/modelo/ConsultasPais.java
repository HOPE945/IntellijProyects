//esta es mi interface para consultas pais
package modelo;

//aca creo los metodos que me van a servir para hacer la insersion 

import java.util.ArrayList;

//importante que solo son las cabeceras 
public interface ConsultasPais {
    //voy a insertar los datos a la tabla entonces la clase que representa
    //esos campos entonces me traigo el VO porque alli estan los metodos publicos que son los get and set
   //la p que esta despues de PaisVO es el alias
    public boolean insertar(PaisVO p); 
    public ArrayList<PaisVO> consultar();  
    //acualizar
    public boolean actualizar(PaisVO p);
    //eliminar
    public boolean eliminar(PaisVO p);
    
}
