package Interfaz;

import Equipamiento.Arma;
import Equipamiento.Armadura;
import Equipamiento.Equipamiento;
import Equipamiento.EquipamientoCaballero;
import Equipamiento.EquipamientoLancero;
import Equipamiento.EquipamientoSoldado;
import Equipamiento.Medio;
import Personajes.CreacionPersonaje;
import Personajes.Personaje;
import javax.swing.JLabel;

public class Interfaz extends javax.swing.JFrame {
    public Interfaz() {
        initComponents();
        listaPersonajes.removeAllItems();
        listaPersonajes.addItem("Soldado");
        listaPersonajes.addItem("Caballero");
        listaPersonajes.addItem("Lancero");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        consola = new javax.swing.JTextArea();
        crear = new javax.swing.JButton();
        labelPersonaje = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JLabel();
        listaPersonajes = new javax.swing.JComboBox<>();
        cantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelImagenes = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        consola.setEditable(false);
        consola.setColumns(20);
        consola.setRows(5);
        jScrollPane2.setViewportView(consola);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );

        crear.setText("CREAR");
        crear.setActionCommand("");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        labelPersonaje.setText("Personaje:");

        labelCantidad.setText("Cantidad:");

        listaPersonajes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaPersonajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPersonajesActionPerformed(evt);
            }
        });

        panelImagenes.setLayout(new java.awt.GridLayout(0, 5));
        jScrollPane1.setViewportView(panelImagenes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(labelPersonaje)
                        .addGap(8, 8, 8)
                        .addComponent(listaPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(labelCantidad)
                        .addGap(13, 13, 13)
                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(crear))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listaPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaPersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaPersonajesActionPerformed
        
    }//GEN-LAST:event_listaPersonajesActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed

        panelImagenes.removeAll();       
        int numCantidad = Integer.parseInt(cantidad.getText());
        
        if(listaPersonajes.getSelectedItem().equals("Caballero")){
            Equipamiento equipamiento =  new EquipamientoCaballero();
            obtenerInfo(numCantidad, equipamiento, "Caballero");
        } else if(listaPersonajes.getSelectedItem().equals("Soldado")){
            Equipamiento equipamiento =  new EquipamientoSoldado();
            obtenerInfo(numCantidad, equipamiento, "Soldado");
        } else if(listaPersonajes.getSelectedItem().equals("Lancero")){
            Equipamiento equipamiento =  new EquipamientoLancero();
            obtenerInfo(numCantidad, equipamiento, "Lancero");
        }
    }//GEN-LAST:event_crearActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
    public void obtenerInfo(int numCantidad, Equipamiento equipamiento, String tipoPersonaje){
        numCantidad = Integer.parseInt(cantidad.getText());

        CreacionPersonaje personaje = new CreacionPersonaje();
        Personaje[] ejercito = new Personaje[numCantidad];

        for (int i=0; i<numCantidad; i++) {
            ejercito[i] = personaje.getPersonajeClone(tipoPersonaje);
            JLabel aca = new JLabel();
            aca.setIcon(ejercito[i].getImagen());
            panelImagenes.add(aca);
            panelImagenes.updateUI();
        }
       
        Armadura armadura = equipamiento.crearArmadura();
        Arma arma = equipamiento.crearArma();
        Medio medio = equipamiento.crearMedio();

        consola.setText(
                "Cantidad: " + numCantidad + " " +tipoPersonaje +"s\n" +
                ejercito[0].traerPersonaje() + "\n\n" +
                armadura.creacion() + "\n" + 
                arma.creacion() + "\n" + 
                medio.creacion()+ "\n" 
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextArea consola;
    private javax.swing.JButton crear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelPersonaje;
    private javax.swing.JComboBox<String> listaPersonajes;
    private javax.swing.JPanel panelImagenes;
    // End of variables declaration//GEN-END:variables
}
