/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import entidades.Producto;

/**
 *
 * @author tDev
 */
public class ListadoNombre extends javax.swing.JInternalFrame {
private TreeSet<Producto> productos;
private DefaultTableModel modelo=new DefaultTableModel();
    /**
     * Creates new form ListadoNombre
     */
    public ListadoNombre(TreeSet<Producto> productos) {
        initComponents();
        this.productos=productos;
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlListadoNombre = new javax.swing.JLabel();
        jlPrimerosCaracteres = new javax.swing.JLabel();
        jtfCaracteresBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setForeground(new java.awt.Color(204, 204, 204));

        jlListadoNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlListadoNombre.setText("Listado Por Nombre");

        jlPrimerosCaracteres.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlPrimerosCaracteres.setText("Escriba los primeros caracteres:");

        jtfCaracteresBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCaracteresBuscarKeyReleased(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtTabla.setEnabled(false);
        jScrollPane1.setViewportView(jtTabla);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlPrimerosCaracteres)
                                .addGap(18, 18, 18)
                                .addComponent(jtfCaracteresBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jlListadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jlListadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCaracteresBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPrimerosCaracteres)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCaracteresBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCaracteresBuscarKeyReleased
        // TODO add your handling code here:
        
        borrarFilas();
        
        String find=jtfCaracteresBuscar.getText().toLowerCase();
        for(Producto prod:productos){
         
            if(prod.getDescripcion().toLowerCase().startsWith(find)){
            
                Vector renglon=new Vector();
                renglon.add(prod.getCodigo());
                renglon.add(prod.getDescripcion());
                renglon.add(prod.getPrecio());
                renglon.add(prod.getStock());
                renglon.add(prod.getRubro());
                modelo.addRow(renglon);
                
            }
            
        }
    }//GEN-LAST:event_jtfCaracteresBuscarKeyReleased

 private void armarCabecera(){
       
         modelo.addColumn("Codigo");
         modelo.addColumn("Descripcion");
         modelo.addColumn("Precio");
         modelo.addColumn("Stock");
         modelo.addColumn("Rubro");
         jtTabla.setModel(modelo);
     }
     
     private void borrarFilas(){
     
         int filas=modelo.getRowCount()-1;
         for(int f=filas;f >= 0;f--){
         
             modelo.removeRow(f);
         }
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlListadoNombre;
    private javax.swing.JLabel jlPrimerosCaracteres;
    private javax.swing.JTable jtTabla;
    private javax.swing.JTextField jtfCaracteresBuscar;
    // End of variables declaration//GEN-END:variables
}
