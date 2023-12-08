package testing;

public class JavaLoops {

	public static void main(String[] args) {
		
		System.out.println("While Loop");
		System.out.println("");
		int num1=0;
		while(num1<=10) {
			System.out.println(num1);
			num1=num1+1;
		}
		System.out.println(num1);

		int num2=10;
		while(num2>=1) {
			System.out.println(num2+num2);
			num2=num2-1;
		}
		
		
		
		 System.out.println("For Loop");
         for(int num3=1;num3<=10;num3++) {
			System.out.println(num3);
		}
		
     	// Find even numbers between 1 to 50 using for loop
 		for(int num4=2;num4<=50;num4+=2) {
 			
 			System.out.println(num4);
		
 		}
	for(int num5=2;num5<=50;num5+=2) {
 			
 			System.out.println(num5);
		
 		}
         System.out.println("Using for each loop *************************");
		
		int[] arr1 = {50,54,12,23,43,90};
		int sum = 0;
		for(int value:arr1) {
			
			System.out.println(value);
			sum+=value;
			
		}
		System.out.println("Sum is " + sum);
		
		
		
		
	}

}
