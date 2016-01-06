package GuideMe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Intern_Chat extends JFrame {

	private JLabel lblPlaceKfc, lblTips, lblNewLabel, lblChat;
	static JList lists, lists1, list_1, list_2;
	static JTextField textField, textField_2, textField_1;
	static JButton btnNewButton, btnNewButton_1, btnNewButton_2, btnNewButton_3, btnOk;
	static JPanel panel;
	static JTextArea textArea;
	static JFrame frame;

	Intern_Chat() {

		frame = new JFrame("Guide ME");
		frame.setSize(480, 550);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.getContentPane().setLayout(null);

		// getContentPane().addMouseListener(new action2());
		JLabel lblGuideMe = new JLabel("Guide ME");
		lblGuideMe.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblGuideMe.setBounds(10, 11, 85, 21);
		frame.getContentPane().add(lblGuideMe);

		textField = new JTextField();
		textField.setBounds(105, 11, 135, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		ImageIcon search = new ImageIcon("list.PNG");
		btnNewButton = new JButton(search);
		btnNewButton.addActionListener(new Intern_Chat_action());
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(240, 11, 20, 21);
		frame.getContentPane().add(btnNewButton);

		btnNewButton_1 = new JButton("Home");
		btnNewButton_1.addActionListener(new Intern_Chat_action());
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(65, 105, 225));
		btnNewButton_1.setBounds(265, 12, 78, 21);
		frame.getContentPane().add(btnNewButton_1);

		ImageIcon list = new ImageIcon("Capture.PNG");
		btnNewButton_2 = new JButton(list);
		btnNewButton_2.setBounds(350, 11, 22, 23);
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBackground(new Color(65, 105, 225));
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new Intern_Chat_action());

		btnNewButton_3 = new JButton(list);
		btnNewButton_3.addActionListener(new Intern_Chat_action());
		btnNewButton_3.setBounds(380, 11, 22, 23);
		frame.getContentPane().add(btnNewButton_3);

		String content[] = { "Friends", "Places", "Brands", "Notifications", "Tastes", "Rates", "Message", "settings",
				"Log out" };

		// for view frinds and palces and brands
		lists = new JList(content);
		lists.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lists.setBackground(new Color(65, 105, 225));
		frame.getContentPane().add(lists);
		lists.setBounds(295, 35, 74, 171);
		lists.hide();

		String content2[] = { "Chick In", "Add Friend", "Add Place", "Add Brand", "Give Rate", "Remove Friend",
				"Remove Brand", "Remove Place", "chat" };
		lists1 = new JList(content2);
		lists1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lists1.setBackground(new Color(65, 105, 225));
		frame.getContentPane().add(lists1);
		lists1.setBounds(379, 35, 95, 171);
		lists1.hide();

		lists.addListSelectionListener(new Intern_Chat_action());
		lists1.addListSelectionListener(new Intern_Chat_action());

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 191, 255));
		panel_1.setBounds(0, 0, 560, 50);
		frame.getContentPane().add(panel_1);

		panel = new JPanel();
		panel.setBounds(0, 101, 185, 418);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JScrollPane scr1 = new JScrollPane(panel);
		scr1.setBounds(0, 101, 185, 418);
		JLabel Users[] = new JLabel[20];
		JLabel message[] = new JLabel[20];
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				Users[i] = new JLabel("12:52 : alaa");
				message[i] = new JLabel("how are you bitch ?");
			} else {
				Users[i] = new JLabel("12:52: You");
				message[i] = new JLabel("fuck you");
			}
			panel.add(Users[i]);
			panel.add(message[i]);
		}
		frame.getContentPane().add(scr1);

		lblChat = new JLabel("Chat");
		lblChat.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChat.setBounds(23, 61, 72, 29);
		frame.getContentPane().add(lblChat);

		textArea = new JTextArea();
		textArea.setBounds(230, 120, 173, 69);
		JScrollPane scr = new JScrollPane(textArea);
		scr.setBounds(230, 120, 173, 69);
		frame.getContentPane().add(scr);

		JButton btnSend = new JButton("Send");
		btnSend.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSend.setBounds(264, 197, 78, 23);
		frame.getContentPane().add(btnSend);

	}

	// private class action implements ActionListener {
	// public void actionPerformed(ActionEvent e) {
	// if (e.getSource() == btnNewButton_2) {
	// if (lists.isVisible())
	// lists.hide();
	// else {
	// lists.show();
	// lists1.hide();
	// }
	// } else if (e.getSource() == btnNewButton) {
	// Search search = new Search();
	// search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// search.setSize(480, 550);
	// search.setResizable(false);
	// setVisible(false);
	// search.setVisible(true);
	//
	// } else if (e.getSource() == btnNewButton_3) {
	// if (lists1.isVisible())
	// lists1.hide();
	// else {
	// lists1.show();
	// lists.hide();
	// }
	// } else if (e.getSource() == btnNewButton) {
	// lists.hide();
	// lists1.hide();
	// }
	//
	// else if (e.getSource() == Fr_not_tas.btnNewButton_1) {
	// // Fr_not_tas.lists.hide();
	// // Fr_not_tas.lists1.hide();
	// Fr_not_tas.frame.setVisible(false); ////
	// Home1 home = new Home1();
	// //home.setSize(480, 580);
	// //home.setResizable(false);
	//
	// //home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//
	// //home.setVisible(true);
	// }
	// }
	// }
	//
	// private class action1 implements ListSelectionListener {
	// public void valueChanged(ListSelectionEvent event) {
	// if (event.getSource() == lists) {
	// if (lists.getSelectedValue() == "Places") {
	// Places place = new Places();
	// place.setResizable(false);
	// setVisible(false);
	// place.setSize(480, 550);
	// place.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// place.setVisible(true);
	// }
	//
	// else if (lists.getSelectedValue() == "Friends" ||
	// lists.getSelectedValue() == "Tastes"
	// || lists.getSelectedValue() == "Notifications" ||
	// lists.getSelectedValue() == "Rates") {
	// setVisible(false);
	// Fr_not_tas friend = new Fr_not_tas((String) lists.getSelectedValue());
	//
	//// friend.setSize(480, 550);
	//// friend.setResizable(false);
	//// friend.setVisible(true);
	//// friend.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// }
	//
	// else if (lists.getSelectedValue() == "Message") {
	// Messages message = new Messages();
	// message.setSize(480, 550);
	// setVisible(false);
	// message.setVisible(true);
	// message.setResizable(false);
	// message.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// }
	//
	// }
	// }
	//
	// }
}
