package Bdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion 
{
    private final String NomBdd = "jdbc:mysql://Localhost/empresa";
    private final String Clave = "";
    private final String User = "root";
    
    private final String Driver = "com.mysql.jdbc.Driver";
    protected Connection Conectar = null;
    
    public Conexion() 
    {
        try 
        {
          Class.forName(Driver);
          Conectar = DriverManager.getConnection(NomBdd, User, Clave);
          /*           if (Conectar  != null) 
            {
                JOptionPane.showMessageDialog(null, "Conexión Satisfactoria");
            }
   */ 
        } 
        catch (ClassNotFoundException | SQLException  e) 
        {
            JOptionPane.showMessageDialog(null, "error, no se conectó a la bdd" + e);
        }
    }
    
    public Connection Conectado()
    {
        return Conectar;
    }
    
    public void Desconectar()
    {
       Conectar = null;
        if (Conectar == null) 
        {
            JOptionPane.showMessageDialog(null, "Desconectando");
        }
    }
}
