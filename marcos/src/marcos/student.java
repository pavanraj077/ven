package marcos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class student {

	private JFrame frmKlhstyljgokstdnylm;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student window = new student();
					window.frmKlhstyljgokstdnylm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public student() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKlhstyljgokstdnylm =  new JFrame();
		frmKlhstyljgokstdnylm.setTitle("klhstyljgokstdnylm");
		frmKlhstyljgokstdnylm.getContentPane().setBackground(new Color(255, 128, 64));
		frmKlhstyljgokstdnylm.setBounds(100, 100, 579, 600);
		frmKlhstyljgokstdnylm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKlhstyljgokstdnylm.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT DETAILS");
		lblNewLabel.setBounds(195, 26, 89, 14);
		frmKlhstyljgokstdnylm.getContentPane().add(lblNewLabel);
		
		JLabel tb1 = new JLabel("NAME");
		tb1.setBounds(90, 72, 46, 14);
		frmKlhstyljgokstdnylm.getContentPane().add(tb1);
		
		JLabel tb2 = new JLabel("ID");
		tb2.setBounds(90, 107, 25, 14);
		frmKlhstyljgokstdnylm.getContentPane().add(tb2);
		
		textField = new JTextField();
		textField.setBounds(175, 69, 86, 20);
		frmKlhstyljgokstdnylm.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(175, 104, 86, 20);
		frmKlhstyljgokstdnylm.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton bt1 = new JButton("submit");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bt1.setBounds(117, 176, 89, 23);
		frmKlhstyljgokstdnylm.getContentPane().add(bt1);
	}
}
