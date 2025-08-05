package ProyectoAula.Windows.Entry;

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
import java.util.logging.Level;
import java.util.logging.Logger;

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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import ProyectoAula.Enums.TypeOfVehicle;
import ProyectoAula.Main;
import ProyectoAula.Styles.Styles;

public class Entry extends JFrame {

    private final JPanel backGround = new JPanel();
    private final JPanel iconContain = new JPanel();
    private final JLabel icon = new JLabel();
    private final JLabel cityLabel = new JLabel();
    private final JLabel nameLabel = new JLabel();
    private final JLabel plateLabel = new JLabel();
    private final JLabel vehicleLabel = new JLabel();
    private final JLabel title = new JLabel();
    private final JButton entryButton = new JButton();
    private final JButton exitButton = new JButton();
    private final JButton backButton = new JButton();
    private final JTextField nameTextfield = new JTextField();
    private final JTextField plateTextfield = new JTextField();
    private final JComboBox<TypeOfVehicle> typeOfVehicle = new JComboBox<>();
    private final JComboBox<String> cities = new JComboBox<>();

    public Entry() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Proyecto de aula");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        backGround.setBackground(Styles.BG_COLOR);

        backButton.setBackground(Styles.BG_BUTTON_COLOR);
        backButton.setFont(Styles.SECUNDARY_FONT);
        backButton.setForeground(Styles.FG_LABEL_COLOR);
        backButton.setText("Volver");
        backButton.addActionListener(this::backButtonActionPerformed);

        plateTextfield.setVisible(false);
        plateTextfield.setBackground(Styles.BG2_COLOR);
        plateTextfield.setFont(new Font("Mongolian Baiti", 0, 14));
        plateTextfield.setForeground(Styles.FG_BUTTON_COLOR);
        plateTextfield.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                plateTextfieldKeyTyped(evt);
            }
        });

        plateLabel.setVisible(false);
        plateLabel.setFont(Styles.MAIN_FONT);
        plateLabel.setForeground(Styles.FG_BUTTON_COLOR);
        plateLabel.setText("Placa:");

        title.setFont(Styles.TITLE_FONT);
        title.setForeground(Styles.FG_BUTTON_COLOR);
        title.setText("Ingreso de vehiculos");

        nameLabel.setFont(Styles.MAIN_FONT);
        nameLabel.setForeground(Styles.FG_BUTTON_COLOR);
        nameLabel.setText("Nombre del propietario:");

        nameTextfield.setBackground(Styles.BG2_COLOR);
        nameTextfield.setForeground(Styles.FG_BUTTON_COLOR);

        cities.setVisible(false);
        cities.setBackground(Color.BLACK);
        cities.setFont(Styles.SECUNDARY_FONT);
        cities.setForeground(Styles.FG_LABEL_COLOR);
        cities.setModel(new DefaultComboBoxModel<>(new String[]{"N/A", "Arjona", "Cartagena", "Clemencia", "Magangué", "Mompox", "San Juan Nepomuceno", "Santa Rosa", "Turbaco", "Otro"}));

        cityLabel.setVisible(false);
        cityLabel.setFont(Styles.MAIN_FONT);
        cityLabel.setForeground(Styles.FG_BUTTON_COLOR);
        cityLabel.setText("Ciudad:");

        entryButton.setBackground(Styles.BG_BUTTON_COLOR);
        entryButton.setFont(Styles.SECUNDARY_FONT);
        entryButton.setForeground(Styles.FG_LABEL_COLOR);
        entryButton.setText("Ingresar vehiculo");
        entryButton.addActionListener((ActionEvent evt) -> {
            try {
                entryButtonActionPerformed(evt);
            } catch (FileNotFoundException | UnsupportedEncodingException e) {
            }
        });

        exitButton.setBackground(Styles.BG_BUTTON_COLOR);
        exitButton.setFont(Styles.SECUNDARY_FONT);
        exitButton.setForeground(Styles.FG_LABEL_COLOR);
        exitButton.setText("Salir");
        exitButton.addActionListener(this::exitButtonActionPerformed);

        iconContain.setBackground(Styles.BG2_COLOR);

        icon.setIcon(new ImageIcon(getClass().getResource("../../Imgs/IconCar.png")));
        icon.setToolTipText("");

        vehicleLabel.setFont(Styles.MAIN_FONT);
        vehicleLabel.setForeground(Styles.FG_BUTTON_COLOR);
        vehicleLabel.setText("Tipo de vehiculo:");

        typeOfVehicle.setBackground(Color.BLACK);
        typeOfVehicle.setFont(Styles.SECUNDARY_FONT);
        typeOfVehicle.setForeground(Styles.FG_LABEL_COLOR);
        typeOfVehicle.setModel(new DefaultComboBoxModel<>(
                new TypeOfVehicle[]{TypeOfVehicle.BICYCLE, TypeOfVehicle.CAR, TypeOfVehicle.MOTOCYCLE})
        );
        typeOfVehicle.addActionListener(this::typeOfVehicleActionPerformed);

        GroupLayout iconContainLayout = new GroupLayout(iconContain);
        iconContain.setLayout(iconContainLayout);
        iconContainLayout.setHorizontalGroup(
                iconContainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, iconContainLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(icon)
                                .addGap(23, 23, 23))
        );
        iconContainLayout.setVerticalGroup(
                iconContainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(iconContainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(icon)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout backGroundLayout = new GroupLayout(backGround);
        backGround.setLayout(backGroundLayout);
        backGroundLayout.setHorizontalGroup(
                backGroundLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(backGroundLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(title)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, backGroundLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(iconContain, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22))
                        .addGroup(backGroundLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(backGroundLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(backGroundLayout.createSequentialGroup()
                                                .addComponent(backButton)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(exitButton))
                                        .addGroup(GroupLayout.Alignment.TRAILING, backGroundLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(backGroundLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(backGroundLayout.createSequentialGroup()
                                                                .addComponent(entryButton, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(98, 98, 98))
                                                        .addGroup(GroupLayout.Alignment.LEADING, backGroundLayout.createSequentialGroup()
                                                                .addGroup(backGroundLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(GroupLayout.Alignment.LEADING, backGroundLayout.createSequentialGroup()
                                                                                .addComponent(cityLabel)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(cities, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(GroupLayout.Alignment.LEADING, backGroundLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                .addGroup(backGroundLayout.createSequentialGroup()
                                                                                        .addComponent(vehicleLabel)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(typeOfVehicle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(plateLabel)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(plateTextfield, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(backGroundLayout.createSequentialGroup()
                                                                                        .addComponent(nameLabel)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(nameTextfield, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(16, 16, 16)))
                                .addContainerGap())
        );

        backGroundLayout.setVerticalGroup(
                backGroundLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(backGroundLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(title)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(iconContain, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(backGroundLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameLabel)
                                        .addComponent(nameTextfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(backGroundLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(plateTextfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(plateLabel)
                                        .addComponent(vehicleLabel)
                                        .addComponent(typeOfVehicle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(backGroundLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cities, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cityLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(entryButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(backGroundLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(backButton)
                                        .addComponent(exitButton))
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(backGround, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(backGround, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void backButtonActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {
        Main mainWindow = new Main();
        mainWindow.setVisible(true);

        setVisible(false);
    }

    private void plateTextfieldKeyTyped(KeyEvent evt) {
        int plateLength = plateTextfield.getText().length();

        if (plateLength > 6) {
            evt.consume();
        }
    }

    private void exitButtonActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {
        System.exit(0);
    }

    private void typeOfVehicleActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {
        String type = typeOfVehicle.getSelectedItem().toString();
        boolean isMotor = type.equals(TypeOfVehicle.CAR.toString()) || type.equals(TypeOfVehicle.MOTOCYCLE.toString());

        System.out.println(type);

        plateLabel.setVisible(isMotor);
        cityLabel.setVisible(isMotor);
        plateTextfield.setVisible(isMotor);
        cities.setVisible(isMotor);
    }

    private void entryButtonActionPerformed(@SuppressWarnings("unused") ActionEvent evt) throws FileNotFoundException, UnsupportedEncodingException {
        boolean checkPlate = true;
        boolean checkCity = true;
        String name = nameTextfield.getText();
        String placa = plateTextfield.getText().toUpperCase();
        String type = typeOfVehicle.getSelectedItem().toString();
        String vehicle = "Bicicleta";
        String city = cities.getSelectedItem().toString();

        if (type.equals(TypeOfVehicle.CAR.toString())
                || type.equals(TypeOfVehicle.MOTOCYCLE.toString())) {
            checkPlate = !placa.matches("^[A-Z]{3}-\\d{2}[A-Z0-9]$") && placa.length() <= 6;
            checkCity = !city.equals("N/A");
        }

        //INGRESAR AL USUARIO
        if (checkPlate && checkCity && name.length() != 0) {
            if ("Bicicleta".equals(type)) {
                placa = "N/A";
                city = "N/A";
            }

            File file = new File("../../Data/data.json");
            //UserInfo user = new UserInfo();
            int userCont = 0;

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] div = linea.split("⁋");

                if (div.length == 6) {
                    //user.NewUser(div[0], div[1], div[2], div[3], div[4], div[5]);
                    userCont++;
                }
            }
            scanner.close();
            /*
            boolean comp = true;
            for (int i = 0; i < userCont; i++) {
                if (placa.equals(user.GeplateTextfield(i)) && city.equals(user.GetCity(i)) && !placa.equals("N/A")) {
                    if (!user.GetOutput(i).equals("N/A")) {
                        SimpleDateFormat date = new SimpleDateFormat("dd | HH:mm:ss");
                        String tiempoActual = date.format(new Date());
                        user.SetInput(i, tiempoActual);
                        user.SetOutput(i, "N/A");
                    }
                    comp = false;
                    break;
                }
            }

            if (comp) {
                SimpleDateFormat date = new SimpleDateFormat("dd | HH:mm:ss");
                String tiempoActual = date.format(new Date());
                user.NewUser(name, opVehiculo, placa, city, tiempoActual, "N/A");
                userCont++;
            }

            PrintWriter writer = new PrintWriter("./proyecto_aula/src/main/java/ProyectoAula/Datos.txt", "UTF-8");
            for (int i = 0; i < userCont; i++) {
                writer.println(user.GetAll(i));
            } 
            writer.close();
             */
            JOptionPane.showMessageDialog(null, "Vehiculo ingresado con exito!", "Exitoso!", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "Datos invalidos", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }
    }

    //<editor-fold psvm here
    public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException, UnsupportedLookAndFeelException {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Entry.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> {
            new Entry().setVisible(true);
        });
    }
}
