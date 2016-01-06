package GuideMe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Search_action implements ActionListener, ListSelectionListener {
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Search.btnNewButton_2) {
			if (Search.lists.isVisible())
				Search.lists.hide();
			else {
				Search.lists.show();
				Search.lists1.hide();
			}
		} else if (e.getSource() == Search.btnNewButton) {
			Search.frame.setVisible(false);

			Search search = new Search();

		} else if (e.getSource() == Search.btnNewButton_3) {
			if (Search.lists1.isVisible())
				Search.lists1.hide();
			else {
				Search.lists1.show();
				Search.lists.hide();
			}
		} else if (e.getSource() == Search.btnNewButton) {
			Search.lists.hide();
			Search.lists1.hide();
		}

		else if (e.getSource() == Search.btnNewButton_1) {

			Search.frame.setVisible(false);
			Home1 home = new Home1();
		}
	}

	public void valueChanged(ListSelectionEvent event) {
		if (event.getSource() == Search.lists) {
			if (Search.lists.getSelectedValue() == "Places") {
				Search.frame.setVisible(false);
				Places place = new Places();

			}

			else if (Search.lists.getSelectedValue() == "Friends" || Search.lists.getSelectedValue() == "Tastes"
					|| Search.lists.getSelectedValue() == "Notifications"
					|| Search.lists.getSelectedValue() == "Rates") {
				Search.frame.setVisible(false);
				Fr_not_tas friend = new Fr_not_tas((String) Search.lists.getSelectedValue());
			}

			else if (Search.lists.getSelectedValue() == "Message") {
				Search.frame.setVisible(false);
				Messages message = new Messages();
			}

		}
	}

}
