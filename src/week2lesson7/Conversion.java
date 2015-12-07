package week2lesson7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Conversion extends JFrame {
	JTextField txtMile;
	JTextField txKm;
	JTextField txtPound;
	JTextField txtKg;
	JTextField txtGalon;
	JTextField txtLiter;
	JTextField txtFarenheit;
	JTextField txtCentigrade;
	JLabel lblKm;
	JLabel lblMile;
	JLabel lblPound;

	JLabel lblKg;
	JLabel lblGalon;
	JLabel lblLiter;
	JLabel lblFarenheit;
	JLabel lblCentgrade;

	Conversion() {
		JPanel panel = new JPanel();
		setTitle("Metric Conversion Assistant");
		setSize(500, 300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		panel.setLayout(null);

		lblMile = new JLabel("Mile:");
		lblMile.setBounds(50, 20, 100, 20);
		panel.add(lblMile);

		lblKm = new JLabel("Kilometer:");
		lblKm.setBounds(270, 20, 100, 20);
		panel.add(lblKm);

		lblPound = new JLabel("Pound:");
		lblPound.setBounds(50, 50, 100, 20);
		panel.add(lblPound);

		lblKg = new JLabel("Kilogram:");
		lblKg.setBounds(270, 50, 100, 20);
		panel.add(lblKg);

		lblGalon = new JLabel("Gallon:");
		lblGalon.setBounds(50, 80, 100, 20);
		panel.add(lblGalon);

		lblLiter = new JLabel("Liter:");
		lblLiter.setBounds(270, 80, 100, 20);
		panel.add(lblLiter);

		lblFarenheit = new JLabel("Fahrenheit:");
		lblFarenheit.setBounds(50, 110, 100, 20);
		panel.add(lblFarenheit);

		lblCentgrade = new JLabel("Centigrade:");
		lblCentgrade.setBounds(270, 110, 100, 20);
		panel.add(lblCentgrade);

		txtMile = new JTextField(20);
		txtMile.setBounds(155, 20, 100, 20);
		panel.add(txtMile);

		txKm = new JTextField(20);
		txKm.setBounds(380, 20, 100, 20);
		panel.add(txKm);

		txtPound = new JTextField(20);
		txtPound.setBounds(155, 50, 100, 20);
		panel.add(txtPound);

		txtKg = new JTextField(20);
		txtKg.setBounds(380, 50, 100, 20);
		panel.add(txtKg);

		txtGalon = new JTextField(20);
		txtGalon.setBounds(155, 80, 100, 20);
		panel.add(txtGalon);

		txtLiter = new JTextField(20);
		txtLiter.setBounds(380, 80, 100, 20);
		panel.add(txtLiter);

		txtFarenheit = new JTextField(20);
		txtFarenheit.setBounds(155, 110, 100, 20);
		panel.add(txtFarenheit);

		txtCentigrade = new JTextField(20);
		txtCentigrade.setBounds(380, 110, 100, 20);
		panel.add(txtCentigrade);

		JButton btnConvert = new JButton("Convert");
		btnConvert.setBounds(130, 150, 100, 40);
		btnConvert.addActionListener(evt -> {
			DecimalFormat df = new DecimalFormat();

			if (txtMile.getText().length() != 0) {
				float mile = Float.parseFloat(txtMile.getText());
				df.setMaximumFractionDigits(2);
				txKm.setText(String.valueOf(df.format(mile * 1.609344)));
			}

			if (txtPound.getText().length() != 0) {
				float pound = Float.parseFloat(txtPound.getText());
				float val = (float) (pound / 2.2);
				df.setMaximumFractionDigits(2);
				txtKg.setText(String.valueOf(df.format(val)));
			}

			if (txtGalon.getText().length() != 0) {
				float gallon = Float.parseFloat(txtGalon.getText());
				float val = (float) (gallon * 3.785411784);
				df.setMaximumFractionDigits(2);
				txtLiter.setText(String.valueOf(df.format(val)));

			}

			if (txtFarenheit.getText().length() != 0) {
				float fr = Float.parseFloat(txtFarenheit.getText());
				float val = (float) ((fr - 32) * 0.5556);
				df.setMaximumFractionDigits(2);
				txtCentigrade.setText(String.valueOf(df.format(val)));
			}

		});
		panel.add(btnConvert);
		add(panel);
	}

	public static void main(String[] args) {
		new Conversion();
	}

}

//output
// by running the code
