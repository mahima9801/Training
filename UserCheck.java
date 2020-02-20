package lab10;

import java.util.Scanner;

public class UserCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name and password: ");
		String name=sc.nextLine();
		String password=sc.nextLine();
		String name1="Mahima01";
		String password1="abc123";
		Usercheck1 u=(user,pass) -> ((name.equals(name1))&&(password.equals(password1)))?true:false;
		boolean check=u.validateNamePassword(name, password1);
		System.out.println("The result is: "+check);
		sc.close();
		
	}


}
