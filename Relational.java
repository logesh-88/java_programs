package helloworld;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		int x,y;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first number(x)");
		x=obj.nextInt();
		System.out.println("Enter the second number(y)");
		y=obj.nextInt();
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(x>=y);
		System.out.println(x<=y);

	}

}
