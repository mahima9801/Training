package lab10;
import java.util.Scanner;

class Fact {
	public static int fac(int n){  
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		return fact;
		
}  
}

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FactorialInterface factor = Fact::fac;  
		System.out.println("Enter the number");
		int n=sc.nextInt();
	    // Calling interface method  
	    factor.fac(n);  
	    sc.close();
	}  
	}  

	


