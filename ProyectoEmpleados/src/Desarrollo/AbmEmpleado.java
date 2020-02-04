package Desarrollo;

import Bdd.Conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class AbmEmpleado 
{
    private String CdEmp;
    private String Nom;
    private char Sex;
    private Date FNac;
    private Date FInc;
    private Double Salario;
    private Double Comi;
    private String Cargo;
    private String CodJefe;
    private String CodDepto;
    
    private String AltaSql = "INSERT INTO empleados (CdEmp,Nom,Sex,FechaNac,FechaInc,Salario,Comision,Cargo,Codjefe,Departamento_CodDepto) VALUES (?,?,?,?,?,?,?,?,?,?);";
    private String Borrar = "DELETE FROM empleados WHERE Nom = (?);"; 
    private String ConsultaSql = "SELECT * FROM empleados;";
    private String ConsultaMuestraDeptoSql = "SELECT Nom FROM departamento;";
    
    private PreparedStatement Instruccion;
    DefaultListModel ModeloListaCategoria = new DefaultListModel();
    DefaultListModel ModeloListaDepto = new DefaultListModel();
    ResultSet Muestra;
    
    Conexion Con = new Conexion();

    //Constructor con parametros.
    public AbmEmpleado(String CdEmp, String Nom, char Sex, Date FNac, Date FInc, Double Salario, Double Comi, String Cargo, String CodJefe, String CodDepto) {
        this.CdEmp = CdEmp;
        this.Nom = Nom;
        this.Sex = Sex;
        this.FNac = FNac;
        this.FInc = FInc;
        this.Salario = Salario;
        this.Comi = Comi;
        this.Cargo = Cargo;
        this.CodJefe = CodJefe;
        this.CodDepto = CodDepto;
    }
    
    //Constructor Vacio.
    public AbmEmpleado() {
    }

    public String getCdEmp() {
        return CdEmp;
    }
    public String getNom() {
        return Nom;
    }
    public char getSex() {
        return Sex;
    }
    public Date getFNac() {
        return FNac;
    }
    public Date getFInc() {
        return FInc;
    }
    public Double getSalario() {
        return Salario;
    }
    public Double getComi() {
        return Comi;
    }
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
    public void setSex(char Sex) {
        this.Sex = Sex;
    }
    public void setFNac(Date FNac) {
        this.FNac = FNac;
    }
    public void setFInc(Date FInc) {
        this.FInc = FInc;
    }
    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }
    public void setComi(Double Comi) {
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

    public void Alta()
    {
        try 
        {
           Instruccion = Con.Conectado().prepareStatement(AltaSql);
           Instruccion.setString(1, this.getCdEmp());
           Instruccion.setString(2, this.getNom());
           Instruccion.setString(3, String.valueOf(this.getSex()));
           Instruccion.setDate(4, this.getFNac());
           Instruccion.setDate(5, this.getFInc());
           Instruccion.setDouble(6, this.getSalario());
           Instruccion.setDouble(7, this.getComi());
           Instruccion.setString(8, this.getCargo());
           Instruccion.setString(9, this.getCodJefe());           
           Instruccion.setString(10, this.getCodDepto());           
           int Registro = Instruccion.executeUpdate();
           if (Registro > 0) 
           {
               JOptionPane.showMessageDialog(null, "Registro guardado correctamente.");     
           }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "El Registro no pudo ser guardado" + e); 
        }        
    }
    
    public void Baja()
    {
        try 
        {
            Instruccion = Con.Conectado().prepareStatement(Borrar);
            Instruccion.setString(1, this.getNom());
            int Registro = Instruccion.executeUpdate();
            if (Registro > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro eliminado.");
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error al querer borrar un registro " + e);
        }           
    }
    
    public void Modificar(String NomViejo, String CdEmpViejo)
    {
        String Cambia = "UPDATE empleado SET Nom = '"+this.getNom()+"', Sex = '"+this.getSex()+"',FechaNac = '"+this.getFNac()+"',FechaInc = '"+this.getFInc()+"',Salario = '"+this.getSalario()+"',Comision = '"+this.getComi()+"',Cargo = '"+this.getCargo()+"',Codjefe = '"+this.getCodJefe()+"',Departamento_CodDepto = '"+this.getCodDepto()+"' WHERE Nom = '"+NomViejo+"' and CdEmp = '"+CdEmpViejo+"';";
        try 
        {
            Instruccion = Con.Conectado().prepareStatement(Cambia);
            int Registro = Instruccion.executeUpdate();
            if (Registro > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado.");
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error al querer modificar un registro " + e );
        }         
    }
    
    public DefaultListModel Muestro()
    {
        try 
        {
            Instruccion = Con.Conectado().prepareStatement(ConsultaSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                ModeloListaCategoria.addElement(Muestra.getString(2));
            }           
            
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos" + e);
        }
        
        return ModeloListaCategoria;
    }

    public DefaultListModel MuestroDepto()
    {
        try 
        {
            Instruccion = Con.Conectado().prepareStatement(ConsultaMuestraDeptoSql);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next())
            {
                ModeloListaDepto.addElement(Muestra.getString(1));
            }            
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos" + e);
        }
        
        return ModeloListaDepto;
    } 
    
    public String Buscar(String NomDepto)
    {
        String BuscarNro = "SELECT CodDepto FROM departamento where Nom = '" + NomDepto + "';";
        String VarCodDepto = "null";
        try 
        {
            Instruccion = Con.Conectado().prepareStatement(BuscarNro);
            Muestra = Instruccion.executeQuery();
            
            if(Muestra.next())
            {
               VarCodDepto = Muestra.getString(1);
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No encuentra el Departamento" + e);
            VarCodDepto="null";
        }
        finally
        {
            return VarCodDepto;
        }
    }
    
    public boolean BuscarRegistro(String NombreEmp)
    {
        String BuscarNro = "SELECT CdEmp,Nom,Sex,FechaNac,FechaInc,Salario,Comision,Cargo,CodJefe,Departamento_CodDepto FROM empleados where Nom = '" + NombreEmp + "';";
        boolean Encuentra = false;
        try 
        {
            Instruccion = Con.Conectado().prepareStatement(BuscarNro);
            Muestra = Instruccion.executeQuery();
            
            if(Muestra.next())
            {
               this.setCdEmp(Muestra.getString(1));
               this.setNom(Muestra.getString(2));
               this.setSex(Muestra.getString(3).charAt(0));
               this.setFNac(Muestra.getDate(4));
               this.setFInc(Muestra.getDate(5));
               this.setSalario(Muestra.getDouble(6));
               this.setComi(Muestra.getDouble(7));
               this.setCargo(Muestra.getString(8));
               this.setCodJefe(Muestra.getString(9));
               this.setCodDepto(Muestra.getString(10));
            }
            Encuentra = true;
        } 
        catch (SQLException e)    
        {
            JOptionPane.showMessageDialog(null, "No encuentra el empleado" + e);
            Encuentra = false;
        }
        finally
        {
            return Encuentra;
        }
    }          
}
