package ProyectoAula;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.JOptionPane;

public class Ingreso extends javax.swing.JFrame {

    public Ingreso(){
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Proyecto de aula");
        jLabel2.setVisible(false);
        jLabel4.setVisible(false);
        PlacaVehiculo.setVisible(false);
        Ciudades.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        VolverIngreso = new javax.swing.JButton();
        PlacaVehiculo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        Ciudades = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ingreso = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        typeVehiculo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(61, 61, 73));

        VolverIngreso.setBackground(new java.awt.Color(9, 9, 15));
        VolverIngreso.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        VolverIngreso.setForeground(new java.awt.Color(204, 204, 255));
        VolverIngreso.setText("Volver");
        VolverIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverIngresoActionPerformed(evt);
            }
        });

        PlacaVehiculo.setBackground(new java.awt.Color(36, 36, 45));
        PlacaVehiculo.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        PlacaVehiculo.setForeground(new java.awt.Color(234, 237, 253));
        PlacaVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlacaVehiculoActionPerformed(evt);
            }
        });
        PlacaVehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PlacaVehiculoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(234, 237, 253));
        jLabel2.setText("Placa:");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(234, 237, 253));
        jLabel3.setText("Ingreso de vehiculos");

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(234, 237, 253));
        jLabel1.setText("Nombre del propietario:");

        nombre.setBackground(new java.awt.Color(36, 36, 45));
        nombre.setForeground(new java.awt.Color(234, 237, 253));

        Ciudades.setBackground(new java.awt.Color(0, 0, 0));
        Ciudades.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        Ciudades.setForeground(new java.awt.Color(204, 204, 255));
        Ciudades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Arjona", "Cartagena", "Clemencia", "Magangué", "Mompox", "San Juan Nepomuceno", "Santa Rosa", "Turbaco", "Otro" }));
        Ciudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiudadesActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(234, 237, 253));
        jLabel4.setText("Ciudad:");

        ingreso.setBackground(new java.awt.Color(9, 9, 15));
        ingreso.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        ingreso.setForeground(new java.awt.Color(204, 204, 255));
        ingreso.setText("Ingresar vehiculo");
        ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    ingresoActionPerformed(evt);
                } catch (FileNotFoundException | UnsupportedEncodingException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        jButton2.setBackground(new java.awt.Color(9, 9, 15));
        jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(36, 36, 45));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cleiver\\Desktop\\Cleiver\\Pat\\proyecto_aula\\src\\main\\java\\imagenes\\Autos_1.png")); // NOI18N
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(234, 237, 253));
        jLabel5.setText("Tipo de vehiculo:");

        typeVehiculo.setBackground(new java.awt.Color(0, 0, 0));
        typeVehiculo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        typeVehiculo.setForeground(new java.awt.Color(204, 204, 255));
        typeVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Motor", "Bicicleta" }));
        typeVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(VolverIngreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Ciudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(typeVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(PlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(typeVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ciudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VolverIngreso)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void VolverIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverIngresoActionPerformed
        MenuPrincipal principal = new MenuPrincipal();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VolverIngresoActionPerformed

    private void PlacaVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlacaVehiculoActionPerformed

    }//GEN-LAST:event_PlacaVehiculoActionPerformed

    private void PlacaVehiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlacaVehiculoKeyTyped
        if (PlacaVehiculo.getText().length() > 6) {
            evt.consume();
        }
    }//GEN-LAST:event_PlacaVehiculoKeyTyped

    private void CiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiudadesActionPerformed

    }//GEN-LAST:event_CiudadesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void typeVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeVehiculoActionPerformed
        if ("Motor".equals(typeVehiculo.getSelectedItem().toString())) {
            jLabel2.setVisible(true);
            jLabel4.setVisible(true);
            PlacaVehiculo.setVisible(true);
            Ciudades.setVisible(true);
        } else {
            jLabel2.setVisible(false);
            jLabel4.setVisible(false);
            PlacaVehiculo.setVisible(false);
            Ciudades.setVisible(false);
        }
    }//GEN-LAST:event_typeVehiculoActionPerformed

    private void ingresoActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, UnsupportedEncodingException {//GEN-FIRST:event_ingresoActionPerformed
        boolean comprobarPlaca = true, comprobarCiudad = true;
        String name = nombre.getText(), placa = PlacaVehiculo.getText().toUpperCase(), type = typeVehiculo.getSelectedItem().toString();
        String opVehiculo = "Bicicleta", city = Ciudades.getSelectedItem().toString();

        if ("Motor".equals(type)) {
            if (placa.length() <= 6) {
                comprobarPlaca = false;
            } else {
                if (!(placa.charAt(3) == '-') || !placa.substring(4, 6).matches("[0-9]+")) {
                    comprobarPlaca = false;
                }

                for (int i = 0; i < 3; i++) {
                    if (!(placa.charAt(i) >= 'A' && placa.charAt(i) <= 'Z')) {
                        comprobarPlaca = false;
                        break;
                    }
                }

                opVehiculo = (placa.charAt(6) >= 'A' && placa.charAt(6) <= 'Z') ? "Moto" : "Auto";
                comprobarCiudad = (!"N/A".equals(city));
            }
        }
        
        
        //INGRESAR AL USUARIO
        if (comprobarPlaca && !"N/A".equals(type) && comprobarCiudad
                && name.length() != 0) {

            if ("Bicicleta".equals(type)) {placa = "N/A"; city = "N/A";}
            File file = new File("./proyecto_aula/src/main/java/ProyectoAula/Datos.txt");
            UserInfo user = new UserInfo();
            int userCont = 0;

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] div = linea.split("⁋");

                if (div.length == 6) {
                    user.NewUser(div[0], div[1], div[2], div[3], div[4], div[5]);
                    userCont++;
                }
            }
            scanner.close();
        
            boolean comp = true;
            for (int i = 0; i < userCont; i++) {
                if (placa.equals(user.GetPlaca(i)) && city.equals(user.GetCity(i)) && !placa.equals("N/A")) {
                    comp = false; break;
                }
            }

            if (comp) {
                SimpleDateFormat date = new SimpleDateFormat("dd | HH:mm:ss");
                String tiempoActual = date.format(new Date());
                user.NewUser(name, opVehiculo, placa, city,tiempoActual,"N/A");
                userCont++;
            }
        
            PrintWriter writer = new PrintWriter("./proyecto_aula/src/main/java/ProyectoAula/Datos.txt", "UTF-8");
            for (int i = 0; i < userCont; i++) {
                writer.println(user.GetAll(i));
            }
            writer.close();

            JOptionPane.showMessageDialog(null,"Vehiculo ingresado con exito!","Exitoso!", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null,"Ingrese todos los campos","Alerta!", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_ingresoActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.UnsupportedEncodingException
     */
    public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException {
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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ingreso().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Ciudades;
    private javax.swing.JTextField PlacaVehiculo;
    private javax.swing.JButton VolverIngreso;
    private javax.swing.JButton ingreso;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> typeVehiculo;
    // End of variables declaration//GEN-END:variables
}
