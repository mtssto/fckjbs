package Desarrollo;
import Bdd.Conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConRelacionadas 
{
    //Atributos
    private int NroForm;
    private int CtdEmp;
    private double SalPromedio;
    private double SumaSalario;
    
    private String NomEmp;
    private String NomDepto;
    private char Sexo;
    private double Comision;
    private double Sueldo;
    private String Cargo;
    private String CodDepto;
    
    //Métodos GET y SET.
    public String getCodDepto() {
        return CodDepto;
    }
    public void setCodDepto(String CodDepto) {
        this.CodDepto = CodDepto;
    }
    public double getSumaSalario() {
        return SumaSalario;
    }
    public void setSumaSalario(double SumaSalario) {
        this.SumaSalario = SumaSalario;
    }
    public String getNomEmp() {
        return NomEmp;
    }
    public void setNomEmp(String NomEmp) {
        this.NomEmp = NomEmp;
    }
    public String getNomDepto() {
        return NomDepto;
    }
    public void setNomDepto(String NomDepto) {
        this.NomDepto = NomDepto;
    }
    public char getSexo() {
        return Sexo;
    }
    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }
    public double getComision() {
        return Comision;
    }
    public void setComision(double Comision) {
        this.Comision = Comision;
    }
    public double getSueldo() {
        return Sueldo;
    }
    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    public int getCtdEmp() {
        return CtdEmp;
    }
    public void setCtdEmp(int CtdEmp) {
        this.CtdEmp = CtdEmp;
    }
    public double getSalPromedio() {
        return SalPromedio;
    }
    public void setSalPromedio(double SalPromedio) {
        this.SalPromedio = SalPromedio;
    }
    
    
    //Constructor
    public ConRelacionadas(int NroForm) {
        this.NroForm = NroForm;
    }
    
    DefaultTableModel ObjTabla;
    PreparedStatement Instruccion;
    ResultSet Muestra;
    
    Conexion Con = new Conexion();
    String [][] Filas = {};
    String [] NomCol = {""};
    String [] VecTabla = {};
    
    String MostrarSql = "";
    String Sql1 = "SELECT e.Nom, e.Cargo, e.Salario, d.Nom FROM empleados AS e INNER JOIN departamento AS d ON e.Departamento_codDepto = d.CodDepto WHERE  (e.Cargo = 'SECRETARIA' or e.Cargo = 'OPERADOR') AND (d.Nom != 'RECEPCION') AND (e.Salario > 800) ORDER BY e.FechaInc;";
    String Sql2 = "SELECT e.Nom, e.Sex, e.Salario, e.Comision, e.Cargo, d.Nom FROM empleados AS e INNER JOIN departamento AS d ON e.Departamento_codDepto = d.CodDepto WHERE (e.Nom LIKE 'M%')  AND (e.Salario > 800 OR e.Comision > 400)  AND (d.Nom != 'GERENCIA');";
    String Sql3 = "SELECT d.Nom, e.Sex, count(e.Sex) FROM empleados AS e INNER JOIN departamento AS d ON e.Departamento_codDepto = d.CodDepto GROUP BY d.Nom, e.Sex;";
    String Sql4 = "SELECT d.Nom, AVG(e.Salario) FROM empleados AS e INNER JOIN departamento AS d ON e.Departamento_codDepto = d.CodDepto GROUP BY d.Nom;";
    String Sql5 = " "; //incompleto.
    String Sql6 = "SELECT d.Nom, COUNT(e.Nom) FROM empleados AS e  INNER JOIN departamento AS d  ON e.Departamento_codDepto = d.CodDepto GROUP BY d.Nom HAVING COUNT(e.Nom) > 5;";
    String Sql7 = "SELECT d.Nom, e.Departamento_CodDepto FROM departamento AS d LEFT JOIN empleados AS e  ON d.CodDepto = e.Departamento_CodDepto WHERE e.Departamento_CodDepto IS NULL;"; //incompleto.
    String Sql8 = "SELECT d.Nom, SUM(e.Salario) FROM empleados AS e INNER JOIN departamento AS d ON e.Departamento_codDepto = d.CodDepto GROUP BY d.Nom ORDER BY SUM(e.Salario) DESC LIMIT 1;";
    
    
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
                String [] NomCol1 = {"Nombre del Empleado", "Cargo", "Salario", "Departamento"};
                NomCol = NomCol1;
                break;
            }
            case 2:
            {
                String [] NomCol2 = {"Empleado","Sexo","Salario","Comisión","Cargo"};
                NomCol = NomCol2;
                break;
            }
            case 3:
            {
                String [] NomCol3 = {"Departamento", "Sexo", "Cantidad de Empleados"};
                NomCol = NomCol3;
                break;
            }
            case 4:
            {
                String [] NomCol4 = {"Departamento", "Salario Promedio"};
                NomCol = NomCol4;
                break;
            }
            case 5:
            {
                String [] NomCol5 = {"Nombre", "Comisión"};
                NomCol = NomCol5;
                break;
            }
            case 6:
            {
                String [] NomCol6 = {"Nombre de Departamento", "Cantidad de Empleados"};
                NomCol = NomCol6;
                break;
            }
            case 7:
            {
                String [] NomCol7 = {"Nombre del Departamento", "Empleados"};
                NomCol = NomCol7;
                break;
            }
            case 8:
            {
                String [] NomCol8 = {"Nombre de Departamento", "Suma del Salário"};
                NomCol = NomCol8;
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
                        this.setNomEmp(Muestra.getString(1));
                        this.setCargo(Muestra.getString(2));
                        this.setSueldo(Muestra.getDouble(3));
                        this.setNomDepto(Muestra.getString(4));
                        String [] Datos = {this.getNomEmp(), this.getCargo(), String.valueOf(this.getSueldo()), this.getNomDepto()}; 
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    case 2: //ok
                    {
                        //"Empleado","Sexo","Salario","Comisión","Cargo"};
                        this.setNomEmp(Muestra.getString(1));
                        this.setSexo(Muestra.getString(2).charAt(0));
                        this.setSueldo(Muestra.getDouble(3));
                        this.setComision(Muestra.getDouble(4));
                        this.setCargo(Muestra.getString(5));
                        String [] Datos = {this.getNomEmp(), String.valueOf(this.getSexo()), String.valueOf(this.getSueldo()), String.valueOf(this.getComision()), this.getCargo()};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    case 3: //ok
                    {
                        //{"Departamento", "Sexo", "Cantidad de Empleados"};
                        this.setNomDepto(Muestra.getString(1));
                        this.setSexo(Muestra.getString(2).charAt(0));
                        this.setCtdEmp(Muestra.getInt(3));
                        //Criar um método
                        String [] Datos = {this.getNomDepto(), String.valueOf(this.getSexo()), String.valueOf(this.getCtdEmp())};
                        ObjTabla.addRow(Datos);
                        break;
                    }
                    
                    case 4: //ok
                    {
                        //{"Departamento", "Salario Promedio"};
                        this.setNomDepto(Muestra.getString(1));
                        this.setSalPromedio(Muestra.getDouble(2));
                        String [] Datos = {this.getNomDepto(), String.valueOf(this.getSalPromedio())};
                        ObjTabla.addRow(Datos); 
                        break;
                    }
                    
                    case 5: //incompleto
                    {
                        String [] Datos = {};
                        ObjTabla.addRow(Datos); 
                        break;
                    }
                    
                    case 6: //ok
                    {
                        this.setNomDepto(Muestra.getString(1));
                        this.setCtdEmp(Muestra.getInt(2));
                        String [] Datos = {this.getNomDepto(), String.valueOf(this.getCtdEmp())};
                        ObjTabla.addRow(Datos); 
                        break;
                    }
                    
                    case 7: //ok
                    {
                        this.setNomDepto(Muestra.getString(1));
                        String Val = Muestra.getString(2);
                        //this.setCodDepto(Muestra.getString(2));
                        
                        if(Val == null)
                            this.setCodDepto("NO TIENE");                                    
                        else
                            this.setCodDepto(Val);
                        
                        String [] Datos = {this.getNomDepto(), this.getCodDepto()};
                        ObjTabla.addRow(Datos); 
                        break;
                    }
                    
                    case 8:
                    {
                        this.setNomDepto(Muestra.getString(1));
                        this.setSumaSalario(Muestra.getDouble(2));
                        String [] Datos = {this.getNomDepto(), String.valueOf(this.getSumaSalario())};
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
