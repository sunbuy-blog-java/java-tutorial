package binarytodecimal;

public class ConvertUsingCustomLogic {
	public static int getDecimalFromBinary(int binaryNumber){  
	    int d = 0;  
	    int n = 0;  
	    while(true){  
	      if(binaryNumber == 0){  
	        break;  
	      } else {  
	          int temp = binaryNumber%10;  
	          d += temp*Math.pow(2, n);  
	          binaryNumber = binaryNumber/10;  
	          n++;  
	       }  
	    }  
	    return d;  
	}  
	public static void main(String args[]){    
		System.out.println("Decimal of 101010 is: " + getDecimalFromBinary(101010));
		System.out.println("Decimal of 101011 is: " + getDecimalFromBinary(101011));
		System.out.println("Decimal of 1110101 is: "+getDecimalFromBinary(1110101));  
	}    
}
