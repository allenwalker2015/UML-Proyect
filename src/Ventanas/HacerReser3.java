/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import clases.Administrar;
import javax.swing.JOptionPane;
import clases.Cliente;
import clases.Reserva;


/**
 *
 * @author cesar
 */
public class HacerReser3 extends javax.swing.JFrame {

    /**
     * Creates new form HacerReser3
     */
    public HacerReser3() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }
    private static boolean isNumeric(String cadena){
    	try {
    		Integer.parseInt(cadena);
    		return true;
    	} catch (NumberFormatException nfe){
    		return false;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ApeCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TarCred = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dia = new javax.swing.JComboBox();
        mes = new javax.swing.JComboBox();
        anio = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        codHab = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cantDias = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("Reservación de habitación");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        nomCliente.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Apellido:");

        ApeCliente.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("Tarjeta de crédito:");

        TarCred.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("Dia:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setText("Mes:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel7.setText("Año:");

        dia.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });

        mes.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        anio.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        anio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015" }));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel8.setText("Codigo de habitacion:");

        codHab.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        jButton3.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel9.setText("Cantidad de días:");

        cantDias.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(43, 43, 43))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ApeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(nomCliente)
                                    .addComponent(TarCred)
                                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantDias)
                                    .addComponent(codHab))
                                .addGap(137, 137, 137))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(97, 97, 97))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(182, 182, 182))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ApeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TarCred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cantDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nom = nomCliente.getText();
        String ape = ApeCliente.getText();
        String tar = TarCred.getText();
        String coHab = codHab.getText();
        
        int dias = Integer.parseInt(cantDias.getText().trim());
        //Validaciones
        if(!nom.equals("") && !ape.equals("") && !tar.equals("") && !codHab.getText().equals("")){
            if(dias>0 && isNumeric(codHab.getText()) && Administrar.buscarHab(coHab)){
               
                Cliente c = new Cliente();
                c.setNombreCliente(nom);
                c.setApellidoCliente(ape);
                c.setTarjetaCredito(tar);
                if(Administrar.DatosCliente(c)==true){
       
                    //borro todo
                    int op;
                    String d="";
                    op=dia.getSelectedIndex();
                    switch(op){
                        case 0: d="01";
                            break;
                        case 1: d="02";
                            break;
                        case 2: d="03";
                            break;
                        case 3: d="04";
                            break;
                        case 4: d="05";
                            break;
                        case 5: d="06";
                            break;
                        case 6: d="07";
                            break;
                        case 7: d="08";
                            break;
                        case 8: d="09";
                            break;
                        case 9: d="10";
                            break;
                        case 10: d="11";
                            break;
                        case 11: d="12";
                            break;
                        case 12: d="13";
                            break;
                        case 13: d="14";
                            break;
                        case 14: d="15";
                            break;
                        case 15: d="16";
                            break;
                        case 16: d="17";
                            break;
                        case 17: d="18";
                            break;
                        case 18: d="19";
                            break;
                        case 19: d="20";
                            break;
                        case 20: d="21";
                            break;
                        case 21: d="22";
                            break;
                        case 22: d="23";
                            break;
                        case 23: d="24";
                            break;
                        case 24: d="25";
                            break;
                        case 25: d="26";
                            break;
                        case 26: d="27";
                            break;
                        case 27: d="28";
                            break;
                        case 28: d="29";
                            break;
                        case 29: d="30";
                            break;                    
                        default: System.out.println("?");
                            break;                           
                    }
                    
                    int op1;
                    String m="";
                    op1=mes.getSelectedIndex();
                        switch(op1){
                            case 0: m="01"; 
                                break;
                            case 1: m="02";
                                break;
                            case 2: m="03";
                                break;
                            case 3: m="04";
                                break;
                            case 4: m="05";
                                break;
                            case 5: m="06";
                                break;
                            case 6: m="07";
                                break;
                            case 7: m="08"; 
                                break;
                            case 8: m="09";
                                break;
                            case 9: m="10";
                                break;
                            case 10: m="11";
                                break;
                            case 11: m="12";
                                break;
                            default: System.out.println("??");
                                break;
                        }
                    String fec = "";
                    String a="2015";
                    fec=d+"/"+m+"/"+a;
                    System.out.println(fec);
                    Reserva r = new Reserva();
                    r.setEstadoReserva(1);
                    r.setFechaReserva(fec);
                    r.setIdCliente(c.getIdCliente());
                    r.setNumeroDiasReserva(dias);
                    if(Administrar.ReservarHab(c, r, coHab)==true){
                        JOptionPane.showMessageDialog(rootPane, "Reservación guardada con éxito!", "Éxito", WIDTH);
                        nomCliente.setText("");
                        ApeCliente.setText("");
                        TarCred.setText("");
                        codHab.setText("");
                        setVisible(false);
                        Ingresar_Recepcionista ir = new Ingresar_Recepcionista();
                        ir.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(rootPane,"Error al almacenar la reservación","Error!",2);
                    }                          
                }else{
                    JOptionPane.showMessageDialog(rootPane,"Error al almacenar datos de cliente","Error!",2);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane,"El codigo de la habitación no existe o debe ingresar días correctos!","Error!",0);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Por favor complete los campos vacios!","Campos vacios",2);
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        //limpio todo
        nomCliente.setText("");
        ApeCliente.setText("");
        TarCred.setText("");
        codHab.setText("");
        setVisible(false);
        Ingresar_Recepcionista ir = new Ingresar_Recepcionista();
        ir.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        nomCliente.setText("");
        ApeCliente.setText("");
        TarCred.setText("");
        codHab.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(HacerReser3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HacerReser3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HacerReser3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HacerReser3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HacerReser3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApeCliente;
    private javax.swing.JTextField TarCred;
    private javax.swing.JComboBox anio;
    private javax.swing.JTextField cantDias;
    private javax.swing.JTextField codHab;
    private javax.swing.JComboBox dia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox mes;
    private javax.swing.JTextField nomCliente;
    // End of variables declaration//GEN-END:variables
}
