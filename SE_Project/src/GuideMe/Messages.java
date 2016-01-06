package GuideMe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Messages extends JFrame {
	static JList lists, lists1, list_1, list_2;
	static JTextField textField, textField_1, textField_2;
	static JButton btnNewButton, btnNewButton_1, btnNewButton_2, btnNewButton_3, replay[], btnOk;
	static JLabel lblPlaceKfc, Users[], messages[], lblTips, lblNewLabel, lblMessages;
	static JPanel panel_All, panels[];
	static JFrame frame;

	Messages() {
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
		btnNewButton.addActionListener(new Messages_action());
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(240, 11, 20, 21);
		frame.getContentPane().add(btnNewButton);

		btnNewButton_1 = new JButton("Home");
		btnNewButton_1.addActionListener(new Messages_action());
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
		btnNewButton_2.addActionListener(new Messages_action());

		btnNewButton_3 = new JButton(list);
		btnNewButton_3.addActionListener(new Messages_action());
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

		lists.addListSelectionListener(new Messages_action());
		lists1.addListSelectionListener(new Messages_action());

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 191, 255));
		panel_1.setBounds(0, 0, 560, 50);
		frame.getContentPane().add(panel_1);////////////////////////////////////////////////////////////////////////

		lblMessages = new JLabel("Messages :");
		lblMessages.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMessages.setBounds(10, 48, 78, 21);
		frame.getContentPane().add(lblMessages);

		panels = new JPanel[20];

		panel_All = new JPanel();
		panel_All.setLayout(new BoxLayout(panel_All, BoxLayout.Y_AXIS));

		Users = new JLabel[20];
		messages = new JLabel[20];
		replay = new JButton[20];

		for (Integer i = 0; i < 20; i++) {
			Users[i] = new JLabel("10:13 AM : amr");
			messages[i] = new JLabel("message is here" + i.toString());
			replay[i] = new JButton("replay");
			panels[i] = new JPanel();
			panels[i].setLayout(new BoxLayout(panels[i], BoxLayout.Y_AXIS));
			panels[i].add(Users[i]);
			panels[i].add(messages[i]);
			panels[i].add(replay[i]);
			panel_All.add(panels[i]);
			replay[i].addActionListener(new Messages_action());

		}
		JScrollPane scr = new JScrollPane(panel_All);

		scr.setBounds(0, 80, 171, 440);
		frame.getContentPane().add(scr);

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
	// }
	// if (e.getSource() == btnNewButton_3) {
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
	// Fr_not_tas.frame.setVisible(false); /////
	// Home1 home = new Home1();
	// //home.setSize(480, 580);
	// //home.setResizable(false);
	//
	// //home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//
	// //home.setVisible(true);
	// } else {
	// for (int i = 0; i < 20; i++)
	// if (e.getSource() == replay[i]) {
	// Intern_Chat chat = new Intern_Chat();
	// setVisible(false);
	// chat.setSize(480, 550);
	// chat.setVisible(true);
	// chat.setResizable(false);
	// chat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// }
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
	// }

}
