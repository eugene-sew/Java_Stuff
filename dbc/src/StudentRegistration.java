import javax.swing.*;

public class StudentRegistration {
    private JPanel Main;
    private JLabel heading;
    private JLabel fnameLabel;
    private JTextField fname;
    private JLabel lnameLabel;
    private JTextField lname;
    private JLabel indexLabel;
    private JTextField indexNumber;

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentRegistration");
        frame.setContentPane(new StudentRegistration().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
