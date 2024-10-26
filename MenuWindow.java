package Coding;

/**
 *
 * @author nadaalharbi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuWindow extends JFrame {
    
    private JLabel massegLabel;
    private final int LABEL_WIDTH= 400;
    private final int LABEL_HELGHT=200;
    
    private JMenuBar menuBar;
    private JMenu fileMenue;
    private JMenu textMenue;
    private JMenuItem exitItem;
    private JRadioButtonMenuItem blackItem;
    private JRadioButtonMenuItem redItem;
    private JRadioButtonMenuItem blueItem;
    private JCheckBoxMenuItem visibleItem;
 
    public MenuWindow(){
        
        setTitle("Example Menu System ");
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        massegLabel = new JLabel("Use the Text menu to " +
                                 "change my color and make me invisible.",
                                    SwingConstants.CENTER);
        
        massegLabel.setPreferredSize(new Dimension(LABEL_WIDTH,LABEL_HELGHT));
          
        massegLabel.setForeground(Color.black);
        
        add(massegLabel);
        
        buildMenuBar();
        
        pack();
        
        setVisible(true);
        
    }

    private void buildMenuBar() {
        
        menuBar = new JMenuBar();
        
        buildFileMenue();
        buildTextMenue();
        
        menuBar.add(fileMenue);
        menuBar.add(textMenue);
     
        setJMenuBar(menuBar);
     }

    private void buildFileMenue() {
        
        exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic(KeyEvent.VK_X);
        exitItem.addActionListener(new ExitListener());
        
        fileMenue = new JMenu("File");
        fileMenue.setMnemonic(KeyEvent.VK_F);
        fileMenue.add(exitItem);
       
    }

    private void buildTextMenue() {
         
        blackItem = new JRadioButtonMenuItem("Black",true);
        blackItem.setMnemonic(KeyEvent.VK_B);
        blackItem.addActionListener(new ColorListener());
        
        redItem = new JRadioButtonMenuItem("Red");
        redItem.setMnemonic(KeyEvent.VK_R);
        redItem.addActionListener(new ColorListener());
        
        blueItem = new JRadioButtonMenuItem("Blue");
        blueItem.setMnemonic(KeyEvent.VK_U);
        blueItem.addActionListener(new ColorListener());
        
        ButtonGroup group = new ButtonGroup();
        
        group.add(blackItem);
        group.add(redItem);
        group.add(blueItem);
        
        visibleItem = new JCheckBoxMenuItem("Visible",true);
        visibleItem.setMnemonic(KeyEvent.VK_V);
        visibleItem.addActionListener(new visibleListener());
        
        textMenue = new JMenu ("Text");
        textMenue.setMnemonic(KeyEvent.VK_T);
        
        textMenue.add(blackItem);
        textMenue.add(redItem);
        textMenue.add(blueItem);
        textMenue.addSeparator();
        textMenue.add(visibleItem);
        
    }

    private class ExitListener implements ActionListener {

      
        public void actionPerformed(ActionEvent e) {
            
            System.exit(0);
        }

       
    }

    private class ColorListener implements ActionListener {

       
        public void actionPerformed(ActionEvent e) {
            
            if(blackItem.isSelected())
               massegLabel.setForeground(Color.BLACK);
            else if (redItem.isSelected())
                massegLabel.setForeground(Color.RED);
            else if(blueItem.isSelected())
                massegLabel.setForeground(Color.BLUE);
           
        }

    }

    private class visibleListener implements ActionListener {

       
        public void actionPerformed(ActionEvent e) {
            
            if (visibleItem.isSelected()){
               massegLabel.setVisible(true); 
            }
               
            else{
                massegLabel.setVisible(false);
                
            }
        }

    }

      public static void main (String[] args ){
        
        
        new MenuWindow();
    }
   
}
