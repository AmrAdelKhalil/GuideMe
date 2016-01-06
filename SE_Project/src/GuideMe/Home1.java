package GuideMe;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;

public class Home1 extends JFrame {
	private JTextField textField;
static	JList lists, lists1;
static	JButton btnNewButton, btnNewButton_2, btnNewButton_3, btnNewButton_1, changeProfile;
static	JPanel panel, panel1;
static JFrame frame;
	public Home1() {
		frame=new JFrame("Guide ME");
		frame.setSize(480, 550);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.getContentPane().setLayout(null);

		frame.getContentPane().addMouseListener(new Home1_action());
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
		btnNewButton.addActionListener(new Home1_action());
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
	
		btnNewButton.setBounds(240, 11, 20, 21);
		frame.getContentPane().add(btnNewButton);
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.addActionListener(new Home1_action());
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
		btnNewButton_2.addActionListener(new Home1_action());

		String content[] = { "Friends", "Places", "Brands", "Notifications", "Tastes", "Rates", "Message", "settings",
				"Log out" };

		// for view frinds and palces and brands
		lists = new JList(content);
		lists.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lists.setBackground(new Color(30, 144, 255));
		frame.getContentPane().add(lists);
		lists.setBounds(295, 35, 74, 171);

		String content2[] = { "Chick In", "Add Friend", "Add Place", "Add Brand", "Give Rate", "Remove Friend",
				"Remove Brand", "Remove Place", "chat" };
		lists1 = new JList(content2);
		lists1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lists1.setBackground(new Color(30, 144, 255));
		frame.getContentPane().add(lists1);
		lists1.setBounds(379, 35, 95, 171);
		lists1.hide();

		panel = new JPanel();
		ImageIcon profile = new ImageIcon("profile.jpg");
		JLabel pp = new JLabel(profile);
		pp.setBounds(5, 50, 220, 240);
		frame.getContentPane().add(pp);
		pp.addMouseListener(new Home1_action());

		changeProfile = new JButton("Update Profile");
		changeProfile.addActionListener(new Home1_action());
		changeProfile.addMouseListener(new Home1_action());
		changeProfile.setBounds(50, 270, 120, 20);
		frame.getContentPane().add(changeProfile);
		changeProfile.hide();

		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(10, 300, 68, 14);
		frame.getContentPane().add(lblName);

		JLabel lblNameHena = new JLabel("name hena");
		lblNameHena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNameHena.setBounds(85, 300, 95, 14);
		frame.getContentPane().add(lblNameHena);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(10, 325, 46, 14);
		frame.getContentPane().add(lblEmail);

		JLabel lblMailHena = new JLabel("mail hena");
		lblMailHena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMailHena.setBounds(87, 325, 96, 14);
		frame.getContentPane().add(lblMailHena);

		JLabel lblFriends = new JLabel("Friends:");
		lblFriends.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFriends.setBounds(10, 425, 68, 14);
		frame.getContentPane().add(lblFriends);

		JLabel lblFriendsHena = new JLabel("num of friends hena");
		lblFriendsHena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFriendsHena.setBounds(88, 425, 138, 14);
		frame.getContentPane().add(lblFriendsHena);

		JLabel lblPlaces = new JLabel("Places:");
		lblPlaces.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlaces.setBounds(10, 450, 68, 14);
		frame.getContentPane().add(lblPlaces);

		JLabel lblNumOfplacesHena = new JLabel("num of places hena");
		lblNumOfplacesHena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumOfplacesHena.setBounds(88, 450, 138, 14);
		frame.getContentPane().add(lblNumOfplacesHena);

		JLabel lblBrands = new JLabel("Brands:");
		lblBrands.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBrands.setBounds(10, 475, 68, 14);
		frame.getContentPane().add(lblBrands);

		JLabel lblNumOfBrands = new JLabel("num of brands");
		lblNumOfBrands.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumOfBrands.setBounds(88, 475, 111, 14);
		frame.getContentPane().add(lblNumOfBrands);

		JLabel lblTastes = new JLabel("Tastes:");
		lblTastes.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTastes.setBounds(10, 500, 52, 14);
		frame.getContentPane().add(lblTastes);

		JLabel lblNumOf = new JLabel("num of Tastes");
		lblNumOf.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumOf.setBounds(88, 500, 101, 14);
		frame.getContentPane().add(lblNumOf);

		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhone.setBounds(10, 350, 68, 14);
		frame.getContentPane().add(lblPhone);

		JLabel lblPhoneHena = new JLabel("Phone hena");
		lblPhoneHena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhoneHena.setBounds(88, 350, 106, 14);
		frame.getContentPane().add(lblPhoneHena);

		JLabel lblBirthDate = new JLabel("Birth Date:");
		lblBirthDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBirthDate.setBounds(10, 375, 85, 14);
		frame.getContentPane().add(lblBirthDate);

		JLabel lblNewLabel = new JLabel("hnea Birth Date");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(85, 375, 120, 14);
		frame.getContentPane().add(lblNewLabel);

		btnNewButton_3 = new JButton(list);
		btnNewButton_3.addActionListener(new Home1_action());
		btnNewButton_3.setBounds(380, 11, 22, 23);
		frame.getContentPane().add(btnNewButton_3);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(10, 400, 68, 14);
		frame.getContentPane().add(lblAddress);

		JLabel lblAddressHena = new JLabel("Address hena");
		lblAddressHena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddressHena.setBounds(88, 400, 106, 14);
		frame.getContentPane().add(lblAddressHena);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 191, 255));
		panel_1.setBounds(0, 0, 560, 50);
		frame.getContentPane().add(panel_1);

		panel1 = new JPanel();
		JPanel commLike[] = new JPanel[20];
		panel1.setBounds(240, 90, 235, 435);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
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

			panel1.add(panels[i]);
		}
		JScrollPane scr1 = new JScrollPane(panel1);
		scr1.setBounds(240, 90, 235, 435);
		frame.getContentPane().add(scr1);

		JLabel lblMyCheck = new JLabel("My Check In");
		lblMyCheck.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMyCheck.setBounds(240, 65, 111, 21);
		frame.getContentPane().add(lblMyCheck);

		lists.addListSelectionListener(new Home1_action());
		lists1.addListSelectionListener(new Home1_action());
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
//			}
//			else if(e.getSource()==btnNewButton)
//			{
//				Search search =new Search();
//				search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				search.setSize(480,550);
//				search.setResizable(false);
//				setVisible(false);	
//				search.setVisible(true);
//			
//			}
//
//			else if (e.getSource() == btnNewButton_3) {
//				if (lists1.isVisible())
//					lists1.hide();
//				else {
//					lists1.show();
//					lists.hide();
//				}
//			}
//
//			else if (e.getSource() == btnNewButton_1) {
//				lists.hide();
//				lists1.hide();
//			}
//		}
//	}
//
//	private class action1 implements ListSelectionListener {
//		public void valueChanged(ListSelectionEvent event) {
//			if (event.getSource() == lists) {
//				for (int i = 0; i < lists.getModel().getSize(); i++) {
//					if (lists.getSelectedValue() == "Places") {
//						Places place = new Places();
//						place.setResizable(false);
//						setVisible(false);
//						place.setSize(480, 550);
//						place.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//						place.setVisible(true);
//						break;
//					}
//
//					else if (lists.getSelectedValue() == "Friends" || lists.getSelectedValue() == "Tastes"
//							|| lists.getSelectedValue() == "Notifications" || lists.getSelectedValue() == "Rates") {
//						setVisible(false);
//						Fr_not_tas friend = new Fr_not_tas((String) lists.getSelectedValue());
//					
////						friend.setSize(480, 550);
////						friend.setResizable(false);
////						friend.setVisible(true);
////						friend.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//						break;
//					}
//
//					else if (lists.getSelectedValue() == "Message") {
//						Messages message = new Messages();
//						message.	setSize(480, 550);
//						setVisible(false);
//						message.setVisible(true);
//						message.setResizable(false);
//						message.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//						break;
//					}
//
//				}
//			}
//
//		}
//	}
//
//	void Open() {
//		JFileChooser fileChooser = new JFileChooser();
//		fileChooser.setDialogTitle("Choose Image");
//		int result = fileChooser.showOpenDialog(this);
//		if (result == JFileChooser.APPROVE_OPTION) {
//			File selectedFile = fileChooser.getSelectedFile();
//		}
//
//	}
//
//	private class action2 implements MouseListener {
//
//		@Override
//		public void mouseClicked(MouseEvent event) {
//
//		}
//
//		@Override
//		public void mouseEntered(MouseEvent event) {
//			// TODO Auto-generated method stub
//			if (event.getX() >= 2 && event.getX() <= 220 && event.getY() >= 10 && event.getY() <= 245) {
//				changeProfile.show();
//			} else
//				changeProfile.hide();
//		}
//
//		@Override
//		public void mouseExited(MouseEvent event) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public void mousePressed(MouseEvent event) {
//			if (event.getX() >= 48 && event.getX() <= 161 && event.getY() >= 222 && event.getY() <= 235)
//				Open();
//
//		}
//
//		@Override
//		public void mouseReleased(MouseEvent event) {
//			// TODO Auto-generated method stub
//
//		}
//
//	}
}