package Coding;

/**
 *
 * @author nadaalharbi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TempConverter extends JFrame {
    
    private JLabel fLabel;
    private JLabel cLabel;
    
    private JTextField fahrenhitTemp;
    private JTextField celsiusTemp;
    
    private JPanel fPanel; 
    private JPanel cPanel; 
    private JPanel sliderPanel; 
    
    private JSlider slider;
    
    
    public TempConverter(){
        
       setTitle("Temperatures ");
         
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       
       buildPanel();
       
       setLayout(new GridLayout(3,1));
       
      /* try {
           
           UIManager.setLookAndFeel
        (" com.sun.java.swing.plaf.motif.MotifLookAndFeel ");
           SwingUtilities.updateComponentTreeUI(this);
       }
       catch (Exception e){
        
        JOptionPane.showMessageDialog(null, "Error setting " + 
                                       "the look and feel.");   
        
        
        System.exit(0);
    }*/
       
       add(fPanel);
       add(cPanel);
       add(sliderPanel);
       
       pack();
      
       setVisible(true);
        
    }

    private void buildPanel() {
        
        fPanel = new JPanel();
        fLabel = new JLabel("Fahrenhit: ");
        fahrenhitTemp = new JTextField("32.0",10);
        fahrenhitTemp.setEditable(false);
        
        fPanel.add(fLabel);
        fPanel.add(fahrenhitTemp);
        
        cPanel= new JPanel();
        cLabel = new JLabel("Celsius: ");
        celsiusTemp = new JTextField("0.0",10);
        celsiusTemp.setEditable(false);
        
        cPanel.add(cLabel);
        cPanel.add(celsiusTemp);
        
        sliderPanel = new JPanel();
        slider = new JSlider(JSlider.HORIZONTAL,0,100,0);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(new SliderListener());
        sliderPanel.add(slider);
        
    
    }

    private class SliderListener implements ChangeListener {
        
        public void stateChanged(ChangeEvent e) {
            
            double c , f;
            
            c= slider.getValue();
            
            celsiusTemp.setText(String.valueOf(c));
             
            f = (9.0 / 5.0 )*c +32.0;
            
            fahrenhitTemp.setText(String.format("%.1f",f));
            
            
        }

    }
    
     public static void main (String[] args ){
        
        
        new TempConverter();
    }
}
