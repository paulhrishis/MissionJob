package Number;


import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
	int a=0, b=1, fib =0;
	for(int i =0; i<num;i++) {
		fib = a;
		a=b;
		b=fib+a;
		System.out.print(a+",");
	}
}
}
