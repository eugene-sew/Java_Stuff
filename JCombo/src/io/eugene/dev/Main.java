package io.eugene.dev;

import javax.swing.*;
import java.awt.*;

public class Main {

    //    public static String[] departments = {"Computer Science","Fashion And Design", "Food Tech", "Engineering"};
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(800, 400);

        JLabel departmentsLabel = new JLabel("Department");
        departmentsLabel.setFont(new Font("sans serif", Font.BOLD, 22));
        departmentsLabel.setSize(150, 30);
        departmentsLabel.setLocation(0, 0);
        String[] departments = {"Computer Science", "Fashion And Design", "Food Tech", "Engineering"};

        JComboBox departmentCombo = new JComboBox(departments);
        departmentCombo.setSize(200, 30);
        departmentCombo.setLocation(160, 0);


        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("sans serif", Font.BOLD, 22));
        genderLabel.setSize(150, 30);
        genderLabel.setLocation(0, 40);

        JRadioButton maleButton = new JRadioButton("Male");
        maleButton.setSize(100, 40);
        maleButton.setLocation(160, 40);
        JRadioButton femaleButton = new JRadioButton("Female");
        femaleButton.setSize(100, 40);
        femaleButton.setLocation(270, 40);


        //adding gender options to a button group
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);


//        buttons
        JButton submitBtn = new JButton("Submit");
        submitBtn.setFont(new Font("sans serif", Font.BOLD, 25));
        submitBtn.setOpaque(true);
        submitBtn.setBackground(Color.BLUE);
        submitBtn.setForeground(Color.black);
        submitBtn.setFocusable(false);
        submitBtn.setSize(200, 50);
        submitBtn.setLocation(20, 90);


        JButton resitBtn = new JButton("Resit");
        resitBtn.setFont(new Font("sans serif", Font.BOLD, 25));
        resitBtn.setOpaque(true);
        resitBtn.setBackground(Color.GREEN);
        resitBtn.setForeground(Color.black);
        resitBtn.setFocusable(false);
        resitBtn.setSize(200, 50);
        resitBtn.setLocation(230, 90);


        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.setFont(new Font("sans serif", Font.BOLD, 25));
        cancelBtn.setOpaque(true);
        cancelBtn.setBackground(Color.RED);
        cancelBtn.setForeground(Color.black);
        cancelBtn.setFocusable(false);
        cancelBtn.setSize(200, 50);
        cancelBtn.setLocation(440, 90);

//        adding components to frame
        frame.add(departmentsLabel);
        frame.add(departmentCombo);
        frame.add(genderLabel);
        frame.add(maleButton);
        frame.add(femaleButton);
        frame.add(submitBtn);
        frame.add(resitBtn);
        frame.add(cancelBtn);

//        additional frame setup
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
