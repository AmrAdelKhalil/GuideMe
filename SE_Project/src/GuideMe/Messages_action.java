package GuideMe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Messages_action implements ActionListener, ListSelectionListener {
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Messages.btnNewButton_2) {
			if (Messages.lists.isVisible())
				Messages.lists.hide();
			else {
				Messages.lists.show();
				Messages.lists1.hide();
			}
		} else if (e.getSource() == Messages.btnNewButton) {
			Messages.frame.setVisible(false);
			Search search = new Search();
		}
		if (e.getSource() == Messages.btnNewButton_3) {
			if (Messages.lists1.isVisible())
				Messages.lists1.hide();
			else {
				Messages.lists1.show();
				Messages.lists.hide();
			}
		} else if (e.getSource() == Messages.btnNewButton) {
			Messages.lists.hide();
			Messages.lists1.hide();
		}

		else if (e.getSource() == Messages.btnNewButton_1) {
			Messages.frame.setVisible(false); /////
			Home1 home = new Home1();
		} else {
			for (int i = 0; i < 20; i++)
				if (e.getSource() == Messages.replay[i]) {
					Messages.frame.setVisible(false);

					Intern_Chat chat = new Intern_Chat();

				}
		}
	}

	public void valueChanged(ListSelectionEvent event) {
		if (event.getSource() == Messages.lists) {
			if (Messages.lists.getSelectedValue() == "Places") {
				Messages.frame.setVisible(false);
				Places place = new Places();
			}

			else if (Messages.lists.getSelectedValue() == "Friends" || Messages.lists.getSelectedValue() == "Tastes"
					|| Messages.lists.getSelectedValue() == "Notifications"
					|| Messages.lists.getSelectedValue() == "Rates") {
				Messages.frame.setVisible(false);
				Fr_not_tas friend = new Fr_not_tas((String) Messages.lists.getSelectedValue());

			}

			else if (Messages.lists.getSelectedValue() == "Message") {
				Messages.frame.setVisible(false);
				Messages message = new Messages();
			}

		}
	}

}
