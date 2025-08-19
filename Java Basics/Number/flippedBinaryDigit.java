package Number;

import java.util.Scanner;

public class flippedBinaryDigit {
	/* flipping binary digits of a Decimal number and returns result as Decimal
	 * 0 <>	1
	 * */
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Long Digit = sc.nextLong();
System.out.printf("flipped binary digits for %d are >> %s", Digit, flippedBinary(Digit));
	
}

public static Long bitBinary(long n) {
	StringBuilder sb = new StringBuilder();
	while(n!=0) {
		sb.insert(0, n%2);
		n /= 2;
	}
	
	if(n==0)
		return (long) 0;
	
	String str = sb.toString();
//	Long.toBinaryString(n);
	return Long.valueOf(str,2);
}

public static Long flippedBinary(Long n) {
	Long binaryDigit = bitBinary(n);
	StringBuilder sb = new StringBuilder();
	String str = String.format("%32s", binaryDigit.toString()).replace(" ", "0");
	for(int i =0;i<32;i++) {
		try {
		sb.append(str.charAt(i)=='0'?1:0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return Long.valueOf(sb.toString(),2);
}

}
