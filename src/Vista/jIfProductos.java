package Vista;

import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import entidades.Producto;
import entidades.Rubro;

public class jIfProductos extends javax.swing.JInternalFrame {

    private TreeSet<Producto> productos;
    private Producto auxiliar = null;

    public jIfProductos(TreeSet<Producto> productos) {
        initComponents();
        this.productos = productos;
        llenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlCodigo = new javax.swing.JLabel();
        jlDescripcion = new javax.swing.JLabel();
        jlPrecio = new javax.swing.JLabel();
        jlRubro = new javax.swing.JLabel();
        jlstock = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtDescripcion = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jtStock = new javax.swing.JTextField();
        jcRubros = new javax.swing.JComboBox<>();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setText("Gestion de Productos");

        jlCodigo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCodigo.setText("Codigo");

        jlDescripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlDescripcion.setText("Descripcion");

        jlPrecio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlPrecio.setText("Precio");

        jlRubro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlRubro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlRubro.setText("Rubro");

        jlstock.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlstock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlstock.setText("Stock");

        jtDescripcion.setEnabled(false);

        jtPrecio.setEnabled(false);

        jtStock.setEnabled(false);

        jcRubros.setEnabled(false);

        jbBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.setEnabled(false);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlRubro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlstock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcRubros, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbEliminar, jbGuardar, jbNuevo, jbSalir});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCodigo)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescripcion)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPrecio)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlRubro)
                    .addComponent(jcRubros, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlstock)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbBuscar, jcRubros, jlCodigo, jlDescripcion, jlPrecio, jlRubro, jlstock, jtCodigo, jtDescripcion, jtPrecio, jtStock});

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-producto-usado-64.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        int codigo;
        if (validaEntero(jtCodigo.getText())) {
            codigo = Integer.parseInt(jtCodigo.getText());
        } else {

            JOptionPane.showMessageDialog(this, "Ingrese un codigo valido");
            jtCodigo.requestFocus();
            return;
        }

        for (Producto prod : productos) {

            if (codigo == prod.getCodigo()) {

                jtDescripcion.setText(prod.getDescripcion());
                jtPrecio.setText(prod.getPrecio() + "");
                jtStock.setText(prod.getStock() + "");
                jcRubros.setSelectedItem(prod.getRubro());
                jbEliminar.setEnabled(true);
                auxiliar = prod;
                return;

            }
        }

        JOptionPane.showMessageDialog(this, "Codigo inexistente");
        limpiar();

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        limpiar();
        jtDescripcion.setEnabled(true);
        jtPrecio.setEnabled(true);
        jcRubros.setEnabled(true);
        jtStock.setEnabled(true);
        jbGuardar.setEnabled(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        int codigo;
        String descripcion;
        double precio;
        Rubro rubro;
        int stock;

        if (validaEntero(jtCodigo.getText())) {
            codigo = Integer.parseInt(jtCodigo.getText());
        } else {

            JOptionPane.showMessageDialog(this, "Ingrese un codigo valido ");
            jtCodigo.requestFocus();
            return;
        }

        if (validaEntero(jtStock.getText())) {
            stock = Integer.parseInt(jtStock.getText());
        } else {

            JOptionPane.showMessageDialog(this, "Ingresar una cantidad valida ");
            jtStock.requestFocus();
            return;
        }

        if (validaReal(jtPrecio.getText())) {
            precio = Double.parseDouble(jtPrecio.getText());
        } else {

            JOptionPane.showMessageDialog(this, "Ingresar un precio valido (Use . para decimal)");
            jtPrecio.requestFocus();
            return;
        }

        if (!jtDescripcion.getText().isEmpty()) {

            descripcion = jtDescripcion.getText();
        } else {
            JOptionPane.showMessageDialog(this, "Ingresar una descripcion");
            jtDescripcion.requestFocus();
            return;
        }

        rubro = (Rubro) jcRubros.getSelectedItem();

        if (rubro == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un rubro");
            return;
        }

        Producto nvoProd = new Producto(codigo, descripcion, precio, rubro, stock);
        if (productos.add(nvoProd)) {
            JOptionPane.showMessageDialog(this, "Producto Agregado");
            limpiar();
        } else {

            JOptionPane.showMessageDialog(this, "Ya existe un producto con ese código");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Confirma Eliminación S/N", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            productos.remove(auxiliar);
            JOptionPane.showMessageDialog(this, "Producto Eliminado ");
            limpiar();
            auxiliar = null;
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void llenarCombo() {

        Rubro comestible = new Rubro(1, "Comestible");
        Rubro limpieza = new Rubro(2, "Limpieza");
        Rubro perfumeria = new Rubro(3, "Perfumeria");

        jcRubros.addItem(comestible);
        jcRubros.addItem(limpieza);
        jcRubros.addItem(perfumeria);

    }

    private boolean validaEntero(String nro) {
        Pattern patron = Pattern.compile("^[0-9]+$");
        Matcher m = patron.matcher(nro);
        return m.matches();
    }

    private boolean validaReal(String nro) {
        Pattern patron = Pattern.compile("^\\d+([.]\\d{1,2})?$");
        Matcher m = patron.matcher(nro);
        return m.matches();

    }

    private void limpiar() {
        jtCodigo.setText("");
        jtDescripcion.setText("");
        jtPrecio.setText("");
        jtStock.setText("");
        jcRubros.setSelectedIndex(-1);
        jbEliminar.setEnabled(false);
        auxiliar = null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Rubro> jcRubros;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlDescripcion;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlRubro;
    private javax.swing.JLabel jlstock;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables
}
