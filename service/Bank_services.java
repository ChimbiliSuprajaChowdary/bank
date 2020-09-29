package service;
import java.util.ArrayList;
import java.util.List;

import model.User;
import sun.security.x509.AVA;
public class Bank_services
{
		static List<User> users=new ArrayList<User>();
		public List<User> addUser(User user)
		{
			users.add(user);
			System.out.println("Adding user");
			return users;
			
		}
		public long deposit(User user,long deposit) {
			
			long avblBalance = user.getBankBalance();
			user.setBankBalance(avblBalance+deposit);
			return avblBalance+deposit;
		}
		
		public String withDraw(User user,long withdraw) {
				
				long avblBalance = user.getBankBalance();
				if(avblBalance<withdraw)
				{
					return "You don't have that much money man";
				}
				else {
					user.setBankBalance(avblBalance-withdraw);
					return "Updated balance "+String.valueOf(avblBalance-withdraw);
				}
				
			}
		
		public String applyLoan(User user) {
			long avblBalance = user.getBankBalance();
			if(avblBalance>=5000)
			{
				return "Loan has Been applied.!";
				
			}
			else {
				return "Minimum Balance to apply loan is 5000";
			}
			
		}
		public String applyCredit(User user) {
			long avblBalance = user.getBankBalance();
			if(avblBalance>=10000)
			{
				return "Credit card has Been applied.!";
				
			}
			else {
				return "Minimum Balance to apply Credit card is 10000";
			}
			
		}
	
	
	
}
