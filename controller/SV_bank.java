package controller;
import model.Admin;
import model.User;
import service.Bank_services;

import java.util.List;

import businesslogic.UserValidations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SV_bank {

	static List<User> usersList=new ArrayList<User>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Bank_services service=new Bank_services();
		UserValidations validations = new UserValidations();
		
		 // Long phoneNumber2 = (long) 1234567890;
		//System.out.println(validations.isNumber(phoneNumber2));
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean success = false;
		while (!success) {
		try {
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
					User testUser = null;
					
					String userName;
					String userpassword;
					//user.setUserName(userName);
					
					System.out.println("Enter your username");
					userName=br.readLine();
				
					System.out.println("Enter your password");
					userpassword=br.readLine();
					
					//testUser.setUserName(userName);
					//testUser.setPassword1(userpassword);
					Boolean notFounBoolean=false;
					boolean isBreakTheLoop = false;
					for(int i=0;i<usersList.size();i++)
					{
						testUser=usersList.get(i);
						if(testUser.getUserName().contentEquals(userName) && testUser.getPassword1().contentEquals(userpassword))
						{
							notFounBoolean=true;
							System.out.println("welcome "+testUser.getUserName());
							do
							{
								System.out.println("\n1.Deposit money\n2.Withdraw money"
										+ "\n3.Apply for loan \n4.Apply for Credit Card \n5.Get Current balance \n6.Logout");
								int operation=Integer.parseInt(br.readLine());
								switch(operation)
								{
								case 1:
								{
									isBreakTheLoop=false;
									System.out.println("Enter your amount :");
									long deposit= Long.parseLong(br.readLine());
									deposit = service.deposit(testUser, deposit);
									System.out.println("Your updated balance:"+testUser.getBankBalance());
									break;
								}
								case 2:
								{
									isBreakTheLoop=false;
									System.out.println("Enter your Withdraw :");
									long withdraw= Long.parseLong(br.readLine());
									String res = service.withDraw(testUser, withdraw);
									
									System.out.println(res);
									System.out.println("Your current Balence "+testUser.getBankBalance());
									break;
									
									
								}
								case 3:
								{
									isBreakTheLoop=false;
									String loanString = service.applyLoan(testUser);
									System.out.println(loanString);
									System.out.println("Your current Balence "+testUser.getBankBalance());
									break;
								}
								case 4:
								{
									isBreakTheLoop=false;
									String creString = service.applyCredit(testUser);
									System.out.println(creString);
									System.out.println("Your current Balence "+testUser.getBankBalance());
									
									break;
								}
								case 5:
								{
									isBreakTheLoop=false;
									System.out.println("Your current Balence "+testUser.getBankBalance());
									break;
									
								}
								case 6:
									isBreakTheLoop=true;
									System.out.println("Get OUT");
									break;
									
								default:
								{
									System.out.println("choose correct option");
									break;
								}
								}
							
							}while(!isBreakTheLoop);
						}
						
						
					}
					if (!notFounBoolean) {
						System.out.println("User not found");
					}
					
					
						
					
					
					
				}
				break;
				case 3:
				{
					System.out.println("Fill the application:");
					System.out.println("Enter YourName:");
					String userName=br.readLine();
					System.out.println("Create a Password:");
					String password1=br.readLine();;
					System.out.println("Your age:");
					int age=Integer.parseInt(br.readLine());
					System.out.println("Enter Your Mobile number");
					String phoneNumber=br.readLine();
					System.out.println("Enter Your Address");
					String address=br.readLine();
					System.out.println("Any proof ID - with Proof Name");
					String proofId=br.readLine();
					System.out.println("How much do you want deposit ?");
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
			
				
			 catch (Exception e) {
				System.out.println("Input only Integers please");
			}
			
			}
			
		
		

		}
}
