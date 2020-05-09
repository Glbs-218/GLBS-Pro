package Calculator;

import Calculator.Grid.GridBagConstraintsForPanelForWorkerForButton;
import Calculator.Grid.GridBagConstraintsForPanelForWorkerForLabel;
import Calculator.Grid.GridBagConstraintsForPanelForWorkerForTextAreas;
import Calculator.Grid.GridBagConstraintsForPanelForWorkerForTextFields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrameForWorker extends JFrame {

    FrameForWorker(){
    	super("Расчет загрузки принтера для работника");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(650,500);
        setLocationRelativeTo(null);

        JPanel panelForWorker = new JPanel();
        add(panelForWorker);

        GridBagLayout gridBagLayout = new GridBagLayout();
        panelForWorker.setLayout(gridBagLayout);
        GridBagConstraintsForPanelForWorkerForLabel gridLabel = new GridBagConstraintsForPanelForWorkerForLabel();
        GridBagConstraintsForPanelForWorkerForTextFields gridFields = new GridBagConstraintsForPanelForWorkerForTextFields();
        GridBagConstraintsForPanelForWorkerForTextAreas gridAreas = new GridBagConstraintsForPanelForWorkerForTextAreas();
        GridBagConstraintsForPanelForWorkerForButton gridButtonCalculation = new GridBagConstraintsForPanelForWorkerForButton();
        GridBagConstraintsForPanelForWorkerForButton gridButtonExit = new GridBagConstraintsForPanelForWorkerForButton();
        
        gridButtonExit.gridx = 1;

        JLabel labelForPanelForWorker = new JLabel("Работник");
        gridBagLayout.setConstraints(labelForPanelForWorker,gridLabel);
        panelForWorker.add(labelForPanelForWorker);

        JPanel panelForTextFields = new JPanel();
        panelForTextFields.setLayout(new GridLayout(3,3,10,10));

        JLabel labelForBlackAndWhitePrinting = new JLabel("Объем черно-белой печати");
        panelForTextFields.add(labelForBlackAndWhitePrinting);
        final JTextField textFieldForBlackAndWhitePrinting = new JTextField();
        panelForTextFields.add(textFieldForBlackAndWhitePrinting);
        JLabel labelForLetter1 = new JLabel("страниц");
        panelForTextFields.add(labelForLetter1);

        JLabel labelForColorPrinting = new JLabel("Объем цветной печати");
        panelForTextFields.add(labelForColorPrinting);
        final JTextField textFieldForColorPrinting = new JTextField();
        panelForTextFields.add(textFieldForColorPrinting);
        JLabel labelForLetter2 = new JLabel("страниц");
        panelForTextFields.add(labelForLetter2);

        JLabel labelForModel = new JLabel("Модель Принтера");
        panelForTextFields.add(labelForModel);
        final JComboBox comboBoxForModel = new JComboBox();
        comboBoxForModel.setEditable(true);
        comboBoxForModel.addItem("HP LaserJet Pro M104a");
        comboBoxForModel.addItem("Xerox Phaser 3020BI");
        comboBoxForModel.addItem("Canon i-SENSYS LBP7010C");
        panelForTextFields.add(comboBoxForModel);

        gridBagLayout.setConstraints(panelForTextFields,gridFields);
        panelForWorker.add(panelForTextFields);

        JPanel panelForTextAreas = new JPanel();
        panelForTextAreas.setLayout(new GridLayout(6,6,10,10));
        JLabel labelForPaper = new JLabel("Расход бумаги");
        panelForTextAreas.add(labelForPaper);
        final JTextArea textAreaForPaper = new JTextArea();
        panelForTextAreas.add(textAreaForPaper);
        JLabel label1 = new JLabel("упаковок");
        panelForTextAreas.add(label1);
        
        JLabel labelForLoad0 = new JLabel("Расход тонера");
        panelForTextAreas.add(labelForLoad0);
        final JTextArea textAreaForLoad0 = new JTextArea();
        panelForTextAreas.add(textAreaForLoad0);
        JLabel label2 = new JLabel("гр.");
        panelForTextAreas.add(label2);
        
        JLabel labelForLoad1 = new JLabel("Расход красного");
        panelForTextAreas.add(labelForLoad1);
        final JTextArea textAreaForLoad1 = new JTextArea();
        panelForTextAreas.add(textAreaForLoad1);
        JLabel label3 = new JLabel("мл.");
        panelForTextAreas.add(label3);
        
        JLabel labelForLoad2 = new JLabel("Расход синего");
        panelForTextAreas.add(labelForLoad2);
        final JTextArea textAreaForLoad2 = new JTextArea();
        panelForTextAreas.add(textAreaForLoad2);
        JLabel label5 = new JLabel("мл.");
        panelForTextAreas.add(label5);
        
        JLabel labelForLoad3 = new JLabel("Расход черного");
        panelForTextAreas.add(labelForLoad3);
        final JTextArea textAreaForLoad3 = new JTextArea();
        panelForTextAreas.add(textAreaForLoad3);
        JLabel label6 = new JLabel("мл.");
        panelForTextAreas.add(label6);
   
        JLabel labelForLoad = new JLabel("Расход желтого");
        panelForTextAreas.add(labelForLoad);
        final JTextArea textAreaForLoad = new JTextArea();
        panelForTextAreas.add(textAreaForLoad);
        JLabel label4 = new JLabel("мл.");
        panelForTextAreas.add(label4);
        gridBagLayout.setConstraints(panelForTextAreas,gridAreas);
        panelForWorker.add(panelForTextAreas);

        final JButton buttonCalculation = new JButton("Расчет");
        buttonCalculation.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                textAreaForPaper.setText(String.format("%.1f",calculationsPaper(textFieldForBlackAndWhitePrinting.getText(),textFieldForColorPrinting.getText())));
                textAreaForLoad.setText(String.format("%.1f",calculationsLoad(textFieldForBlackAndWhitePrinting.getText(),textFieldForColorPrinting.getText(),String.valueOf(comboBoxForModel.getSelectedItem()))));
                textAreaForLoad1.setText(String.format("%.1f",calculationsLoad1(textFieldForBlackAndWhitePrinting.getText(),textFieldForColorPrinting.getText(),String.valueOf(comboBoxForModel.getSelectedItem()))));
                textAreaForLoad2.setText(String.format("%.1f",calculationsLoad2(textFieldForBlackAndWhitePrinting.getText(),textFieldForColorPrinting.getText(),String.valueOf(comboBoxForModel.getSelectedItem()))));
                textAreaForLoad3.setText(String.format("%.1f",calculationsLoad3(textFieldForBlackAndWhitePrinting.getText(),textFieldForColorPrinting.getText(),String.valueOf(comboBoxForModel.getSelectedItem()))));
                textAreaForLoad0.setText(String.format("%.1f",calculationsLoad0(textFieldForBlackAndWhitePrinting.getText(),textFieldForColorPrinting.getText(),String.valueOf(comboBoxForModel.getSelectedItem()))));           
            }
            
        });
        gridBagLayout.setConstraints(buttonCalculation,gridButtonCalculation);
        panelForWorker.add(buttonCalculation);

        JButton buttonExit = new JButton("Выход");
        buttonExit.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        gridBagLayout.setConstraints(buttonExit,gridButtonExit);
        panelForWorker.add(buttonExit);

        setVisible(true);
    }
    public double calculationsPaper(String BLACKANDWHITE,String COLOR){
        return (Double.parseDouble(BLACKANDWHITE)/500+Double.parseDouble(COLOR)/500)*0.5;
    }

    public double calculationsLoad(String BLACKANDWHITE,String COLOR,String MODEL){
        if (MODEL=="HP LaserJet Pro M104a"){
            return (Double.parseDouble(BLACKANDWHITE)+Double.parseDouble(COLOR))*0;
        }else {
                if (MODEL=="Xerox Phaser 3020BI"){
                    return (Double.parseDouble(BLACKANDWHITE)+Double.parseDouble(COLOR))*0;
                }else {
                    if (MODEL=="Canon i-SENSYS LBP7010C"){
                        return (((Double.parseDouble(COLOR)))*0.3)/4;
                    }else {
                        return 0;
                    }
                }
        }


    }
    
    public double calculationsLoad1(String BLACKANDWHITE,String COLOR,String MODEL){
        if (MODEL=="HP LaserJet Pro M104a"){
            return (Double.parseDouble(BLACKANDWHITE)+Double.parseDouble(COLOR))*0;
        }else {
                if (MODEL=="Xerox Phaser 3020BI"){
                    return (Double.parseDouble(BLACKANDWHITE)+Double.parseDouble(COLOR))*0;
                }else {
                    if (MODEL=="Canon i-SENSYS LBP7010C"){
                        return (((Double.parseDouble(COLOR)))*0.3)/4;
                    }else {
                        return 0;
                    }
                }
        }
    }
    
    public double calculationsLoad2(String BLACKANDWHITE,String COLOR,String MODEL){
        if (MODEL=="HP LaserJet Pro M104a"){
            return (Double.parseDouble(BLACKANDWHITE)+Double.parseDouble(COLOR))*0;
        }else {
                if (MODEL=="Xerox Phaser 3020BI"){
                    return (Double.parseDouble(BLACKANDWHITE)+Double.parseDouble(COLOR))*0;
                }else {
                    if (MODEL=="Canon i-SENSYS LBP7010C"){
                        return (((Double.parseDouble(COLOR)))*0.3)/4;
                    }else {
                        return 0;
                    }
                }
        }
    }
    
    public double calculationsLoad3(String BLACKANDWHITE,String COLOR,String MODEL){
        if (MODEL=="HP LaserJet Pro M104a"){
            return (Double.parseDouble(BLACKANDWHITE))*0;
        }else {
                if (MODEL=="Xerox Phaser 3020BI"){
                    return (Double.parseDouble(BLACKANDWHITE))*0;
                }else {
                    if (MODEL=="Canon i-SENSYS LBP7010C"){
                        return ((((Double.parseDouble(COLOR)))*0.3)/4);
                    }else {
                        return 0;
                    }
                }
        }
    }
    public double calculationsLoad0(String BLACKANDWHITE,String COLOR,String MODEL){
        if (MODEL=="HP LaserJet Pro M104a"){
            return (Double.parseDouble(BLACKANDWHITE))*0.048;
        }else {
                if (MODEL=="Xerox Phaser 3020BI"){
                    return (Double.parseDouble(BLACKANDWHITE))*0.050;
                }else {
                    if (MODEL=="Canon i-SENSYS LBP7010C"){
                        return (((Double.parseDouble(COLOR)))*0);
                    }else {
                        return 0;
                    }
                }
        }
    }
    
}