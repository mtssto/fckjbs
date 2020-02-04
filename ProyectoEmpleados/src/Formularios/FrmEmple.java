
package Formularios;

import Bdd.Conexion;
import Desarrollo.AbmEmpleado;
import java.util.Date;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class FrmEmple extends javax.swing.JInternalFrame {
    AbmEmpleado ObjEmp;
    AbmEmpleado ObjEmp2  = new AbmEmpleado();;        
    String NomCatBorrar = null;
    String NomViejo = null;
    Conexion Con = new Conexion();

    public FrmEmple() 
    {
        initComponents();
        this.setTitle("PROYECTO EMPLEADOS");
        this.PanelConsulta.setVisible(true);
        ListaDepto.setModel( ObjEmp2.MuestroDepto());
        this.PanelNomEmp.setVisible(false);
        this.LblNomEmp.setVisible(false);
        this.BtnCancelar.setVisible(false);
        this.BtnEliminar.setVisible(false);              
        this.BtnBuscar.setVisible(false);
        this.BtnActualizar.setVisible(false);
        this.BtnBaja.setVisible(false);
        this.BtnModif.setVisible(false);          
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoSexo = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        LblTitulo = new org.edisoncor.gui.label.LabelMetric();
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
        ListaDepto = new javax.swing.JList<>();
        LblNom1 = new org.edisoncor.gui.label.LabelRect();
        LblNom2 = new org.edisoncor.gui.label.LabelRect();
        LblNom3 = new org.edisoncor.gui.label.LabelRect();
        TxtCdEmp = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        LblNom4 = new org.edisoncor.gui.label.LabelRect();
        LblNom5 = new org.edisoncor.gui.label.LabelRect();
        PanelSexo = new javax.swing.JPanel();
        RdMasc = new javax.swing.JRadioButton();
        RdFem = new javax.swing.JRadioButton();
        TxtComi = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        TxtSalario = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        DFNac = new com.toedter.calendar.JDateChooser();
        DFInsc = new com.toedter.calendar.JDateChooser();
        LblCargo = new org.edisoncor.gui.label.LabelRect();
        LblCdJefe = new org.edisoncor.gui.label.LabelRect();
        TxtCargo = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        TxtCodJefe = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        LblNom8 = new org.edisoncor.gui.label.LabelRect();
        PanelNomEmp = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        LstNomEmp = new javax.swing.JList<>();
        LblNomEmp = new org.edisoncor.gui.label.LabelRect();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrincipal.setBackground(new java.awt.Color(51, 102, 255));

        LblTitulo.setText("EMPLEADOS");
        LblTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        LblNom.setForeground(new java.awt.Color(0, 102, 204));
        LblNom.setText("NOMBRE");
        LblNom.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        TxtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomActionPerformed(evt);
            }
        });
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

        ListaDepto.setBackground(new java.awt.Color(0, 0, 204));
        ListaDepto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ListaDepto.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(ListaDepto);

        javax.swing.GroupLayout PanelConsultaLayout = new javax.swing.GroupLayout(PanelConsulta);
        PanelConsulta.setLayout(PanelConsultaLayout);
        PanelConsultaLayout.setHorizontalGroup(
            PanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConsultaLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        PanelConsultaLayout.setVerticalGroup(
            PanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConsultaLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        LblNom1.setForeground(new java.awt.Color(0, 102, 204));
        LblNom1.setText("CODIGO EMPLEADO");
        LblNom1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        LblNom2.setForeground(new java.awt.Color(0, 102, 204));
        LblNom2.setText("COMISION");
        LblNom2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        LblNom3.setForeground(new java.awt.Color(0, 102, 204));
        LblNom3.setText("SALARIO");
        LblNom3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        TxtCdEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCdEmpActionPerformed(evt);
            }
        });
        TxtCdEmp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCdEmpKeyTyped(evt);
            }
        });

        LblNom4.setForeground(new java.awt.Color(0, 102, 204));
        LblNom4.setText("FECHA INSCRIPCION");
        LblNom4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        LblNom5.setForeground(new java.awt.Color(0, 102, 204));
        LblNom5.setText("FECHA DE NACIMIENTO");
        LblNom5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        PanelSexo.setBackground(new java.awt.Color(102, 153, 255));
        PanelSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("SEXO"));

        GrupoSexo.add(RdMasc);
        RdMasc.setText("MASCULINO");

        GrupoSexo.add(RdFem);
        RdFem.setSelected(true);
        RdFem.setText("FEMENINO");

        javax.swing.GroupLayout PanelSexoLayout = new javax.swing.GroupLayout(PanelSexo);
        PanelSexo.setLayout(PanelSexoLayout);
        PanelSexoLayout.setHorizontalGroup(
            PanelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSexoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RdMasc)
                    .addComponent(RdFem))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        PanelSexoLayout.setVerticalGroup(
            PanelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSexoLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(RdFem)
                .addGap(18, 18, 18)
                .addComponent(RdMasc)
                .addGap(17, 17, 17))
        );

        TxtComi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtComiActionPerformed(evt);
            }
        });
        TxtComi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtComiKeyTyped(evt);
            }
        });

        TxtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSalarioActionPerformed(evt);
            }
        });
        TxtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtSalarioKeyTyped(evt);
            }
        });

        LblCargo.setForeground(new java.awt.Color(0, 102, 204));
        LblCargo.setText("CARGO");
        LblCargo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        LblCdJefe.setForeground(new java.awt.Color(0, 102, 204));
        LblCdJefe.setText("CODIGO DE JEFE");
        LblCdJefe.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        TxtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCargoActionPerformed(evt);
            }
        });
        TxtCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCargoKeyTyped(evt);
            }
        });

        TxtCodJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodJefeActionPerformed(evt);
            }
        });
        TxtCodJefe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodJefeKeyTyped(evt);
            }
        });

        LblNom8.setForeground(new java.awt.Color(0, 102, 204));
        LblNom8.setText("DEPARTAMENTO");
        LblNom8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jScrollPane2.setViewportView(LstNomEmp);

        javax.swing.GroupLayout PanelNomEmpLayout = new javax.swing.GroupLayout(PanelNomEmp);
        PanelNomEmp.setLayout(PanelNomEmpLayout);
        PanelNomEmpLayout.setHorizontalGroup(
            PanelNomEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNomEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        PanelNomEmpLayout.setVerticalGroup(
            PanelNomEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNomEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        LblNomEmp.setForeground(new java.awt.Color(0, 102, 204));
        LblNomEmp.setText("Lista de Empleados");
        LblNomEmp.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(PanelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblNom5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DFNac, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblNom4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DFInsc, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(LblNom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(LblNom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtComi, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(79, 79, 79)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(LblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(LblCdJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtCodJefe, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(355, 355, 355)
                                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(LblNom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtCdEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(LblNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(PanelNomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(LblNom8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(LblNomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtCdEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNom8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(TxtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(LblNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                                                .addComponent(PanelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(57, 57, 57))
                                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(LblNom5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(LblNom4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(DFInsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(DFNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(LblNom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(PanelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtComi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblNom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblCdJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCodJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(PanelNomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(PanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomKeyTyped
        SoloLetras(evt);
    }//GEN-LAST:event_TxtNomKeyTyped

    private void BtnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajaActionPerformed
        //NomViejo = this.ListNomEmp;
        
        this.BtnModif.setVisible(false);
        this.BtnConsulta1.setVisible(false);
        Ocultar();
        this.BtnCancelar.setVisible(true);
        this.BtnEliminar.setVisible(true);
        this.BtnBaja.setVisible(false);
        NomCatBorrar = this.ListaDepto.getSelectedValue();
    }//GEN-LAST:event_BtnBajaActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        
        String NomAct = this.TxtNom.getText();
        
        char TipoSexoAct;
        if(this.RdMasc.isSelected())
            TipoSexoAct = 'M';
        else
            TipoSexoAct = 'F';
        
        String CdEmpAct = this.TxtCdEmp.getText().toUpperCase();
        char SexoAct = TipoSexoAct;
        Date FNacElegidaAct = this.DFNac.getDate();
        java.sql.Date FNacAct = ConvertirASql(FNacElegidaAct);
        Date FIncElegidaAct = this.DFNac.getDate();
        java.sql.Date FIncAct = ConvertirASql(FIncElegidaAct);
        
        double SalarioAct = Double.parseDouble(this.TxtSalario.getText());
        double ComiAct = Double.parseDouble(this.TxtComi.getText());
        String CargoAct = this.TxtCargo.getText().toUpperCase();
        String CodJefeAct = this.TxtCodJefe.getText().toUpperCase();
        String NomDeptoElegidoAct = this.ListaDepto.getSelectedValue();
        String CodDeptoAct = ObjEmp2.Buscar(NomDeptoElegidoAct);
        
        if (CodDeptoAct.equals(null)) 
        {
            JOptionPane.showMessageDialog(null, "No permite dar de alta porque no encuentra el código de depto.");
        }
        
        else
        {
            ObjEmp2.setCargo(CargoAct);
            ObjEmp2.setCdEmp(CdEmpAct);
            ObjEmp2.setCodDepto(CodDeptoAct);
            ObjEmp2.setCodJefe(CodJefeAct);
            ObjEmp2.setComi(ComiAct);
            ObjEmp2.setFInc(FIncAct);
            ObjEmp2.setFNac(FIncAct);
            ObjEmp2.setNom(NomAct);
            ObjEmp2.setSalario(SalarioAct);
            ObjEmp2.setSex(SexoAct);
            ObjEmp2.Modificar(NomViejo, CdEmpAct);
        }
        
        Limpiar();
        Visible();
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAltaActionPerformed
        
        char TipoSexo;
        if (this.RdMasc.isSelected()) 
            TipoSexo = 'M';
        else
            TipoSexo = 'F';
        
        String CdEmp = this.TxtCdEmp.getText().toUpperCase();
        String Nom = this.TxtNom.getText().toUpperCase();
        char Sexo = TipoSexo;
        Date FNacElegida = this.DFNac.getDate();
        java.sql.Date FNac = ConvertirASql(FNacElegida);
        Date FIncElegida = this.DFInsc.getDate();
        java.sql.Date FInc = ConvertirASql(FIncElegida);
        double Salario = Double.parseDouble(this.TxtSalario.getText());
        double Comi = Double.parseDouble(this.TxtComi.getText());
        String Cargo = this.TxtCargo.getText().toUpperCase();
        String CodJefe = this.TxtCodJefe.getText().toUpperCase();  
        
        String NomDeptoElegido = this.ListaDepto.getSelectedValue(); 
        
        String CodDepto = ObjEmp2.Buscar(NomDeptoElegido);
        if (CodDepto.equals(null)) 
        {
            JOptionPane.showMessageDialog(null, "No permite dar de alta porque no encuentra el código de depto.");
        }
        else
        {
            ObjEmp = new AbmEmpleado(CdEmp, Nom, Sexo, FNac, FInc, Salario, Comi, Cargo, CodJefe, CodDepto);
            ObjEmp.Alta();            
        }
        Limpiar();
    }//GEN-LAST:event_BtnAltaActionPerformed

    private java.sql.Date ConvertirASql(java.util.Date FechaElegida) 
    {
        java.sql.Date SqlFechaConvertida = new java.sql.Date(FechaElegida.getTime()); 
        return SqlFechaConvertida;
    }      
    
    private void BtnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifActionPerformed
        this.BtnBaja.setVisible(false);
        this.BtnCancelar.setVisible(true);
        this.BtnBuscar.setVisible(false);
        this.BtnActualizar.setVisible(true);
        this.BtnModif.setVisible(false);
        this.BtnConsulta1.setVisible(false);
        Ocultar();
        NomViejo = this.LstNomEmp.getSelectedValue();
        TraerDatos(NomViejo);
        this.LblNom.setVisible(true);
        this.TxtNom.setVisible(true);
    }//GEN-LAST:event_BtnModifActionPerformed

   private void TraerDatos(String NombreEmp)
   {
        boolean z1 = ObjEmp2.BuscarRegistro(NombreEmp);
        if (z1 == true) 
        {
            Visible();
            
            this.BtnAlta.setEnabled(false);
            this.BtnConsulta1.setEnabled(false);
            this.TxtCargo.setText(ObjEmp2.getCargo());
            this.TxtSalario.setText(ObjEmp2.getSalario().toString());
            this.TxtComi.setText(ObjEmp2.getComi().toString());
            this.TxtCodJefe.setText(ObjEmp2.getCodJefe());
            this.TxtNom.setText(ObjEmp2.getNom());
            this.TxtCdEmp.setText(ObjEmp2.getCdEmp());
            this.TxtCdEmp.setEditable(false);
            
            if(ObjEmp2.getSex() == 'M')
                this.RdMasc.setSelected(true);
            else
                this.RdFem.setSelected(true);            
            
            this.DFInsc.setDate(ObjEmp2.getFInc());
            this.DFNac.setDate(ObjEmp2.getFNac());
            ListaDepto.setModel(ObjEmp2.MuestroDepto());
            this.BtnActualizar.setVisible(true);
            this.BtnCancelar.setVisible(true);
        }
    }
   
    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        try 
        {
            Con.Conectado().close();
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "no se pudo cerrar la base de datos");
        }
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        int z = JOptionPane.showConfirmDialog(null, "Esta seguro ?");
        if (z == 0)
        {
            ObjEmp2.setNom(NomCatBorrar);
            ObjEmp2.Baja();
            this.TxtNom.setText(null);
            LstNomEmp.setModel(ObjEmp2.Muestro());
            Visible();
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        Visible();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsulta1ActionPerformed
        this.PanelConsulta.setVisible(true);
        this.ListaDepto.setVisible(false);
        this.PanelNomEmp.setVisible(true);
        this.LblNomEmp.setVisible(true);
        this.LblNom8.setVisible(true);
        this.BtnModif.setVisible(true);
        this.BtnCancelar.setVisible(false);
        this.BtnEliminar.setVisible(false);
        this.BtnBaja.setVisible(true);
        this.BtnAlta.setVisible(false);
        this.BtnSalir.setVisible(true);
        this.LblNom.setVisible(false);
        this.TxtNom.setVisible(false);
        ObjEmp2 = new AbmEmpleado();
        LstNomEmp.setModel(ObjEmp2.Muestro());
    }//GEN-LAST:event_BtnConsulta1ActionPerformed

    private void TxtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomActionPerformed
       
    }//GEN-LAST:event_TxtNomActionPerformed

    private void TxtCdEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCdEmpActionPerformed
       
    }//GEN-LAST:event_TxtCdEmpActionPerformed

    private void TxtCdEmpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCdEmpKeyTyped
        SoloLetras(evt);
    }//GEN-LAST:event_TxtCdEmpKeyTyped

    private void TxtComiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtComiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtComiActionPerformed

    private void TxtComiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtComiKeyTyped
        SoloNumeros(evt);
    }//GEN-LAST:event_TxtComiKeyTyped

    private void TxtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSalarioActionPerformed

    private void TxtSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSalarioKeyTyped
        SoloNumeros(evt);
    }//GEN-LAST:event_TxtSalarioKeyTyped

    private void TxtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCargoActionPerformed

    private void TxtCargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCargoKeyTyped
        SoloLetras(evt);
    }//GEN-LAST:event_TxtCargoKeyTyped

    private void TxtCodJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodJefeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodJefeActionPerformed

    private void TxtCodJefeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodJefeKeyTyped
        SoloLetras(evt);
    }//GEN-LAST:event_TxtCodJefeKeyTyped

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
    
    
    private void SoloNumeros(java.awt.event.KeyEvent evt)
    {
        char nro = evt.getKeyChar();
        int Bs = (int) evt.getKeyChar();
        if ( !Character.isDigit(nro)  && Bs != 8  ) 
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número");
            evt.consume();
        }
    }
    
      
        
    private void Limpiar()
    {
        this.TxtNom.setText(null);
        this.TxtSalario.setText(null);
        this.TxtComi.setText(null);
        this.TxtCodJefe.setText(null);
        this.TxtCdEmp.setText(null);
        this.TxtCargo.setText(null);
        
    }

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
    private com.toedter.calendar.JDateChooser DFInsc;
    private com.toedter.calendar.JDateChooser DFNac;
    private javax.swing.ButtonGroup GrupoSexo;
    private org.edisoncor.gui.label.LabelRect LblCargo;
    private org.edisoncor.gui.label.LabelRect LblCdJefe;
    private org.edisoncor.gui.label.LabelRect LblNom;
    private org.edisoncor.gui.label.LabelRect LblNom1;
    private org.edisoncor.gui.label.LabelRect LblNom2;
    private org.edisoncor.gui.label.LabelRect LblNom3;
    private org.edisoncor.gui.label.LabelRect LblNom4;
    private org.edisoncor.gui.label.LabelRect LblNom5;
    private org.edisoncor.gui.label.LabelRect LblNom8;
    private org.edisoncor.gui.label.LabelRect LblNomEmp;
    private org.edisoncor.gui.label.LabelMetric LblTitulo;
    private javax.swing.JList<String> ListaDepto;
    private javax.swing.JList<String> LstNomEmp;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelConsulta;
    private javax.swing.JPanel PanelNomEmp;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelSexo;
    private javax.swing.JRadioButton RdFem;
    private javax.swing.JRadioButton RdMasc;
    private org.edisoncor.gui.textField.TextFieldRoundBackground TxtCargo;
    private org.edisoncor.gui.textField.TextFieldRoundBackground TxtCdEmp;
    private org.edisoncor.gui.textField.TextFieldRoundBackground TxtCodJefe;
    private org.edisoncor.gui.textField.TextFieldRoundBackground TxtComi;
    private org.edisoncor.gui.textField.TextFieldRoundBackground TxtNom;
    private org.edisoncor.gui.textField.TextFieldRoundBackground TxtSalario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
