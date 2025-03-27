package StringManipulation;

import java.util.Scanner;

public class Pangram {
public static void main(String[] args) {
	//String is pangram if it contains all alphabet letters..
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter some string that you wanna check for pangram");
	String str = sc.nextLine();
	System.out.println("Please choose B for basic and I for Inbuilt");
	char character = sc.next().charAt(0);
	sc.close();
	if(character == 'B') {
		if(checkPangramBasic(str))
			System.out.println("String is Pangram");
		else System.out.println("string is not pangram");
	}else if(character == 'I') {
		if(str.replaceAll("\\s+","").matches(".*(?=.*a|A)(?=.*b|B)(?=.*c|C)(?=.*d|D)(?=.*e|E)(?=.*d|D)(?=.*e|E)(?=.*f|F)(?=.*g|G)(?=.*i|I)(?=.*h|H)(?=.*j|J)(?=.*k|K)(?=.*l|L)(?=.*m|M)(?=.*n|N)(?=.*o|O)(?=.*p|P)(?=.*q|Q)(?=.*r|R)(?=.*s|S)(?=.*t|T)(?=.*u|U)(?=.*v|V)(?=.*w|W)(?=.*x|X)(?=.*y|Y)(?=.*z|Z).*$")) 
			System.out.println("String is pangram");
		else System.out.println("String is not pangram");
	}
	
}

private static boolean checkPangramBasic(String str) {
	char [] charArray = str.toLowerCase().replaceAll("\\s+","").trim().toCharArray();
	boolean[] arr = new boolean[26];
	for(char ch:charArray) {
		if(ch>='a' && ch<='z')
			arr[ch-'a'] =true;
	}
	for(boolean b:arr) {
//		System.out.println(b);
		if(!b)
			return false;
	}
	return true;
}
}
