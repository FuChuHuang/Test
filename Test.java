import java.util.*;
import java.io.*;
import java.util.Scanner;

class Test
{
	public static void main (String[] args)
	{
		Scanner inputd = new Scanner(System.in);
		int num1;
		int num2;
		int total;
		System.out.println("Intput number:");
		num1 = inputd.nextInt();
		System.out.println("Input number:");
		num2 = inputd.nextInt();

		total = num1 + num2;

		System.out.println("Input Operator:+");
		System.out.println("Result" + total);
	}
}