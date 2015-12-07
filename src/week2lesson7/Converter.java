package week2lesson7;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Converter extends JFrame {

	JLabel lblMile;
	JLabel lblPound;
	JLabel lblGalon;
	JLabel lblFarenheit;
	JLabel lblKm;
	JLabel lblKg;
	JLabel lblLiter;
	JLabel lblCentrgade;

	JTextField txtMile;
	JTextField txtPound;
	JTextField txtGalon;
	JTextField txtFarenheit;
	JTextField txtKm;
	JTextField txtKg;
	JTextField txtLiter;
	JTextField txtCentrade;

	JButton btnConvert;

	public Converter() {
		// TODO Auto-generated constructor stub

		JPanel panel = new JPanel();
		panel.setLayout(null);
		lblMile = new JLabel("Mile:");
		lblMile.setBounds(50, 50, 50, 25);
		panel.add(lblMile);
		
		lblPound = new JLabel("Pound:");
		lblPound.setBounds(50, 80, 50, 25);
		panel.add(lblPound);
		
		txtMile = new JTextField();
		txtMile.setBounds(100, 50, 100, 25);
		panel.add(txtMile);
		
		lblKm = new JLabel("Kilometer:");
		lblKm.setBounds(220, 50, 100, 24);
		panel.add(lblKm);
		
		txtKm = new JTextField();
		txtKm.setBounds(320, 50, 100, 25);
		panel.add(txtKm);
		
		add(panel);
		setVisible(true);
		setResizable(false);
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new Converter();
	}

}
