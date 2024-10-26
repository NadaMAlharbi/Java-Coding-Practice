package Coding;

/**
 *
 * @author nadaalharbi
 */

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class ListWindow extends JFrame {
    
    private JPanel monthPanel;
    private JPanel selectedMonthPanel;
    private JList monthList;
    private JScrollPane scorollPane;
    private JTextField selsctedMonth;
    private JLabel label;
    
    private String[] months = { "January", "February",
                                "March", "April", "May", "June", "July",
                                "August", "September", "October", "November",
                                "December" };
    
    public ListWindow(){
        
        setTitle("List Demo.");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        
        buildMonthPane();
        buildSelectedMonthPane();
        
        add(monthPanel, BorderLayout.CENTER);
        add(selectedMonthPanel,BorderLayout.SOUTH);
        
       // monthList.setBorder(BorderFactory.createLineBorder(Color.black,1));
        
        pack();
        
        setVisible(true);
     
    }

    private void buildMonthPane() {
        
        monthPanel = new JPanel();
        
        monthList = new JList(months);
        
        monthList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        monthList.addListSelectionListener(new ListListener());   

        monthList.setVisibleRowCount(6);
        
        scorollPane = new JScrollPane (monthList);
        
        monthPanel.add(scorollPane);
        
       //  monthPanel.add(monthList);
        
       
    }

    private void buildSelectedMonthPane() {
        
        selectedMonthPanel = new JPanel();
        
        label = new JLabel("You Selected: ");
        
        selsctedMonth = new JTextField(10);
        
        selsctedMonth.setEditable(false);
        
        selectedMonthPanel.add(label);
        
        selectedMonthPanel.add(selsctedMonth);
    
    }
    
    private class ListListener implements ListSelectionListener{
        
        public void valueChanged(ListSelectionEvent e){
            
            String Selected = (String) monthList.getSelectedValue();
            selsctedMonth.setText(Selected);
        
        }
        
    }
    
    public static void main (String[] args ){
        
        
        new ListWindow();
    }
    
}
