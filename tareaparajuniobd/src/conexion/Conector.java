/*Esta es mi API de conexion, la puedo hacer en un paquete aparte 
o bien en controlador creo la Class de conexion ya es mi eleccion y como me 
acostumbre*/
package conexion;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Conector {

    //Aqui declaro las variables que se van a utilizar con respecto a la conexion
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String host = "127.0.0.1";  //aqui va la direccion del host, solo por esta vez use la ip de heidi
    private String user = "root";
    private String pass = ""; //aqui va la contraseña    
    private String db = "bdconector"; //nombre de la bd
    private String cadena;
//Declaracion de objetos para la conexion
    Connection connection;
    Statement statement;

//declaracion de metodos para la conexion
//metodo de conectar   
//este metodo es un path, o sea una ruta de nuestro tipo de conexio
    public void conectar() {
        this.cadena = "jdbc:mysql://" + this.host + "/" + this.db;
        //siempre la conexion va dentro de un try para que muestre los errores      
        try {
            Class.forName(this.driver).newInstance();
            this.connection = DriverManager.getConnection(this.cadena, this.user, this.pass);

        } catch (Exception e) {
            System.out.println("Error [MCon]:" + e.getMessage());
        }

    }

    //Metodo desconectar
    public void desconectar() {
        try {
            this.connection.close();
        } catch (Exception e) {
            System.err.println("Error[MDes]: " + e.getMessage());
        }
    }

    //Metodos para realizar los querys de INSERT, UPDATE, DELETE
    public int consultasMultiples(String query) {
        int resultado;
        try {
            this.conectar();
            this.statement = this.connection.createStatement();
            resultado = this.statement.executeUpdate(query);
        } catch (Exception e) {
            System.err.println("Error[MConsultasMultiples]: " + e.getMessage());
            return 0;
        }
        return resultado;
    }
    
     

    //Metodo para realizar consultas SELECT
    public ResultSet consultaDatos(String consulta) {
        try {
            this.conectar();
            ResultSet resultado = null;
            this.statement = this.connection.createStatement();
            resultado = (ResultSet) (Resultset) this.statement.executeQuery(consulta);
            return resultado;
        } catch (Exception e) {
            System.err.println("Error[MCD]: " + e.getMessage());
            return null;
        }

    }

}
