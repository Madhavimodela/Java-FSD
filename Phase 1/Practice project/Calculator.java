package madhu;

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value =");
		System.out.println("enter b value =");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("+,-,*,/,%");
		String operator=sc.next();
		switch(operator)
		{
		case "+":c=a+b;
		System.out.println(+c);
		break;
		case "-":c=a-b;
		System.out.println(+c);
		break;
		case "*":c=a*b;
		System.out.println(+c);
		break;
		case "/":c=a/b;
		System.out.println(+c);
		break;
		case "%":c=a%b;
		System.out.println(+c);
		break;
		default:
			System.out.println("Invalid operator");
			break;
		}
	}

}
