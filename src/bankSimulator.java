//Author Ahmet Tunahan Ozkan
//Simple ATM simulation

import javax.swing.JOptionPane;

public class bankSimulator {

	public bankSimulator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String input;
		int yesNo = 0;
		int balance = 1000;
		JOptionPane.showMessageDialog(null, "Hi, Welcome to Too Bank","Message",JOptionPane.WARNING_MESSAGE);
		input = JOptionPane.showInputDialog("Please enter your Pin Code, then press OK");
		
		  while (Integer.parseInt(input) != 1234)
		  {
			 input = JOptionPane.showInputDialog("Incorrect Pin Code, Please try again");
		  }
		 
		  	while(yesNo != 1)
		  	{
			Object[] options = {"Deposit","Withdraw","Show Balance"}; 
		  	int option = JOptionPane.showOptionDialog(null, "What would you like to do?", "Deposit or Withdraw", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		  	
		  
		  	if(option == 0)
		  	{
			  	String deposit;
			  	deposit = JOptionPane.showInputDialog("Amount to Deposit");
			  
			  	if(Integer.parseInt(deposit) <= 0 )
			  	{
				  	JOptionPane.showMessageDialog(null, "Invalid Deposit value","Warning",JOptionPane.ERROR_MESSAGE);
			  
				  	yesNo = JOptionPane.showConfirmDialog(null, "Do you want to another service?", "Deposit", JOptionPane.YES_NO_OPTION);
			  	}
			  	else if(Integer.parseInt(deposit) > 0)
			  	{
				  	balance = balance + Integer.parseInt(deposit); 
				  	yesNo = JOptionPane.showConfirmDialog(null, "Do you want to another service?", "Deposit", JOptionPane.YES_NO_OPTION);
			  	}
			  
		  	}
		  	else if(option == 1)
		  	{
			  	String withdraw;
			  	withdraw = JOptionPane.showInputDialog("Amount to Withdraw");
			  	if(Integer.parseInt(withdraw) <= 0 || Integer.parseInt(withdraw) > balance )
			  	{
				  	JOptionPane.showMessageDialog(null, "Invalid Withdraw value","Warning",JOptionPane.ERROR_MESSAGE);
				  	yesNo = JOptionPane.showConfirmDialog(null, "Do you want to another service?", "Withdraw", JOptionPane.YES_NO_OPTION);
			  	}
			  	else if(Integer.parseInt(withdraw) > 0 && Integer.parseInt(withdraw) <= balance)
			  	{
				  	balance = balance - Integer.parseInt(withdraw); 
				  	yesNo = JOptionPane.showConfirmDialog(null, "Do you want to another service?", "Withdraw", JOptionPane.YES_NO_OPTION);
			  	}
		  	}
		  	else if(option == 2)
		  	{
			  	JOptionPane.showMessageDialog(null, "Your Balance is "+ balance,"Balance",JOptionPane.WARNING_MESSAGE);
			  	yesNo = JOptionPane.showConfirmDialog(null, "Do you want to another service?", "Balance", JOptionPane.YES_NO_OPTION);
		  	}
		  	
		  }
	}

}
