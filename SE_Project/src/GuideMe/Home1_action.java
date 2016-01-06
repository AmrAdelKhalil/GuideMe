package GuideMe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Home1_action implements ActionListener, ListSelectionListener, MouseListener {
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Home1.btnNewButton_2) {
			if (Home1.lists.isVisible())
				Home1.lists.hide();
			else {
				Home1.lists.show();
				Home1.lists1.hide();
			}
		}
		else if(e.getSource()==Home1.btnNewButton)
		{
			Home1.frame.setVisible(false);	
			Search search =new Search();
		}

		else if (e.getSource() == Home1.btnNewButton_3) {
			if (Home1.lists1.isVisible())
				Home1.lists1.hide();
			else {
				Home1.lists1.show();
				Home1.lists.hide();
			}
		}

		else if (e.getSource() == Home1.btnNewButton_1) {
			Home1.lists.hide();
			Home1.lists1.hide();
		}
	}
	
	public void valueChanged(ListSelectionEvent event) {
		if (event.getSource() == Home1.lists) {
				if (Home1.lists.getSelectedValue() == "Places") {
					Home1.frame.setVisible(false);
					Places place = new Places();
				}

				else if (Home1.lists.getSelectedValue() == "Friends" || Home1.lists.getSelectedValue() == "Tastes"
						|| Home1.lists.getSelectedValue() == "Notifications" || Home1.lists.getSelectedValue() == "Rates") {
					Home1.frame.setVisible(false);
					Fr_not_tas friend = new Fr_not_tas((String) Home1.lists.getSelectedValue());
				
				}

				else if (Home1.lists.getSelectedValue() == "Message") {
					Home1.frame.setVisible(false);
					Messages message = new Messages();
					
				}

			}

	}
	
	void Open() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Choose Image");
		int result = fileChooser.showOpenDialog(Home1.frame);
		if (result == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fileChooser.getSelectedFile();
		}

	}
	
	
	@Override
	public void mouseClicked(MouseEvent event) {

	}

	@Override
	public void mouseEntered(MouseEvent event) {
		// TODO Auto-generated method stub
		if (event.getX() >= 2 && event.getX() <= 220 && event.getY() >= 10 && event.getY() <= 245) {
			Home1.changeProfile.show();
		} else
			Home1.changeProfile.hide();
	}

	@Override
	public void mouseExited(MouseEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent event) {
		if (event.getX() >= 48 && event.getX() <= 161 && event.getY() >= 222 && event.getY() <= 235)
			Open();

	}

	@Override
	public void mouseReleased(MouseEvent event) {
		// TODO Auto-generated method stub

	}

}
