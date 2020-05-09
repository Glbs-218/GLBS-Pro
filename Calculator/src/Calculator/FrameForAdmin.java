package Calculator;

import Calculator.Grid.GridBagConstraintsForPanelForWorkerForButton;
import Calculator.Grid.GridBagConstraintsForPanelForWorkerForLabel;
import Calculator.Grid.GridBagConstraintsForPanelForWorkerForTextFields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrameForAdmin extends JFrame {
    FrameForAdmin(){
    	super("������ �������� �������� ��� ��������������");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);

        JPanel panelForFrameForAdminLabel = new JPanel();
        JLabel labelForFrameForAdmin = new JLabel("�������������");
        panelForFrameForAdminLabel.add(labelForFrameForAdmin);
        panelForFrameForAdminLabel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JPanel panelForFrameForAdmin = new JPanel();
        panelForFrameForAdmin.setLayout(new GridLayout(7,7,10,20));
        
        JLabel labelForNumber1 = new JLabel("������ ������");
        panelForFrameForAdmin.add(labelForNumber1);
        final JTextField textFieldForNumber1 = new JTextField();
        panelForFrameForAdmin.add(textFieldForNumber1);
        JLabel labelForPackaging1 = new JLabel("��������");
        panelForFrameForAdmin.add(labelForPackaging1);
        
        JLabel labelForNumber2 = new JLabel("������ ��������");
        panelForFrameForAdmin.add(labelForNumber2);
        final JTextField textAreaForNumber2 = new JTextField();
        panelForFrameForAdmin.add(textAreaForNumber2);
        JLabel label3 = new JLabel("��.");
        panelForFrameForAdmin.add(label3);
        
        JLabel labelForNumber3 = new JLabel("������ ������");
        panelForFrameForAdmin.add(labelForNumber3);
        final JTextField textAreaForNumber3 = new JTextField();
        panelForFrameForAdmin.add(textAreaForNumber3);
        JLabel label5 = new JLabel("��.");
        panelForFrameForAdmin.add(label5);
        
        JLabel labelForNumber4 = new JLabel("������ �������");
        panelForFrameForAdmin.add(labelForNumber4);
        final JTextField textAreaForNumber4 = new JTextField();
        panelForFrameForAdmin.add(textAreaForNumber4);
        JLabel label6 = new JLabel("��.");
        panelForFrameForAdmin.add(label6);
   
        JLabel labelForLoad = new JLabel("������ �������");
        panelForFrameForAdmin.add(labelForLoad);
        final JTextField textAreaForLoad = new JTextField();
        panelForFrameForAdmin.add(textAreaForLoad);
        JLabel label4 = new JLabel("��.");
        panelForFrameForAdmin.add(label4);

        JLabel labelForNumber = new JLabel("������ ������");
        panelForFrameForAdmin.add(labelForNumber);
        final JTextField textFieldForNumber = new JTextField();
        panelForFrameForAdmin.add(textFieldForNumber);
        JLabel labelForPackaging = new JLabel("��.");
        panelForFrameForAdmin.add(labelForPackaging);


        JLabel labelForPay = new JLabel("��������� ��������");
        panelForFrameForAdmin.add(labelForPay);
        final JTextArea textForPay = new JTextArea();
        panelForFrameForAdmin.add(textForPay);
        JLabel labelForRub = new JLabel("������");
        panelForFrameForAdmin.add(labelForRub);

        JButton buttonExit = new JButton("�����");
        buttonExit.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

       // JButton buttonForNumber = new JButton("������");
       // buttonForNumber.addActionListener(new AbstractAction() {
           //     try {
				//	JLabel textFieldForCartridge = null;
					//textForPay.setText(String.valueOf(textForPay(Integer.parseInt(textFieldForNumber.getText()),Integer.parseInt(textFieldForCartridge.getText()))));
              //  }catch (NumberFormatException e1){
               //     JOptionPane.showMessageDialog(null,"������� �����!");
               // }

          //  }
     //   });
        final JButton buttonForNumber= new JButton("������");
        buttonForNumber.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
            	
				textForPay.setText(String.format("%.1f",textForPay(textFieldForNumber.getText(),textAreaForNumber2.getText(),textAreaForNumber3.getText(),textAreaForNumber4.getText(),textFieldForNumber1.getText(),textAreaForLoad.getText())));
                }
            
        });


        GridBagConstraintsForPanelForWorkerForLabel gridLabel = new GridBagConstraintsForPanelForWorkerForLabel();
        layout.setConstraints(panelForFrameForAdminLabel,gridLabel);
        add(panelForFrameForAdminLabel);
        GridBagConstraintsForPanelForWorkerForTextFields gridText = new GridBagConstraintsForPanelForWorkerForTextFields();
        layout.setConstraints(panelForFrameForAdmin,gridText);
        add(panelForFrameForAdmin);
        GridBagConstraintsForPanelForWorkerForButton gridButton = new GridBagConstraintsForPanelForWorkerForButton();
        GridBagConstraintsForPanelForWorkerForButton gridButton1 = new GridBagConstraintsForPanelForWorkerForButton();
        gridButton.gridy = 6;
        gridButton1.gridy = 6;
        gridButton1.gridx = 1;
        layout.setConstraints(buttonForNumber,gridButton);
        add(buttonForNumber);
        layout.setConstraints(buttonExit,gridButton1);
        add(buttonExit);

        setVisible(true);
    }
    public double textForPay(String textFieldForNumber,String textFieldForNumber1,String textAreaForNumber2,String textAreaForNumber3,String textAreaForNumber4, String textAreaForLoad){
        return ((((Double.parseDouble(textFieldForNumber))/140)*200)+(Double.parseDouble(textFieldForNumber1))*280+
        		+(390*((Double.parseDouble(textAreaForNumber2)+Double.parseDouble(textAreaForNumber3)+Double.parseDouble(textAreaForNumber4)+Double.parseDouble(textAreaForLoad))/70)))/10;
    }
}