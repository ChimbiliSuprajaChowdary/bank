package model;

public class User {
	private String userName;
	private String password1;
	private int age;
	private String phoneNumber;
	private String address;
	private String proofId;
	private long bankBalance;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(long bankBalance) {
		this.bankBalance = bankBalance;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProofId() {
		return proofId;
	}
	public void setProofId(String proofId) {
		this.proofId = proofId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password) {
		this.password1 = password;
	}
}
