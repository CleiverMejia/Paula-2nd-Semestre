package ProyectoAula.Windows.Table;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import ProyectoAula.Main;

public class Table extends JFrame {
    //public static UserInfo user = new UserInfo();
    public static int userCont = 0;

    public Table() {
        /* try {
            initComponents();
            this.setLocationRelativeTo(null);
            info();
            SimpleDateFormat date = new SimpleDateFormat("dd | HH:mm:ss");
            final int PRECIO = 2500; 

            DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
            for (int i = 0; i < userCont; i++) {
                String tiempoActual = date.format(new Date());
                if (!user.GetOutput(i).equals("N/A")) {
                    tiempoActual = user.GetOutput(i);
                }
                int dias = Math.abs(Integer.parseInt(tiempoActual.substring(0, 2)) - Integer.parseInt(user.GetInput(i).substring(0, 2)));
                int horas = (24*dias) + (Integer.parseInt(tiempoActual.substring(5, 7)) - Integer.parseInt(user.GetInput(i).substring(5, 7)));
                float minutos = Math.abs(Integer.parseInt(tiempoActual.substring(8, 10)) - Integer.parseInt(user.GetInput(i).substring(8, 10)));
                int segundos = Math.abs(Integer.parseInt(tiempoActual.substring(11, 13)) - Integer.parseInt(user.GetInput(i).substring(11, 13)));

                int tiempoHrs = (int) (horas + ((minutos+(segundos/60f))/60f));
                int total = (tiempoHrs*PRECIO)+PRECIO;
                model.addRow(new Object[]{i, user.GetName(i), user.GetType(i), user.GetPlaca(i), user.GetCity(i), user.GetInput(i), user.GetOutput(i), "$ " + total});
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
        } */
    }
    
    public static void info() throws FileNotFoundException {
        File file = new File("./proyecto_aula/src/main/java/ProyectoAula/Datos.txt");
        //user = new UserInfo();
        userCont = 0;
        
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] div = linea.split("⁋");
                
                if (div.length == 6) {
                    //user.NewUser(div[0], div[1], div[2], div[3], div[4], div[5]);
                    userCont++;
                }
            }
        }
        
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jScrollPane2 = new JScrollPane();
        Tabla = new JTable();
        jButton1 = new JButton();
        jButton2 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(61, 61, 73));
        setUndecorated(true);

        jPanel1.setBackground(new Color(61, 61, 73));
        jPanel1.setToolTipText("");

        jLabel2.setFont(new Font("Microsoft YaHei UI Light", 1, 48)); // NOI18N
        jLabel2.setForeground(new Color(204, 204, 255));
        jLabel2.setText("Listado de vehiculos");
        jLabel2.setToolTipText("");

        Tabla.setBackground(new Color(36, 36, 45));
        Tabla.setForeground(new Color(204, 204, 255));
        Tabla.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Propietario", "Tipo de vehiculo", "Placa", "Ciudad", "Entrada", "Salida", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setFillsViewportHeight(true);
        Tabla.setGridColor(new Color(16, 16, 32));
        Tabla.setName(""); // NOI18N
        Tabla.setSelectionBackground(new Color(0, 0, 51));
        Tabla.setSelectionForeground(new Color(204, 204, 255));
        Tabla.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        Tabla.setShowGrid(true);
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(Tabla);

        jButton1.setBackground(new Color(9, 9, 15));
        jButton1.setFont(new Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jButton1.setForeground(new Color(204, 204, 255));
        jButton1.setText("Volver");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setBackground(new Color(9, 9, 15));
        jButton2.setFont(new Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jButton2.setForeground(new Color(204, 204, 255));
        jButton2.setText("Salir");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 769, GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButton1ActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
        int count = model.getRowCount();
        for (int i = 0; i < count; i++) {
            model.removeRow(0);
        }
        
        Main mainWindow = new Main();
        mainWindow.setVisible(true);

        setVisible(false);
    }

    private void jButton2ActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {
        System.exit(0);
    }


    public static void main(String args[]) throws FileNotFoundException, UnsupportedLookAndFeelException {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
         
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> {
            new Table().setVisible(true);
        });
    }

    private JTable Tabla;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JScrollPane jScrollPane2;
}