/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import entidades.Producto;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 54265
 */
public class ConsultaPorPrecio extends javax.swing.JInternalFrame {
private TreeSet<Producto> productos;
DefaultTableModel modelo;
    /**
     * Creates new form ConsultaPorPrecio
     */
    public ConsultaPorPrecio(TreeSet<Producto> productos) {
        initComponents();
        this.productos = productos;
        modelo = (DefaultTableModel)jtDetalle.getModel();
        limpiarTabla();
        llenarTabla(0d,0d);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtDesde = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtHasta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetalle = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Consulta por precio");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Entre  $");

        jtDesde.setText("0");
        jtDesde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDesdeKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("y  $");

        jtHasta.setText("0");
        jtHasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtHastaKeyReleased(evt);
            }
        });

        jtDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "DESCRIPCION", "RUBRO", "STOCK", "PRECIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtDetalle);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Consulta de productos por precio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDesdeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDesdeKeyReleased
        // TODO add your handling code here:
        limpiarTabla();
        if (validarPrecio(jtDesde.getText()) && validarPrecio(jtHasta.getText())) {
            llenarTabla(Double.parseDouble(jtDesde.getText()), Double.parseDouble(jtHasta.getText()));
        }
        else{
            if(!jtDesde.getText().equals("0"))
                JOptionPane.showMessageDialog(this, "Ingresar un precio valido (Use . para decimal)");
        }
    }//GEN-LAST:event_jtDesdeKeyReleased

    private void jtHastaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtHastaKeyReleased
        // TODO add your handling code here:
        limpiarTabla();
        if (validarPrecio(jtDesde.getText()) && validarPrecio(jtHasta.getText())) {
            llenarTabla(Double.parseDouble(jtDesde.getText()), Double.parseDouble(jtHasta.getText()));
        }
        else{
            if(!jtDesde.getText().equals("0"))
                JOptionPane.showMessageDialog(this, "Ingresar un precio valido (Use . para decimal)");
        }
    }//GEN-LAST:event_jtHastaKeyReleased

    private void limpiarTabla(){
        for (int i = modelo.getRowCount()-1; i >= 0 ; i--) {
            modelo.removeRow(i);
        }
    }
    
    private void llenarTabla(Double desde, Double hasta){
        if (desde.equals(0.0)&&hasta.equals(0.0)) {
            for(Producto prod: productos){
            modelo.addRow(new Object[]{ prod.getCodigo(),
                                        prod.getDescripcion(),
                                        prod.getRubro(),
                                        prod.getStock(),
                                        prod.getPrecio()
                                        });
            }
        }
        else{
            for (Producto prod : buscarProductos(desde, hasta)) {
                modelo.addRow(new Object[]{ prod.getCodigo(),
                                        prod.getDescripcion(),
                                        prod.getRubro(),
                                        prod.getStock(),
                                        prod.getPrecio()
                                        });
            }
        }
    }

    private boolean validarPrecio(String nro){
        Pattern patron=Pattern.compile("^\\d+([.]\\d{1,2})?$");
        Matcher m=patron.matcher(nro);
        return m.matches();
    }
    
    private ArrayList<Producto> buscarProductos(Double desde, Double hasta){
        ArrayList<Producto> listado = new ArrayList<>();
        for(Producto prod:productos){
            if ((prod.getPrecio()>=desde) && (prod.getPrecio()<=hasta)) {
                listado.add(prod);
            }
        }
        return listado;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtDesde;
    private javax.swing.JTable jtDetalle;
    private javax.swing.JTextField jtHasta;
    // End of variables declaration//GEN-END:variables
}