package GuideMe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Places_action implements ActionListener, ListSelectionListener {
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Places.btnNewButton_2) {
			if (Places.lists.isVisible())
				Places.lists.hide();
			else {
				Places.lists.show();
				Places.lists1.hide();
			}
		} else if (e.getSource() == Places.btnNewButton) {
			Places.frame.setVisible(false);
			Search search = new Search();

		} else if (e.getSource() == Places.btnNewButton_3) {
			if (Places.lists1.isVisible())
				Places.lists1.hide();
			else {
				Places.lists1.show();
				Places.lists.hide();
			}
		} else if (e.getSource() == Places.btnNewButton) {
			Places.lists.hide();
			Places.lists1.hide();
		}

		else if (e.getSource() == Places.btnNewButton_1) {

			Places.frame.setVisible(false);
			Home1 home = new Home1();

		}
	}

	public void valueChanged(ListSelectionEvent event) {

		if (event.getSource() == Places.lists) {
			if (Places.lists.getSelectedValue() == "Places") {
				Places.frame.setVisible(false);
				Places place = new Places();
			}

			else if (Places.lists.getSelectedValue() == "Friends" || Places.lists.getSelectedValue() == "Tastes"
					|| Places.lists.getSelectedValue() == "Notifications"
					|| Places.lists.getSelectedValue() == "Rates") {
				Places.frame.setVisible(false);
				Fr_not_tas friend = new Fr_not_tas((String) Places.lists.getSelectedValue());

			}

			else if (Places.lists.getSelectedValue() == "Message") {
				Places.frame.setVisible(false);
				Messages message = new Messages();
			}

		}

		///////////////////////////////////////////////////////////////////////////////////////////
		else if (event.getSource() == Places.list_1) {
			Places.frame.setVisible(false);
			View_Place place = new View_Place();
		}

	}
}
