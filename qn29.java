import java.awt.*;
import java.awt.event.*;
public class qn29 extends Frame implements ActionListener {
    Label nameLabel, ageLabel, genderLabel, courseLabel;
    TextField nameField, ageField;
    Choice genderChoice, courseChoice;
    Button submitButton, resetButton;
    public qn29() {
        setTitle("Student Registration Form");
        setLayout(new GridLayout(5, 2));
        nameLabel = new Label("Name:");
        ageLabel = new Label("Age:");
        genderLabel = new Label("Gender:");
        courseLabel = new Label("Course:");
        nameField = new TextField();
        ageField = new TextField();

        genderChoice = new Choice();
        genderChoice.add("Male");
        genderChoice.add("Female");
        genderChoice.add("Other");

        courseChoice = new Choice();
        courseChoice.add("Computer Science");
        courseChoice.add("Information Technology");
        courseChoice.add("Electronics");
        courseChoice.add("Mechanical Engineering");

        submitButton = new Button("Submit");
        resetButton = new Button("Reset");
        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(genderLabel);
        add(genderChoice);
        add(courseLabel);
        add(courseChoice);
        add(submitButton);
        add(resetButton);
       
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);
        setSize(400, 300);
        setVisible(true);
       
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });  }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            
            String name = nameField.getText();
            String age = ageField.getText();
            String gender = genderChoice.getSelectedItem();
            String course = courseChoice.getSelectedItem();
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Course: " + course);
        } else if (e.getSource() == resetButton) {
            nameField.setText("");
            ageField.setText("");
            genderChoice.select(0); 
            courseChoice.select(0); 
            }
    }
    public static void main(String[] args) {
        new qn29();}
}

