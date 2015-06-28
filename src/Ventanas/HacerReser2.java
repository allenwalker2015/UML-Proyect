/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import clases.Administrar;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cesar
 */
public final class HacerReser2 extends javax.swing.JFrame {

    DefaultTableModel model;
   
    /**
     * Creates new form HacerReser2
     */
    public HacerReser2() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        Vector encabezado=new Vector();
        encabezado.add(0,"idReserva");
        encabezado.add(1,"codHabitacion");
        encabezado.add(2,"FechaReserva");
        encabezado.add(3,"Estado");
        Vector datos=new Vector();
        model=new DefaultTableModel(datos,encabezado);
        tableReser.setModel(model);
        try{
         this.mostrar1();
        }catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }   
    }
    
    public void limpiarTabla(){
        int i=0;
        while(i<tableReser.getRowCount()){
            model.removeRow(1);
        }
    }
    
    public void mostrar1() throws ClassNotFoundException, SQLException{
        limpiarTabla();
        Vector datosBD=Administrar.getReservas(2);
        int i=0;
        while(i<datosBD.size()){
           Vector fila=(Vector)datosBD.get(i);
           model.addRow(fila);
           i++;
        }
    }
    
    public void mostrar2() throws ClassNotFoundException, SQLException{
        limpiarTabla();
        Vector datosBD=Administrar.getReservas(3);
        int i=0;
        while(i<datosBD.size()){
           Vector fila=(Vector)datosBD.get(i);
           model.addRow(fila);
           i++;
        }
    }
    
    public void mostrar3() throws ClassNotFoundException, SQLException{
        limpiarTabla();
        Vector datosBD=Administrar.getReservas(4);
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

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReser = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnGuard = new javax.swing.JButton();
        btnElim = new javax.swing.JButton();
        btnCanc = new javax.swing.JButton();
        btnRec = new javax.swing.JButton();
        btnGetGuard = new javax.swing.JButton();
        btnGetElim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Información");

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tableReser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idReserva", "codHabitacion", "FechaReserva", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableReser.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableReser);
        if (tableReser.getColumnModel().getColumnCount() > 0) {
            tableReser.getColumnModel().getColumn(0).setResizable(false);
            tableReser.getColumnModel().getColumn(1).setResizable(false);
            tableReser.getColumnModel().getColumn(2).setResizable(false);
            tableReser.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("idReserva:");

        btnGuard.setText("Guardar");
        btnGuard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardActionPerformed(evt);
            }
        });

        btnElim.setText("Eliminar");
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });

        btnCanc.setText("Cancelar");
        btnCanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnGuard)
                        .addGap(32, 32, 32)
                        .addComponent(btnElim)
                        .addGap(26, 26, 26)
                        .addComponent(btnCanc)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuard)
                    .addComponent(btnElim)
                    .addComponent(btnCanc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRec.setText("Recibidos");
        btnRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecActionPerformed(evt);
            }
        });

        btnGetGuard.setText("Guardados");
        btnGetGuard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetGuardActionPerformed(evt);
            }
        });

        btnGetElim.setText("Eliminados");
        btnGetElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetElimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnGetElim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGetGuard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnRec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGetGuard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGetElim)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Ingresar_Recepcionista ir = new Ingresar_Recepcionista();
        ir.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecActionPerformed
        // TODO add your handling code here:
        Vector encabezado=new Vector();
        encabezado.add(0,"idReserva");
        encabezado.add(1,"codHabitacion");
        encabezado.add(2,"FechaReserva");
        encabezado.add(3,"Estado");
        Vector datos=new Vector();
        model=new DefaultTableModel(datos,encabezado);
        tableReser.setModel(model);
        try{
         this.mostrar1();
        }catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnRecActionPerformed

    private void btnGetGuardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetGuardActionPerformed
        // TODO add your handling code here:
        Vector encabezado=new Vector();
        encabezado.add(0,"idReserva");
        encabezado.add(1,"codHabitacion");
        encabezado.add(2,"FechaReserva");
        encabezado.add(3,"Estado");
        Vector datos=new Vector();
        model=new DefaultTableModel(datos,encabezado);
        tableReser.setModel(model);
        try{
         this.mostrar2();
        }catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnGetGuardActionPerformed

    private void btnGetElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetElimActionPerformed
        // TODO add your handling code here:
        Vector encabezado=new Vector();
        encabezado.add(0,"idReserva");
        encabezado.add(1,"codHabitacion");
        encabezado.add(2,"FechaReserva");
        encabezado.add(3,"Estado");
        Vector datos=new Vector();
        model=new DefaultTableModel(datos,encabezado);
        tableReser.setModel(model);
        try{
         this.mostrar3();
        }catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnGetElimActionPerformed

    private void btnGuardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardActionPerformed
        // TODO add your handling code here:
        String txtid = txtID.getText();
        if(!txtid.equals("") && esEntero(txtid)){
            int id = Integer.parseInt(txtid);
            if(Administrar.buscarReserv(id)){
                JOptionPane.showMessageDialog(rootPane,"            ¡Enhorabuena!\n¡La reservación se ha guardado con éxito!","Éxito",1);
                Vector encabezado=new Vector();
                Administrar.guardarReservacion(id);
                txtID.setText("");
                encabezado.add(0,"idReserva");
                encabezado.add(1,"codHabitacion");
                encabezado.add(2,"FechaReserva");
                encabezado.add(3,"Estado");
                Vector datos=new Vector();
                model=new DefaultTableModel(datos,encabezado);
                tableReser.setModel(model);
                try{
                    this.mostrar2();
                }catch(ClassNotFoundException ex){
                    System.out.println(ex.getMessage());
                }catch(SQLException ex){
                    System.out.println(ex.getMessage());
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "¡¡No existe la reservación o ese no es un id valido!!\n             Vuelva a intentarlo","No existe",2);
            }   
        }else{
            JOptionPane.showMessageDialog(rootPane, "El campo vacios","Campos vacio",4);
        }
    }//GEN-LAST:event_btnGuardActionPerformed

    private void btnCancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancActionPerformed
        // TODO add your handling code here:
        txtID.setText("");
    }//GEN-LAST:event_btnCancActionPerformed

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
        // TODO add your handling code here:
        String txtid = txtID.getText();
        if(!txtid.equals("") && esEntero(txtid)){
            int id = Integer.parseInt(txtid);
            if(Administrar.buscarReserv(id)){
                JOptionPane.showMessageDialog(rootPane,"            ¡Enhorabuena!\n¡La reservación se ha eliminado con éxito!","Éxito",1);
                Vector encabezado=new Vector();
                Administrar.eliminarReservacion(id);
                txtID.setText("");
                encabezado.add(0,"idReserva");
                encabezado.add(1,"codHabitacion");
                encabezado.add(2,"FechaReserva");
                encabezado.add(3,"Estado");
                Vector datos=new Vector();
                model=new DefaultTableModel(datos,encabezado);
                tableReser.setModel(model);
                try{
                    this.mostrar3();
                }catch(ClassNotFoundException ex){
                    System.out.println(ex.getMessage());
                }catch(SQLException ex){
                    System.out.println(ex.getMessage());
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "¡¡No existe la reservación o ese no es un id valido!!\n             Vuelva a intentarlo","No existe",2);
            }   
        }else{
            JOptionPane.showMessageDialog(rootPane, "El campo vacios","Campos vacio",3);
        }
    }//GEN-LAST:event_btnElimActionPerformed

    public boolean esEntero(String cad){
        try{
            Integer.parseInt(cad);
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
            java.util.logging.Logger.getLogger(HacerReser2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HacerReser2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HacerReser2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HacerReser2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HacerReser2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanc;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btnGetElim;
    private javax.swing.JButton btnGetGuard;
    private javax.swing.JButton btnGuard;
    private javax.swing.JButton btnRec;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableReser;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
