package controller;
import model.Admin;
import model.User;
import service.Bank_services;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SV_bank {

	static List<User> usersList=new ArrayList<User>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Bank_services service=new Bank_services();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.println("WELCOME TO THE BANK");
			System.out.println("Enter your choice");
			System.out.println("1.Admin");
			System.out.println("2.User Login");
			System.out.println("3.Apply for bank account");
			int choice = Integer.parseInt(br.readLine());
			switch(choice) {
			case 1: 
			{
				Admin admin=new Admin();
				String adminName;
				String password;
				password=br.readLine();
				System.out.println("Enter your username");
				adminName=br.readLine();
				System.out.println("Enter your password");
				password=br.readLine();
				if(adminName.contentEquals(admin.getUserName()) && password.contentEquals(admin.getPassword()))
				{
					System.out.println("welcome admin");
					do
					{
						System.out.println("\n1.Get user details"
								+ "\n3.Update user details/n4.Delete user details");
						int operation=Integer.parseInt(br.readLine());
						switch(operation)
						{
						case 1:
						{}
						case 2:
						{}
						case 3:
						{}
						case 4:
						{}
						default:
						{
							System.out.println("Access denied!!");
							break;
						}
						}
					
					}while(true);
				
			}
				}
			case 2:
			{
				
					System.out.println("welcome user");
					do
					{
						System.out.println("\n1.Deposit money\n2.Withdraw money"
								+ "\n3.Apply for loan/n4.Apply for .....");
						int operation=Integer.parseInt(br.readLine());
						switch(operation)
						{
						case 1:
						{}
						case 2:
						{}
						case 3:
						{}
						case 4:
						{}
						default:
						{
							System.out.println("choose correct option");
							break;
						}
						}
					
					}while(true);
				
			}
			case 3:
			{
				System.out.println("Fill the application:");
				
				String userName=br.readLine();
				String password1=br.readLine();;
				int age=Integer.parseInt(br.readLine());
				String phoneNumber=br.readLine();
				String address=br.readLine();
				String proofId=br.readLine();
				long bankBalance=Long.parseLong(br.readLine());
				
				User user=new User();
				
				user.setUserName(userName);
				user.setPassword1(password1);
				user.setAge(age);
				user.setPhoneNumber(phoneNumber);
				user.setAddress(address);
				user.setProofId(proofId);
				user.setBankBalance(bankBalance);
				//admin validation
				usersList=service.addUser(user);
				System.out.println("user added");
				
			}
			}
			}while(true);

		}
}