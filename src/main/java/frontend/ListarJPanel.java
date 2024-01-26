/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frontend;

import backend.Circulo;
import backend.Cuadrado;
import backend.Triangulo;
import com.mongodb.MongoException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author labctr
 */
public class ListarJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ListarJPanel
     */
   private void updateTrianguloTable() {
        Triangulo triangulo = new Triangulo(0, 0); 

        try {
            
            Triangulo[] triangulos = triangulo.consultarAreas();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0); 

            int count = 1;
            for (Triangulo tri : triangulos) {
                model.addRow(new Object[]{count++, tri.getBase(), tri.getAltura(), tri.calcularArea()});
            }
        } catch (MongoException e) {
            
            e.printStackTrace();
        }
        Cuadrado cuadrado = new Cuadrado(0); 
        
        try {
            
            Cuadrado[] cuadrados = cuadrado.consultarAreas();

            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            model.setRowCount(0); 

            int count = 1;
            for (Cuadrado cua : cuadrados) {
                model.addRow(new Object[]{count++, cua.getLado(), cua.calcularArea()});
            }
        } catch (MongoException e) {
            
            e.printStackTrace();
        }
        Circulo circulo = new Circulo(0);
        
        try {
            
            Circulo[] circulos = circulo.consultarAreas();

            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0); 

            int count = 1;
            for (Circulo cua : circulos) {
                model.addRow(new Object[]{count++, cua.getRadio(), cua.calcularArea()});
            }
        } catch (MongoException e) {
            
            e.printStackTrace();
        }
        
    }

    public ListarJPanel() {
        initComponents();
        jPanelCirculo.setVisible(false);
        jPanelTriangulo.setVisible(false);
        jPanelCuadrado.setVisible(false);
        // Call the method to initially update the table
        updateTrianguloTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTriangulo1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanelTodo = new javax.swing.JPanel();
        jPanelTriangulo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelCuadrado = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanelCirculo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabelImg = new javax.swing.JLabel();
        jLabelImg1 = new javax.swing.JLabel();
        jLabelImg2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "#", "BASE", "ALTURA", "AREA"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelTrianguloLayout = new javax.swing.GroupLayout(jPanelTriangulo);
        jPanelTriangulo.setLayout(jPanelTrianguloLayout);
        jPanelTrianguloLayout.setHorizontalGroup(
            jPanelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTrianguloLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelTrianguloLayout.setVerticalGroup(
            jPanelTrianguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTrianguloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "#", "LADO", "AREA"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanelCuadradoLayout = new javax.swing.GroupLayout(jPanelCuadrado);
        jPanelCuadrado.setLayout(jPanelCuadradoLayout);
        jPanelCuadradoLayout.setHorizontalGroup(
            jPanelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCuadradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCuadradoLayout.setVerticalGroup(
            jPanelCuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCuadradoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "#", "RADIO", "AREA"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanelCirculoLayout = new javax.swing.GroupLayout(jPanelCirculo);
        jPanelCirculo.setLayout(jPanelCirculoLayout);
        jPanelCirculoLayout.setHorizontalGroup(
            jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCirculoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelCirculoLayout.setVerticalGroup(
            jPanelCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelTodoLayout = new javax.swing.GroupLayout(jPanelTodo);
        jPanelTodo.setLayout(jPanelTodoLayout);
        jPanelTodoLayout.setHorizontalGroup(
            jPanelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanelTodoLayout.setVerticalGroup(
            jPanelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTodoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jLabelImg.setIcon(new javax.swing.ImageIcon("./src/main/java/resourses/triangulo.png"));
        jLabelImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImgMouseClicked(evt);
            }
        });

        jLabelImg1.setIcon(new javax.swing.ImageIcon("./src/main/java/resourses/cuadrado.png"));
        jLabelImg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImg1MouseClicked(evt);
            }
        });

        jLabelImg2.setIcon(new javax.swing.ImageIcon("./src/main/java/resourses/circulo.png"));
        jLabelImg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImg2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanelTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(746, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelImg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addComponent(jPanelTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImgMouseClicked
        // TODO add your handling code here:
        jPanelCirculo.setVisible(false);
        jPanelTriangulo.setVisible(true);
        jPanelCuadrado.setVisible(false);
    }//GEN-LAST:event_jLabelImgMouseClicked

    private void jLabelImg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImg1MouseClicked
        // TODO add your handling code here:
        jPanelCirculo.setVisible(false);
        jPanelTriangulo.setVisible(false);
        jPanelCuadrado.setVisible(true);
    }//GEN-LAST:event_jLabelImg1MouseClicked

    private void jLabelImg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImg2MouseClicked
        // TODO add your handling code here:
        jPanelCirculo.setVisible(true);
        jPanelTriangulo.setVisible(false);
        jPanelCuadrado.setVisible(false);
    }//GEN-LAST:event_jLabelImg2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelImg;
    private javax.swing.JLabel jLabelImg1;
    private javax.swing.JLabel jLabelImg2;
    private javax.swing.JLabel jLabelTriangulo1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCirculo;
    private javax.swing.JPanel jPanelCuadrado;
    private javax.swing.JPanel jPanelTodo;
    private javax.swing.JPanel jPanelTriangulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
