package io.eugene.dev;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(600, 900);
//        label for intro Text
        JLabel introLabel = new JLabel();
        introLabel.setText("Student Registration Form");
        introLabel.setFont(new Font("Comic Sans", Font.PLAIN, 30));
        introLabel.setVerticalAlignment(JLabel.CENTER);
        introLabel.setHorizontalAlignment(JLabel.CENTER);
        introLabel.setBounds(50, 0, 500, 50);
        introLabel.setBackground(Color.BLACK);
        introLabel.setForeground(Color.CYAN);
        introLabel.setOpaque(true);
        frame.add(introLabel);
//panel to contain all fields
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
//        mainPanel.setLayout(new GridLayout(6, 2));
        mainPanel.setBounds(50, 50, 500, 750);
        frame.add(mainPanel);

//        field for first name
        JLabel firstNameLabel = new JLabel();
        firstNameLabel.setText("First Name");
        firstNameLabel.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        firstNameLabel.setHorizontalAlignment(JLabel.LEFT);
// firstname textField
        JTextField fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        fnameTextField.setPreferredSize(new Dimension(300, 50));
        mainPanel.add(firstNameLabel);
        mainPanel.add(fnameTextField);

//        field for last name
        JLabel lastNameLabel = new JLabel();
        lastNameLabel.setText("Last Name");
        lastNameLabel.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        lastNameLabel.setHorizontalAlignment(JLabel.LEFT);
// lastname textField
        JTextField lnameTextField = new JTextField();
        lnameTextField.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        lnameTextField.setPreferredSize(new Dimension(300, 50));
        mainPanel.add(lastNameLabel);
        mainPanel.add(lnameTextField);


//        field for email address
        JLabel emailLabel = new JLabel();
        emailLabel.setText("Email Address");
        emailLabel.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        emailLabel.setHorizontalAlignment(JLabel.LEFT);
// email textField
        JTextField emailTextField = new JTextField();
        emailTextField.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        emailTextField.setPreferredSize(new Dimension(300, 50));
        mainPanel.add(emailLabel);
        mainPanel.add(emailTextField);

        JPanel bioPanel = new JPanel();
        bioPanel.setBackground(Color.WHITE);
        bioPanel.setLayout(new GridLayout(3, 1));

//gender
        JPanel genderPanel = new JPanel();
        genderPanel.setBackground(Color.WHITE);
        genderPanel.setLayout(new GridLayout(2, 1));

        genderPanel.setBounds(0, 200, 600, 200);

        JLabel genderLabel = new JLabel("What Gender are you?");

        genderLabel.setFont(new Font("Consolas", Font.BOLD, 20));
        ButtonGroup genderGroup = new ButtonGroup();
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");

        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        bioPanel.add(genderLabel);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        bioPanel.add(genderPanel);

//        Interests
        JPanel interestsPanel = new JPanel();
        interestsPanel.setBackground(Color.WHITE);
        interestsPanel.setLayout(new GridLayout(7, 1));
        interestsPanel.setBounds(0, 300, 600, 200);
        JCheckBox astrologyCheck = new JCheckBox("Astrology");
        JCheckBox physicsCheck = new JCheckBox("Physics");
        JCheckBox chemistryCheck = new JCheckBox("Chemistry");
        JCheckBox programmingCheck = new JCheckBox("Programming");
        JCheckBox foodCheck = new JCheckBox("Food");
        JCheckBox musicCheck = new JCheckBox("Music");

        JLabel interestLabel = new JLabel("Interests");
        interestLabel.setFont(new Font("Consolas", Font.BOLD, 20));

        bioPanel.add(interestLabel);
        interestsPanel.add(astrologyCheck);
        interestsPanel.add(physicsCheck);
        interestsPanel.add(chemistryCheck);
        interestsPanel.add(programmingCheck);
        interestsPanel.add(foodCheck);
        interestsPanel.add(musicCheck);
        bioPanel.add(interestsPanel);

        mainPanel.add(bioPanel);
//        Educational
        JLabel certificate = new JLabel("Highest Education Level");
        certificate.setFont(new Font("Consolas", Font.BOLD, 20));
        String[] certs = {"WASSCE", "HND", "Degree", "Masters"};
        JComboBox comboBox = new JComboBox(certs);
        mainPanel.add(certificate);
        mainPanel.add(comboBox);
//        button for submit
        JButton submitButton = new JButton();
        submitButton.setText("Register");
        submitButton.setFont(new Font("Comic Sans", Font.BOLD, 23));
        submitButton.setHorizontalAlignment(JButton.CENTER);
        submitButton.setForeground(Color.BLACK);
        mainPanel.add(submitButton);

// frame setup

        frame.setLayout(null);
//        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

