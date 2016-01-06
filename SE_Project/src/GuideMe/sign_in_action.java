package GuideMe;

import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class sign_in_action implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sign_in.btnNewButton) { // sign in

			String Email = sign_in.textField.getText();
			String password = sign_in.passwordField.getText();
			String all = "select * from user where user.Mail=" + "'" + Email + "';";
			try {
				Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/guideme", "root",
						"732008");
				Statement mys = myConn.createStatement();
				ResultSet res = mys.executeQuery(all);
				if (res.next() == false) {
					JOptionPane.showMessageDialog(sign_in.frame, "No Such User", "Guide Me",
							JOptionPane.WARNING_MESSAGE);
					sign_in.textField.setText(null);
					sign_in.passwordField.setText(null);
				} else {
					if (res.getString("Password").equals(password) == false) {
						JOptionPane.showMessageDialog(sign_in.frame, "Password is Wrong", "Guide Me",
								JOptionPane.WARNING_MESSAGE);
						sign_in.passwordField.setText(null);
					} else {
						sign_in.frame.setVisible(false);

						Home1 home = new Home1();
					}
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				// e1.printStackTrace();
				System.out.println("Syntax Error");
			}

		} else if (e.getSource() == sign_in.rdbtnPremuim) {
			sign_in.textField_7.show();
			sign_in.lblID.show();
			sign_in.textField_7.setEditable(true);
		}

		else if (e.getSource() == sign_in.rdbtnnormal) {
			sign_in.textField_7.hide();
			sign_in.lblID.hide();
		}

		else if (e.getSource() == sign_in.btnSignUp) // sign up
		{
			SignUp();
		}
	}
	
	public void SignUp(){
		//System.out.println(sign_in.textField_6.getText().length() );
		String Target=sign_in.textField_3.getText();
		
		//validate @hotmail, @yahoo, @gmail and spaces
		boolean ThereIsSpace=false;
		for(int i=0; i<Target.length(); i++)if(Target.charAt(i)==' '){ThereIsSpace=true;break;}
		
		int IndAt=Target.indexOf('@', 0);
		String substring=Target.substring(IndAt+1);
		System.out.println(IndAt+" " +substring);
		
		boolean checkDate=false;
		int []date={0,31, 28,31,30,31,30,31,31,30,31,30,31};
		if(date[Integer.valueOf(sign_in.choice_1.getSelectedItem())]>=Integer.valueOf(sign_in.choice_2.getSelectedItem()))checkDate=true;
		
		if ((sign_in.textField_1.getText().length() == 0 || sign_in.textField_2.getText().length() == 0
				|| sign_in.textField_3.getText().length() == 0 || sign_in.textField_4.getText().length() == 0
				|| sign_in.textField_5.getText().length() == 0 
				|| (!sign_in.rdbtnFmale.isSelected() && !sign_in.rdbtnMale.isSelected())
				|| (!sign_in.rdbtnnormal.isSelected() && !sign_in.rdbtnPremuim.isSelected()))) {
			JOptionPane.showMessageDialog(sign_in.frame, "Fill All Information", "Guide Me",
					JOptionPane.WARNING_MESSAGE);
		} else if(ThereIsSpace || (!substring.equals("gmail.com")&&!substring.equals("yahoo.com")&& !substring.equals("hotmail.com"))){
			JOptionPane.showMessageDialog(sign_in.frame, "Invalid E-Mail", "Guide Me",
					JOptionPane.WARNING_MESSAGE);
		}else if(!checkDate){
			JOptionPane.showMessageDialog(sign_in.frame, "Wrong with date, please follow Gregoian Calender", "Guide Me",
					JOptionPane.WARNING_MESSAGE);
		}else {
			String Query="select * from user;";
			try {
				Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/guideme", "root",
						"732008");
				Statement mys = myConn.createStatement();
				ResultSet res = mys.executeQuery(Query);
				
				boolean exists=false;
				while (res.next()){
					if(res.getString("Mail").equals(Target)){
						exists=true;
						break;
					}
				}
				
				if(exists){
					JOptionPane.showMessageDialog(sign_in.frame, "This Email is exists","Guide Me",JOptionPane.WARNING_MESSAGE);
				}else{
					//registration then user take if premium
					String Gender ="";
					if(sign_in.rdbtnFmale.isSelected()){
						Gender="F";
					}else Gender="M";
					
					String TOU="";
					if(sign_in.rdbtnnormal.isSelected()){
						TOU="1";
					}else TOU="2";
					
					//check about account if user is premium
					boolean PremCheck=false;
					
					if(TOU.equals("2")){
						System.out.println(sign_in.textField_7.getText());
						PremCheck=verifyCreditCard(sign_in.textField_7.getText());
						System.out.println(PremCheck);
					}
					//System.out.println("prim check"+ PremCheck);
					if (PremCheck||TOU.equals("1")){
					//add in registration 
					Query="SELECT COUNT(*)  FROM registration;";
					res=mys.executeQuery(Query);
					Integer Last=-1;
					while(res.next())
						Last=res.getInt("count(*)");
//					System.out.println(Last);
					Last++;
//					System.out.println(Last);
					//System.out.println(sign_in.textField_3.getText());
					Query="INSERT INTO registration VALUES ("+
							"'"+sign_in.textField_3.getText()+"',"+
							Last.toString()+
							");";
					
					mys.executeUpdate(Query);
					
					//add to user
					
					
					Query="SELECT MAX(ID) from user";
					Integer Maxi=-1;
					mys.execute(Query);
//					res=mys.getResultSet();
					res=mys.executeQuery(Query);
				//	System.out.println(Maxi);
					while(res.next()){
						Maxi=res.getInt(1);
					}
					
					Maxi++;
					
					String Date="";
					Date+=sign_in.choice.getSelectedItem()+"-"+sign_in.choice_1.getSelectedItem()+"-"+sign_in.choice_2.getSelectedItem();
					
					Query="INSERT INTO user VALUES("+
							"'"+sign_in.textField_1.getText()+"',"+
							"'"+sign_in.textField_3.getText()+"',"+
							""+Last+","+
							""+Maxi.toString()+","+
							"'"+sign_in.textField_4.getText()+"',"+
							"'"+Gender+"',"+
							"'"+Date+"',"+
							"'"+sign_in.textField_5.getText()+"',"+
							"'"+sign_in.textField_2.getText()+"',"+
							""+TOU+","+
							"'"+"0'"+
							");";
					//System.out.println(Query);
					mys.executeUpdate(Query);
					
					if(PremCheck){
						Query="SELECT MAX(ID) from premiumuser";
						Integer MaxiP=-1;
						mys.execute(Query);
//						res=mys.getResultSet();
						res=mys.executeQuery(Query);
						//System.out.println(MaxiP);
						while(res.next()){
							MaxiP=res.getInt(1);
						}
						
						MaxiP++;
						
						Query="INSERT INTO premiumuser VALUES("+
								Maxi.toString()+","+
								MaxiP.toString()+
								");";
						//System.out.println(Query);
						mys.executeUpdate(Query);
					}
					
					
					JOptionPane.showMessageDialog(sign_in.frame, "You have successfully registered in out system, Welcome :D","Guide Me",JOptionPane.PLAIN_MESSAGE);
					}
					else{
					JOptionPane.showMessageDialog(sign_in.frame, "Serial Number not exists","Guide Me",JOptionPane.WARNING_MESSAGE);
						
					}
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				// e1.printStackTrace();
				System.out.println("Syntax Error");
			}

		}
	}
	
	public boolean verifyCreditCard(String SerialNumber){
		
		if(SerialNumber.length()==0)return false;
		
		for(int i=0 ; i <SerialNumber.length() ;i++)
			if(SerialNumber.charAt(i)==' '||!(SerialNumber.charAt(i)>=48&&SerialNumber.charAt(i)<=57))return false;
		
		
		String Query="SELECT * from account";
		try{
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/guideme", "root",
					"732008");
			Statement mys = myConn.createStatement();
			ResultSet res = mys.executeQuery(Query);
			res=mys.executeQuery(Query);
			while(res.next()){
				if(res.getInt("SerialNumber")==Integer.valueOf(SerialNumber)){
					return true;
				}
			}
		}catch(SQLException e1){
			System.out.println("Syntax Error in verifyCreditCard function");
		}
		return false;
		
	}

	
}
