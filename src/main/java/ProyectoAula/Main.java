package ProyectoAula;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import ProyectoAula.Styles.Styles;

public class Main extends JFrame {

    private final JPanel backGround = new JPanel();
    private final JPanel iconContain = new JPanel();
    private final JLabel icon = new JLabel();
    private final JLabel titleLabel = new JLabel();
    private final JButton entryButton = new JButton();
    private final JButton closeButton = new JButton();
    private final JButton listButton = new JButton();
    private final JButton exitButton = new JButton();

    public Main() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        // setLocationRelativeTo(null);

        backGround.setBackground(Styles.BG_COLOR);

        closeButton.setBackground(Styles.BG_BUTTON_COLOR);
        closeButton.setFont(Styles.SECUNDARY_FONT);
        closeButton.setForeground(Styles.FG_BUTTON_COLOR);
        closeButton.setText("Salir");
        closeButton.addActionListener(this::closeButtonActionPerformed);

        exitButton.setBackground(Styles.BG_BUTTON_COLOR);
        exitButton.setFont(Styles.MAIN_FONT);
        exitButton.setForeground(Styles.FG_BUTTON_COLOR);
        exitButton.setText("Retirar Vehiculo");
        exitButton.addActionListener(this::exitButtonActionPerformed);

        entryButton.setBackground(Styles.BG_BUTTON_COLOR);
        entryButton.setFont(Styles.MAIN_FONT);
        entryButton.setForeground(Styles.FG_BUTTON_COLOR);
        entryButton.setText("Ingresar Vehiculo");
        entryButton.addActionListener(this::entryButtonActionPerformed);

        listButton.setBackground(Styles.BG_BUTTON_COLOR);
        listButton.setFont(Styles.MAIN_FONT);
        listButton.setForeground(Styles.FG_BUTTON_COLOR);
        listButton.setText("Listar Vehiculo");
        listButton.addActionListener(this::listButtonActionPerformed);

        iconContain.setBackground(Styles.BG2_COLOR);

        icon.setIcon(new ImageIcon(getClass().getResource("./Imgs/IconParking.png")));

        GroupLayout iconContainLayout = new GroupLayout(iconContain);
        iconContain.setLayout(iconContainLayout);
        iconContainLayout.setHorizontalGroup(
                iconContainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(iconContainLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(icon)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)));

        iconContainLayout.setVerticalGroup(
                iconContainLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(iconContainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(icon)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)));

        titleLabel.setFont(new Font("Microsoft YaHei UI Light", 1, 48));
        titleLabel.setForeground(new Color(204, 204, 255));
        titleLabel.setText("Estacionamiento");

        GroupLayout backGroundLayout = new GroupLayout(backGround);
        backGround.setLayout(backGroundLayout);
        backGroundLayout.setHorizontalGroup(
                backGroundLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(backGroundLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                .addComponent(iconContain, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(backGroundLayout.createParallelGroup(
                                        GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING,
                                                backGroundLayout
                                                        .createSequentialGroup()
                                                        .addGroup(backGroundLayout
                                                                .createParallelGroup(
                                                                        GroupLayout.Alignment.LEADING)
                                                                .addComponent(titleLabel)
                                                                .addComponent(closeButton,
                                                                        GroupLayout.Alignment.TRAILING))
                                                        .addContainerGap())
                                        .addGroup(GroupLayout.Alignment.TRAILING,
                                                backGroundLayout
                                                        .createSequentialGroup()
                                                        .addGroup(backGroundLayout
                                                                .createParallelGroup(
                                                                        GroupLayout.Alignment.LEADING)
                                                                .addComponent(listButton,
                                                                        GroupLayout.Alignment.TRAILING,
                                                                        GroupLayout.PREFERRED_SIZE,
                                                                        279,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(entryButton,
                                                                        GroupLayout.Alignment.TRAILING,
                                                                        GroupLayout.PREFERRED_SIZE,
                                                                        279,
                                                                        GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(exitButton,
                                                                        GroupLayout.Alignment.TRAILING,
                                                                        GroupLayout.PREFERRED_SIZE,
                                                                        279,
                                                                        GroupLayout.PREFERRED_SIZE))
                                                        .addGap(36, 36, 36)))));

        backGroundLayout.setVerticalGroup(
                backGroundLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, backGroundLayout
                                .createSequentialGroup()
                                .addGap(0, 52, Short.MAX_VALUE)
                                .addGroup(backGroundLayout
                                        .createParallelGroup(
                                                GroupLayout.Alignment.LEADING,
                                                false)
                                        .addGroup(backGroundLayout
                                                .createSequentialGroup()
                                                .addComponent(titleLabel)
                                                .addGap(39, 39, 39)
                                                .addComponent(entryButton,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        53,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(exitButton,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        53,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(listButton,
                                                        GroupLayout.PREFERRED_SIZE,
                                                        53,
                                                        GroupLayout.PREFERRED_SIZE))
                                        .addComponent(iconContain,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE))
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(closeButton)
                                .addContainerGap()));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(backGround, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(backGround, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));

        pack();
    }

    private void listButtonActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {
        /*
        * BaseDatos datos = new BaseDatos();
        * setVisible(false);
        */
    }

    private void entryButtonActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {
        /*
        * Ingreso ingreso = new Ingreso();
        * setVisible(false);
        */
    }

    private void exitButtonActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {
        /*
        * Retiro retiro = new Retiro();
        * setVisible(false);
        */
    }

    private void closeButtonActionPerformed(@SuppressWarnings("unused") ActionEvent evt) {
        System.exit(0);
    }

    // <editor-fold psvm here
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,
                    null,
                    ex);
        }

        EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }
}
