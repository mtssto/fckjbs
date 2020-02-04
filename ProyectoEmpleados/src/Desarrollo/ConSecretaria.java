
package Desarrollo;
import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class ConSecretaria 
{

    private String CdEmp;
    private String Nom;
    private char Sexo;
    private double Sueldo;
    private double Comi;
    private String Cargo;
    private String CdJefe;
    private String CdDepto;        
    
    
    public ConSecretaria() {
    }
   
    /***********************************/
    
    DefaultTableModel Tabla; 

    String [][] Filas = {};
    String [] NomCol = {"Nombre","Código de Empleado","Sexo", "Sueldo", "Comisión", "Cargo", "Código de Jefe", "Código de Departamento"}; 
       
    String MostrarSql = "SELECT Nom, CdEmp, Sex, Salario, Comision, Cargo, Codjefe, Departamento_CodDepto FROM empleados WHERE Cargo = 'SECRETARIA' ORDER BY Nom;";
        
    PreparedStatement Instruccion;    
    ResultSet Muestra;
    Conexion Con = new Conexion();
 
    public void setCdEmp(String CdEmp) {
        this.CdEmp = CdEmp;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public void setComi(double Comi) {
        this.Comi = Comi;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public void setCdJefe(String CdJefe) {
        this.CdJefe = CdJefe;
    }

    public void setCdDepto(String CdDepto) {
        this.CdDepto = CdDepto;
    }

    public String getCdEmp() {
        return CdEmp;
    }

    public String getNom() {
        return Nom;
    }

    public char getSexo() {
        return Sexo;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public double getComi() {
        return Comi;
    }

    public String getCargo() {
        return Cargo;
    }

    public String getCdJefe() {
        return CdJefe;
    }

    public String getCdDepto() {
        return CdDepto;
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
                this.setCdEmp(Muestra.getString(2));
                this.setSexo(Muestra.getString(3).charAt(0));
                this.setSueldo(Muestra.getDouble(4));
                this.setComi(Muestra.getDouble(5));
                this.setCargo(Muestra.getString(6));
                this.setCdJefe(Muestra.getString(7));
                this.setCdDepto(Muestra.getString(8));

                String [] VecTabla = {this.getNom(), this.getCdEmp(), String.valueOf(this.getSexo()), String.valueOf(this.getSueldo()), String.valueOf(this.getComi()), this.getCargo(), this.getCdJefe(), this.getCdDepto()};
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
