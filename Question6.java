package assignments.ForLoop_5;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int n;
		n=sc.nextInt();
		
		int i=1, t1=0, t2=1;
		while(i<=n) {
			System.out.print(t1 + " ,");
			int sum=t1 + t2;
			t1 = t2;
			t2 =sum;
			i++;
		}
		
			}
		}

		
		
		
		
		
		
		