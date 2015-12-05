package week2lesson6;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame implements ActionListener{

	JTextField txtUser;
	JTextField txtPssd;
	JLabel lblUser;
	JLabel lblPssd;
	JButton btnLogin;
	JButton btnRegister;

	public Login() {
		Container pane = getContentPane();
		lblUser = new JLabel("User");
		lblUser.setBounds(50, 50, 100, 25);
		pane.add(lblUser);
		txtUser = new JTextField();
		txtUser.setBounds(120, 50, 150, 25);
		txtUser.setBackground(Color.BLUE);
		pane.add(txtUser);
		lblPssd = new JLabel("Password");
		lblPssd.setBounds(50, 80, 100, 25);
		pane.add(lblPssd);
		txtPssd = new JTextField();
		txtPssd.setBounds(120, 80, 150, 25);
		pane.add(txtPssd);
		btnLogin = new JButton("Login");
		btnLogin.setBounds(50, 120, 100, 30);
		btnLogin.setBackground(Color.RED);
		btnLogin.addActionListener(this);
		pane.add(btnLogin);
		btnRegister = new JButton("Register");
		btnRegister.setBounds(180, 120, 100, 30);

		pane.add(btnRegister);
		setBounds(0, 0, 400, 200);
		setTitle("Login Screen");
		pane.setLayout(null);
		//setLayout(null);
		pane.setLocation(120,120);
		setLocation(100, 100);
		setBackground(Color.BLACK);
		pane.setBackground(Color.CYAN);
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		JFrame login = new Login();
		login.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		txtUser.setText("Reseted");
	}

}


