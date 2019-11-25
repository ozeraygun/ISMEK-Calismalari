package com.ozer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form {

	private JFrame frmanSistemi;
	private JTextField txtOgrenci1;
	private JTextField txtOgrenci2;
	private JTextField txtOgrenci3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form window = new Form();
					window.frmanSistemi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmanSistemi = new JFrame();
		frmanSistemi.setTitle("\u00C7an Sistemi");
		frmanSistemi.setBounds(100, 100, 450, 300);
		frmanSistemi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmanSistemi.getContentPane().setLayout(null);

		txtOgrenci1 = new JTextField();
		txtOgrenci1.setBounds(195, 11, 86, 20);
		frmanSistemi.getContentPane().add(txtOgrenci1);
		txtOgrenci1.setColumns(10);

		JLabel lblogrenci1 = new JLabel("\u00D6\u011Frenci 1");
		lblogrenci1.setBounds(36, 14, 107, 14);
		frmanSistemi.getContentPane().add(lblogrenci1);

		JLabel lblogrenci2 = new JLabel("\u00D6\u011Frenci 2");
		lblogrenci2.setBounds(36, 53, 107, 14);
		frmanSistemi.getContentPane().add(lblogrenci2);

		JLabel lblogrenci3 = new JLabel("\u00D6\u011Frenci 3");
		lblogrenci3.setBounds(36, 95, 107, 14);
		frmanSistemi.getContentPane().add(lblogrenci3);

		txtOgrenci2 = new JTextField();
		txtOgrenci2.setBounds(195, 50, 86, 20);
		frmanSistemi.getContentPane().add(txtOgrenci2);
		txtOgrenci2.setColumns(10);

		txtOgrenci3 = new JTextField();
		txtOgrenci3.setBounds(195, 92, 86, 20);
		frmanSistemi.getContentPane().add(txtOgrenci3);
		txtOgrenci3.setColumns(10);

		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ogrenci1Text = txtOgrenci1.getText();
				String ogrenci2Text = txtOgrenci2.getText();
				String ogrenci3Text = txtOgrenci3.getText();

				Byte ogrenci1Not = Byte.valueOf(ogrenci1Text);
				Byte ogrenci2Not = Byte.valueOf(ogrenci2Text);
				Byte ogrenci3Not = Byte.valueOf(ogrenci3Text);

				float ortalama = (ogrenci1Not + ogrenci2Not + ogrenci3Not) / 3f;

				if (ogrenci1Not >= ortalama) {
					JOptionPane.showMessageDialog(frmanSistemi, "1.Öðrenci GEÇTÝ");
					System.out.println("GEÇTÝ");
				} else {
					float kalmaNotu = ortalama - ogrenci1Not;
					JOptionPane.showMessageDialog(frmanSistemi, "1.Öðrenci " + kalmaNotu + " puan altýnda KALDI.");
				}
				if (ogrenci2Not >= ortalama) {
					JOptionPane.showMessageDialog(frmanSistemi, "2.Öðrenci GEÇTÝ");
				} else {
					float kalmaNotu = ortalama - ogrenci2Not;
					JOptionPane.showMessageDialog(frmanSistemi, "2.Öðrenci " + kalmaNotu + " puan altýnda KALDI.");
				}

				if (ogrenci3Not >= ortalama) {
					JOptionPane.showMessageDialog(frmanSistemi, "3.Öðrenci GEÇTÝ");
				} else {
					float kalmaNotu = ortalama - ogrenci3Not;
					JOptionPane.showMessageDialog(frmanSistemi, "3.Öðrenci " + kalmaNotu + " puan altýnda KALDI.");
				}
			}
		});
		btnNewButton.setBounds(195, 140, 89, 23);
		frmanSistemi.getContentPane().add(btnNewButton);
	}
}
