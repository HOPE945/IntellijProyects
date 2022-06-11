package modelo;
// aqui es donde ya se interactua con codigo java y sql :)
import conexion.Conector;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.sql.ResultSet;
//paso 1 realizar el implements de la interfaz
//cuando se crea el override ya esta ligada la clase a la cosulta
//aqui se define el acceso a los datos
public class PaisDAO implements ConsultasPais{
    //para realizar cualquier accion que se refleje tengo que hacer la conexion
    //entonces yo me jalo a la clase conector
    @Override
    public boolean insertar(PaisVO p) {
        //paso 2 declaro el objeto de la clase conector
        Conector c = new Conector();        
        //3. recordarme que esto puede dar algun error entonces va dentro de un try para capturar los errores
        try {            
            //4. declaro una variable que voy a nombrar query tengo que ser cuidadosa porque aqui no hay lugar a equivocaciones
            c.conectar();
            String query = "INSERT INTO pais(nombre_pais, "
                    +"capital_pais, poblacion_pais, fecha_ingreso_pais)"
                    + "VALUES ('"+p.getNombrePais()+"', '"+p.getCapitalPais()+"',"
                    + p.getPoblacionPais()+", '"+p.getFechaIngPais()+"')";

            c.consultasMultiples(query);                                       
                    
        } catch (Exception e) {
            System.err.println("Error[MInsert]");
            c.desconectar();
            return false;
        }
       c.desconectar();      
        return true;        
    }

    @Override
    public ArrayList<PaisVO> consultar() {
        Conector c = new Conector();
        ArrayList<PaisVO> info = new ArrayList();
        //todo lo que que retorna info lo mejor en un try catch
        try {
            c.conectar();
            String query =("SELECT " 
                    + "p.id_pais, "
                    + "p.nombre_pais, " 
                    +"p.capital_pais, "
                    + "p.poblacion_pais, "
                    + "p.fecha_ingreso_pais "
                    + " FROM bdconector.pais p ");
        ResultSet rs = c.consultaDatos(query);
        while(rs.next()){
            PaisVO pvo = new PaisVO();
            pvo.setIdPais(rs.getInt(1));
            pvo.setNombrePais(rs.getString(2));
            pvo.setCapitalPais(rs.getString(3));
            pvo.setPoblacionPais(rs.getLong(4));
            pvo.setFechaIngPais(rs.getString(5));
            
            //este es el que permite llenar nuevos datos
            info.add(pvo);
        }
        } catch (Exception e) {            
            System.err.println("Error[Mmostrar]: " + e.getMessage());
            c.desconectar();
        }        
        return info;
    }

    @Override
    public boolean actualizar(PaisVO p) {
        Conector c = new Conector();        
        try {        
            c.conectar();
            String query = "UPDATE bdconector.pais " +
                     "SET nombre_pais = '"+p.getNombrePais()+"', "
                    +"capital_pais = '"+p.getCapitalPais()+"', "
                    +"poblacion_pais = '"+p.getPoblacionPais()+"', "                    
                    +"fecha_actualiza_pais ='"+p.getFechaActPais()+"' "
                    +"WHERE id_pais = "+p.getIdPais();            
            c.consultasMultiples(query);  
        } catch (Exception e) {
            System.err.println("Error[MActualizar]: " + e.getMessage());
            c.desconectar();
            return false;             
        }     
        c.desconectar();
        return true;        
    }

    @Override
    public boolean eliminar(PaisVO p) {
        Conector c = new Conector();        
        try {
        c.conectar();
        String query = "DELETE bdconector.pais "
                + "WHERE id_pais = "+p.getIdPais();
        c.consultasMultiples(query);
        } catch (Exception e) {
            System.err.println("Error[Mliminar]: " + e.getMessage());
        }        
         return true;
    }
    
}
