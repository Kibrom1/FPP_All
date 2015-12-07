package week2lesson6;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RainBow extends JFrame {
	JButton btnRed;
	JButton btnOrange;
	JButton btnGreen;
	JButton btnBlue;
	JButton btnYellow;
	JButton btnPink;
	JButton btnpPurple;
	static int width = 50;
	static int height = 50;

	RainBow() {
		JPanel panel = new JPanel();

		btnRed = new JButton();
		btnRed.setBackground(Color.RED);
		setSize(width, height);
		btnRed.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		panel.add(btnRed);

		btnOrange = new JButton();
		btnOrange.setBackground(Color.ORANGE);
		btnOrange.setSize(width, height);
		btnOrange.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		panel.add(btnOrange);

		btnGreen = new JButton();
		btnGreen.setBackground(Color.GREEN);
		btnGreen.setSize(width, height);
		btnGreen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		panel.add(btnGreen);

		btnBlue = new JButton();
		btnBlue.setBackground(Color.BLUE);
		btnBlue.setSize(width, height);
		btnBlue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		panel.add(btnBlue);

		btnYellow = new JButton();
		btnYellow.setBackground(Color.YELLOW);
		btnYellow.setSize(width, height);
		btnYellow.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		panel.add(btnYellow);

		btnPink = new JButton();
		btnPink.setBackground(Color.PINK);
		btnPink.setSize(width, height);
		btnPink.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		panel.add(btnPink);

		btnpPurple = new JButton();
		btnpPurple.setBackground(Color.CYAN);
		btnpPurple.setSize(width, height);
		btnpPurple.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		panel.add(btnpPurple);

		add(panel);
		setVisible(true);
		setSize(300, 50);

	}

	public static void main(String[] args) {
		new RainBow();
	}

}
