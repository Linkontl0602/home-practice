package basic;

import java.util.Scanner;

public class Kfc {
	static String companyname = "KFC";	
	static int friedchickenprice= 5;
	
	public static void main(String[] args) {
		
	System.out.println("Company Name "+" "+companyname);	
	System.out.println("Your Total Order");
	Scanner in = new Scanner(System.in);
	int totalquantity = in.nextInt();	
	System.out.println("Your Total $"+totalquantity*friedchickenprice);	
	System.out.println("************************");	
    System.out.println("Thank You For Visiting Us");
	
	
    
    in.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
