package businesslogic;



public class UserValidations {
	
	public boolean isNumber(long num) {
		int number = String.valueOf(num).length();
		if(number==10)
		{
			return true;
		}
		else {
			return false;
		}
		
	}
		

}
