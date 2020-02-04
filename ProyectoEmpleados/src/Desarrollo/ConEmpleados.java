package Desarrollo;
import Bdd.Conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConEmpleados 
{
    //Atributos
    private String CdEmp;
    private String Nom;
    private char Sexo;
    private double Sueldo;
    private double Comi;
    private String Cargo;
    private String CodJefe;
    private String CodDepto;   
    
    private int NroForm; // Número do formulário.
    private double SalMas500;
    private double SalComi;
    private double SalMax;
    
    
    //Construtor que recebe o número do formulário de onde foi chamado.
    public ConEmpleados(int NroForm) {
        this.NroForm = NroForm;
    }

    //Métodos SET
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
    public void setSalMas500(double SalMas500) {
        this.SalMas500 = SalMas500;
    }
    public void setSalComi(double SalComi) {
        this.SalComi = SalComi;
    }
    public void setSalMax(double SalMax) {
        this.SalMax = SalMax;
    }

    
    //Métodos GET
    public String getCargo() {
        return Cargo;
    }
    public String getCodJefe() {
        return CodJefe;
    }
    public String getCodDepto() {
        return CodDepto;
    }
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
    public void setCodJefe(String CodJefe) {
        this.CodJefe = CodJefe;
    }
    public void setCodDepto(String CodDepto) {
        this.CodDepto = CodDepto;
    }
    public double getSalMas500() {
        return SalMas500;
    }
    public double getSalComi() {
        return SalComi;
    }
    public double getSalMax() {
        return SalMax;
    }
    
    
    
    DefaultTableModel ObjTabla;
    PreparedStatement Instruccion;
    ResultSet Muestra;
    String MostrarSql;
    
    String Sql1 = "SELECT Salario, Nom, Cargo FROM empleados ORDER BY Salario;";
    String Sql2 = "SELECT Salario, Comision FROM empleados WHERE Departamento_CodDepto = 'A405' ORDER BY Comision;";
    String Sql3 = "SELECT Nom, Comision FROM empleados;";
    String Sql4 = "SELECT Nom, (Salario+500) FROM empleados WHERE Departamento_CodDepto = 'A405' ORDER BY Nom;";
    String Sql5 = "SELECT Nom, Comision FROM empleados WHERE Comision > 500;";
    String Sql6 = "SELECT Nom, Comision, Salario FROM empleados WHERE Comision <= (Salario*0.3);";
    String Sql7 = "SELECT Salario, Comision, Nom FROM empleados WHERE CodJefe = 'D90' and Salario > 8000;";
    String Sql8 = "SELECT Nom, Cargo FROM empleados WHERE Nom regexp '^[C-D]' ORDER BY CARGO;";
    String Sql9 = "SELECT Salario, Comision, (Salario+Comision), cdEmp, Nom FROM empleados WHERE Comision > 500 ORDER BY NOM;"; //Comision > 500
    String Sql10 = "SELECT Salario, Comision, (Salario + Comision), cdEmp, Nom FROM empleados WHERE Comision < 100;"; //Sin Comision
    String Sql11 = "SELECT Nom, cdEmp FROM empleados WHERE Nom Not LIKE '%MA%';";
    String Sql12 = "SELECT MAX(Salario), Nom FROM empleados";
    String Sql13 = "SELECT Comision, cdEmp FROM empleados WHERE Comision > 100;";        
    
    Conexion Con = new Conexion();
    String [][] Filas = {};
    String [] NomCol = {""};
    String [] VecTabla = {};
    
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
            case 8:
            {
                MostrarSql = Sql8;
                break;
            }
            case 9:
            {
                MostrarSql = Sql9;
                break;
            }
            case 10:
            {
                MostrarSql = Sql10;
                break;
            }
            case 11:
            {
                MostrarSql = Sql11;
                break;
            }
            case 12:
            {
                MostrarSql = Sql12;
                break;
            }
            case 13:
            {
                MostrarSql = Sql13;
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
                String [] NomCol1 = {"Sueldo", "Nombre Empleado", "Cargo"};
                NomCol = NomCol1;
                break;
            }
            case 2:
            {
                String [] NomCol2 = {"Sueldo", "Comisión"};
                NomCol = NomCol2;
                break;
            }
            case 3:
            {
                String [] NomCol3 = {"Nombre", "Comisión"};
                NomCol = NomCol3;
                break;
            }
            case 4:
            {
                String [] NomCol4 = {"Nombre", "Salario + 500"};
                NomCol = NomCol4;
                break;
            }
            case 5:
            {
                String [] NomCol5 = {"Nombre","Comisión"};
                NomCol = NomCol5;
                break;
            }
            case 6:
            {
                String [] NomCol6 = {"Nombre", "Comisión", "Salario"};
                NomCol = NomCol6;
                break;
            }
            case 7:
            {
                String [] NomCol7 = {"Sueldo", "Comisión", "Nombre Empleado"};
                NomCol = NomCol7;
                break;
            }
            case 8:
            {
                String [] NomCol8 = {"Nombre", "Cargo"};
                NomCol = NomCol8;
                break;
            }
            
            case 9:
            {
                //Salario, Comision, Sueldo+Comision, cdEmp, Nom
                String [] NomCol9 = {"Sueldo", "Comisión","Sueldo + Comision", "Codigo Empleado", "Nombre"};
                NomCol = NomCol9;
                break;
            }
            case 10:
            {
                //
                String [] NomCol10 = {"Sueldo", "Comisión","Sueldo + Comision", "Codigo Empleado", "Nombre"};
                NomCol = NomCol10;
                break;
            }
            case 11:
            {
                String [] NomCol11 = {"Nombre", "Codigo Empleado"};
                NomCol = NomCol11;
                break;
            }
            case 12:
            {
                String [] NomCol12 = {"Salario Maximo", "Empleado"};
                NomCol = NomCol12;
                break;
            }
            case 13:
            {
                String [] NomCol13 = {"Comisión", "Codigo de Empleado"};
                NomCol = NomCol13;
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
    //private String [] SeleccionaLosGet(int NroFormulario)
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
                        this.setSueldo(Muestra.getDouble(1));
                        this.setNom(Muestra.getString(2));
                        this.setCargo(Muestra.getString(3));
                        String [] Datos = {String.valueOf(this.getSueldo()), this.getNom(), this.getCargo()}; 
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    case 2: //ok
                    {
                        this.setSueldo(Muestra.getDouble(1));
                        this.setComi(Muestra.getDouble(2));
                        String [] Datos = {String.valueOf(this.getSueldo()), String.valueOf(this.getComi())};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    case 3: //ok
                    {
                        this.setNom(Muestra.getString(1));
                        this.setComi(Muestra.getDouble(2));
                        String [] Datos = {this.getNom(), String.valueOf(this.getComi())};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    case 4: //ok
                    {
                        this.setNom(Muestra.getString(1));
                        this.setSalMas500(Muestra.getDouble(2));
                        String [] Datos = {this.getNom(), String.valueOf(this.getSalMas500())};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    case 5: //ok
                    {
                        this.setNom(Muestra.getString(1));
                        this.setComi(Muestra.getDouble(2));
                        String [] Datos = {this.getNom(), String.valueOf(this.getComi())};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    case 6: //ok
                    {
                        this.setNom(Muestra.getString(1));
                        this.setComi(Muestra.getDouble(2));
                        this.setSueldo(Muestra.getDouble(3));
                        String [] Datos = {this.getNom(), String.valueOf(this.getComi()), String.valueOf(this.getSueldo())};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    case 7: //ok
                    {
                        this.setSueldo(Muestra.getDouble(1));
                        this.setComi(Muestra.getDouble(2));
                        this.setNom(Muestra.getString(3));
                        String [] Datos = {String.valueOf(this.getSueldo()), String.valueOf(this.getComi()), this.getNom()};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    case 8:
                    {
                        this.setNom(Muestra.getString(1));
                        this.setCargo(Muestra.getString(2));
                        String [] Datos = {this.getNom(), this.getCargo()};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    case 9: //ok
                    {
                        //Salario, Comision, Sueldo+Comision, cdEmp, Nom
                        this.setSueldo(Muestra.getDouble(1));
                        this.setComi(Muestra.getDouble(2));
                        this.setSalComi(Muestra.getDouble(3));
                        this.setCdEmp(Muestra.getString(4));
                        this.setNom(Muestra.getString(5));
                        String [] Datos = {String.valueOf(this.getSueldo()), String.valueOf(this.getComi()), String.valueOf(this.getSalComi()),this.getCdEmp(), this.getNom()};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    case 10:
                    {
                        //"Sueldo", "Comisión","Sueldo + Comision", "Codigo Empleado", "Nombre"
                        this.setSueldo(Muestra.getDouble(1));
                        this.setComi(Muestra.getDouble(2));
                        this.setSalComi(Muestra.getDouble(3));
                        this.setCdEmp(Muestra.getString(4));
                        this.setNom(Muestra.getString(5));
                        String [] Datos = {String.valueOf(this.getSueldo()), String.valueOf(this.getComi()), String.valueOf(this.getSalComi()),this.getCdEmp(), this.getNom()};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    case 11: //ok
                    {
                        this.setNom(Muestra.getString(1));
                        this.setCdEmp(Muestra.getString(2));
                        String [] Datos = {this.getNom(), this.getCdEmp()};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    case 12:
                    {
                        //this.sueldoMax -> Falta fazer
                        this.setSalMax(Muestra.getDouble(1));
                        this.setNom(Muestra.getString(2));
                        String [] Datos = {String.valueOf(this.getSalMax()), this.getNom()};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    case 13:
                    {
                        this.setComi(Muestra.getDouble(1));
                        this.setCdEmp(Muestra.getString(2));
                        String [] Datos = {String.valueOf(this.getComi()), this.getCdEmp()};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Error.");
                }//Fin Switch
            } //Fin While
        }// fin do try
        
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error : "+e);
        }   
        
        return ObjTabla;
    }
}
