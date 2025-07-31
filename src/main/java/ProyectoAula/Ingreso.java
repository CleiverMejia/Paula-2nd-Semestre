/* package ProyectoAula;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.JOptionPane;

public class Ingreso extends javax.swing.JFrame {

    public Ingreso(){
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Proyecto de aula");
        lPlaca.setVisible(false);
        lCiudad.setVisible(false);
        tPlaca.setVisible(false);
        Ciudades.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        volver = new javax.swing.JButton();
        tPlaca = new javax.swing.JTextField();
        lPlaca = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        lNombre = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        Ciudades = new javax.swing.JComboBox<>();
        lCiudad = new javax.swing.JLabel();
        ingreso = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        img = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lVehiculo = new javax.swing.JLabel();
        typeVehiculo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(61, 61, 73));

        volver.setBackground(new java.awt.Color(9, 9, 15));
        volver.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        volver.setForeground(new java.awt.Color(204, 204, 255));
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        tPlaca.setBackground(new java.awt.Color(36, 36, 45));
        tPlaca.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        tPlaca.setForeground(new java.awt.Color(234, 237, 253));
        tPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPlacaActionPerformed(evt);
            }
        });
        tPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tPlacaKeyTyped(evt);
            }
        });

        lPlaca.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        lPlaca.setForeground(new java.awt.Color(234, 237, 253));
        lPlaca.setText("Placa:");

        titulo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(234, 237, 253));
        titulo.setText("Ingreso de vehiculos");

        lNombre.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        lNombre.setForeground(new java.awt.Color(234, 237, 253));
        lNombre.setText("Nombre del propietario:");

        tNombre.setBackground(new java.awt.Color(36, 36, 45));
        tNombre.setForeground(new java.awt.Color(234, 237, 253));

        Ciudades.setBackground(new java.awt.Color(0, 0, 0));
        Ciudades.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        Ciudades.setForeground(new java.awt.Color(204, 204, 255));
        Ciudades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N/A", "Arjona", "Cartagena", "Clemencia", "Magangué", "Mompox", "San Juan Nepomuceno", "Santa Rosa", "Turbaco", "Otro" }));
        Ciudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CiudadesActionPerformed(evt);
            }
        });

        lCiudad.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        lCiudad.setForeground(new java.awt.Color(234, 237, 253));
        lCiudad.setText("Ciudad:");

        ingreso.setBackground(new java.awt.Color(9, 9, 15));
        ingreso.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        ingreso.setForeground(new java.awt.Color(204, 204, 255));
        ingreso.setText("Ingresar vehiculo");
        ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    ingresoActionPerformed(evt);
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (UnsupportedEncodingException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        salir.setBackground(new java.awt.Color(9, 9, 15));
        salir.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(204, 204, 255));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        img.setBackground(new java.awt.Color(36, 36, 45));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Autos_1.png"))); // NOI18N
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout imgLayout = new javax.swing.GroupLayout(img);
        img.setLayout(imgLayout);
        imgLayout.setHorizontalGroup(
            imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(23, 23, 23))
        );
        imgLayout.setVerticalGroup(
            imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lVehiculo.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        lVehiculo.setForeground(new java.awt.Color(234, 237, 253));
        lVehiculo.setText("Tipo de vehiculo:");

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
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(volver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lCiudad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Ciudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lVehiculo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(typeVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lPlaca)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lNombre)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombre)
                    .addComponent(tNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lPlaca)
                    .addComponent(lVehiculo)
                    .addComponent(typeVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ciudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCiudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volver)
                    .addComponent(salir))
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


    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        MenuPrincipal principal = new MenuPrincipal();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    private void tPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPlacaActionPerformed

    }//GEN-LAST:event_tPlacaActionPerformed

    private void tPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPlacaKeyTyped
        if (tPlaca.getText().length() > 6) {
            evt.consume();
        }
    }//GEN-LAST:event_tPlacaKeyTyped

    private void CiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CiudadesActionPerformed

    }//GEN-LAST:event_CiudadesActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void typeVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeVehiculoActionPerformed
        if ("Motor".equals(typeVehiculo.getSelectedItem().toString())) {
            lPlaca.setVisible(true);
            lCiudad.setVisible(true);
            tPlaca.setVisible(true);
            Ciudades.setVisible(true);
        } else {
            lPlaca.setVisible(false);
            lCiudad.setVisible(false);
            tPlaca.setVisible(false);
            Ciudades.setVisible(false);
        }
    }//GEN-LAST:event_typeVehiculoActionPerformed

    private void ingresoActionPerformed(java.awt.event.ActionEvent evt) throws FileNotFoundException, UnsupportedEncodingException {//GEN-FIRST:event_ingresoActionPerformed
        boolean comprobarPlaca = true, comprobarCiudad = true;
        String name = tNombre.getText(), placa = tPlaca.getText().toUpperCase(), type = typeVehiculo.getSelectedItem().toString();
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
                    if (!user.GetOutput(i).equals("N/A")) {
                        SimpleDateFormat date = new SimpleDateFormat("dd | HH:mm:ss");
                        String tiempoActual = date.format(new Date());
                        user.SetInput(i, tiempoActual); user.SetOutput(i, "N/A");
                    }
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
            JOptionPane.showMessageDialog(null,"Datos invalidos","Alerta!", JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_ingresoActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.UnsupportedEncodingException
     
    public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
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

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(() -> {
            new Ingreso().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Ciudades;
    private javax.swing.JPanel img;
    private javax.swing.JButton ingreso;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lCiudad;
    private javax.swing.JLabel lNombre;
    private javax.swing.JLabel lPlaca;
    private javax.swing.JLabel lVehiculo;
    private javax.swing.JButton salir;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tPlaca;
    private javax.swing.JLabel titulo;
    private javax.swing.JComboBox<String> typeVehiculo;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
 */