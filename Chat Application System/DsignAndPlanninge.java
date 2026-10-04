import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DsignAndPlanninge extends JFrame {
    public DsignAndPlanninge() {
        setTitle("Chat Application");
        setSize(400, 300);

        // Initialize components
        JButton signUpButton = new JButton("Sign Up");
        JButton loginButton = new JButton("Log In");
        JButton deliverMessageButton = new JButton("Deliver Message");
        JButton receiveMessageButton = new JButton("Receive Message");
        JButton manageUserListButton = new JButton("Manage User List");
        JButton displayMessageButton = new JButton("Display Message");
        JButton notificationButton = new JButton("Notification");
        JButton logoutButton = new JButton("Log Out");

        // Layout setup
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10)); // 4 rows, 2 columns, with 10px horizontal and vertical gap
        panel.add(signUpButton);
        panel.add(loginButton);
        panel.add(deliverMessageButton);
        panel.add(receiveMessageButton);
        panel.add(manageUserListButton);
        panel.add(displayMessageButton);
        panel.add(notificationButton);
        panel.add(logoutButton);

        // Add components to the frame
        add(panel);
        // Location allocated
        setLocationRelativeTo(null);

        // Event listeners
        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openSignUp();
            }
        });

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openLogIn();
            }
        });

        deliverMessageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openDeliverMessage();
            }
        });

        receiveMessageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openReceiveMessage();
            }
        });

        manageUserListButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openManageUserList();
            }
        });

        displayMessageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openDisplayMessage();
            }
        });

        notificationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openNotification();
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openLogOut();
            }
        });
    }

    private void openSignUp() {
        SignUp signUpWindow = new SignUp();
        signUpWindow.setVisible(true);
    }

    private void openLogIn() {
        LogIn logInWindow = new LogIn();
        logInWindow.setVisible(true);
    }

    private void openDeliverMessage() {
        DeliverMessage deliverMessageWindow = new DeliverMessage();
        deliverMessageWindow.setVisible(true);
    }

    private void openReceiveMessage() {
        ReceiveMessage receiveMessageWindow = new ReceiveMessage();
        receiveMessageWindow.setVisible(true);
    }

    private void openManageUserList() {
        ManageUserList manageUserListWindow = new ManageUserList();
        manageUserListWindow.setVisible(true);
    }

    private void openDisplayMessage() {
        DisplayMessage displayMessageWindow = new DisplayMessage();
        displayMessageWindow.setVisible(true);
    }

    private void openNotification() {
        Notification notificationWindow = new Notification();
        notificationWindow.setVisible(true);
    }

    private void openLogOut() {
        LogOut logOutWindow = new LogOut();
        logOutWindow.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                DsignAndPlanninge designAndPlanningWindow = new DsignAndPlanninge();
                designAndPlanningWindow.setVisible(true);
            }
        });
    }
    
}

class SignUp extends JFrame {
    private JLabel nameLabel, usernameLabel, passwordLabel;
    private JTextField nameField, usernameField;
    private JPasswordField passwordField;
    private JButton signUpButton;

    public SignUp() {
        setTitle("Sign Up");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Initialize components
        nameLabel = new JLabel("Name:");
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");

        nameField = new JTextField(20);
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);

        signUpButton = new JButton("Sign Up");

        // Layout setup
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(signUpButton);

        // Add components to the frame
        add(panel);

        // Event listener for sign-up button
        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                signUp();
            }
        });
    }

    private void signUp() {
        String name = nameField.getText();
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());


        JOptionPane.showMessageDialog(this, "Name: " + name + "\nUsername: " + username + "\nPassword: " + password,
                "Sign Up Successful", JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }
}

class LogIn extends JFrame {
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, signUpButton;

    public LogIn() {
        setTitle("Log In");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize components
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");

        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);

        loginButton = new JButton("Log In");
        signUpButton = new JButton("Sign Up");

        // Layout setup
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(signUpButton);

        // Add components to the frame
        add(panel);

        // Event listener for login button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                logIn();
            }
        });

        // Event listener for sign-up button
        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openSignUp();
            }
        });
    }

    private void logIn() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());


        JOptionPane.showMessageDialog(this, "Logged in successfully as: " + username, "Log In Successful",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void openSignUp() {
        SignUp signUpWindow = new SignUp();
        signUpWindow.setVisible(true);
    }
}

class DeliverMessage extends JFrame {
    private JTextArea messageArea;
    private JTextField messageField;
    private JButton sendButton;

    public DeliverMessage() {
        setTitle("Deliver Message");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize components
        messageArea = new JTextArea();
        messageArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(messageArea);
        messageField = new JTextField(20);
        sendButton = new JButton("Send");

        // Layout setup
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(messageField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);

        // Add components to the frame
        add(panel, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);

        // Event listeners
        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
        messageField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
    }

    private void sendMessage() {
        String message = messageField.getText();
        if (!message.isEmpty()) {
            messageArea.append("You: " + message + "\n");
            messageField.setText("");
        }
    }
}

class ReceiveMessage extends JFrame {
    private JTextArea messageArea;

    public ReceiveMessage() {
        setTitle("Receive Message");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Initialize components
        messageArea = new JTextArea();
        messageArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(messageArea);

        // Layout setup
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        // Add components to the frame
        add(panel, BorderLayout.CENTER);
    }

    public void displayMessage(String sender, String message) {
        // Append the received message to the message area
        messageArea.append(sender + ": " + message + "\n");
    }
}


class ManageUserList extends JFrame {
    private JList<String> userList;
    private DefaultListModel<String> listModel;
    private JButton addButton, removeButton;

    public ManageUserList() {
        setTitle("Manage User List");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize components
        listModel = new DefaultListModel<>();
        userList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(userList);
        addButton = new JButton("Add User");
        removeButton = new JButton("Remove User");

        // Layout setup
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Add components to the frame
        add(mainPanel);

        // Event listeners
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addUser();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removeUser();
            }
        });
    }

    private void addUser() {
        String username = JOptionPane.showInputDialog(this, "Enter username:");
        if (username != null && !username.isEmpty()) {
            listModel.addElement(username);
        }
    }
    private void removeUser() {
        int selectedIndex = userList.getSelectedIndex();
        if (selectedIndex != -1) {
            listModel.remove(selectedIndex);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a user to remove.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
}

class DisplayMessage extends JFrame {
    private JTextArea messageArea;

    public DisplayMessage() {
        setTitle("Display Message");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Initialize components
        messageArea = new JTextArea();
        messageArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(messageArea);

        // Layout setup
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        // Add components to the frame
        add(panel);
    }

    public void displayMessage(String sender, String message) {
        // Append the message to the message area
        messageArea.append(sender + ": " + message + "\n");

        // Ensure the message area scrolls to the bottom to show the latest message
        messageArea.setCaretPosition(messageArea.getDocument().getLength());
    }
}


class Notification extends JFrame {
    private JLabel notificationLabel;

    public Notification() {
        setTitle("Notification");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize components
        notificationLabel = new JLabel();

        // Layout setup
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(notificationLabel, BorderLayout.CENTER);

        // Add components to the frame
        add(panel);

        // Center the window on the screen
        setLocationRelativeTo(null);
    }

    public void displayNotification(String notification) {
        notificationLabel.setText(notification);
    }
}

class LogOut extends JFrame {
    private JLabel logoutLabel;
    private JButton logoutButton;

    public LogOut() {
        setTitle("Log Out");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize components
        logoutLabel = new JLabel("Are you sure you want to log out?");
        logoutButton = new JButton("Log Out");

        // Layout setup
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(logoutLabel, BorderLayout.CENTER);
        panel.add(logoutButton, BorderLayout.SOUTH);

        // Add components to the frame
        add(panel);

        // Center the window on the screen
        setLocationRelativeTo(null);

        // Event listener for logout button
        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performLogout();
            }
        });
    }

    private void performLogout() {

        JOptionPane.showMessageDialog(this, "Logged out successfully!", "Log Out", JOptionPane.INFORMATION_MESSAGE);

        // Close the logout window
        dispose();
    }
}
