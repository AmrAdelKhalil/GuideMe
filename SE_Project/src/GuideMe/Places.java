package GuideMe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Places extends JFrame {

	private JPanel panel;
	static JList lists, lists1, list_1;
	static JTextField textField;
	static JButton btnNewButton, btnNewButton_1, btnNewButton_2, btnNewButton_3;
	static JFrame frame;

	public Places() {
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
		btnNewButton.addActionListener(new Places_action());

		btnNewButton_1 = new JButton("Home");
		btnNewButton_1.addActionListener(new Places_action());
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
		btnNewButton_2.addActionListener(new Places_action());

		btnNewButton_3 = new JButton(list);
		btnNewButton_3.addActionListener(new Places_action());
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

		lists.addListSelectionListener(new Places_action());
		lists1.addListSelectionListener(new Places_action());

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 191, 255));
		panel_1.setBounds(0, 0, 560, 50);
		frame.getContentPane().add(panel_1);

		//////////////////////////////////////////////////////////////////////////////////////////////

		// view places
		list_1 = new JList(content2);
		JScrollPane scr = new JScrollPane(list_1);
		scr.setBounds(0, 90, 210, 487);
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setBackground(new Color(30, 144, 255));
		frame.getContentPane().add(scr);

		JLabel lblPlaces = new JLabel("Places :");
		lblPlaces.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlaces.setBounds(10, 57, 61, 21);
		frame.getContentPane().add(lblPlaces);

		JLabel lblCheckIn = new JLabel("Check In :");
		lblCheckIn.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCheckIn.setBounds(230, 60, 85, 14);
		frame.getContentPane().add(lblCheckIn);

		panel = new JPanel();
		JPanel commLike[] = new JPanel[20];
		panel.setBounds(240, 90, 220, 420);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JButton comment[] = new JButton[20];
		JButton like[] = new JButton[20];
		JTextField comm[] = new JTextField[20];
		JLabel label[] = new JLabel[20];
		JPanel panels[] = new JPanel[20];
		Box box = Box.createVerticalBox();
		for (Integer i = 0; i < 20; i++) {
			comment[i] = new JButton("Comment");
			like[i] = new JButton("Like");
			comm[i] = new JTextField();
			label[i] = new JLabel("amr: in ay 7eta");
			panels[i] = new JPanel();
			panels[i].setLayout(new BoxLayout(panels[i], BoxLayout.Y_AXIS));
			panels[i].add(label[i]);
			commLike[i] = new JPanel();
			commLike[i].add(comment[i]);
			commLike[i].add(like[i]);
			panels[i].add(commLike[i]);
			panels[i].add(comm[i]);

			panel.add(panels[i]);
		}
		JScrollPane scr1 = new JScrollPane(panel);
		scr1.setBounds(240, 90, 220, 420);
		frame.getContentPane().add(scr1);

		list_1.addListSelectionListener(new Places_action());

		// list_2.addListSelectionListener(new action1());

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
//				Fr_not_tas.frame.setVisible(false); /////
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
//
//			if (event.getSource() == lists) {
//				if (lists.getSelectedValue() == "Places") {
//					Places place = new Places();
//					place.setResizable(false);
//					setVisible(false);
//					place.setSize(480, 550);
//					place.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//					place.setVisible(true);
//
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
//
//			///////////////////////////////////////////////////////////////////////////////////////////
//			else if (event.getSource() == list_1) {
//				View_Place place = new View_Place();
//				place.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				place.setSize(480, 550);
//				place.setResizable(false);
//				setVisible(false);
//				place.setVisible(true);
//			}
//
//		}
//	}
}
