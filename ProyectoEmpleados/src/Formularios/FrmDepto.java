package Formularios;

import Bdd.Conexion;
import Desarrollo.AbmDepto;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class FrmDepto extends javax.swing.JInternalFrame {
AbmDepto ObjDepto;
AbmDepto ObjDepto2;        
String NomCatBorrar = null;
String NomViejo = null;
Conexion Con = new Conexion();

    public FrmDepto() {
        initComponents();
        this.setTitle("PROYECTO EMPLEADOS");
        this.PanelConsulta.setVisible(false);
        this.BtnCancelar.setVisible(false);
        this.BtnEliminar.setVisible(false);              
        this.BtnBuscar.setVisible(false);
        this.BtnActualizar.setVisible(false);
        this.BtnBaja.setVisible(false);
        this.BtnModif.setVisible(false); 
        this.setTitle("PROYECTO EMPLEADOS");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        LblDepto = new org.edisoncor.gui.label.LabelMetric();
        LblNom = new org.edisoncor.gui.label.LabelRect();
        TxtNom = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        PanelBotones = new javax.swing.JPanel();
        BtnBaja = new org.edisoncor.gui.button.ButtonAero();
        BtnActualizar = new org.edisoncor.gui.button.ButtonAero();
        BtnAlta = new org.edisoncor.gui.button.ButtonAero();
        BtnModif = new org.edisoncor.gui.button.ButtonAero();
        BtnSalir = new org.edisoncor.gui.button.ButtonAero();
        BtnEliminar = new org.edisoncor.gui.button.ButtonAero();
        BtnBuscar = new org.edisoncor.gui.button.ButtonAero();
        BtnCancelar = new org.edisoncor.gui.button.ButtonAero();
        BtnConsulta1 = new org.edisoncor.gui.button.ButtonAero();
        PanelConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaCategorias = new javax.swing.JList<>();
        LblCiu = new org.edisoncor.gui.label.LabelRect();
        LblCdDepto = new org.edisoncor.gui.label.LabelRect();
        LblCdJefe = new org.edisoncor.gui.label.LabelRect();
        TxtCdDepto = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        TxtCiu = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        TxtDir = new org.edisoncor.gui.textField.TextFieldRoundBackground();

        setBackground(new java.awt.Color(102, 255, 102));
        setClosable(true);
        setIconifiable(true);

        PanelPrincipal.setBackground(new java.awt.Color(51, 102, 255));

        LblDepto.setText("DEPARTAMENTOS");
        LblDepto.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        LblNom.setForeground(new java.awt.Color(0, 102, 204));
        LblNom.setText("NOMBRE");
        LblNom.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        TxtNom.setDescripcion("ingrese el Nombre aquí");
        TxtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNomKeyTyped(evt);
            }
        });

        PanelBotones.setBackground(new java.awt.Color(51, 102, 255));

        BtnBaja.setBackground(new java.awt.Color(51, 102, 255));
        BtnBaja.setText("BAJAS");
        BtnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajaActionPerformed(evt);
            }
        });

        BtnActualizar.setBackground(new java.awt.Color(51, 102, 255));
        BtnActualizar.setText("ACTUALIZAR");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        BtnAlta.setBackground(new java.awt.Color(51, 102, 255));
        BtnAlta.setText("ALTAS");
        BtnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAltaActionPerformed(evt);
            }
        });

        BtnModif.setBackground(new java.awt.Color(51, 102, 255));
        BtnModif.setText("MODIFICACIONES");
        BtnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifActionPerformed(evt);
            }
        });

        BtnSalir.setBackground(new java.awt.Color(51, 102, 255));
        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnEliminar.setBackground(new java.awt.Color(51, 102, 255));
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnBuscar.setBackground(new java.awt.Color(51, 102, 255));
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnCancelar.setBackground(new java.awt.Color(51, 102, 255));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnConsulta1.setBackground(new java.awt.Color(51, 102, 255));
        BtnConsulta1.setText("CONSULTAS");
        BtnConsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsulta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonesLayout = new javax.swing.GroupLayout(PanelBotones);
        PanelBotones.setLayout(PanelBotonesLayout);
        PanelBotonesLayout.setHorizontalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBotonesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBotonesLayout.createSequentialGroup()
                        .addComponent(BtnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBotonesLayout.setVerticalGroup(
            PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnModif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelConsulta.setBackground(new java.awt.Color(51, 102, 255));

        jScrollPane1.setBackground(new java.awt.Color(51, 102, 255));

        ListaCategorias.setBackground(new java.awt.Color(51, 102, 255));
        ListaCategorias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ListaCategorias.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(ListaCategorias);

        javax.swing.GroupLayout PanelConsultaLayout = new javax.swing.GroupLayout(PanelConsulta);
        PanelConsulta.setLayout(PanelConsultaLayout);
        PanelConsultaLayout.setHorizontalGroup(
            PanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConsultaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        PanelConsultaLayout.setVerticalGroup(
            PanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConsultaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        LblCiu.setForeground(new java.awt.Color(0, 102, 204));
        LblCiu.setText("CIUDAD");
        LblCiu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        LblCdDepto.setForeground(new java.awt.Color(0, 102, 204));
        LblCdDepto.setText("CODIGO DE DEPARTAMENTO");
        LblCdDepto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        LblCdJefe.setForeground(new java.awt.Color(0, 102, 204));
        LblCdJefe.setText("CODIGO DIRECTOR");
        LblCdJefe.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        TxtCdDepto.setDescripcion("ingrese el Código aquí");
        TxtCdDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCdDeptoActionPerformed(evt);
            }
        });
        TxtCdDepto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCdDeptoKeyTyped(evt);
            }
        });

        TxtCiu.setDescripcion("ingresela ciudad aquí");
        TxtCiu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCiuKeyTyped(evt);
            }
        });

        TxtDir.setDescripcion("ingrese el Códigoo aquí");
        TxtDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDirKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(LblCdDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCdDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(LblCiu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(TxtCiu, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(LblNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(LblCdJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(PanelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(PanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(LblDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(LblDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblCdDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCdDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblCiu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCiu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblCdJefe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(PanelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(PanelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomKeyTyped
        SoloLetras(evt);
        if (TxtNom.getText().length()== 20)
        {
            evt.consume(); 
        }
    }//GEN-LAST:event_TxtNomKeyTyped

    private void BtnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaActionPerformed
        this.BtnModif.setVisible(false);
        this.BtnConsulta1.setVisible(false);
        Ocultar();
        this.BtnCancelar.setVisible(true);
        this.BtnEliminar.setVisible(true);
        this.BtnBaja.setVisible(false);
        NomCatBorrar = this.ListaCategorias.getSelectedValue();
    }//GEN-LAST:event_BtnBajaActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed

        String NomAct = this.TxtNom.getText().toUpperCase();
        String CiuAct = this.TxtCiu.getText().toUpperCase();
        String DirAct = this.TxtDir.getText();
        String DeptoAct = this.TxtCdDepto.getText();
        ObjDepto2.setNom(NomAct);
        ObjDepto2.setCdDir(DirAct);
        ObjDepto2.setCdDepto(DeptoAct);
        ObjDepto2.setCiu(CiuAct);
//        ObjDepto2 = new AbmDepto(NomViejo);
        ObjDepto2.Modificar(NomViejo);
        Limpiar();
        Visible();
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAltaActionPerformed
        String Nom = this.TxtNom.getText().toUpperCase();
        String CdDepto = this.TxtCdDepto.getText().toUpperCase();
        String Ciudad = this.TxtCiu.getText().toUpperCase();
        String CdDir =  this.TxtDir.getText().toUpperCase();       
        ObjDepto = new AbmDepto(CdDepto,Nom,Ciudad,CdDir);
        ObjDepto.Alta();
        Limpiar();
    }//GEN-LAST:event_BtnAltaActionPerformed

    private void BtnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifActionPerformed
        this.BtnBaja.setVisible(false);
        this.BtnCancelar.setVisible(true);
        this.BtnBuscar.setVisible(false);
        this.BtnActualizar.setVisible(true);
        this.BtnModif.setVisible(false);
        this.BtnConsulta1.setVisible(false);
        Ocultar();
        
        NomViejo = this.ListaCategorias.getSelectedValue();
        this.TxtNom.setText(NomViejo);
        TraerDatos(NomViejo);
        
        this.LblNom.setVisible(true);
        this.TxtNom.setVisible(true);
    }//GEN-LAST:event_BtnModifActionPerformed

    private void TraerDatos(String NombreDepto)
    {
       boolean  z1 =   ObjDepto2.Buscar(NombreDepto);
         if (z1  == true) 
         {
             Visible();
             this.TxtCdDepto.setText(ObjDepto2.getCdDepto());
             this.TxtCiu.setText(ObjDepto2.getCiu());
             this.TxtDir.setText(ObjDepto2.getCdDir());
             this.TxtNom.setText(ObjDepto2.getNom());
             
 
             this.BtnActualizar.setVisible(true);
             this.BtnCancelar.setVisible(true);
         }
        
    }
    
    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        try {
            Con.Conectado().close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "no se pudo cerrar la base de datos");
        }
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        int z = JOptionPane.showConfirmDialog(null, "Esta seguro ?");
        if ( z == 0)
        {
            ObjDepto2 = new AbmDepto();
            ObjDepto2.setNom(NomCatBorrar);
            ObjDepto2.Baja();
            this.TxtNom.setText(null);
            ObjDepto2 = new AbmDepto();
            ListaCategorias.setModel(ObjDepto2.Muestro());
            Visible();
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        Visible();
    }//GEN-LAST:event_BtnCancelarActionPerformed

 private void Visible()
    {
        this.BtnActualizar.setVisible(false);
        this.BtnConsulta1.setVisible(true);
        this.BtnModif.setVisible(false);
        this.BtnCancelar.setVisible(false);
        this.BtnEliminar.setVisible(false);        
        this.BtnBaja.setVisible(false);
        this.BtnAlta.setVisible(true);
        this.BtnSalir.setVisible(true);
        this.LblNom.setVisible(true);
        this.TxtNom.setVisible(true);
    }
 
   private void Ocultar()
    {
        this.BtnAlta.setVisible(false);
        this.BtnSalir.setVisible(false);   
        this.LblNom.setVisible(false);
        this.TxtNom.setVisible(false);
    }
      
    private void SoloLetras(java.awt.event.KeyEvent evt)
    {
        char Letra = evt.getKeyChar();
        int Bs = (int) evt.getKeyChar();
        if ( !Character.isLetter(Letra) && Bs != 32  && Bs != 8 ) 
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar una letra");
            evt.consume();
            
        }
    } 
    
    private void Limpiar()
    {
        this.TxtCdDepto.setText(null);
        this.TxtNom.setText(null);
        this.TxtCiu.setText(null);
        this.TxtDir.setText(null);
    }
    private void BtnConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsulta1ActionPerformed
        this.PanelConsulta.setVisible(true);
        this.ListaCategorias.setVisible(true);
        this.BtnModif.setVisible(true);
        this.BtnCancelar.setVisible(false);
        this.BtnEliminar.setVisible(false);
        this.BtnBaja.setVisible(true);
        this.BtnAlta.setVisible(false);
        this.BtnSalir.setVisible(true);
        this.LblNom.setVisible(false);
        this.TxtNom.setVisible(false);
        ObjDepto2 = new AbmDepto();
        ListaCategorias.setModel(ObjDepto2.Muestro());
    }//GEN-LAST:event_BtnConsulta1ActionPerformed

    private void TxtCdDeptoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCdDeptoKeyTyped
        if (TxtCdDepto.getText().length()== 4)
        {
            evt.consume(); 
        }

         
    }//GEN-LAST:event_TxtCdDeptoKeyTyped

    private void TxtCiuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCiuKeyTyped
        SoloLetras(evt);
        if (TxtCiu.getText().length()== 15)
        {
            evt.consume(); 
        }
    }//GEN-LAST:event_TxtCiuKeyTyped

    private void TxtDirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDirKeyTyped
        if (TxtDir.getText().length()== 12)
        {
            evt.consume(); 
        }
    }//GEN-LAST:event_TxtDirKeyTyped

    private void TxtCdDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCdDeptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCdDeptoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonAero BtnActualizar;
    private org.edisoncor.gui.button.ButtonAero BtnAlta;
    private org.edisoncor.gui.button.ButtonAero BtnBaja;
    private org.edisoncor.gui.button.ButtonAero BtnBuscar;
    private org.edisoncor.gui.button.ButtonAero BtnCancelar;
    private org.edisoncor.gui.button.ButtonAero BtnConsulta1;
    private org.edisoncor.gui.button.ButtonAero BtnEliminar;
    private org.edisoncor.gui.button.ButtonAero BtnModif;
    private org.edisoncor.gui.button.ButtonAero BtnSalir;
    private org.edisoncor.gui.label.LabelRect LblCdDepto;
    private org.edisoncor.gui.label.LabelRect LblCdJefe;
    private org.edisoncor.gui.label.LabelRect LblCiu;
    private org.edisoncor.gui.label.LabelMetric LblDepto;
    private org.edisoncor.gui.label.LabelRect LblNom;
    private javax.swing.JList<String> ListaCategorias;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelConsulta;
    private javax.swing.JPanel PanelPrincipal;
    private org.edisoncor.gui.textField.TextFieldRoundBackground TxtCdDepto;
    private org.edisoncor.gui.textField.TextFieldRoundBackground TxtCiu;
    private org.edisoncor.gui.textField.TextFieldRoundBackground TxtDir;
    private org.edisoncor.gui.textField.TextFieldRoundBackground TxtNom;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
