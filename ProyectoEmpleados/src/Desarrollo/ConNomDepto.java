
package Desarrollo;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class ConNomDepto 
{
    private String Nom;
    
    public ConNomDepto() {
    }
    
     /***********************************/
    
    DefaultTableModel Tabla; 

    String [][] Filas = {};
    String [] NomCol = {"Nombre del departamento"}; 
      
    String MostrarSql = "select Nom from departamento;";
    
    
    PreparedStatement Instruccion;    
    ResultSet Muestra;
    Conexion Con = new Conexion();

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getNom() {
        return Nom;
    }
    
    
    
    public DefaultTableModel Titulos() 
    {
       Tabla = new DefaultTableModel(Filas, NomCol);
       return Tabla;
    }
   public DefaultTableModel Muestra()
    {
        try 
        {
            Instruccion = Con.Conectado().prepareStatement(MostrarSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next()) 
            {
                this.setNom(Muestra.getString(1));
                String [] VecTabla = {this.getNom()};
                Tabla.addRow(VecTabla); 
            }
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos" + e);
        }
        return Tabla;
   }     
      
}
