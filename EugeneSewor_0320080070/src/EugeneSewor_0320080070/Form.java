package EugeneSewor_0320080070;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class Form extends JFrame implements ActionListener {
    JTextField idField,pNameField,pAgeField,pTempField,pBloodField;
    JButton idmake, cancel ,save,update,fetch;

    Form()  {
        setTitle("Patient's Record");
        setSize(1000,700);
        JLabel title = new JLabel("Patient's Record");
        title.setBounds(200,10,200,40);
        title.setFont(new Font("Consolas",Font.BOLD,20));

        JLabel idLabel = new JLabel("id");
        idLabel.setBounds(10,40,290,40);
        idLabel.setFont(new Font("Consolas",Font.BOLD,15));

        idField = new JTextField("");
        idField.setBounds(310,40,150,40);
        idField.setFont(new Font("Consolas",Font.BOLD,15));


        JLabel pName = new JLabel("Enter Patient's Name");
        pName.setBounds(10,80,290,40);
        pName.setFont(new Font("Consolas",Font.BOLD,15));

        pNameField = new JTextField("");
        pNameField.setBounds(310,80,290,40);
        pNameField.setFont(new Font("Consolas",Font.BOLD,15));


        JLabel pAge = new JLabel("Enter Patient's age");
        pAge.setBounds(10,130,290,40);
        pAge.setFont(new Font("Consolas",Font.BOLD,15));

        pAgeField = new JTextField();
        pAgeField.setBounds(310,130,290,40);
        pAgeField.setFont(new Font("Consolas",Font.BOLD,15));


        JLabel pTemp = new JLabel("Enter Patient's Temperature");
        pTemp.setBounds(10,180,290,40);
        pTemp.setFont(new Font("Consolas",Font.BOLD,15));

        pTempField = new JTextField("");
        pTempField.setBounds(310,180,290,40);
        pTempField.setFont(new Font("Consolas",Font.BOLD,15));

        JLabel pBlood = new JLabel("Enter Patient's Blood Pressure");
        pBlood.setBounds(10,230,300,40);
        pBlood.setFont(new Font("Consolas",Font.BOLD,15));


        pBloodField = new JTextField("");
        pBloodField.setBounds(310,230,290,40);
        pBloodField.setFont(new Font("Consolas",Font.BOLD,15));


        cancel = new JButton("Cancel");
        cancel.setBounds(40,280,100,40);
        cancel.setFont(new Font("Consolas",Font.BOLD,15));
        cancel.addActionListener(this);



        save = new JButton("Save");
        save.setBounds(160,280,100,40);
        save.setFont(new Font("Consolas",Font.BOLD,15));
        save.addActionListener(this);


        update = new JButton("Update");
        update.setBounds(260,280,100,40);
        update.setFont(new Font("Consolas",Font.BOLD,15));
        update.addActionListener(this);



        JButton delete = new JButton("Delete");
        delete.setBounds(360,280,100,40);
        delete.setFont(new Font("Consolas",Font.BOLD,15));
        delete.addActionListener(e-> {
            try {
                deleteRecord(idField.getText());
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });

        idmake = new JButton("idmake");
        idmake.setBounds(460,40,100,40);
        idmake.setFont(new Font("Consolas",Font.BOLD,15));
        idmake.addActionListener(e-> {
            idField.setText(generateID());
            idmake.setEnabled(false);
        });


        fetch = new JButton("Get Patient Data");
        fetch.setBounds(480,280,200,40);
        fetch.setFont(new Font("Consolas",Font.BOLD,15));
        fetch.addActionListener(e-> {
            try {
                ArrayList data = db.fetchOne(idField.getText());
                if (data == null) {
                    JOptionPane.showMessageDialog(null, "Patient Data not found \n enter correct id ","Patient's Record",JOptionPane.INFORMATION_MESSAGE);
                    clearFields();
                }else {
                    pNameField.setText(data.get(0).toString());
                    pAgeField.setText(data.get(1).toString());
                    pTempField.setText(data.get(2).toString());
                    pBloodField.setText(data.get(3).toString());
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });


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
        add(update);
        add(delete);
        add(idmake);
        add(fetch);



        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    //instantiating db
    DBConnect db;

    {
        try {
            db = new DBConnect();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Database connection refused \n <<< check database url and server >>>","DB connection Failure",JOptionPane.ERROR_MESSAGE);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Communications link Failure \n <<< check jdbc driver >>>","DB connector Failure",JOptionPane.ERROR_MESSAGE);


        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /* declaring variables */
        String id = idField.getText();
        String pName = pNameField.getText();
        String pAge = pAgeField.getText();
        String pTemp = pTempField.getText();
        String bloodPressure = pBloodField.getText();

        /* save record to database */
        if (e.getSource()==save) {

            try {
                addFields(id,pName,Integer.parseInt(pAge),Double.parseDouble(pTemp),bloodPressure);
                idmake.setEnabled(true);
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null,"Could not perform operation \n ??? Could not find Database \n <<< check database url and server >>>","DB connection Failure",JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Enter valid data","Illegal operation",JOptionPane.ERROR_MESSAGE);
            }
        }

        /* clear all fields */
        if(e.getSource()==cancel){
            clearFields();
            idmake.setEnabled(true);
        }

        if(e.getSource()==update){
            try {
                updateRecord(id,pName,Integer.parseInt(pAge),Double.parseDouble(pTemp),bloodPressure);
                idmake.setEnabled(true);
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null,"Could not perform operation \n ??? Could not find Database \n <<< check database url and server >>>","DB connection Failure",JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Enter valid data","Illegal operation",JOptionPane.ERROR_MESSAGE);
            }
        }


    }

//generate random id
    public String generateID() {
        int randNum = (int) Math.round(Math.random() * 100);
        String genID = "PID" + randNum;
        System.out.println(genID);
        return genID;
    }

//    clear fields function
    public void clearFields(){
        idField.setText("");
        pNameField.setText("");
        pAgeField.setText("");
        pTempField.setText("");
        pBloodField.setText("");
    }
//    method to add fields
    public void addFields(String id,String name, int age,double temperature, String pressure) throws SQLException {
        db.addData(id,name,age,temperature,pressure);
        clearFields();
        idmake.setEnabled(true);
    }


//    update a record
public void updateRecord(String id,String name, int age,double temperature, String pressure) throws SQLException {
    db.updateRecord(id,name,age,temperature,pressure);
    clearFields();
    idmake.setEnabled(true);
}

//    method to delete field by id
    public void deleteRecord(String id) throws SQLException{
        db.deleteData(id);
    }


}
