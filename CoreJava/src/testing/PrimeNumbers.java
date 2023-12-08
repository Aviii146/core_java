package testing;

public class PrimeNumbers {

	  public static void main(String[] args) {
	    for (int i = 2; i <= 100; i++) {
	      int count = 0;
	      for (int j = 2; j <= i / 2; j++) {
	        if (i % j == 0) {
	          count++;
	          break;
	        }
	          else if(i % j != 0) {
	        	  System.out.println("Avinash");
	          }
	          
	        }
	        
	        
	    
	      if (count == 0) {
	        System.out.println(i);
	      }
	    }
	  }
	}