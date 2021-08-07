package week1.assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123;
		int remainder;
		int sum = 0;
		while (number > 0) {
			remainder = number % 10;
			System.out.println(remainder);
			sum = sum + remainder;
			System.out.println(sum);
			number = number / 10;
			System.out.println(number);

		}
		System.out.println("The sum of digits of 123 is   " + sum);
	}

}

//Declare your input number (int)

// Initialize an integer variable by name: sum

// Use loop to calculate the sum: use while loop to set condition until the
// number goes greater than 0

// Within loop: get the remainder when done by 10 -> Tip: use mod %

// Print the remainder to confirm

// Within loop: add that remainder to the sum

// Print the sum to confirm

// Within loop: get quotient of that number (tip: quotient should be same
// variable of loop condition)

// Print the quotient to confirm

// Outside the loop: print the final sum