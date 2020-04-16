package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;



public class FrameForAdminPassword extends JFrame {
    FrameForAdminPassword(){
    	super("Авторизация");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,180);
        setLocationRelativeTo(null);

        JPanel panelForFrameForAdminPassword = new JPanel();
        panelForFrameForAdminPassword.setLayout(new GridLayout(4,2,10,10));
        
        JLabel labelForPanelForFrameForAdmin = new JLabel("Введите логин");
        labelForPanelForFrameForAdmin.setHorizontalAlignment(JLabel.CENTER);
        panelForFrameForAdminPassword.add(labelForPanelForFrameForAdmin);

        final JPasswordField passwordField = new JPasswordField();

        panelForFrameForAdminPassword.add(passwordField);

        JLabel labelForPanelForFrameForAdmin1 = new JLabel("Введите пароль");
        labelForPanelForFrameForAdmin1.setHorizontalAlignment(JLabel.CENTER);
        panelForFrameForAdminPassword.add(labelForPanelForFrameForAdmin1);

        final JPasswordField passwordField1 = new JPasswordField();

        panelForFrameForAdminPassword.add(passwordField1);
        

        JButton buttonForPanelForFrameForAdmin = new JButton("Вход");
        buttonForPanelForFrameForAdmin.setHorizontalAlignment(JButton.CENTER);
        buttonForPanelForFrameForAdmin.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                if (password(String.valueOf(passwordField.getPassword()))==true) {
                    FrameForAdmin frameForAdmin = new FrameForAdmin();
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null,"Вы ввели неправильный пароль");
                }

            }
        });
        panelForFrameForAdminPassword.add(buttonForPanelForFrameForAdmin);

        add(panelForFrameForAdminPassword);

        setVisible(true);
    }
    public boolean password(String PAS){
        return PAS.equals("admin");
    }
}
