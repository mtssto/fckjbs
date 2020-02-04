
package Formularios;
import java.util.Date;
import Desarrollo.AbmFecha;

public class EjemploFecha extends javax.swing.JInternalFrame {
Date FechaElegida;
AbmFecha ObjFecha;
    public EjemploFecha() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JFecha = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setClosable(true);

        JFecha.setBackground(new java.awt.Color(0, 204, 0));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addComponent(JFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(JFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jButton1)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FechaElegida = this.JFecha.getDate();
        java.sql.Date SqlFechaVta = ConvertirASql(FechaElegida);
        ObjFecha = new AbmFecha(SqlFechaVta);
        ObjFecha.Alta();
    }//GEN-LAST:event_jButton1ActionPerformed

    private java.sql.Date ConvertirASql(java.util.Date FechaElegida) 
    {
        java.sql.Date SqlFechaConvertida = new java.sql.Date(FechaElegida.getTime()); 
        return SqlFechaConvertida;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JFecha;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
