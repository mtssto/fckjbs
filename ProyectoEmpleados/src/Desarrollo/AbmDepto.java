package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;

public class AbmDepto 
{

    private String CdDepto;
    private String Nom;
    private String Ciu;
    private String CdDir;

    private String AltaSql = "INSERT INTO departamento (CodDepto,Nom,Ciudad,CodDir) VALUES (?,?,?,?);";
    private String Borrar = "DELETE FROM departamento WHERE Nom = (?);"; 
    private String ConsultaSql = "SELECT * FROM departamento;";
    
    private PreparedStatement Instruccion;
    DefaultListModel ModeloListaCategoria = new DefaultListModel();
    ResultSet Muestra;
    
    Conexion Con = new Conexion();

    public AbmDepto(String CdDepto, String Nom, String Ciu, String CdDir) {
        this.CdDepto = CdDepto;
        this.Nom = Nom;
        this.Ciu = Ciu;
        this.CdDir = CdDir;
    }
    


    public AbmDepto() {
    }

    public String getCdDepto() {
        return CdDepto;
    }

    public String getNom() {
        return Nom;
    }

    public String getCiu() {
        return Ciu;
    }

    public String getCdDir() {
        return CdDir;
    }

    public void setCdDepto(String CdDepto) {
        this.CdDepto = CdDepto;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setCiu(String Ciu) {
        this.Ciu = Ciu;
    }

    public void setCdDir(String CdDir) {
        this.CdDir = CdDir;
    }


    
    

    
    public void Alta()
    {
        try 
        {
            Instruccion = Con.Conectado().prepareStatement(AltaSql);
            Instruccion.setString(1, this.getCdDepto());
            Instruccion.setString(2, this.getNom());
            Instruccion.setString(3, this.getCiu());
            Instruccion.setString(4, this.getCdDir());
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
    
    public void Baja()
    {
        try 
        {
            Instruccion = Con.Conectado().prepareStatement(Borrar);
            Instruccion.setString(1, this.getNom());
            int Registro = Instruccion.executeUpdate();
            if (Registro > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro eliminado");
            }
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error al querer borrar un registro " + e);
        }           
    }
    
    public void Modificar(String NomViejo)
    {
        String Cambia ="UPDATE departamento SET CodDepto = '"+this.getCdDepto() +"', Nom = '"+ this.getNom()+"', Ciudad = '"+this.getCiu() +"', CodDir = '"+this.getCdDir() +"' WHERE Nom = '"+ NomViejo +"';";
        try 
        {
            Instruccion = Con.Conectado().prepareStatement(Cambia);
            int Registro = Instruccion.executeUpdate();
            if (Registro > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "no actualiza");    
            }
        } catch (SQLException e) 
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
    
    
    public boolean Buscar(String NombreDepto)
    {
        String BuscarNro = "SELECT CodDepto,Nom,Ciudad,CodDir FROM departamento where Nom = '" + NombreDepto + "';";
        boolean Encuentra = false;
        try 
        {
            Instruccion = Con.Conectado().prepareStatement(BuscarNro);
            Muestra = Instruccion.executeQuery();
            
            if(Muestra.next())
            {
               this.setCdDepto(Muestra.getString(1));
               this.setNom(Muestra.getString(2));
               this.setCiu(Muestra.getString(3));
               this.setCdDir(Muestra.getString(4));
            }
            Encuentra = true;
        } catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No encuentra el Departamento" + e);
            Encuentra = false;
        }
        finally
        {
            return Encuentra;
        }
    }      
}


