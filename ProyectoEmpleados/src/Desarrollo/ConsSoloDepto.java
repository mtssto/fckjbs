package Desarrollo;

import Bdd.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class ConsSoloDepto {

/* atributos */
    private String Nom;
    private String Ciu;
    private String CodDir;
/***********************************/
    
    DefaultTableModel Tabla; 
// declaras el objeto (el nombre del modelo)
    String [][] Filas = {};
    // van los datos 
    //(no importa las columnas a mostrar)
    
    String [] NomCol = {"Nombre del Departamento","Ciudad","Código de Director"}; 
// vector en el que van los titulos 
    //de las columnas (varia de acuerdo
    //a la cantidad de columnas a mostrar)

    
    

    
/************** en todos los select *********/
    PreparedStatement Instruccion;    
    ResultSet Muestra;
    Conexion Con = new Conexion();
/*********************************************/
    
    private String ListaDepto = "select Nom, Ciudad, CodDir from departamento"; 
    
    
    
    
    public ConsSoloDepto() 
    {
        
    }


    public void setNom(String Nom) { // le digo, manda el contenido del parametro al atributo
        this.Nom = Nom;
    }

    public void setCiu(String Ciu) {
        this.Ciu = Ciu;
    }

    public void setCodDir(String CodDir) {
        this.CodDir = CodDir;
    }

    public String getNom() {
        return Nom;
    }

    public String getCiu() {
        return Ciu;
    }

    public String getCodDir() {
        return CodDir;
    }


    
    public DefaultTableModel Titulos() 
// imprime los titulos y ningun registro
    {
       Tabla = 
        new DefaultTableModel(Filas, NomCol);
       // en el constructor van los datos y los titulos
        return Tabla;
    }


  public DefaultTableModel MuestraDepto()
    {
        try 
        {
            Instruccion = Con.Conectado().prepareStatement(ListaDepto);
            Muestra = Instruccion.executeQuery();
            while   (Muestra.next()) // lee cada registro de la tabla en base a la instruccion del select
            {
 /*************** desde aca *******************/
                /********** menciono los campos a mostrar */////////
               this.setNom(Muestra.getString(1));
               // llama al metod set y le envia como parametro
               //el contenido del campo de la instruccion
               //sql
               this.setCiu(Muestra.getString(2));
               this.setCodDir(Muestra.getString(3));
               /***************************************************/
               
                String [] VecTabla = {this.getNom(), this.getCiu(), 
                    this.getCodDir()};
                // armando tu registro que va en 
                //cada fila del datatable

                Tabla.addRow(VecTabla); 
// envia el contenido de los campos
// de mi select al modelo de mi datatable
                
/********************* hasta acá  ********************************/                
                
            }
        }
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "No puede mostrar los datos" + e);
        }
        return Tabla;
   }     

    
}
