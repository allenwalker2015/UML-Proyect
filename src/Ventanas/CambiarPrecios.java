/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author cesar
 */
import clases.Administrar;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class CambiarPrecios extends javax.swing.JFrame {

    DefaultTableModel model;
    /**
     * Creates new form CambiarPrecios
     */
    public CambiarPrecios() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        Vector encabezado=new Vector();
        encabezado.add(0,"codHabitacion");
        encabezado.add(1,"precioHabitacion($)");
        Vector datos=new Vector();
        model=new DefaultTableModel(datos,encabezado);
        tableHab.setModel(model);
        try{
         this.mostrar();
        }catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void limpiarTabla(){
        int i=0;
        while(i<tableHab.getRowCount()){
            model.removeRow(1);
        }
    }
    
    public void mostrar() throws ClassNotFoundException, SQLException{
        limpiarTabla();
        Vector datosBD=Administrar.getHabitaciones();
        int i=0;
        while(i<datosBD.size()){
           Vector fila=(Vector)datosBD.get(i);
           model.addRow(fila);
           i++;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCodHab = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        btnCanc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHab = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("Cambio de precio a Habitación");

        guardar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        btnCanc.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnCanc.setText("Cancelar");
        btnCanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nuevo precio:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Código de la habitación:");

        tableHab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "codHabitacion", "precioHabitacion($)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableHab.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableHab);
        if (tableHab.getColumnModel().getColumnCount() > 0) {
            tableHab.getColumnModel().getColumn(0).setResizable(false);
            tableHab.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodHab, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCanc, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(btnCanc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Cambiar_verificar cv = new Cambiar_verificar();
        cv.setVisible(true);
    }//GEN-LAST:event_btnCancActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        String codiHab=txtCodHab.getText();
        String precHab=txtPrecio.getText();
        if(!codiHab.equals("") && !precHab.equals("")){
            if(Administrar.buscarHab(codiHab) && esDecimal(precHab)){
                double preh = Double.parseDouble(precHab);
                JOptionPane.showMessageDialog(rootPane,"            ¡Enhorabuena!\n¡Nuevo precio almacenado con éxito!","Éxito",1);
                Vector encabezado=new Vector();
                Administrar.cambiarPrecioHabitacion(codiHab, preh);
                txtCodHab.setText("");
                txtPrecio.setText("");
                encabezado.add(0,"codHabitacion");
                encabezado.add(1,"precioHabitacion($)");
                Vector datos=new Vector();
                model=new DefaultTableModel(datos,encabezado);
                tableHab.setModel(model);
                try{
                    this.mostrar();
                }catch(ClassNotFoundException ex){
                    System.out.println(ex.getMessage());
                }catch(SQLException ex){
                    System.out.println(ex.getMessage());
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "¡¡No existe la habitación o ese no es un precio valido!!\n             Vuelva a intentarlo","No existe",2);
            }   
        }else{
            JOptionPane.showMessageDialog(rootPane, "Uno o ambos campos estan vacios","Campos vacio",3);
        }
        
        //Si precio no es mayor que cero o no existe dicha habitación, o falta algo, o el no es número etc, etc.
        //JOptionPane.showMessageDialog(rootPane,"","",WIDTH);
    }//GEN-LAST:event_guardarActionPerformed
    
    public boolean esDecimal(String cad){
        try{
            Double.parseDouble(cad);
            return true;
        }catch(NumberFormatException nfe){
            return false;
        }
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CambiarPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiarPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiarPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiarPrecios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarPrecios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanc;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tableHab;
    private javax.swing.JTextField txtCodHab;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
