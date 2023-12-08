package testing;

public class ReverseTest {

 	public static void main(String[] args) {
        String str1 = "There is no shortcut to get success";
		
		// rev the string and show in the output
        
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        System.out.println( "String is : "+sb);
        sb.reverse();
       System.out.println("Reversed string is : "+sb);
		
		int num1 = 10282023;
		
		// find the sum of all the digits in num2
		int sum = 0;

		while (num1 > 0)
		{
		    int digit = num1 % 10;  // Get the last digit
		    sum += digit;           // Add the digit to the sum
		    num1 /= 10;             // Remove the last digit
		}
		System.out.println("SUM ON NUM" +sum);
		// find out the rev num of num1
		int reversedNum = 0;

		while (num1 > 0)
		{
		    int digit = num1 % 10;    // Get the last digit of num1
		    reversedNum = reversedNum * 10 + digit; // Append the digit to reversedNum in reverse order
		    num1 /= 10;              // Remove the last digit
		}

		System.out.println("The reverse of num1 is: " + reversedNum);
		// do not convert this num into string


	}

}
