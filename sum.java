package helloworld;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		int x,y,sum;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first number(x)");
		x=obj.nextInt();
		System.out.println("Enter the second number(y)");
		y=obj.nextInt();
		sum=x+y;
		System.out.println("sum is"+sum);
		obj.nextLine();
		String str1,str2,str3;
		System.out.println("enter the first String");
		str1=obj.nextLine();
		System.out.println();
		System.out.println("enter the second String");
		str2=obj.nextLine();
		str3=str1+str2;
		System.out.println("The concatenated string is:"+str3);
		float a,b,sub;
		System.out.println("Enter the first number(a)");
		a=obj.nextFloat();
		System.out.println("Enter the second number (b)");
		b=obj.nextFloat();
		sub=a-b;
		System.out.println("result="+sub);
		double m1,m2,m3;
		System.out.println("Enter the first number1(*)");
		m1=obj.nextDouble();
		System.out.println("Enter the second number (*)");
		m2=obj.nextDouble();
		m3=m1*m2;
		System.out.println("result="+m3);
		double d1,d2,d3;
		System.out.println("Enter the first number(/)");
		d1=obj.nextDouble();
		System.out.println("Enter the second number (/)");
		d2=obj.nextDouble();
		d3=d1/d2;
		System.out.println("result="+d3);
		
		
		
		
		
		
	}
		

}
