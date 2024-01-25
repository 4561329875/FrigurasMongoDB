/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frontend;

import backend.Circulo;
import backend.Triangulo;
import javax.swing.ImageIcon;

/**
 *
 * @author david
 */
public class TrianguloJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MenuJPanel
     */
    public TrianguloJPanel() {
        
        initComponents();
        
        jLabelTitulo.putClientProperty( "FlatLaf.styleClass", "h2" );
        jLabelParrafo.putClientProperty( "FlatLaf.styleClass", "h4" );
        jLabelArea.putClientProperty( "FlatLaf.styleClass", "h4" );
        jLabelBase.putClientProperty( "FlatLaf.styleClass", "h4" );
        jLabelResArea.putClientProperty( "FlatLaf.styleClass", "h3" );
        jButtonCalcular.putClientProperty( "FlatLaf.styleClass", "h3" );
        jLabelAltura.putClientProperty( "FlatLaf.styleClass", "h4" );
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
        jLabelTriangulo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelParrafo = new javax.swing.JLabel();
        jLabelBase = new javax.swing.JLabel();
        jLabelAltura = new javax.swing.JLabel();
        jLabelArea = new javax.swing.JLabel();
        jLabelResArea = new javax.swing.JLabel();
        jButtonCalcular = new javax.swing.JButton();
        jTextFieldBase = new javax.swing.JTextField();
        jTextFieldAltura = new javax.swing.JTextField();
        jLabelTriangulo1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jLabelTriangulo.setIcon(new javax.swing.ImageIcon("C:\\Users\\labctr.BQV-LAB-SALA8\\Documents\\TRABAJO GRUPAL\\FrigurasMongoDB\\triangulo6.png")); // NOI18N

        setPreferredSize(new java.awt.Dimension(424, 251));

        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Area del Triangulo");
        jLabelTitulo.setToolTipText("");

        jLabelParrafo.setText("<html>El área de un triángulo se calcula con A = (base * altura) / 2, donde la base es la longitud de uno de los lados y la altura es la distancia perpendicular desde la base hasta el vértice opuesto.</html>");

        jLabelBase.setText("Base:");

        jLabelAltura.setText("Altura:");

        jLabelArea.setText("Area:");

        jLabelResArea.setText("0.00");

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jLabelTriangulo1.setIcon(new javax.swing.ImageIcon("C:\\Users\\labctr.BQV-LAB-SALA8\\Documents\\TRABAJO GRUPAL\\FrigurasMongoDB\\triangulo6.png")); // NOI18N

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
                        .addGap(12, 12, 12)
                        .addComponent(jLabelTriangulo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelBase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldBase, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelAltura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonCalcular)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelArea)
                                    .addGap(54, 54, 54)
                                    .addComponent(jLabelResArea))))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelParrafo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBase)
                            .addComponent(jTextFieldBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAltura)
                            .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelArea)
                            .addComponent(jLabelResArea))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCalcular)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTriangulo1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        Triangulo tri = new Triangulo(Double.parseDouble(jTextFieldBase.getText()), Double.parseDouble(jTextFieldAltura.getText()));
        jLabelResArea.setText(String.valueOf(tri.calcularArea()));
        
        
    }//GEN-LAST:event_jButtonCalcularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JLabel jLabelAltura;
    private javax.swing.JLabel jLabelArea;
    private javax.swing.JLabel jLabelBase;
    private javax.swing.JLabel jLabelParrafo;
    private javax.swing.JLabel jLabelResArea;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTriangulo;
    private javax.swing.JLabel jLabelTriangulo1;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldBase;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
