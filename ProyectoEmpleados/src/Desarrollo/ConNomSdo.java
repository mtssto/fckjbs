
package Desarrollo;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class ConNomSdo 
{
    private String Nom;
    private double Sdo;
    
    
    public ConNomSdo() {
    }
    
   /***********************************/
    
    DefaultTableModel Tabla; 

    String [][] Filas = {};
    String [] NomCol = {"Nombre", "Salario"}; 
        
    String MostrarSql = "select Nom,Salario from empleados;";
     
    PreparedStatement Instruccion;    
    ResultSet Muestra;
    Conexion Con = new Conexion();

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setSdo(double Sdo) {
        this.Sdo = Sdo;
    }

    public String getNom() {
        return Nom;
    }

    public double getSdo() {
        return Sdo;
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
                this.setSdo(Muestra.getDouble(2));
                String [] VecTabla = {this.getNom(),String.valueOf(this.getSdo())};
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
