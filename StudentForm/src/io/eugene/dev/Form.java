package io.eugene.dev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Month;

public class Form extends JFrame implements ActionListener {
    JButton submitBtn,cancelBtn;
    JTextField sfnameTextBox,slnameTextBox,emailTextBox,emailConfirmTextBox;
    JPasswordField passwordTextBox,passwordConfirmTextBox;
    JComboBox yearCombo,monthCombo,dayCombo;
    JRadioButton maleButton,femaleButton,cmiButton,cseButton,elecButton,elecomButton,mechButton;


    Form(){

        setTitle("Registration Form");

        add(new Title());

//        first name
        JLabel sfnameLabel = new JLabel("Student First Name");
        sfnameLabel.setBounds(10,50,180,40);
        sfnameLabel.setFont(new Font("serif", Font.BOLD, 15));

        sfnameTextBox = new JTextField();
        sfnameTextBox.setBounds(190,50,250,40);
        sfnameTextBox.setFont(new Font("Comic Sans", Font.PLAIN, 20));

//      last name
        JLabel slnameLabel = new JLabel("Student Last Name");
        slnameLabel.setBounds(10,100,150,40);
        slnameLabel.setFont(new Font("serif", Font.BOLD, 15));

        slnameTextBox = new JTextField();
        slnameTextBox.setBounds(190,100,250,40);
        slnameTextBox.setFont(new Font("Comic Sans", Font.PLAIN, 20));

//        email
        JLabel emailLabel = new JLabel("Email Address");
        emailLabel.setBounds(10,150,150,40);
        emailLabel.setFont(new Font("serif", Font.BOLD, 15));

        emailTextBox = new JTextField();
        emailTextBox.setBounds(190,150,250,40);
        emailTextBox.setFont(new Font("Comic Sans", Font.PLAIN, 20));

//        confirm email
        JLabel emailConfirmLabel = new JLabel("Confirm Email Address");
        emailConfirmLabel.setBounds(10,200,200,40);
        emailConfirmLabel.setFont(new Font("serif", Font.BOLD, 15));

        emailConfirmTextBox = new JTextField();
        emailConfirmTextBox.setBounds(190,200,250,40);
        emailConfirmTextBox.setFont(new Font("Comic Sans", Font.PLAIN, 20));

//        password
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,250,200,40);
        passwordLabel.setFont(new Font("serif", Font.BOLD, 15));

        passwordTextBox = new JPasswordField();
        passwordTextBox.setBounds(190,250,250,40);
        passwordTextBox.setFont(new Font("Comic Sans", Font.PLAIN, 20));

//        confirm password
        JLabel passwordConfirmLabel = new JLabel("Confirm Password");
        passwordConfirmLabel.setBounds(10,300,200,40);
        passwordConfirmLabel.setFont(new Font("serif", Font.BOLD, 15));

        passwordConfirmTextBox = new JPasswordField();
        passwordConfirmTextBox.setBounds(190,300,250,40);
        passwordConfirmTextBox.setFont(new Font("Comic Sans", Font.PLAIN, 20));

//        Date of birth
        String[] year = {"Year","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
        String[] month = {"Month","January","February","March","April","May","June","July","August","September","October","November","December"};
        String[] day={"Day","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

        JLabel dobLabel = new JLabel("Date of Birth");
        dobLabel.setBounds(10,350,200,40);
        dobLabel.setFont(new Font("serif", Font.BOLD, 15));

        yearCombo = new JComboBox(year);
        yearCombo.setBounds(190,350,110,40);
        monthCombo = new JComboBox(month);
        monthCombo.setBounds(300,350,110,40);
        dayCombo = new JComboBox(day);
        dayCombo.setBounds(410,350,110,40);


//        gender
        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("sans serif", Font.BOLD, 15));
        genderLabel.setBounds(10, 400,200,40);

        maleButton = new JRadioButton("Male");
        maleButton.setBounds(190, 400,100,40);
        maleButton.addActionListener(this);

        femaleButton = new JRadioButton("Female");
        femaleButton.setBounds(300, 400,100,40);
        femaleButton.addActionListener(this);

        //adding gender options to a button group
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

// Department
        JLabel dptLabel = new JLabel("Department");
        dptLabel.setFont(new Font("sans serif", Font.BOLD, 15));
        dptLabel.setBounds(10, 450,200,40);

        cmiButton = new JRadioButton("CMI");
        cmiButton.setBounds(190, 450,250,40);
        cmiButton.addActionListener(this);

        cseButton = new JRadioButton("Computer Science and Engineering");
        cseButton.setBounds(190, 480,250,40);
        cseButton.addActionListener(this);

        elecButton = new JRadioButton("Electrical");
        elecButton.setBounds(190, 510,250,40);
        elecButton.addActionListener(this);

        elecomButton = new JRadioButton("Electronics and Communication");
        elecomButton.setBounds(190, 540,250,40);
        elecomButton.addActionListener(this);

        mechButton = new JRadioButton("Mechanical");
        mechButton.setBounds(190, 570,250,40);
        mechButton.addActionListener(this);

        //adding department options to a button group
        ButtonGroup dptGroup = new ButtonGroup();
        dptGroup.add(cmiButton);
        dptGroup.add(cseButton);
        dptGroup.add(elecButton);
        dptGroup.add(elecomButton);
        dptGroup.add(mechButton);


//        imagebox
        JPanel emptyPanel = new JPanel();
        emptyPanel.setBounds(500,450,230,230);
        emptyPanel.setBackground(Color.WHITE);

//        submit buttons
        submitBtn = new JButton("Submit");
        submitBtn.setFont(new Font("sans serif", Font.BOLD, 16));
        submitBtn.setFocusable(false);
        submitBtn.setBounds(190,620,100,40);
        submitBtn.addActionListener(this);
//        cancel
        cancelBtn = new JButton("Cancel");
        cancelBtn.addActionListener(this);
        cancelBtn.setFont(new Font("sans serif", Font.BOLD, 16));
        cancelBtn.setFocusable(false);
        cancelBtn.setBounds(340,620,100,40);


        add(sfnameLabel);
        add(sfnameTextBox);
        add(slnameLabel);
        add(slnameTextBox);
        add(emailLabel);
        add(emailTextBox);
        add(emailConfirmLabel);
        add(emailConfirmTextBox);
        add(passwordLabel);
        add(passwordTextBox);
        add(passwordConfirmLabel);
        add(passwordConfirmTextBox);
        add(dobLabel);
        add(yearCombo);
        add(monthCombo);
        add(dayCombo);
        add(genderLabel);
        add(maleButton);
        add(femaleButton);
        add(dptLabel);
        add(cmiButton);
        add(cseButton);
        add(elecButton);
        add(elecomButton);
        add(mechButton);
        add(emptyPanel);
        add(submitBtn);
        add(cancelBtn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,900);
        setLayout(null);
        setVisible(true);
        setResizable(false);

    }

    @SuppressWarnings("deprecation")
    @Override
    public void actionPerformed(ActionEvent e) {
        String gender = null;
        String department = null;
//    creating instance of db
        DBConnect connect = new DBConnect();
//    try connecting to db
        connect.connect();

//        query db

        if(e.getSource()==submitBtn){
//            dispose();
            String fname = sfnameTextBox.getText();
            String lname = slnameTextBox.getText();
            String email = emailTextBox.getText();
            String confirm_Email = emailConfirmTextBox.getText();
            String password = passwordTextBox.getText();
            String confirm_Password = passwordConfirmTextBox.getText();
            LocalDate fullDate =  LocalDate.of(Integer.parseInt(yearCombo.getSelectedItem().toString()), Month.valueOf(monthCombo.getSelectedItem().toString().toUpperCase()),Integer.parseInt(dayCombo.getSelectedItem().toString()));
            if(maleButton.isSelected()) gender = "male";
            else if(femaleButton.isSelected()) gender = "female";
            if(cmiButton.isSelected()) department = "CMI";
            else if(cseButton.isSelected()) department = "Computer Science and Engineering";
            else if(elecButton.isSelected()) department = "Electrical";
            else if(elecomButton.isSelected()) department = "Electronics and Communication";
            else if(mechButton.isSelected()) department = "Mechanical";
            System.out.println(fname +" "+lname+" "+email+" "+confirm_Email+" "+password+" "+confirm_Password+" "+fullDate+" "+gender+" "+ department);
            connect.makeQuery(fname,lname,email,password,fullDate,gender,department);
            JOptionPane.showMessageDialog(null,"Data Submitted Successfully", "Student Registration Form", JOptionPane.INFORMATION_MESSAGE);
        }else if (e.getSource()==cancelBtn){
            dispose();
            JOptionPane.showMessageDialog(null,"Data Not Submitted", "Student Registration Form", JOptionPane.ERROR_MESSAGE);
            System.out.println("oops");
        }
    }
}
