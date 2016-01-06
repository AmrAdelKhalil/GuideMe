package GuideMe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Fr_not_tas_action implements ActionListener, ListSelectionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == Fr_not_tas.btnNewButton_2) {
			if (Fr_not_tas.lists.isVisible())
				Fr_not_tas.lists.hide();
			else {
				Fr_not_tas.lists.show();
				Fr_not_tas.lists1.hide();
			}
		} else if (e.getSource() == Fr_not_tas.btnNewButton) {
			Fr_not_tas.frame.setVisible(false);
			Search search = new Search();
		} else if (e.getSource() == Fr_not_tas.btnNewButton_3) {
			if (Fr_not_tas.lists1.isVisible())
				Fr_not_tas.lists1.hide();
			else {
				Fr_not_tas.lists1.show();
				Fr_not_tas.lists.hide();
			}
		} else if (e.getSource() == Fr_not_tas.btnNewButton) {
			Fr_not_tas.lists.hide();
			Fr_not_tas.lists1.hide();
		}

		else if (e.getSource() == Fr_not_tas.btnNewButton_1) {

			Fr_not_tas.frame.setVisible(false);
			Home1 home = new Home1();

		}

	}

	public void valueChanged(ListSelectionEvent event) {
		if (event.getSource() == Fr_not_tas.lists) {
			if (Fr_not_tas.lists.getSelectedValue() == "Places") {
				Fr_not_tas.frame.setVisible(false);
				Places place = new Places();
			}

			else if (Fr_not_tas.lists.getSelectedValue() == "Friends" || Fr_not_tas.lists.getSelectedValue() == "Tastes"
					|| Fr_not_tas.lists.getSelectedValue() == "Notifications" || Fr_not_tas.lists.getSelectedValue() == "Rates") {
				Fr_not_tas.frame.setVisible(false);
				Fr_not_tas friend = new Fr_not_tas((String) Fr_not_tas.lists.getSelectedValue());
				
			}

			else if (Fr_not_tas.lists.getSelectedValue() == "Message") {
				Messages.frame.setVisible(false);
				Messages message = new Messages();
			}

		}
	}
}
