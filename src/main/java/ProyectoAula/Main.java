package ProyectoAula;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Main extends JFrame {
    private final JPanel Fondo  = new JPanel();
    private final JPanel jPanel1 = new JPanel();
    private final JLabel jLabel1 = new JLabel();
    private final JLabel jLabel2 = new JLabel();
    private final JButton ingresoBoton = new JButton();
    private final JButton jButton4 = new JButton();
    private final JButton listaBoton = new JButton();
    private final JButton retiroBoton = new JButton();

    public Main() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        //setLocationRelativeTo(null);

        Fondo.setBackground(new Color(61, 61, 73));

        jButton4.setBackground(new Color(9, 9, 15));
        jButton4.setFont(new Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        jButton4.setForeground(new Color(234, 237, 253));
        jButton4.setText("Salir");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        retiroBoton.setBackground(new Color(9, 9, 15));
        retiroBoton.setFont(new Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        retiroBoton.setForeground(new Color(234, 237, 253));
        retiroBoton.setText("Retirar Vehiculo");
        retiroBoton.addActionListener(this::retiroBotonActionPerformed);

        ingresoBoton.setBackground(new Color(9, 9, 15));
        ingresoBoton.setFont(new Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        ingresoBoton.setForeground(new Color(234, 237, 253));
        ingresoBoton.setText("Ingresar Vehiculo");
        ingresoBoton.addActionListener(this::ingresoBotonActionPerformed);

        listaBoton.setBackground(new Color(9, 9, 15));
        listaBoton.setFont(new Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        listaBoton.setForeground(new Color(234, 237, 253));
        listaBoton.setText("Listar Vehiculo");
        listaBoton.addActionListener(this::listaBotonActionPerformed);

        jPanel1.setBackground(new Color(36, 36, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("./img/IconParking.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jLabel2.setFont(new Font("Microsoft YaHei UI Light", 1, 48)); // NOI18N
        jLabel2.setForeground(new Color(204, 204, 255));
        jLabel2.setText("Estacionamiento");

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
                FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(FondoLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout
                                                .createSequentialGroup()
                                                .addGroup(FondoLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jButton4,
                                                                javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout
                                                .createSequentialGroup()
                                                .addGroup(FondoLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(listaBoton,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 279,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ingresoBoton,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 279,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(retiroBoton,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 279,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(36, 36, 36)))));
        FondoLayout.setVerticalGroup(
                FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                                .addGap(0, 52, Short.MAX_VALUE)
                                .addGroup(FondoLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(FondoLayout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(39, 39, 39)
                                                .addComponent(ingresoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(retiroBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(listaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));

        pack();
    }

    private void listaBotonActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {
        /* BaseDatos datos = new BaseDatos();
        datos.setVisible(true);
        this.setVisible(false); */
    }

    private void ingresoBotonActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {// GEN-FIRST:event_ingresoBotonActionPerformed
        /* Ingreso ingreso = new Ingreso();
        ingreso.setVisible(true);
        this.setVisible(false); */
    }

    private void retiroBotonActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {// GEN-FIRST:event_retiroBotonActionPerformed
        /* Retiro retiro = new Retiro();
        retiro.setVisible(true);
        this.setVisible(false); */
    }

    private void jButton4ActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }

    public static void main(String args[]) {
        // <editor-fold guatafak
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }
}
