
package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConVarias 
{
    private int NroForm;
    private String NomDepto;
    private String NomEmple;
    private double Salario;
    private double Comision;
    private double MaxSal; //Salario maximo
    private double MinSal; //Salario minimo
    private double DifSal; //Diferencia de Salario
    private String CodJefe; //Codigo del Jefe
    private int CtdEmp; //Cantidad de empleados
    
    DefaultTableModel ObjTabla;
    PreparedStatement Instruccion;
    ResultSet Muestra;
    
    Conexion Con = new Conexion();
    String [][] Filas = {};
    String [] NomCol = {""};
    String [] VecTabla = {};
    
    //Constructor
    public ConVarias(int NroForm) {
        this.NroForm = NroForm;
    }

    
    //Metodos GET y SET
    public double getDifSal() {
        return DifSal;
    }
    public void setDifSal(double DifSal) {
        this.DifSal = DifSal;
    }
    public String getNomDepto() {
        return NomDepto;
    }
    public void setNomDepto(String NomDepto) {
        this.NomDepto = NomDepto;
    }
    public String getNomEmple() {
        return NomEmple;
    }
    public void setNomEmple(String NomEmple) {
        this.NomEmple = NomEmple;
    }
    public double getSalario() {
        return Salario;
    }
    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    public double getComision() {
        return Comision;
    }
    public void setComision(double Comision) {
        this.Comision = Comision;
    }
    public double getMaxSal() {
        return MaxSal;
    }
    public void setMaxSal(double MaxSal) {
        this.MaxSal = MaxSal;
    }
    public double getMinSal() {
        return MinSal;
    }
    public void setMinSal(double MinSal) {
        this.MinSal = MinSal;
    }
    public String getCodJefe() {
        return CodJefe;
    }
    public void setCodJefe(String CodJefe) {
        this.CodJefe = CodJefe;
    }
    public int getCtdEmp() {
        return CtdEmp;
    }
    public void setCtdEmp(int CtdEmp) {
        this.CtdEmp = CtdEmp;
    }
    
    
    String MostrarSql = "";
    String Sql1 = "SELECT Nom FROM departamento WHERE Nom NOT IN ('FACTURACION', 'RECEPCION', 'COMERCIO EXTERIOR');";
    String Sql2 = "SELECT Nom FROM empleados WHERE length(Nom) = 6;";
    String Sql3 = "SELECT Nom FROM empleados WHERE length(Nom) >= 5;";
    String Sql4 = "SELECT Nom, Salario, Comision FROM empleados WHERE (Salario = Comision/2);";
    String Sql5 = "SELECT Nom FROM empleados ORDER BY CdEmp DESC LIMIT 1,5;";
    String Sql6 = "SELECT  Max(Salario), Min(Salario), Max(Salario) - Min(Salario) FROM empleados;";
    String Sql7 = "SELECT Codjefe, Count(CdEmp) FROM empleados GROUP BY(Codjefe) HAVING COUNT(CdEmp) > 6 ORDER BY Codjefe;";
    
    
    public DefaultTableModel Titulos()
    {
        ObjTabla = new DefaultTableModel(Filas, SeleccionTitulo(this.NroForm));
        return ObjTabla;
    }
    
    private String SeleccionaSql(int NroEjercicio)
    {
        switch(NroEjercicio)
        {
            case 1:
            {
                MostrarSql = Sql1;
                break;
            }
            case 2:
            {
                MostrarSql = Sql2;
                break;
            }
            case 3:
            {
                MostrarSql = Sql3;
                break;
            }
            case 4:
            {
                MostrarSql = Sql4;
                break;
            }
            case 5:
            {
                MostrarSql = Sql5;
                break;
            }
            case 6:
            {
                MostrarSql = Sql6;
                break;
            }
            case 7:
            {
                MostrarSql = Sql7;
                break;
            }
            default:
            {
                JOptionPane.showMessageDialog(null, "Error!!");
                return null;
            }
        }
        return MostrarSql;
    }
    
    //Escolhe os nomes das colunas das tabelas dependendendo da consulta.
    private String [] SeleccionTitulo(int NroFormulario)
    {
        switch(NroFormulario)
        {
            case 1:
            {
                String [] NomCol1 = {"Nombre del Departamento"};
                NomCol = NomCol1;
                break;
            }
            case 2:
            {
                String [] NomCol2 = {"Nombre del Empleado"};
                NomCol = NomCol2;
                break;
            }
            case 3:
            {
                String [] NomCol3 = {"Nombre del Empleado"};
                NomCol = NomCol3;
                break;
            }
            case 4:
            {
                String [] NomCol4 = {"Nombre del Empleado", "Salario", "Comisión"};
                NomCol = NomCol4;
                break;
            }
            case 5:
            {
                String [] NomCol5 = {"Nombre del Empleado"};
                NomCol = NomCol5;
                break;
            }
            case 6:
            {
                String [] NomCol6 = {"Máximo", "Mínimo", "Diferencia"};
                NomCol = NomCol6;
                break;
            }
            case 7:
            {
                String [] NomCol7 = {"Codigo de Jefe", "Cantidad de Empleados"};
                NomCol = NomCol7;
                break;
            }
            default:
            {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        return NomCol;
    }
    
    public DefaultTableModel Mostra()
    {
        try
        {
            Instruccion = Con.Conectado().prepareStatement(SeleccionaSql(NroForm));
            Muestra = Instruccion.executeQuery();
            
            while(Muestra.next())
            {
                switch(this.NroForm)
                {
                    case 1: //ok
                    {
                        this.setNomDepto(Muestra.getString(1));
                        String [] Datos = {this.getNomDepto()}; 
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    case 2: //ok
                    {
                        this.setNomEmple(Muestra.getString(1));
                        String [] Datos = {this.getNomEmple()};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    case 3: //ok
                    {
                        this.setNomEmple(Muestra.getString(1));
                        String [] Datos = {this.getNomEmple()};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    case 4: //ok
                    {
                        this.setNomEmple(Muestra.getString(1));
                        this.setSalario(Muestra.getDouble(2));
                        this.setComision(Muestra.getDouble(3));
                        String [] Datos = {this.getNomEmple(), String.valueOf(this.getSalario()), String.valueOf(this.getComision())};
                        ObjTabla.addRow(Datos); 
                        break;
                    }
                    
                    case 5: //incompleto.
                    {
                        this.setNomEmple(Muestra.getString(1));
                        String [] Datos = {this.getNomEmple()};
                        ObjTabla.addRow(Datos); 
                        break;
                    }
                    
                    case 6: //ok
                    {
                        this.setMaxSal(Muestra.getDouble(1));
                        this.setMinSal(Muestra.getDouble(2));
                        this.setDifSal(Muestra.getDouble(3));
                        String [] Datos = {String.valueOf(this.getMaxSal()),String.valueOf(this.getMinSal()),String.valueOf(this.getDifSal())};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    case 7: //ok
                    {
                        this.setCodJefe(Muestra.getString(1));
                        this.setCtdEmp(Muestra.getInt(2));
                        String [] Datos = {this.getCodJefe(), String.valueOf(this.getCtdEmp())};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                
                    default:
                        JOptionPane.showMessageDialog(null, "Error.");
                }//Fim Switch
            } //Fim While
        }// Fim Try
        
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error : "+e);
        }   
        
        return ObjTabla;
    }
    
}
