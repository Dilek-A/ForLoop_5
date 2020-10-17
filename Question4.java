package assignments.ForLoop_5;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number");
		
		int number;
		number=input.nextInt();
		
		int product=0;
		while(product<100) {
			product=product+(number*10);
			System.out.println("Result of product = " + product);
		}

	}

}
