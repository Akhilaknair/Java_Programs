import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginApp extends JFrame implements ActionListener {
    
    // Database connection details
    private static final String DB_URL = "jdbc:mysql://localhost:3306/user_db";
    private static final String DB_USERNAME = "root"; // Change if needed
    private static final String DB_PASSWORD = "password"; // Change if needed

    // GUI Components
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    // Constructor to set up the GUI
    public LoginApp() {
        // Set up frame properties
        setTitle("Login System");
        setSize(300, 200);
        setLocationRelativeTo(null);  // Center the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create UI components
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);  // Register the ActionListener

        // Add components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);

        // Make the window visible
        setVisible(true);
    }

    // ActionListener method to handle login button click
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (verifyLogin(username, password)) {
                JOptionPane.showMessageDialog(this, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Method to verify user credentials from the database
    private boolean verifyLogin(String username, String password) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            // SQL query to check if the user exists in the database
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, username);
                stmt.setString(2, password);
                ResultSet rs = stmt.executeQuery();

                // If a user is found with the given credentials, return true
                return rs.next();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database connection error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Set up the look and feel of the UI (optional)
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Launch the login window
        new LoginApp();
    }
}

