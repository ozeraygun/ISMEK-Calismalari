package com.ozer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form2 {

	private JFrame frame;
	private JTextField txtsayi1;
	private JTextField txtsayi2;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form2 window = new Form2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Form2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "TOPLAMA", "CIKARMA", "BOLME", "CARPMA" }));
		comboBox.setBounds(79, 11, 160, 20);
		frame.getContentPane().add(comboBox);

		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String islemTipi = comboBox.getSelectedItem().toString();
//				JOptionPane.showMessageDialog(frame, islemTipi);

				String sayi1 = txtsayi1.getText();
				String sayi2 = txtsayi2.getText();

				Float sayi3 =Float.valueOf(sayi1);
				Float sayi4 =Float.valueOf(sayi2);

				/*Byte sayi3 = Byte.valueOf(sayi1);
				Byte sayi4 = Byte.valueOf(sayi2);*/

				if (islemTipi == "TOPLAMA") {
					JOptionPane.showMessageDialog(frame, "TOPLAMLARI = " + (sayi3 + sayi4));
				}
				if (islemTipi == "CIKARMA") {
					JOptionPane.showMessageDialog(frame, "FARKLARI = " + (sayi3 - sayi4));
				}
				if (islemTipi == "CARPMA") {
					JOptionPane.showMessageDialog(frame, "ÇARPIMLARI = " + (sayi3 * sayi4));
				}
				if (islemTipi == "BOLME") {
					JOptionPane.showMessageDialog(frame, "BÖLÜMLERÝ = " + (sayi3 / sayi4));
				}
			}
		});
		btnHesapla.setBounds(153, 176, 89, 23);
		frame.getContentPane().add(btnHesapla);

		JLabel lblSay = new JLabel("Say\u0131 1");
		lblSay.setBounds(44, 82, 46, 14);
		frame.getContentPane().add(lblSay);

		JLabel lblSay_1 = new JLabel("Say\u0131 2");
		lblSay_1.setBounds(44, 124, 46, 14);
		frame.getContentPane().add(lblSay_1);

		txtsayi1 = new JTextField();
		txtsayi1.setBounds(153, 79, 86, 20);
		frame.getContentPane().add(txtsayi1);
		txtsayi1.setColumns(10);

		txtsayi2 = new JTextField();
		txtsayi2.setColumns(10);
		txtsayi2.setBounds(153, 121, 86, 20);
		frame.getContentPane().add(txtsayi2);
	}
}
