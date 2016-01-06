package GuideMe;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class View_Place extends JFrame {
	static JList lists, lists1, list_1, list_2;
	static JTextField textField;
	static JButton btnNewButton, btnNewButton_1, btnNewButton_2, btnNewButton_3;
	private JLabel lblPlaceKfc;
	private JLabel lblTips;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel;
	private JButton btnOk;
	static JFrame frame;

	View_Place() {

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
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(240, 11, 20, 21);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new View_Place_action());

		btnNewButton_1 = new JButton("Home");
		btnNewButton_1.addActionListener(new View_Place_action());
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
		btnNewButton_2.addActionListener(new View_Place_action());

		btnNewButton_3 = new JButton(list);
		btnNewButton_3.addActionListener(new View_Place_action());
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

		lists.addListSelectionListener(new View_Place_action());
		lists1.addListSelectionListener(new View_Place_action());

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 191, 255));
		panel_1.setBounds(0, 0, 560, 50);
		frame.getContentPane().add(panel_1);
		///////////////////////////////////////////////////////////////////////////////////////
		lblPlaceKfc = new JLabel("Place : KFC");
		lblPlaceKfc.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlaceKfc.setBounds(10, 57, 85, 14);
		frame.getContentPane().add(lblPlaceKfc);

		lblTips = new JLabel("Tips :");
		lblTips.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTips.setBounds(10, 82, 46, 19);
		frame.getContentPane().add(lblTips);

		JButton arr[] = new JButton[20];
		JPanel panels[] = new JPanel[20];
		JLabel Labels[] = new JLabel[20];
		Box box = Box.createVerticalBox();
		JPanel panel_All = new JPanel();
		for (Integer i = 0; i < 20; i++) {
			arr[i] = new JButton("Like");
			Labels[i] = new JLabel("KFC is Good : " + i.toString() + "Likes");
			panels[i] = new JPanel();
			panels[i].add(Labels[i]);
			panels[i].add(arr[i]);
			box.add(panels[i]);
		}
		panel_All.add(box);
		JScrollPane scr = new JScrollPane(panel_All);
		scr.setBounds(0, 107, 251, 400);
		frame.getContentPane().add(scr);

		JButton btnRemove = new JButton("Remove");
		btnRemove.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRemove.setBounds(143, 78, 106, 23);
		frame.getContentPane().add(btnRemove);

		JLabel lblTip = new JLabel("Tip");
		lblTip.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTip.setBounds(256, 108, 46, 14);
		frame.getContentPane().add(lblTip);

		textField_1 = new JTextField();
		textField_1.setBounds(286, 107, 138, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnPost = new JButton("Post");
		btnPost.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPost.setBounds(346, 138, 78, 23);
		frame.getContentPane().add(btnPost);

		textField_2 = new JTextField();
		textField_2.setBounds(297, 179, 57, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		lblNewLabel = new JLabel("Rate");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(256, 180, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		btnOk = new JButton("OK");
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOk.setBounds(356, 172, 60, 30);
		frame.getContentPane().add(btnOk);

	}

//	private class action implements ActionListener {
//		public void actionPerformed(ActionEvent e) {
//			if (e.getSource() == btnNewButton_2) {
//				if (lists.isVisible())
//					lists.hide();
//				else {
//					lists.show();
//					lists1.hide();
//				}
//			} else if (e.getSource() == btnNewButton) {
//				Search search = new Search();
//				search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				search.setSize(480, 550);
//				search.setResizable(false);
//				setVisible(false);
//				search.setVisible(true);
//
//			} else if (e.getSource() == btnNewButton_3) {
//				if (lists1.isVisible())
//					lists1.hide();
//				else {
//					lists1.show();
//					lists.hide();
//				}
//			} else if (e.getSource() == btnNewButton) {
//				lists.hide();
//				lists1.hide();
//			}
//
//			else if (e.getSource() == Fr_not_tas.btnNewButton_1) {
//				// Fr_not_tas.lists.hide();
//				// Fr_not_tas.lists1.hide();
//				Fr_not_tas.frame.setVisible(false); ///////
//				Home1 home = new Home1();
//				// home.setSize(480, 580);
//				// home.setResizable(false);
//
//				// home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//				// home.setVisible(true);
//			}
//		}
//	}
//
//	private class action1 implements ListSelectionListener {
//		public void valueChanged(ListSelectionEvent event) {
//			if (event.getSource() == lists) {
//				if (lists.getSelectedValue() == "Places") {
//					Places place = new Places();
//					setVisible(false);
//					place.setResizable(false);
//					place.setSize(480, 550);
//					place.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//					place.setVisible(true);
//				}
//
//				else if (lists.getSelectedValue() == "Friends" || lists.getSelectedValue() == "Tastes"
//						|| lists.getSelectedValue() == "Notifications" || lists.getSelectedValue() == "Rates") {
//					setVisible(false);
//					Fr_not_tas friend = new Fr_not_tas((String) lists.getSelectedValue());
//
//					// friend.setSize(480, 550);
//					// friend.setResizable(false);
//					// friend.setVisible(true);
//					// friend.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				}
//
//				else if (lists.getSelectedValue() == "Message") {
//					Messages message = new Messages();
//					message.setSize(480, 550);
//					setVisible(false);
//					message.setVisible(true);
//					message.setResizable(false);
//					message.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				}
//
//			}
//		}
//	}
}
