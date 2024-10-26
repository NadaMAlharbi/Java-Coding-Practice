package Coding;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class MetricConverter extends JFrame {
    
   private JPanel panel;
   private JLabel messageLabel;
   private JTextField kiloTextField;
   private JRadioButton milesButton; 
   private JRadioButton feetButton;
   private JRadioButton inchesButton; 
   private ButtonGroup radioButtonGroup; 
   private final int WINDOW_WIDTH = 400; 
   private final int WINDOW_HEIGHT = 100;


public MetricConverter(){
    
    setTitle(" Metric Converter ");

    setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    buildPanel(); 

    add(panel); 

    setVisible(true); 
    
    }

private void buildPanel() {
    
    messageLabel = new JLabel("Enter a distance in kilometers");
    kiloTextField = new JTextField(10);
    milesButton = new JRadioButton(" Convert to miles ");
    feetButton  = new JRadioButton(" Convert to feet ");
    inchesButton = new JRadioButton(" Convert to inches ");
    
    radioButtonGroup = new ButtonGroup();
    radioButtonGroup.add(milesButton);
    radioButtonGroup.add(feetButton);
    radioButtonGroup.add(inchesButton);
    
    milesButton.addActionListener(new RadioButtonListener());
    feetButton.addActionListener(new RadioButtonListener());
    inchesButton.addActionListener(new RadioButtonListener());
  
    panel = new JPanel();
    panel.add(messageLabel);
    panel.add(kiloTextField);
    panel.add(milesButton);
    panel.add(feetButton);
    panel.add(inchesButton);
   
    }

private class RadioButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            
            String input;
            String ConvertTO="";
            double result=0.0;
            
            input=kiloTextField.getText();
            
            if (e.getSource()== milesButton){
                
                ConvertTO=" miles.";
                result=Double.parseDouble(input) * 0.6214;
       
            }
           
            else if (e.getSource()== feetButton){
                
                ConvertTO=" feet.";
                result=Double.parseDouble(input) * 3281.0;
                
            }
            
            else if (e.getSource()== inchesButton){
                
                ConvertTO=" inches.";
                result=Double.parseDouble(input) * 39370.0;
                
            }
            
            
            JOptionPane.showMessageDialog(null, input + " kilometers is " + result + ConvertTO);
        
        }
}

public static void main (String[] args) {
    
     new MetricConverter();
     
   }
 }

