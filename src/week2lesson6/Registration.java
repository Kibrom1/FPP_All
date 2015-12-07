package week2lesson6;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Registration extends JFrame {

	JLabel lblWelcome;
	JLabel lblRegistration;
	JLabel lblFirstName;
	JLabel lblLastName;
	JLabel lblStreet;
	JLabel lblCity;
	JLabel lblState;
	JLabel lblCountry;
	JLabel lblGender;
	JLabel lblSelecCourse;
	JLabel lblSuitableSession;
	JLabel lblMessage;

	JTextField txtFirstName;
	JTextField txtLastName;
	JTextField txtStreet;
	JTextField txtCity;
	JTextField txtState;
	JTextField txtCountry;
	JTextArea txtMessage;

	JRadioButton rbtnMale;
	JRadioButton rbtnFemale;

	JComboBox<String> cmbCourse;
	JCheckBox chkMorning;
	JCheckBox chkEvening;
	JCheckBox chkAfternoon;
	JButton btnSubmit;

	Registration() {
		JPanel panel = new JPanel();
		// adding only Labels
		// lblFirstName = new JLabel("First Name");
		// lblFirstName.setBounds(50,50,);
		lblWelcome = new JLabel("Welcome to Maharishi University of Management");
		lblWelcome.setBounds(250, 20, 350, 20);
		panel.add(lblWelcome);
		lblRegistration = new JLabel("Online class registration form");
		lblRegistration.setBounds(300, 35, 250, 20);
		panel.add(lblRegistration);
		lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(100, 70, 100, 20);
		panel.add(lblFirstName);

		lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(100, 95, 100, 20);
		panel.add(lblLastName);

		lblStreet = new JLabel("Street:");
		lblStreet.setBounds(100, 120, 100, 20);
		panel.add(lblStreet);

		lblCity = new JLabel("City");
		lblCity.setBounds(100, 145, 100, 20);
		panel.add(lblCity);

		lblState = new JLabel("State:");
		lblState.setBounds(100, 170, 100, 20);
		panel.add(lblState);

		lblCountry = new JLabel("Country:");
		lblCountry.setBounds(100, 195, 100, 20);
		panel.add(lblCountry);

		lblGender = new JLabel("Gender");
		lblGender.setBounds(100, 220, 100, 20);
		panel.add(lblGender);

		lblSelecCourse = new JLabel("Select Course:");
		lblSelecCourse.setBounds(100, 245, 120, 20);
		panel.add(lblSelecCourse);

		lblSuitableSession = new JLabel("Suitable Session:");
		lblSuitableSession.setBounds(100, 270, 130, 20);
		panel.add(lblSuitableSession);

		lblMessage = new JLabel("Message:");
		lblMessage.setBounds(100, 295, 130, 20);
		panel.add(lblMessage);

		txtFirstName = new JTextField();
		txtFirstName.setBounds(250, 65, 200, 20);
		panel.add(txtFirstName);

		txtLastName = new JTextField();
		txtLastName.setBounds(250, 90, 200, 20);
		panel.add(txtLastName);

		txtStreet = new JTextField();
		txtStreet.setBounds(250, 115, 200, 20);
		panel.add(txtStreet);

		txtCity = new JTextField();
		txtCity.setBounds(250, 140, 200, 20);
		panel.add(txtCity);

		txtState = new JTextField();
		txtState.setBounds(250, 165, 200, 20);
		panel.add(txtState);

		txtCountry = new JTextField();
		txtCountry.setBounds(250, 190, 200, 20);
		panel.add(txtCountry);

		rbtnMale = new JRadioButton("Male");
		rbtnMale.setBounds(250, 220, 100, 20);
		rbtnMale.setSelected(true);

		panel.add(rbtnMale);

		rbtnFemale = new JRadioButton("Female");
		rbtnFemale.setBounds(350, 220, 100, 20);
		panel.add(rbtnFemale);

		ButtonGroup grpGender = new ButtonGroup();
		grpGender.add(rbtnMale);
		grpGender.add(rbtnFemale);

		String[] courses = { "Java", "C#", "C++", "C" };
		cmbCourse = new JComboBox<String>(courses);
		cmbCourse.setBounds(250, 250, 200, 25);
		panel.add(cmbCourse);

		chkMorning = new JCheckBox("Morning");
		chkMorning.setBounds(250, 280, 100, 25);
		chkMorning.setSelected(true);
		panel.add(chkMorning);

		chkAfternoon = new JCheckBox("Afternoon");
		chkAfternoon.setBounds(350, 280, 100, 25);
		panel.add(chkAfternoon);

		chkEvening = new JCheckBox("Evening");
		chkEvening.setBounds(450, 280, 100, 25);
		panel.add(chkEvening);

		txtMessage = new JTextArea(10, 20);
		txtMessage.setBounds(250, 310, 300, 100);
		panel.add(txtMessage);

		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(250, 420, 200, 40);
		panel.add(btnSubmit);

		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (txtFirstName.getText().equals("") || txtLastName.getText().equals("")
						|| txtStreet.getText().equals("") || txtCity.getText().equals("")
						|| txtState.getText().equals("") || txtCountry.getText().equals("")
						|| txtMessage.getText().equals("")) {
					if (txtFirstName.getText().equals(""))
						JOptionPane.showMessageDialog(panel, "Please Enter First Name");
					if (txtLastName.getText().equals(""))
						JOptionPane.showMessageDialog(panel, "Please Enter Last Name");
					if (txtStreet.getText().equals(""))
						JOptionPane.showMessageDialog(panel, "Please Enter Street Name");
					if (txtCity.getText().equals(""))
						JOptionPane.showMessageDialog(panel, "Please Enter City Name");
					if (txtState.getText().equals(""))
						JOptionPane.showMessageDialog(panel, "Please Enter State Name");
					if (txtCountry.getText().equals(""))
						JOptionPane.showMessageDialog(panel, "Please Enter Country Name");
				} else if ((chkAfternoon.isSelected() == false) && (chkMorning.isSelected() == false)
						&& (chkEvening.isSelected() == false)) {
					JOptionPane.showMessageDialog(panel, "Please select suittable session!");
				} else {
					JOptionPane.showMessageDialog(panel, "Successfully Registered!");
				}

			}
		});

		add(panel);
		panel.setLayout(null);
		setVisible(true);
		setResizable(false);
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Registration();
	}

}
// Output
// Can be seen by running the code
