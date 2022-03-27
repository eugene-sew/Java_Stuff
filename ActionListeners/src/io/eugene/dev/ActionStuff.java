package io.eugene.dev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionStuff extends JFrame implements ActionListener {
    JButton rbutton;
    ActionStuff(){
        setTitle("Action Listeners");
        rbutton = new JButton("Reset");
        rbutton.setBounds(100, 100,250,40);
        rbutton.setFont(new Font("sans serif", Font.BOLD, 16));
        rbutton.setFocusable(false);
        rbutton.addActionListener(this);

        add(rbutton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(null);
        setResizable(false);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==rbutton){
            JOptionPane.showMessageDialog(null,"Hello me","MessageBox",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
