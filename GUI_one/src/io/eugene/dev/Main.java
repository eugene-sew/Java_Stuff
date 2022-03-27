package io.eugene.dev;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame frame = new JFrame("Student Form");
        frame.setSize(400,400);

        JLabel label = new JLabel();
        label.setSize(400,50);
        label.setText("Student Registration Form");
        label.setFont(new Font(Font.SERIF,Font.BOLD,35));
        label.setSize(500,100);
        label.setLocation(30,20);
        label.setLocation(30,20);

        frame.add(label);
        JLabel fnamelabel = new JLabel();
        fnamelabel.setText("FirstName");
        fnamelabel.setFont(new Font(Font.SERIF,Font.PLAIN,16));
        fnamelabel.setSize(200,100);
        fnamelabel.setLocation(30,60);
        frame.add(fnamelabel);
        JTextField fnametext= new JTextField("Enter First Name");
        fnametext.setSize(200,30);
        fnametext.setLocation(150,60) ;
        frame.add(fnamelabel);

        frame.add(label);
        JLabel lnamelabel = new JLabel();
        lnamelabel.setText("LastName");
        lnamelabel.setFont(new Font(Font.SERIF,Font.PLAIN,16));
        lnamelabel.setSize(200,100);
        lnamelabel.setLocation(30,70);
        frame.add(lnamelabel);
        JTextField lnametext= new JTextField("Enter First Name");
        lnametext.setSize(200,30);
        lnametext.setLocation(230,170) ;
        frame.add(lnamelabel);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
