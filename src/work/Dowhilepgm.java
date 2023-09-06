package work;

import java.util.Scanner;

public class Dowhilepgm {

	public static void main(String[] args) {
		Scanner dw=new Scanner(System.in);
		// TODO Auto-generated method stub
		int sum=0;
		char op;
		do {
			System.out.println("enter two numbers ");
			int num1=dw.nextInt();
			int num2=dw.nextInt();
			sum = sum+num1+num2;
		      System.out.println("Do you wish to perform another operation, Y/N");
		      op =dw.next().charAt(0);
		}
		while(op =='Y'||op=='y');
	    System.out.println("sum "+sum);

	}

}
