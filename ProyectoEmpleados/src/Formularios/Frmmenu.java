package Formularios;

public class Frmmenu extends javax.swing.JFrame {

    public Frmmenu() {
        initComponents();
        this.setTitle("PROYECTO EMPLEADOS");
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        MenuBarra = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        ItemDepto = new javax.swing.JMenuItem();
        ItemEmpleado = new javax.swing.JMenuItem();
        ItemEjemploFecha = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        ItemSoloDepto = new javax.swing.JMenuItem();
        ItemNomDepto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ItemDatosEmp = new javax.swing.JMenuItem();
        ItemSecre = new javax.swing.JMenuItem();
        ItemNomSdosEmp = new javax.swing.JMenuItem();
        ItemNomCar = new javax.swing.JMenuItem();
        ItemDeptoA405 = new javax.swing.JMenuItem();
        ItemComi = new javax.swing.JMenuItem();
        ItemTotal = new javax.swing.JMenuItem();
        Item500 = new javax.swing.JMenuItem();
        ItemMenor30 = new javax.swing.JMenuItem();
        ItemD90 = new javax.swing.JMenuItem();
        ItemCyD = new javax.swing.JMenuItem();
        ItemComiMayor500 = new javax.swing.JMenuItem();
        ItemSinComision = new javax.swing.JMenuItem();
        ItemMA = new javax.swing.JMenuItem();
        ItemSalario = new javax.swing.JMenuItem();
        ItemTieneComision = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ItemRel1 = new javax.swing.JMenuItem();
        ItemRel2 = new javax.swing.JMenuItem();
        ItemRel3 = new javax.swing.JMenuItem();
        ItemRel4 = new javax.swing.JMenuItem();
        ItemRel5 = new javax.swing.JMenuItem();
        ItemRel6 = new javax.swing.JMenuItem();
        ItemRel7 = new javax.swing.JMenuItem();
        ItemRel8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        ItemVarias1 = new javax.swing.JMenuItem();
        ItemVarias2 = new javax.swing.JMenuItem();
        ItemVarias3 = new javax.swing.JMenuItem();
        ItemVarias4 = new javax.swing.JMenuItem();
        ItemVarias5 = new javax.swing.JMenuItem();
        ItemVarias6 = new javax.swing.JMenuItem();
        ItemVarias7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setBackground(new java.awt.Color(153, 153, 0));

        fileMenu.setMnemonic('f');
        fileMenu.setText("CARGA DE DATOS");

        ItemDepto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        ItemDepto.setMnemonic('o');
        ItemDepto.setText("DEPARATAMENTO");
        ItemDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDeptoActionPerformed(evt);
            }
        });
        fileMenu.add(ItemDepto);

        ItemEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        ItemEmpleado.setMnemonic('s');
        ItemEmpleado.setText("EMPLEADOS");
        ItemEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemEmpleadoActionPerformed(evt);
            }
        });
        fileMenu.add(ItemEmpleado);

        ItemEjemploFecha.setText("Ejemplo Fecha");
        ItemEjemploFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemEjemploFechaActionPerformed(evt);
            }
        });
        fileMenu.add(ItemEjemploFecha);

        MenuBarra.add(fileMenu);

        jMenu1.setText("CONSULTAS TABLA DEPARTAMENTOS");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        ItemSoloDepto.setText("Obtener los datos completos de los departamentos");
        ItemSoloDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemSoloDeptoActionPerformed(evt);
            }
        });
        jMenu1.add(ItemSoloDepto);

        ItemNomDepto.setText("Listar el nombre de los departamentos");
        ItemNomDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNomDeptoActionPerformed(evt);
            }
        });
        jMenu1.add(ItemNomDepto);

        MenuBarra.add(jMenu1);

        jMenu2.setText("CONSULTA TABLA EMPLEADOS");

        ItemDatosEmp.setText("Obtener los datos completos de los empleados");
        ItemDatosEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDatosEmpActionPerformed(evt);
            }
        });
        jMenu2.add(ItemDatosEmp);

        ItemSecre.setText("Obtener los datos de los empleados secretaria, ordenado por nombre");
        ItemSecre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemSecreActionPerformed(evt);
            }
        });
        jMenu2.add(ItemSecre);

        ItemNomSdosEmp.setText("Obtener el nombre y salario de los empleados");
        ItemNomSdosEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNomSdosEmpActionPerformed(evt);
            }
        });
        jMenu2.add(ItemNomSdosEmp);

        ItemNomCar.setText("Obtener el nombre y cargo de todos los empleados, ordenado por salario");
        ItemNomCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNomCarActionPerformed(evt);
            }
        });
        jMenu2.add(ItemNomCar);

        ItemDeptoA405.setText("Listar los salarios y comisiones de los empleados del departamento A405, ordenado por comisión");
        ItemDeptoA405.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDeptoA405ActionPerformed(evt);
            }
        });
        jMenu2.add(ItemDeptoA405);

        ItemComi.setText("Listar todas las comisiones.");
        ItemComi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemComiActionPerformed(evt);
            }
        });
        jMenu2.add(ItemComi);

        ItemTotal.setText("Obtener el valor total a pagar que resulta de sumar a los empleados del departamento D900 con una bonificación de 500 pesos en orden alfabetico de empleados");
        ItemTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemTotalActionPerformed(evt);
            }
        });
        jMenu2.add(ItemTotal);

        Item500.setText("Obtener la lista de empleados que ganan una comisión superior a 500 pesos.");
        Item500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item500ActionPerformed(evt);
            }
        });
        jMenu2.add(Item500);

        ItemMenor30.setText("Listar los empleados cuya comisión es menor o igual que 30% de su sueldo.");
        ItemMenor30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenor30ActionPerformed(evt);
            }
        });
        jMenu2.add(ItemMenor30);

        ItemD90.setText("Hallar el salario y la comisión de aquellos empleados con codigo de jefe igual a D90 y sueldo superior a 8000 pesos.");
        ItemD90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemD90ActionPerformed(evt);
            }
        });
        jMenu2.add(ItemD90);

        ItemCyD.setText("Mostrar los empleados cuyo nombre empieze con las letras C y D (rango).");
        ItemCyD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCyDActionPerformed(evt);
            }
        });
        jMenu2.add(ItemCyD);

        ItemComiMayor500.setText("Listar el salario, la comisión, codigo de empleado y nombre de aquellos empleados que tienen una comisión superior a 500 pesos ordenado por nombre del empleado.");
        ItemComiMayor500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemComiMayor500ActionPerformed(evt);
            }
        });
        jMenu2.add(ItemComiMayor500);

        ItemSinComision.setText("Obtener un listado similar al anterior pero de los empleados que no tienen comisión MENOR A 100.");
        ItemSinComision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemSinComisionActionPerformed(evt);
            }
        });
        jMenu2.add(ItemSinComision);

        ItemMA.setText("Hallar los empleados cuyo el nombre no tiene la cadena 'MA'.");
        ItemMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMAActionPerformed(evt);
            }
        });
        jMenu2.add(ItemMA);

        ItemSalario.setText("Mostrar el salario mas alto de la empresa.");
        ItemSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemSalarioActionPerformed(evt);
            }
        });
        jMenu2.add(ItemSalario);

        ItemTieneComision.setText("Mostrar cada una de las comisiones y el numero del empleado que la recibe, solo si tiene comisión MAYOR A 100.");
        ItemTieneComision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemTieneComisionActionPerformed(evt);
            }
        });
        jMenu2.add(ItemTieneComision);

        MenuBarra.add(jMenu2);

        jMenu3.setText("CONSULTA TABLAS RELACIONADAS");

        ItemRel1.setText("Obtener el nombre y el departamento de los empleados con cargo 'Secretaria'' o 'Operador', que no trabajan en \"RECEPCION\", cuyo salario es superior a $800 ordenados por fecha de incorporación");
        ItemRel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRel1ActionPerformed(evt);
            }
        });
        jMenu3.add(ItemRel1);

        ItemRel2.setText("Listar los dados de los empleados cyuo nombre inicia por la lertra M, su salario es mayor a $800 o reciben comision mayor a 400 y trabajan para el departamento de 'facturacion'");
        ItemRel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRel2ActionPerformed(evt);
            }
        });
        jMenu3.add(ItemRel2);

        ItemRel3.setText("Mostrar el numero de mepleado de sexo femenino y de sexo masculino, por departamento.");
        ItemRel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRel3ActionPerformed(evt);
            }
        });
        jMenu3.add(ItemRel3);

        ItemRel4.setText("Hallar el salario promedio por departamento");
        ItemRel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRel4ActionPerformed(evt);
            }
        });
        jMenu3.add(ItemRel4);

        ItemRel5.setText("Mostrar la lista de los empleados cuyo salario es mayo or igual que el promedio de la empresa. Ordenarlo por departamento.");
        ItemRel5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRel5ActionPerformed(evt);
            }
        });
        jMenu3.add(ItemRel5);

        ItemRel6.setText("Hallar los departamentos que tienete más de 5 empleados. Mostrar el numero de empleados de esos departamentos.");
        ItemRel6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRel6ActionPerformed(evt);
            }
        });
        jMenu3.add(ItemRel6);

        ItemRel7.setText("Hallar los departamentos que no tienen empleados.");
        ItemRel7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRel7ActionPerformed(evt);
            }
        });
        jMenu3.add(ItemRel7);

        ItemRel8.setText("Mostrar el nombre del departamento cuya suma de salarios se la más alta, indicando el valor de la suma.");
        ItemRel8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRel8ActionPerformed(evt);
            }
        });
        jMenu3.add(ItemRel8);

        MenuBarra.add(jMenu3);

        jMenu4.setText("CONSULTAS VARIAS");

        ItemVarias1.setText("Nombres de los departamentos que no sean FACTURACION, RECEPCION y COMERCIO EXTERIOR");
        ItemVarias1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemVarias1ActionPerformed(evt);
            }
        });
        jMenu4.add(ItemVarias1);

        ItemVarias2.setText("Información de empleados cuyo nombre tiene exactamente 6 caracteres");
        ItemVarias2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemVarias2ActionPerformed(evt);
            }
        });
        jMenu4.add(ItemVarias2);

        ItemVarias3.setText("Información de empleados cuyo nombre tiene al menos 5 caracteres");
        ItemVarias3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemVarias3ActionPerformed(evt);
            }
        });
        jMenu4.add(ItemVarias3);

        ItemVarias4.setText("Nombres, salario y comisiones de empleados cuyo salario sea la mitad de de su comisión.");
        ItemVarias4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemVarias4ActionPerformed(evt);
            }
        });
        jMenu4.add(ItemVarias4);

        ItemVarias5.setText("Mostrar los nombres de los últimos 5 empleados por orden alfabético.");
        ItemVarias5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemVarias5ActionPerformed(evt);
            }
        });
        jMenu4.add(ItemVarias5);

        ItemVarias6.setText("Hallar el salario más alto, el más bajo y la diferencia entre ellos.");
        ItemVarias6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemVarias6ActionPerformed(evt);
            }
        });
        jMenu4.add(ItemVarias6);

        ItemVarias7.setText("Código/nombre de cada jefe/número empleados que dirige (solo más de 6).");
        ItemVarias7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemVarias7ActionPerformed(evt);
            }
        });
        jMenu4.add(ItemVarias7);

        MenuBarra.add(jMenu4);

        setJMenuBar(MenuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1185, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDeptoActionPerformed
        FrmDepto ObjDepto = new FrmDepto();
        Escritorio.add(ObjDepto);
        ObjDepto.show();
        
    }//GEN-LAST:event_ItemDeptoActionPerformed

    private void ItemEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEmpleadoActionPerformed
        FrmEmple ObjEmp = new FrmEmple();
        Escritorio.add(ObjEmp);
        ObjEmp.show();
    }//GEN-LAST:event_ItemEmpleadoActionPerformed

    private void ItemEjemploFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemEjemploFechaActionPerformed
        EjemploFecha objfe = new EjemploFecha();
        Escritorio.add(objfe);
        objfe.show();
    }//GEN-LAST:event_ItemEjemploFechaActionPerformed

    private void ItemSoloDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemSoloDeptoActionPerformed
        FrmConsSoloDepto objSoloDepto = new FrmConsSoloDepto();
        Escritorio.add(objSoloDepto);
        objSoloDepto.show();
    }//GEN-LAST:event_ItemSoloDeptoActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
 
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void ItemNomDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNomDeptoActionPerformed
       FrmConNomDepto ObjNomDepto = new FrmConNomDepto();
       Escritorio.add(ObjNomDepto);
       ObjNomDepto.show();
    }//GEN-LAST:event_ItemNomDeptoActionPerformed

    private void ItemDatosEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDatosEmpActionPerformed
        FrmConSoloEmp ObjSoloEmp = new FrmConSoloEmp();
        Escritorio.add(ObjSoloEmp);
        ObjSoloEmp.show();
    }//GEN-LAST:event_ItemDatosEmpActionPerformed

    private void ItemSecreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemSecreActionPerformed
       FrmConSecretaria ObjSecre = new FrmConSecretaria();
       Escritorio.add(ObjSecre);
       ObjSecre.show();
    }//GEN-LAST:event_ItemSecreActionPerformed

    private void ItemNomSdosEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNomSdosEmpActionPerformed
        FrmConNomSdo ObjNomSdo = new FrmConNomSdo();
        Escritorio.add(ObjNomSdo);
        ObjNomSdo.show();
    }//GEN-LAST:event_ItemNomSdosEmpActionPerformed

    private void ItemNomCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNomCarActionPerformed
        // TODO add your handling code here:
        FrmEmpNomCar ObjNomcar = new FrmEmpNomCar();
        Escritorio.add(ObjNomcar);
        ObjNomcar.show();
    }//GEN-LAST:event_ItemNomCarActionPerformed

    private void ItemDeptoA405ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDeptoA405ActionPerformed
        // TODO add your handling code here:
        FrmEmpSalCom ObjA405 = new FrmEmpSalCom();
        Escritorio.add(ObjA405);
        ObjA405.show();
    }//GEN-LAST:event_ItemDeptoA405ActionPerformed

    private void ItemD90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemD90ActionPerformed
        // TODO add your handling code here: Hallar el salario y la comisión de aquellos empleados con codigo de jefe igual a D90 y sueldo superior a 8000 pesos.
        FrmConEmpDni ObjConEmpDni = new FrmConEmpDni();
        Escritorio.add(ObjConEmpDni);
        ObjConEmpDni.show();
    }//GEN-LAST:event_ItemD90ActionPerformed

    private void ItemComiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemComiActionPerformed
        // TODO add your handling code here: Listar todas las comisiones
        FrmEmpComi ObjEmpComi = new FrmEmpComi();
        Escritorio.add(ObjEmpComi);
        ObjEmpComi.show();
    }//GEN-LAST:event_ItemComiActionPerformed

    private void ItemTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemTotalActionPerformed
        // TODO add your handling code here: Obtener el valor total a pagar que resulta de sumar a los empleados del departamento D900 con una bonificación de 500 pesos en orden alfabetico de empleados
        FrmEmpTotalPagar ObjEmpTotalPagar = new FrmEmpTotalPagar();
        Escritorio.add(ObjEmpTotalPagar);
        ObjEmpTotalPagar.show();
        
    }//GEN-LAST:event_ItemTotalActionPerformed

    private void Item500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item500ActionPerformed
        // TODO add your handling code here: Comision superior a 500
        FrmEmpConMayor500 ObjEmpConMayor500 = new FrmEmpConMayor500();
        Escritorio.add(ObjEmpConMayor500);
        ObjEmpConMayor500.show();
    }//GEN-LAST:event_Item500ActionPerformed

    private void ItemMenor30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenor30ActionPerformed
        // TODO add your handling code here: 30%
        FrmEmpConMenorSdo ObjItemMenor30 = new FrmEmpConMenorSdo();
        Escritorio.add(ObjItemMenor30);
        ObjItemMenor30.show();
    }//GEN-LAST:event_ItemMenor30ActionPerformed

    private void ItemCyDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCyDActionPerformed
        // TODO add your handling code here:Mostrar los empleados cuyo nombre empieze con las letras C y D (rango).
        FrmEmpLike ObjEmpLike = new FrmEmpLike();
        Escritorio.add(ObjEmpLike);
        ObjEmpLike.show();
    }//GEN-LAST:event_ItemCyDActionPerformed

    private void ItemComiMayor500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemComiMayor500ActionPerformed
        // TODO add your handling code here:Listar el salario, la comisión, codigo de empleado y nombre de aquellos empleados que tienen una comisión superior a 500 pesos ordenado por nombre del empleado.
        FrmSdoComTotal ObjSdoComTotal = new FrmSdoComTotal();
        Escritorio.add(ObjSdoComTotal);
        ObjSdoComTotal.show();
    }//GEN-LAST:event_ItemComiMayor500ActionPerformed

    private void ItemMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMAActionPerformed
        // TODO add your handling code here: No tiene la cadena 'MA'
        FrmEmpNoLike ObjEmpNoLike = new FrmEmpNoLike();
        Escritorio.add(ObjEmpNoLike);
        ObjEmpNoLike.show();
    }//GEN-LAST:event_ItemMAActionPerformed

    private void ItemSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemSalarioActionPerformed
        // TODO add your handling code here: Mostrar el salario mas alto de la empresa. (11)
        FrmEmpConSdoMasAlto ObjEmpConSdoMasAlto = new FrmEmpConSdoMasAlto();
        Escritorio.add(ObjEmpConSdoMasAlto);
        ObjEmpConSdoMasAlto.show();
    }//GEN-LAST:event_ItemSalarioActionPerformed

    private void ItemTieneComisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemTieneComisionActionPerformed
        // TODO add your handling code here:Mostrar cada una de las comisiones y el numero del empleado que la recibe, solo si tiene comisión. (12)
        FrmEmpSiTieneComi ObjSiTieneComi = new FrmEmpSiTieneComi();
        Escritorio.add(ObjSiTieneComi);
        ObjSiTieneComi.show();
    }//GEN-LAST:event_ItemTieneComisionActionPerformed

    private void ItemSinComisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemSinComisionActionPerformed
        // TODO add your handling code here:Obtener un listado similar al anterior pero de los empleados que no tiene comision.
        FrmEmpNoComi ObjNoTieneComi = new FrmEmpNoComi();
        Escritorio.add(ObjNoTieneComi);
        ObjNoTieneComi.show();
    }//GEN-LAST:event_ItemSinComisionActionPerformed

    private void ItemRel6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRel6ActionPerformed
        // TODO add your handling code here:
        FrmRelacionadas ObjRel = new FrmRelacionadas(6);
        Escritorio.add(ObjRel);
        ObjRel.show();
    }//GEN-LAST:event_ItemRel6ActionPerformed

    private void ItemRel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRel1ActionPerformed
        // TODO add your handling code here:
        FrmRelacionadas ObjRel = new FrmRelacionadas(1);
        Escritorio.add(ObjRel);
        ObjRel.show();
    }//GEN-LAST:event_ItemRel1ActionPerformed

    private void ItemRel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRel2ActionPerformed
        // TODO add your handling code here:
        FrmRelacionadas ObjRel = new FrmRelacionadas(2);
        Escritorio.add(ObjRel);
        ObjRel.show();
    }//GEN-LAST:event_ItemRel2ActionPerformed

    private void ItemRel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRel3ActionPerformed
        // TODO add your handling code here:
        FrmRelacionadas ObjRel = new FrmRelacionadas(3);
        Escritorio.add(ObjRel);
        ObjRel.show();
    }//GEN-LAST:event_ItemRel3ActionPerformed

    private void ItemRel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRel4ActionPerformed
        // TODO add your handling code here:
        FrmRelacionadas ObjRel = new FrmRelacionadas(4);
        Escritorio.add(ObjRel);
        ObjRel.show();
    }//GEN-LAST:event_ItemRel4ActionPerformed

    private void ItemRel5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRel5ActionPerformed
        // TODO add your handling code here:
        FrmRelacionadas ObjRel = new FrmRelacionadas(5);
        Escritorio.add(ObjRel);
        ObjRel.show();
    }//GEN-LAST:event_ItemRel5ActionPerformed

    private void ItemRel7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRel7ActionPerformed
        // TODO add your handling code here:
        FrmRelacionadas ObjRel = new FrmRelacionadas(7);
        Escritorio.add(ObjRel);
        ObjRel.show();
    }//GEN-LAST:event_ItemRel7ActionPerformed

    private void ItemRel8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRel8ActionPerformed
        // TODO add your handling code here:
        FrmRelacionadas ObjRel = new FrmRelacionadas(8);
        Escritorio.add(ObjRel);
        ObjRel.show();
    }//GEN-LAST:event_ItemRel8ActionPerformed

    private void ItemVarias7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemVarias7ActionPerformed
        // TODO add your handling code here:
        FrmConsultasVarias ObjVarias = new FrmConsultasVarias(7);
        Escritorio.add(ObjVarias);
        ObjVarias.show();
    }//GEN-LAST:event_ItemVarias7ActionPerformed

    private void ItemVarias1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemVarias1ActionPerformed
        // TODO add your handling code here:
        FrmConsultasVarias ObjVarias = new FrmConsultasVarias(1);
        Escritorio.add(ObjVarias);
        ObjVarias.show();
    }//GEN-LAST:event_ItemVarias1ActionPerformed

    private void ItemVarias2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemVarias2ActionPerformed
        // TODO add your handling code here:
        FrmConsultasVarias ObjVarias = new FrmConsultasVarias(2);
        Escritorio.add(ObjVarias);
        ObjVarias.show();
    }//GEN-LAST:event_ItemVarias2ActionPerformed

    private void ItemVarias3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemVarias3ActionPerformed
        // TODO add your handling code here:
        FrmConsultasVarias ObjVarias = new FrmConsultasVarias(3);
        Escritorio.add(ObjVarias);
        ObjVarias.show();
    }//GEN-LAST:event_ItemVarias3ActionPerformed

    private void ItemVarias4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemVarias4ActionPerformed
        // TODO add your handling code here:
        FrmConsultasVarias ObjVarias = new FrmConsultasVarias(4);
        Escritorio.add(ObjVarias);
        ObjVarias.show();
    }//GEN-LAST:event_ItemVarias4ActionPerformed

    private void ItemVarias5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemVarias5ActionPerformed
        // TODO add your handling code here:
        FrmConsultasVarias ObjVarias = new FrmConsultasVarias(5);
        Escritorio.add(ObjVarias);
        ObjVarias.show();
    }//GEN-LAST:event_ItemVarias5ActionPerformed

    private void ItemVarias6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemVarias6ActionPerformed
        // TODO add your handling code here:
        FrmConsultasVarias ObjVarias = new FrmConsultasVarias(6);
        Escritorio.add(ObjVarias);
        ObjVarias.show();
    }//GEN-LAST:event_ItemVarias6ActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frmmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem Item500;
    private javax.swing.JMenuItem ItemComi;
    private javax.swing.JMenuItem ItemComiMayor500;
    private javax.swing.JMenuItem ItemCyD;
    private javax.swing.JMenuItem ItemD90;
    private javax.swing.JMenuItem ItemDatosEmp;
    private javax.swing.JMenuItem ItemDepto;
    private javax.swing.JMenuItem ItemDeptoA405;
    private javax.swing.JMenuItem ItemEjemploFecha;
    private javax.swing.JMenuItem ItemEmpleado;
    private javax.swing.JMenuItem ItemMA;
    private javax.swing.JMenuItem ItemMenor30;
    private javax.swing.JMenuItem ItemNomCar;
    private javax.swing.JMenuItem ItemNomDepto;
    private javax.swing.JMenuItem ItemNomSdosEmp;
    private javax.swing.JMenuItem ItemRel1;
    private javax.swing.JMenuItem ItemRel2;
    private javax.swing.JMenuItem ItemRel3;
    private javax.swing.JMenuItem ItemRel4;
    private javax.swing.JMenuItem ItemRel5;
    private javax.swing.JMenuItem ItemRel6;
    private javax.swing.JMenuItem ItemRel7;
    private javax.swing.JMenuItem ItemRel8;
    private javax.swing.JMenuItem ItemSalario;
    private javax.swing.JMenuItem ItemSecre;
    private javax.swing.JMenuItem ItemSinComision;
    private javax.swing.JMenuItem ItemSoloDepto;
    private javax.swing.JMenuItem ItemTieneComision;
    private javax.swing.JMenuItem ItemTotal;
    private javax.swing.JMenuItem ItemVarias1;
    private javax.swing.JMenuItem ItemVarias2;
    private javax.swing.JMenuItem ItemVarias3;
    private javax.swing.JMenuItem ItemVarias4;
    private javax.swing.JMenuItem ItemVarias5;
    private javax.swing.JMenuItem ItemVarias6;
    private javax.swing.JMenuItem ItemVarias7;
    private javax.swing.JMenuBar MenuBarra;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    // End of variables declaration//GEN-END:variables

}
