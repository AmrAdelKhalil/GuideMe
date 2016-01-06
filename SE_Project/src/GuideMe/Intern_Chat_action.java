package GuideMe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Intern_Chat_action implements ActionListener, ListSelectionListener {
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Intern_Chat.btnNewButton_2) {
			if (Intern_Chat.lists.isVisible())
				Intern_Chat.lists.hide();
			else {
				Intern_Chat.lists.show();
				Intern_Chat.lists1.hide();
			}
		} else if (e.getSource() == Intern_Chat.btnNewButton) {
			Intern_Chat.frame.setVisible(false);
			Search search = new Search();

		} else if (e.getSource() == Intern_Chat.btnNewButton_3) {
			if (Intern_Chat.lists1.isVisible())
				Intern_Chat.lists1.hide();
			else {
				Intern_Chat.lists1.show();
				Intern_Chat.lists.hide();
			}
		} else if (e.getSource() == Intern_Chat.btnNewButton) {
			Intern_Chat.lists.hide();
			Intern_Chat.lists1.hide();
		}

		else if (e.getSource() == Fr_not_tas.btnNewButton_1) {

			Intern_Chat.frame.setVisible(false);
			Home1 home = new Home1();
		}
	}

	public void valueChanged(ListSelectionEvent event) {
		if (event.getSource() == Intern_Chat.lists) {
			if (Intern_Chat.lists.getSelectedValue() == "Places") {
				Intern_Chat.frame.setVisible(false);
				Places place = new Places();
			}

			else if (Intern_Chat.lists.getSelectedValue() == "Friends"
					|| Intern_Chat.lists.getSelectedValue() == "Tastes"
					|| Intern_Chat.lists.getSelectedValue() == "Notifications"
					|| Intern_Chat.lists.getSelectedValue() == "Rates") {
				Intern_Chat.frame.setVisible(false);
				Fr_not_tas friend = new Fr_not_tas((String) Intern_Chat.lists.getSelectedValue());

			}

			else if (Intern_Chat.lists.getSelectedValue() == "Message") {
				Intern_Chat.frame.setVisible(false);
				Messages message = new Messages();
			}

		}
	}
}
