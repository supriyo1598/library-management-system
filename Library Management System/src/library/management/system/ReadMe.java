package library.management.system;

import java.awt.*;
import javax.swing.*;

public class ReadMe extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new ReadMe().setVisible(true);			
	}
    
        public ReadMe() {
            
            super("Read Me - Library Management System");
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);


            contentPane.setBackground(Color.WHITE);
	}
        

}

