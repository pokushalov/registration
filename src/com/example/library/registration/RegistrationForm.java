package com.example.library.registration;

import javax.swing.*;

public class RegistrationForm extends JFrame {
    private JPanel contentPane;
    private JTextField txtFirst;
    private JTextField txtLast;
    private JTextField txtEmail;
    private JTextField txtPass;
    private JButton btnRegister;
    private JLabel lblFirst;
    private JLabel lblLast;
    private JLabel lblEmail;
    private JLabel lblPass;
    private Users users;


    public RegistrationForm() {
        super("Registration form");
        // I removed THIS word
        JFrame frame = new JFrame("Registration form xxxxx" );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        // Set a new content pane
        JPanel newContentPane = new JPanel();
        newContentPane.add(new JLabel("Hello, World!"));
        frame.setContentPane(newContentPane);
        // Show the frame
        frame.setVisible(true);


        // this.setContentPane(this.contentPane);
        // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.pack();
    }

    public static void main(String[] args) {

        RegistrationForm form = new RegistrationForm();
        form.setVisible(true);

    }


    private void createUIComponents() {

        // TODO: place custom component creation code here
        // create UUI
        users = new Users();
        btnRegister.addActionListener(e -> {
            String firstName = txtFirst.getText();
            String lastName = txtLast.getText();
            String email = txtEmail.getText();
            String password = txtPass.getText();
            User user = new User(firstName, lastName, email, password);
            users.addUser(user);
            System.out.println(users);
        });

    }
}






