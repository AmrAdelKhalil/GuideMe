package GuideMe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Fr_not_tas  {
	private JTextField textField;
static	JList lists, list_1, lists1;
static	JButton btnNewButton, btnNewButton_2, btnNewButton_3, btnNewButton_1;
static 	JScrollPane scr;
static	JLabel lblFriends;
static JFrame frame;
	public Fr_not_tas(String chooses) {
		frame=new JFrame("Guide ME");
		frame.setSize(480, 550);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.getContentPane().setLayout(null);

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
		btnNewButton.addActionListener(new Fr_not_tas_action());
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(240, 11, 20, 21);
		frame.getContentPane().add(btnNewButton);

		btnNewButton_1 = new JButton("Home");
		btnNewButton_1.addActionListener(new Fr_not_tas_action());
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
		btnNewButton_2.addActionListener(new Fr_not_tas_action());

		btnNewButton_3 = new JButton(list);
		btnNewButton_3.addActionListener(new Fr_not_tas_action());
		btnNewButton_3.setBounds(380, 11, 22, 23);
		frame.getContentPane().add(btnNewButton_3);

		String content[] = { "Friends", "Places", "Brands", "Notifications", "Tastes", "Rates", "Message", "settings",
				"Log out" };

		// for view frinds and palces and brands
		lists = new JList(content);
		lists.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lists.setBackground(new Color(30, 144, 255));
		frame.getContentPane().add(lists);
		lists.setBounds(295, 35, 74, 165);

		String content2[] = { "Chick In", "Add Friend", "Add Place", "Add Brand", "Give Rate", "Remove Friend",
				"Remove Brand", "Remove Place", "chat" };
		lists1 = new JList(content2);
		lists1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lists1.setBackground(new Color(30, 144, 255));
		frame.getContentPane().add(lists1);
		lists1.setBounds(379, 35, 95, 165);
		lists1.hide();

		// for list frinds and places and brands
		list_1 = new JList(content);
		scr = new JScrollPane(list_1);
		list_1.setBackground(new Color(100, 149, 237));
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scr.setBounds(0, 75, 274, 472);
		frame.getContentPane().add(scr);

		lblFriends = new JLabel(chooses + ":");
		lblFriends.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFriends.setBounds(10, 46, 110, 23);
		frame.getContentPane().add(lblFriends);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 191, 255));
		panel_1.setBounds(0, 0, 585, 48);
		frame.getContentPane().add(panel_1);

		lists.addListSelectionListener(new Fr_not_tas_action());
		lists1.addListSelectionListener(new Fr_not_tas_action());
		lists.hide();

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
//			else if (e.getSource() == btnNewButton_1) {
//				lists.hide();
//				lists1.hide();
//				Home1 home = new Home1();
//				home.setResizable(false);
//				home.setSize(480, 580);
//				setVisible(false);
//				home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				;
//				home.setVisible(true);
//			}
//		}
//	}

	// scr.getVerticalScrollBar().addAdjustmentListener(new action2());
	// private class action2 implements AdjustmentListener
	// {
	// @Override
	// public void adjustmentValueChanged(AdjustmentEvent e) {
	// // TODO Auto-generated method stub
	// int[] selectedIx = lists.getSelectedIndices();
	// // Get all the selected items using the indices
	// for (int i = 0; i < selectedIx.length; i++)
	// System.out.println( lists.getModel().getElementAt(selectedIx[i]));
	// list_1.show();
	//
	// }
	//
	// }

//	private class action1 implements ListSelectionListener {
//		public void valueChanged(ListSelectionEvent event) {
//			if (event.getSource() == lists) {
//				if (lists.getSelectedValue() == "Places") {
//					Places place = new Places();
//					place.setResizable(false);
//					frame.setVisible(false);
//					place.setSize(480, 550);
//					place.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//					place.setVisible(true);
//				}
//
//				else if (lists.getSelectedValue() == "Friends" || lists.getSelectedValue() == "Tastes"
//						|| lists.getSelectedValue() == "Notifications" || lists.getSelectedValue() == "Rates") {
//					frame.setVisible(false);
//					Fr_not_tas friend = new Fr_not_tas((String) lists.getSelectedValue());
//					
////					friend.setSize(480, 550);
////					friend.setResizable(false);
////					friend.setVisible(true);
////					friend.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				}
//
//				else if (lists.getSelectedValue() == "Message") {
//					Messages message = new Messages();
//					message.setSize(480, 550);
//					//setVisible(false);
//					message.setVisible(true);
//					message.setResizable(false);
//					message.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				}
//
//			}
//		}
//	}
}
