package io.eugene.dev;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm extends JFrame implements ActionListener {
    JButton btn,cls;
    JTextField fld;

    MyForm(){
        setSize(400,400);
        setTitle("Some Frame");
        btn = new JButton("Some Button");
        btn.setBounds(50,240,150,40);
        btn.addActionListener(this);

        cls = new JButton("Clear");
        cls.setBounds(220,240,150,40);
        cls.addActionListener(this);


        fld = new JTextField("");
        fld.setBounds(0,0,400,200);

        add(btn);
        add(fld);
        add(cls);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            fld.setText("I got Clicked");
        }else if(e.getSource()==cls){
            fld.setText("T got Cleared");
        }
    }
}


