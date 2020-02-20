package lab10;

import java.util.Scanner;

public class Numcheck {
	 final private int num;
	    public Numcheck(int num) {
	        this.num = num;
	    }
	    public void setNum(int num1) {
			num1=num;
		}
	    public int getNum() {
	        return num;
	    }
	    // check if num is bigger than the input value n
	    boolean isBigger(int n) {
	        return num > n;
	    }
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the number to be compared");
	    	int n=sc.nextInt();
	        Numcheck checker = new Numcheck(n);
	        int numToCompare = 15;
	        NumberCheck p = checker::isBigger;
	        boolean result = p.check(numToCompare);
	        if (result) {
	            System.out.println(checker.num + " is bigger than " + numToCompare);
	        }else {
	            System.out.println(checker.num + " is smaller than "+numToCompare+" or equal to " + numToCompare);
	        }
	        sc.close();
	    }
	}


