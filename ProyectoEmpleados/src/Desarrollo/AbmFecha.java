
package Desarrollo;

import Bdd.Conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class AbmFecha 
{
    private Date FNac;

    private String AltaSql = "INSERT INTO EjemploFecha (FechaNac) VALUES (?);";
 
    Conexion Con = new Conexion();
    private PreparedStatement Instruccion;
    
    public AbmFecha(Date FNac) {
        this.FNac = FNac;
    }

    public Date getFNac() {
        return FNac;
    }
    
    public void Alta()
    {
        try 
        {
            Instruccion = Con.Conectado().prepareStatement(AltaSql);
            Instruccion.setDate(1, this.getFNac());
            int Registro = Instruccion.executeUpdate();
            if (Registro > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro guardado correctamente");
                
            }
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "El Registro no pudo ser guardado" + e); 
        }         
    }
}
