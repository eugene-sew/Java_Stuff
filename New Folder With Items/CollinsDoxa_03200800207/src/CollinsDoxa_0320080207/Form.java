package CollinsDoxa_0320080207;

import javax.swing.*;
import java.awt.*;



    public class Form extends JFrame {
        Form(){
            setTitle("Patient's Record");
            setSize(1000,700);
            JLabel title = new JLabel("Patient's Record");
            title.setBounds(200,10,200,40);
            title.setFont(new Font("Consolas",Font.BOLD,20));

            JLabel idLabel = new JLabel("id");
            idLabel.setBounds(10,40,290,40);
            idLabel.setFont(new Font("Consolas",Font.BOLD,15));

            JTextField idField = new JTextField();
            idField.setBounds(220,40,150,40);
            idField.setFont(new Font("Consolas",Font.BOLD,15));


            JLabel pName = new JLabel("Enter Patient's Name");
            pName.setBounds(10,80,290,40);
            pName.setFont(new Font("Consolas",Font.BOLD,15));

            JTextField pNameField = new JTextField();
            pNameField.setBounds(220,80,290,40);
            pNameField.setFont(new Font("Consolas",Font.BOLD,15));


            JLabel pAge = new JLabel("Enter Patient's age");
            pAge.setBounds(10,130,290,40);
            pAge.setFont(new Font("Consolas",Font.BOLD,15));

            JTextField pAgeField = new JTextField();
            pAgeField.setBounds(220,130,290,40);
            pAgeField.setFont(new Font("Consolas",Font.BOLD,15));

            JLabel pTemp = new JLabel("Enter Patient's Temperature");
            pTemp.setBounds(10,180,290,40);
            pTemp.setFont(new Font("Consolas",Font.BOLD,15));

            JTextField pTempField = new JTextField();
            pTempField.setBounds(220,180,290,40);
            pTempField.setFont(new Font("Consolas",Font.BOLD,20));


            JLabel pBlood = new JLabel("Enter Patient's age");
            pBlood.setBounds(10,230,290,40);
            pBlood.setFont(new Font("Consolas",Font.BOLD,15));

            JTextField pBloodField = new JTextField();
            pBloodField.setBounds(220,230,290,40);
            pBloodField.setFont(new Font("Consolas",Font.BOLD,15));


            JButton cancel = new JButton("Cancel");
            cancel.setBounds(40,280,100,40);
            cancel.setFont(new Font("Consolas",Font.BOLD,15));

            JButton save = new JButton("Save");
            save.setBounds(160,280,100,40);
            save.setFont(new Font("Consolas",Font.BOLD,15));



            add(title);
            add(idLabel);
            add(idField);
            add(pName);
            add(pNameField);
            add(pAge);
            add(pAgeField);
            add(pTemp);
            add(pTempField);
            add(pBlood);
            add(pBloodField);
            add(cancel);
            add(save);





            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }
    }

