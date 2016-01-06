package GuideMe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class sign_in extends JFrame{
	static JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_7;
	static JPasswordField passwordField;
	static JLabel lblAddress ,lblBirthDate,lblID ,lblEmail,lblPassword,lblGuideMe,lblSignUp,lblName,lblPhone,lblMail,lblPassword_1;
	static JButton btnNewButton,btnSignUp;
	static JRadioButton rdbtnPremuim, rdbtnnormal,rdbtnMale,rdbtnFmale,rdbtnNewRadioButton;
	static JFrame frame;
	static JPanel panel;
	static ButtonGroup typeAccount,typeGender;
	static Choice choice;
	static Choice choice_1;
	static Choice choice_2;
	public sign_in() {
		frame = new JFrame("Guide ME");
		frame.setSize(480, 550);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.getContentPane().setLayout(null);
		
		lblAddress = new JLabel("Address :");
		frame.getContentPane().add(lblAddress);
			
		lblBirthDate = new JLabel("Birth Date :");
		frame.getContentPane().add(lblBirthDate);
		
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(98, 10, 52, 20);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(lblEmail);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(217, 11, 77, 19);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(98, 38, 109, 26);
		textField.setBackground(new Color(250, 240, 230));
		textField.setColumns(10);
		frame.getContentPane().add(textField);
		
		btnNewButton = new JButton("Log in");
		btnNewButton.setBounds(344, 40, 80, 23);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.addActionListener(new sign_in_action());
		frame.getContentPane().add(btnNewButton);
		
		lblGuideMe = new JLabel("Guide ME");
		lblGuideMe.setBounds(10, 32, 89, 32);
		lblGuideMe.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(lblGuideMe);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(250, 240, 230));
		passwordField.setBounds(217, 38, 117, 26);
		frame.getContentPane().add(passwordField);
		//frame.getContentPane().add(passwordField);
		

		rdbtnNewRadioButton = new JRadioButton("Forgot Password ?");
		rdbtnNewRadioButton.setBounds(217, 71, 117, 23);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.ITALIC, 11));
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		lblSignUp = new JLabel("Sign UP");
		lblSignUp.setBounds(203, 122, 66, 26);
		lblSignUp.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSignUp.setForeground(new Color(0, 0, 255));
		frame.getContentPane().add(lblSignUp);
		
		textField_1 = new JTextField();
		textField_1.setBounds(277, 151, 117, 20);
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		lblName = new JLabel("Name :");
		lblName.setBounds(85, 151, 66, 17);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setForeground(new Color(0, 0, 255));
		frame.getContentPane().add(lblName);
		
		lblPhone = new JLabel("Phone :");
		lblPhone.setBounds(85, 179, 66, 14);
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhone.setForeground(new Color(0, 0, 255));
		frame.getContentPane().add(lblPhone);
		
		textField_2 = new JTextField();
		textField_2.setBounds(277, 178, 117, 20);
		frame.getContentPane().add(textField_2);
		// textField_2.setColumns(10);

		lblMail = new JLabel("Mail :");
		lblMail.setBounds(85, 210, 46, 14);
		lblMail.setForeground(new Color(0, 0, 255));
		lblMail.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(lblMail);
		
		textField_3 = new JTextField();
		textField_3.setBounds(277, 209, 117, 20);
		textField_3.setColumns(10);
		frame.getContentPane().add(textField_3);
		
		lblPassword_1 = new JLabel("Password :");
		lblPassword_1.setBounds(85, 235, 83, 14);
		lblPassword_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword_1.setForeground(new Color(0, 0, 255));
		frame.getContentPane().add(lblPassword_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(277, 234, 117, 20);
		textField_4.setColumns(10);
		frame.getContentPane().add(textField_4);
		
		lblAddress.setBounds(85, 259, 109, 31);
		lblAddress.setForeground(new Color(0, 0, 255));
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));

		textField_5 = new JTextField();
		textField_5.setBounds(277, 266, 117, 20);
		textField_5.setColumns(10);
		frame.getContentPane().add(textField_5);
		
		lblBirthDate.setBounds(85, 290, 143, 31);
		lblBirthDate.setForeground(new Color(0, 0, 255));
		lblBirthDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(118, 340, 60, 23);
		frame.getContentPane().add(rdbtnMale);
		
		rdbtnFmale = new JRadioButton("Female");
		rdbtnFmale.setBounds(238, 340, 66, 23);
		frame.getContentPane().add(rdbtnFmale);
		
		typeGender = new ButtonGroup();
		typeGender.add(rdbtnMale);
		typeGender.add(rdbtnFmale);

		rdbtnnormal = new JRadioButton("Normal");
		rdbtnnormal.setBounds(118, 380, 66, 23);
		rdbtnnormal.addActionListener(new sign_in_action());
		frame.getContentPane().add(rdbtnnormal);
		
		rdbtnPremuim = new JRadioButton("Premium");
		rdbtnPremuim.setBounds(238, 380, 80, 23);
		rdbtnPremuim.addActionListener(new sign_in_action());
		frame.getContentPane().add(rdbtnPremuim);
		
		btnSignUp = new JButton("Sign UP");
		btnSignUp.setBounds(162, 460, 87, 23);
		btnSignUp.setBackground(new Color(100, 149, 237));
		frame.getContentPane().add(btnSignUp);
		btnSignUp.addActionListener(new sign_in_action());
		lblID = new JLabel("Serial account :");
		lblID.setBounds(85, 420, 109, 20);
		lblID.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblID.setForeground(new Color(0, 0, 255));
		lblID.hide();
		frame.getContentPane().add(lblID);
		
		textField_7 = new JTextField();
		textField_7.setBounds(217, 420, 117, 20);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.hide();
		frame.getContentPane().add(textField_7);
	
		typeAccount = new ButtonGroup();
		typeAccount.add(rdbtnPremuim);
		typeAccount.add(rdbtnnormal);

		panel = new JPanel();
		panel.setBounds(0, 0, 490, 111);
		panel.setBackground(new Color(0, 191, 255));
		frame.getContentPane().add(panel);
		
		choice = new Choice();
		choice.setBounds(276, 301, 58, 20);
		for(int i=1995; i<2016; i++)choice.add(String.valueOf(i));
		frame.getContentPane().add(choice);
		
		choice_1 = new Choice();
		choice_1.setBounds(340, 301, 42, 20);
		for(int i=1; i<10; i++)choice_1.add("0"+String.valueOf(i));
		for(int i=10; i<13; i++)choice_1.add(String.valueOf(i));
		frame.getContentPane().add(choice_1);
		
		choice_2 = new Choice();
		choice_2.setBounds(388, 301, 40, 20);
		for(int i=1; i<10; i++)choice_2.add("0"+String.valueOf(i));
		for(int i=10; i<32; i++)choice_2.add(String.valueOf(i));
		frame.getContentPane().add(choice_2);
		
		
	}
	
//
//	private class action implements ActionListener {
//		public void actionPerformed(ActionEvent e) {
//			if (e.getSource() == btnNewButton) {
//				
//				String Email=textField.getText();
//				String password=passwordField.getText();
//				setVisible(false);
//				
//				Home1 home = new Home1();
//			
//			} else if (e.getSource() == rdbtnPremuim) {
//				textField_7.show();
//				lblID.show();
//			}
//
//			else if (e.getSource() == rdbtnnormal) {
//				textField_7.hide();
//				lblID.hide();
//			}
//		}
//	}
}
