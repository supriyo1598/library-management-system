package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/logo.jpg"));
            Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);


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

            


            JLabel l6 = new JLabel("Developed By :Supriya Sarkar");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);
JLabel l7 = new JLabel("Ayush Agarwal");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l7.setBounds(280, 230, 600, 35);
            contentPane.add(l7);
JLabel l8 = new JLabel("Samydeep Saha");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l8.setBounds(280, 262, 600, 35);
            contentPane.add(l8);



                
                
            contentPane.setBackground(Color.WHITE);
	}
        

}

