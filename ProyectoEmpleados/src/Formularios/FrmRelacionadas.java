package Formularios;
import Desarrollo.ConRelacionadas;
import javax.swing.JOptionPane;

public class FrmRelacionadas extends javax.swing.JInternalFrame {
    
    ConRelacionadas Objx;

    public FrmRelacionadas(int NroFrm) {
        initComponents();
        Objx = new ConRelacionadas(NroFrm);
        TitulosLabel(NroFrm);
        this.Tabela.setModel(Objx.Titulos());
    }

    
    private void TitulosLabel(int nro)
    {
        switch(nro)
        {
            case 1:
            {
                this.LblTitulo.setText("Obtener el nombre y el departamento de los empleados con cargo 'Secretaria'' o 'Operador', que no trabajan en \"RECEPCION\", cuyo salario es superior a $800 ordenados por fecha de incorporación");
                break;
            }
            case 2:
            {
                this.LblTitulo.setText("Listar los dados de los empleados cyuo nombre inicia por la lertra M, su salario es mayor a $800 o reciben comision mayor a 400 y trabajan para el departamento de 'facturacion'");
                break;
            }
            case 3:
            {
                this.LblTitulo.setText("Mostrar el numero de mepleado de sexo femenino y de sexo masculino, por departamento.");
                break;
            }
            case 4:
            {
                this.LblTitulo.setText("Hallar el salario promedio por departamento");
                break;
            }
            case 5:
            {
                this.LblTitulo.setText("Mostrar la lista de los empleados cuyo salario es mayo or igual que el promedio de la empresa. Ordenarlo por departamento.");
                break;
            }
            case 6:
            {
                this.LblTitulo.setText("Hallar los departamentos que tienete más de 5 empleados. Mostrar el numero de empleados de esos departamentos.");
                break;
            }
            case 7:
            {
                this.LblTitulo.setText("Hallar los departamentos que no tienen empleados.");
                break;
            }
            case 8:
            {
                this.LblTitulo.setText("Mostrar el nombre del departamento cuya suma de salarios se la más alta, indicando el valor de la suma.");
                break;
            }
            default:
                JOptionPane.showMessageDialog(null, "Opcion ilegal.");
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        BtnMostrar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        LblTitulo.setText("D");

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título 1"
            }
        ));
        jScrollPane1.setViewportView(Tabela);

        BtnMostrar.setText("MOSTRAR");
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });

        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSalir)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1084, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMostrar)
                    .addComponent(BtnSalir))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        // TODO add your handling code here:
        this.Tabela.setModel(Objx.Mostra());
    }//GEN-LAST:event_BtnMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JTable Tabela;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
