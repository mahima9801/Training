package lab10;

import java.util.Scanner;

public class Power1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Power p = (double x, double y)->Math.pow(x, y);
		double result = p.Pow(sc.nextDouble(), sc.nextDouble());
		System.out.println(result);
		sc.close();
		
		
		
	}

}
