package GuideMe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class View_Place_action implements ActionListener, ListSelectionListener {
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == View_Place.btnNewButton_2) {
			if (View_Place.lists.isVisible())
				View_Place.lists.hide();
			else {
				View_Place.lists.show();
				View_Place.lists1.hide();
			}
		} else if (e.getSource() == View_Place.btnNewButton) {
			View_Place.frame.setVisible(false);
			Search search = new Search();
		} else if (e.getSource() == View_Place.btnNewButton_3) {
			if (View_Place.lists1.isVisible())
				View_Place.lists1.hide();
			else {
				View_Place.lists1.show();
				View_Place.lists.hide();
			}
		} else if (e.getSource() == View_Place.btnNewButton) {
			View_Place.lists.hide();
			View_Place.lists1.hide();
		}

		else if (e.getSource() == View_Place.btnNewButton_1) {
			View_Place.frame.setVisible(false);
			Home1 home = new Home1();

		}
	}

	public void valueChanged(ListSelectionEvent event) {
		if (event.getSource() == View_Place.lists) {
			if (View_Place.lists.getSelectedValue() == "Places") {
				View_Place.frame.setVisible(false);
				Places place = new Places();

			}

			else if (View_Place.lists.getSelectedValue() == "Friends" || View_Place.lists.getSelectedValue() == "Tastes"
					|| View_Place.lists.getSelectedValue() == "Notifications"
					|| View_Place.lists.getSelectedValue() == "Rates") {
				View_Place.frame.setVisible(false);
				Fr_not_tas friend = new Fr_not_tas((String) View_Place.lists.getSelectedValue());

			}

			else if (View_Place.lists.getSelectedValue() == "Message") {
				View_Place.frame.setVisible(false);
				Messages message = new Messages();
			}

		}
	}
}
