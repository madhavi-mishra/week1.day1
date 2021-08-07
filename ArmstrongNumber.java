package week1.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number=153;
		int calculated = 0 ,remainder,original=number;
		while(original>0) {
			remainder= original%10;
			original=original/10;
			calculated =calculated + remainder *remainder *remainder;
		}
		
			if(calculated == number){
				System.out.println("The given number "+number+" is an Armstrong Number");
				
			}else
				System.out.println("The given Number "+number+"is not an Armstrong Number");
	
			
			
		
		
	}

}
