package week2lesson6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StringUtility extends JFrame {

	JButton btnCount;
	JButton btnReverse;
	JButton btnRemoveDuplicate;
	JTextField txtInput;
	JTextField txtOutput;
	JLabel lblInput;
	JLabel lblOutput;

	StringUtility(){
		JPanel panel = new JPanel();
		btnCount = new JButton("Count Letters");
		btnCount.setBounds(50,50,170,25);
		btnCount.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txtOutput.setText(txtInput.getText());
			}
		});
		panel.add(btnCount);
		btnReverse = new JButton("Reverse Letters");
		btnReverse.setBounds(50,90,170,25);
		btnReverse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtOutput.setText(txtInput.getText());
			}
		});
		panel.add(btnReverse);
		btnRemoveDuplicate = new JButton("Remove Duplicates");
		btnRemoveDuplicate.setBounds(50,130,170,25);
		btnRemoveDuplicate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtOutput.setText(txtInput.getText());
			}
		});
			
		
		panel.add(btnRemoveDuplicate);
		
		txtInput = new JTextField();
		txtInput.setBounds(240,70,200,25);
		panel.add(txtInput);
		
		txtOutput = new JTextField();
		txtOutput.setBounds(240, 120, 200, 25);
		panel.add(txtOutput);
		
		lblInput = new JLabel("Input");
		lblInput.setBounds(240,50,100,25);
		panel.add(lblInput);
		
		lblOutput = new JLabel("Output");
		lblOutput.setBounds(240,100,100,25);
		panel.add(lblOutput);
		add(panel);
		panel.setLayout(null);
		setVisible(true);
		setBounds(50,50,500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		StringUtility stUtility = new StringUtility();
	}

}
