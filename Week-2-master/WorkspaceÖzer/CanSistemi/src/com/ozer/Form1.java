package com.ozer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form1 {

	private JFrame frmCalculatingnumber;
	private JTextField txtsayi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form1 window = new Form1();
					window.frmCalculatingnumber.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Form1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculatingnumber = new JFrame();
		frmCalculatingnumber.setTitle("CalculatingNumber");
		frmCalculatingnumber.setBounds(100, 100, 450, 300);
		frmCalculatingnumber.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculatingnumber.getContentPane().setLayout(null);

		JLabel lblSay = new JLabel("Say\u0131");
		lblSay.setBounds(50, 46, 78, 14);
		frmCalculatingnumber.getContentPane().add(lblSay);

		txtsayi = new JTextField();
		txtsayi.setBounds(184, 43, 86, 20);
		frmCalculatingnumber.getContentPane().add(txtsayi);
		txtsayi.setColumns(10);

		JButton btnClick = new JButton("Click");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sayi = txtsayi.getText();

				Byte sayiDegeri = Byte.valueOf(sayi);

				if (sayiDegeri >= 0 && sayiDegeri <= 50) {

					if (sayiDegeri % 5 == 0) {
						JOptionPane.showMessageDialog(frmCalculatingnumber, "Sayý 5 ile tam bölünür.");
					} else if (sayiDegeri % 4 == 0) {
						JOptionPane.showMessageDialog(frmCalculatingnumber, "Sayý 4 ile tam bölünür.");
					} else if (sayiDegeri % 3 == 0) {
						JOptionPane.showMessageDialog(frmCalculatingnumber, "Sayý 3 ile tam bölünür.");
					} else if (sayiDegeri % 2 == 0) {
						JOptionPane.showMessageDialog(frmCalculatingnumber, "Sayý 2 ile tam bölünür.");
					} else {
						JOptionPane.showMessageDialog(frmCalculatingnumber, "Sayý 2,3,4 ve 5 ile tam bölünmez.");
					}
				} else
					JOptionPane.showMessageDialog(frmCalculatingnumber, "Sayý 0 ile 50 aralýðýnda deðildir..!!");

			}

		});
		btnClick.setBounds(184, 100, 89, 23);
		frmCalculatingnumber.getContentPane().add(btnClick);
	}

}
