package Coding;

/**
 *
 * @author nadaalharbi
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.File;


public class MyCatImage extends JFrame  {
    
    private JPanel imagePanel;
    private JPanel buttonPanel;
    private JLabel imageLabel;
    private JButton button;
    
    
    public MyCatImage (){
        
        setTitle("My Cat ");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        
        buildImagePanel();
        buildButtonPanel();
        
        add(imagePanel,BorderLayout.CENTER);
        add(buttonPanel,BorderLayout.SOUTH);
        
        pack();
        
        setVisible(true);
    
    }
    
    private void buildImagePanel(){
        
         imagePanel = new JPanel();
         
         imageLabel = new JLabel("Click the button to " + " see an image of my cat.");
         
         imagePanel.add(imageLabel);
      
    }
    
    private void buildButtonPanel (){
        
        ImageIcon image = new ImageIcon ("Smiley.png");
        
        buttonPanel = new JPanel ();
        
        button = new JButton("Get Image ");
        
        button.setMnemonic(KeyEvent.VK_G);
        
        button.setToolTipText("Click to show image");
        
        button.setIcon(image);
        
        button.addActionListener(new ButtonListener());
        
        buttonPanel.add(button);
     
    }
    
    private class ButtonListener implements ActionListener {
       
        public void actionPerformed(ActionEvent e) {
            
            Color SelectedColor;
            SelectedColor = JColorChooser.showDialog(null, "Selected Color", Color.BLUE);
            button.setBackground(SelectedColor);
            
           /* JFileChooser openFile = new JFileChooser();
            
            int status = openFile.showOpenDialog(null);
            
            if (status == JFileChooser.APPROVE_OPTION ){
                
                File SelectedFile = openFile.getSelectedFile();
                
                String path = selectedFile.getPath();
                
                ImageIcon CatImage = new ImageIcon (path);
                
                imageLabel.setIcon(CatImage);
             
                imageLabel.setText(null);
           
            }
               ImageIcon CatImage = new ImageIcon ("Cat.jpg");
             
               imageLabel.setIcon(CatImage);
             
               imageLabel.setText(null);
             
              pack();*/
             
            }
    }
    
    public static void main (String[] args ){
        
        
        new MyCatImage();
    }
    
    
}
