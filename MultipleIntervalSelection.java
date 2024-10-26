package Coding;

/**
 *
 * @author nadaalharbi
 */

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleIntervalSelection extends JFrame {
    
    
    private JPanel monthPanel;
    private JPanel selectedMonthPanel;
    private JPanel buttonPanel; 
    private JList monthList;
    private JList selectedMonthList;
    private JScrollPane scorollPane1;
    private JScrollPane scorollPane2;
    private JButton button; 
    
    private String[] months = { "January", "February",
                                "March", "April", "May", "June", "July",
                                "August", "September", "October", "November",
                                "December" };

    public MultipleIntervalSelection(){
        
        
        setTitle("List Demo.");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        
        buildMonthPane();
        buildSelectedMonthPane();
        buildButtonPanel();
        
        add(monthPanel, BorderLayout.NORTH);
        add(selectedMonthPanel,BorderLayout.CENTER);
        add(buttonPanel,BorderLayout.SOUTH);
         
        pack();
        
        setVisible(true);
        
    }

    private void buildMonthPane() {
        
        monthPanel = new JPanel();
        
        monthList = new JList(months);
        
        monthList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        monthList.setVisibleRowCount(6);
        
        scorollPane1 = new JScrollPane(monthList);
        
        monthPanel.add(scorollPane1);
        
 
    }

    private void buildSelectedMonthPane() {
        
        selectedMonthPanel = new JPanel();
        
        selectedMonthList = new JList();
        
        selectedMonthList.setVisibleRowCount(6);
        
        scorollPane2 = new JScrollPane(selectedMonthList);
        
        selectedMonthPanel.add(scorollPane2);
        
    }

    private void buildButtonPanel() {
       
        buttonPanel = new JPanel();
        
        button = new JButton("Get Selections ");
        
        button.addActionListener(new ButtonListener());
        
        buttonPanel.add(button);
        
   
    }
    
    
    private class ButtonListener implements ActionListener{
       
        public void actionPerformed(ActionEvent e) {
            
        
             Object[] selectedItim = monthList.getSelectedValues();
             
             selectedMonthList.setListData(selectedItim); 
            
        }
        
    }
    
    
    public static void main (String[] args ){
        
        
        new MultipleIntervalSelection();
    }
    
}

    
