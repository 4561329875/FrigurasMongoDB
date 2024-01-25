/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frontend;

import backend.Circulo;
import backend.Cuadrado;
import javax.swing.ImageIcon;

/**
 *
 * @author david
 */
public class CuadradoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MenuJPanel
     */
    public CuadradoJPanel() {
        
        initComponents();
        
        jLabelTitulo.putClientProperty( "FlatLaf.styleClass", "h2" );
        jLabelParrafo.putClientProperty( "FlatLaf.styleClass", "h4" );
        jLabelArea.putClientProperty( "FlatLaf.styleClass", "h4" );
        jLabelLado.putClientProperty( "FlatLaf.styleClass", "h4" );
        jLabelResArea.putClientProperty( "FlatLaf.styleClass", "h3" );
        jButtonCalcular.putClientProperty( "FlatLaf.styleClass", "h3" );
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelParrafo = new javax.swing.JLabel();
        jLabelLado = new javax.swing.JLabel();
        jLabelArea = new javax.swing.JLabel();
        jLabelResArea = new javax.swing.JLabel();
        jButtonCalcular = new javax.swing.JButton();
        jTextFieldLado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setPreferredSize(new java.awt.Dimension(424, 251));

        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Area del Cuadrado");
        jLabelTitulo.setToolTipText("");

        jLabelParrafo.setText("<html> El área de un cuadrado se calcula multiplicando la longitud de un lado por sí misma. La fórmula general es A = lado², donde \"lado\" representa la longitud de uno de los lados del cuadrado.</html>");

        jLabelLado.setText("Lado:");

        jLabelArea.setText("Area:");

        jLabelResArea.setText("0.00");

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\labctr.BQV-LAB-SALA8\\Documents\\TRABAJO GRUPAL\\FrigurasMongoDB\\cuadrado1.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelParrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelLado)
                                .addGap(15, 15, 15)
                                .addComponent(jTextFieldLado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButtonCalcular))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelArea)
                                .addGap(54, 54, 54)
                                .addComponent(jLabelResArea)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelParrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLado)
                            .addComponent(jTextFieldLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelArea)
                            .addComponent(jLabelResArea))
                        .addGap(21, 21, 21)
                        .addComponent(jButtonCalcular))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        Cuadrado cua = new Cuadrado(Double.parseDouble(jTextFieldLado.getText()));
        jLabelResArea.setText(String.valueOf(cua.calcularArea()));
        
        
    }//GEN-LAST:event_jButtonCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelArea;
    private javax.swing.JLabel jLabelLado;
    private javax.swing.JLabel jLabelParrafo;
    private javax.swing.JLabel jLabelResArea;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldLado;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
