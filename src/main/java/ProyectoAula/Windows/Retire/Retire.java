package ProyectoAula.Windows.Retire;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import ProyectoAula.Main;

public class Retire extends JFrame {

    public Retire() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        tPlaca.setVisible(false);
        Ciudades.setVisible(false);
        tID.setVisible(false);
        jLabel4.setVisible(false);
    }

    private void initComponents() {

        jPanel2 = new JPanel();
        jLabel2 = new JLabel();
        jLabel1 = new JLabel();
        tNombre = new JTextField();
        TypeVehiculo = new JComboBox<>();
        jLabel4 = new JLabel();
        tID = new JTextField();
        jButton2 = new JButton();
        retirar = new JButton();
        jButton1 = new JButton();
        jPanel1 = new JPanel();
        jLabel7 = new JLabel();
        jLabel5 = new JLabel();
        jLabel3 = new JLabel();
        jLabel6 = new JLabel();
        Ciudades = new JComboBox<>();
        tPlaca = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(61, 61, 73));
        setUndecorated(true);

        jPanel2.setBackground(new Color(61, 61, 73));

        jLabel2.setFont(new Font("Microsoft YaHei UI Light", 1, 48)); // NOI18N
        jLabel2.setForeground(new Color(204, 204, 255));
        jLabel2.setText("Retiro de vehiculos");

        jLabel1.setFont(new Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new Color(204, 204, 255));
        jLabel1.setText("Nombre del propietario:");

        tNombre.setBackground(new Color(36, 36, 45));
        tNombre.setForeground(new Color(204, 204, 255));

        TypeVehiculo.setBackground(new Color(0, 0, 0));
        TypeVehiculo.setForeground(new Color(204, 204, 255));
        TypeVehiculo.setModel(new DefaultComboBoxModel<>(new String[]{"N/A", "Motor", "Bicicleta"}));
        TypeVehiculo.addActionListener(this::TypeVehiculoActionPerformed);

        jLabel4.setFont(new Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new Color(204, 204, 255));
        jLabel4.setText("ID:");

        tID.setBackground(new Color(36, 36, 45));
        tID.setForeground(new Color(204, 204, 255));
        tID.addActionListener(this::tIDActionPerformed);
        tID.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                tIDKeyTyped(evt);
            }
        });

        jButton2.setBackground(new Color(9, 9, 15));
        jButton2.setFont(new Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jButton2.setForeground(new Color(204, 204, 255));
        jButton2.setText("Salir");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        retirar.setBackground(new Color(9, 9, 15));
        retirar.setFont(new Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        retirar.setForeground(new Color(204, 204, 255));
        retirar.setText("Retirar");
        retirar.addActionListener((ActionEvent evt) -> {
            try {
                retirarActionPerformed(evt);
            } catch (FileNotFoundException | UnsupportedEncodingException e) {
            }
        });

        jButton1.setBackground(new Color(9, 9, 15));
        jButton1.setFont(new Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jButton1.setForeground(new Color(204, 204, 255));
        jButton1.setText("Volver");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jPanel1.setBackground(new Color(36, 36, 45));

        jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel7.setIcon(new ImageIcon(getClass().getResource("/imagenes/iconos-recogida-entrega.bd79a1b21f946a0554830002e1de6a9b.fill-560x333.png"))); // NOI18N

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 12, Short.MAX_VALUE))
        );

        jLabel5.setFont(new Font("Microsoft JhengHei UI", 1, 14));
        jLabel5.setForeground(new Color(204, 204, 255));
        jLabel5.setText("Placa:");

        jLabel3.setFont(new Font("Microsoft JhengHei UI", 1, 14));
        jLabel3.setForeground(new Color(204, 204, 255));
        jLabel3.setText("Tipo:");

        jLabel6.setFont(new Font("Microsoft JhengHei UI", 1, 14));
        jLabel6.setForeground(new Color(204, 204, 255));
        jLabel6.setText("Ciudad:");

        Ciudades.setBackground(new Color(0, 0, 0));
        Ciudades.setForeground(new Color(204, 204, 255));
        Ciudades.setModel(new DefaultComboBoxModel<>(new String[]{"N/A", "Arjona", "Cartagena", "Clemencia", "Magangué", "Mompox", "San Juan Nepomuceno", "Santa Rosa", "Turbaco", "Otro"}));
        Ciudades.addActionListener(this::CiudadesActionPerformed);

        tPlaca.setBackground(new Color(36, 36, 45));
        tPlaca.setFont(new Font("Microsoft JhengHei UI", 0, 12));
        tPlaca.setForeground(new Color(204, 204, 255));
        tPlaca.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                tPlacaKeyTyped(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(tNombre, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jLabel3)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(TypeVehiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jLabel4)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(tID, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jLabel6)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(Ciudades, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jLabel5)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(tPlaca, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(69, 69, 69)))
                                .addGap(20, 20, 20))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)
                                .addGap(112, 112, 112)
                                .addComponent(retirar)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(tNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(TypeVehiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3)
                                        .addComponent(tPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(tID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(Ciudades, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(retirar))
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButton1ActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {
        Main mainWindow = new Main();
        mainWindow.setVisible(true);

        setVisible(false);
    }

    private void retirarActionPerformed(@SuppressWarnings("unused") ActionEvent evt) throws FileNotFoundException, UnsupportedEncodingException {
        File file = new File("./proyecto_aula/src/main/java/ProyectoAula/Datos.txt");
        //UserInfo user = new UserInfo();
        int id = 0, cont = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] div = linea.split("⁋");

                if (div.length == 6) {
                    //user.NewUser(div[0], div[1], div[2], div[3], div[4], div[5]);
                    cont++;
                }
            }
        }

        String placa = tPlaca.getText(), ciudad = Ciudades.getSelectedItem().toString();
        String opVehiculo = TypeVehiculo.getSelectedItem().toString();
        if (tID.getText().matches("[0-9]+")) {
            if (TypeVehiculo.getSelectedItem().toString().equals("Motor") && placa.length() > 0) {
                id = Integer.parseInt(tID.getText());
                opVehiculo = (placa.toUpperCase().charAt(6) >= 'A' && placa.toUpperCase().charAt(6) <= 'Z') ? "Moto" : "Auto";
            }

            if (TypeVehiculo.getSelectedItem().toString().equals("Bicicleta")) {
                id = Integer.parseInt(tID.getText());
                placa = "N/A";
                ciudad = "N/A";
            }
        }

        if (tNombre.getText().length() > 0 && id >= 0 && id < cont && placa.length() > 0) {

            /* if (user.GetName(id).equals(tNombre.getText()) && user.GetType(id).equals(opVehiculo) && user.GetPlaca(id).equals(placa.toUpperCase())
                    && user.GetCity(id).equals(ciudad)) {

                if (user.GetOutput(id).equals("N/A")) {
                    SimpleDateFormat date = new SimpleDateFormat("dd | HH:mm:ss");
                    String tiempoActual = date.format(new Date());
                    user.SetOutput(id, tiempoActual);

                    PrintWriter writer = new PrintWriter("./proyecto_aula/src/main/java/ProyectoAula/Datos.txt", "UTF-8");
                    for (int i = 0; i < cont; i++) {
                        writer.println(user.GetAll(i));
                    }
                    writer.close();

                    JOptionPane.showMessageDialog(null, "Vehiculo retirado con exito", "Exitoso!", JOptionPane.DEFAULT_OPTION);
                } else {
                    JOptionPane.showMessageDialog(null, "El vehiculo ya ha sido retirado", "Aviso!", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El vehiculo no existe", "Aviso!", JOptionPane.WARNING_MESSAGE);
            } */
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese todos los campos!", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void TypeVehiculoActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {
        if ("Motor".equals(TypeVehiculo.getSelectedItem().toString())) {
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            tPlaca.setVisible(true);
            Ciudades.setVisible(true);
        } else {
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            tPlaca.setVisible(false);
            Ciudades.setVisible(false);
        }

        if (!"N/A".equals(TypeVehiculo.getSelectedItem().toString())) {
            tID.setVisible(true);
            jLabel4.setVisible(true);
        } else {
            jLabel4.setVisible(false);
            tID.setVisible(false);
        }
    }

    private void jButton2ActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {
        System.exit(0);
    }

    private void CiudadesActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {

    }

    private void tIDActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {

    }

    private void tIDKeyTyped(KeyEvent evt) {
        if (tID.getText().length() > 2) {
            evt.consume();
        }
    }

    private void tPlacaKeyTyped(KeyEvent evt) {
        if (tPlaca.getText().length() > 6) {
            evt.consume();
        }
    }

    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Retire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> {
            new Retire().setVisible(true);
        });
    }

    private JComboBox<String> Ciudades;
    private JComboBox<String> TypeVehiculo;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JButton retirar;
    private JTextField tID;
    private JTextField tNombre;
    private JTextField tPlaca;
}
