package Formularios;
import Desarrollo.ConVarias;
import javax.swing.JOptionPane;

public class FrmConsultasVarias extends javax.swing.JInternalFrame {

    ConVarias Objx;
    
    public FrmConsultasVarias(int NroForm) {
        initComponents();
        Objx = new ConVarias(NroForm);
        TitulosLabel(NroForm);
        this.Tabela.setModel(Objx.Titulos());
    }
    
    private void TitulosLabel(int nro)
    {
        switch(nro)
        {
            case 1:
            {
                this.LblTitulo.setText("Nombres de los departamentos que no sean FACTURACION, RECEPCION y COMERCIO EXTERIOR");
                break;
            }
            case 2:
            {
                this.LblTitulo.setText("Información de empleados cuyo nombre tiene exactamente 6 caracteres");
                break;
            }
            case 3:
            {
                this.LblTitulo.setText("Información de empleados cuyo nombre tiene al menos 5 caracteres");
                break;
            }
            case 4:
            {
                this.LblTitulo.setText("Nombres, salario y comisiones de empleados cuyo salario sea la mitad de de su comisión.");
                break;
            }
            case 5:
            {
                this.LblTitulo.setText("Mostrar los nombres de los últimos 5 empleados por orden alfabético.");
                break;
            }
            case 6:
            {
                this.LblTitulo.setText("Hallar el salario más alto, el más bajo y la diferencia entre ellos.");
                break;
            }
            case 7:
            {
                this.LblTitulo.setText("Código/nombre de cada jefe/número empleados que dirige (solo más de 6).");
                break;
            }
            default:
                JOptionPane.showMessageDialog(null, "Opcion ilegal.");
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        LblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        BtnMostrar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

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

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(BtnMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSalir)
                .addGap(89, 89, 89))
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(194, 194, 194))
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMostrar)
                    .addComponent(BtnSalir))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here: Botão SALIR
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        // TODO add your handling code here: Botão MOSTRAR
        this.Tabela.setModel(Objx.Mostra());
    }//GEN-LAST:event_BtnMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JTable Tabela;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
