package StringManipulation;

import java.util.Scanner;

public class AnagramString {
	//Anagrams are strings having same number of characters with same frequency but differs in arrange order...
public static void main(String[] args) {
	System.out.println("Pls enter Two strings to test");
	Scanner sc  = new Scanner(System.in);
	String str  = sc.next();
	String str1 = sc.next();
	sc.close();
	int strSize = str.length()-1;
	int strSize1 = str1.length()-1;
	if(strSize != strSize1)
		System.out.println("Strings are not anagrams");
	else {
		String strSorted = sort(str.toCharArray());
		String str1Sorted = sort(str1.toCharArray());
		System.out.println("stirng1 ans string2 are   +"+strSorted+ "++"+str1Sorted);
		if(strSorted.equals(str1Sorted))
			System.out.println("Strings are anagrams");
		else
			System.out.println("strings are not anagrams");
	}
	
}
public static String sort(char... cs) {
	int size = cs.length-1;
	String jst = "";
	for(int i = 0; i<size; i++) {
		for(int j = 0; j<size-i; j++) {
			if(cs[j]>cs[j+1]) {
				char temp = cs[j];
				cs[j] = cs[j+1];
				cs[j+1] = temp;
			}
		}
	}
	for(char temp:cs) {
		jst += temp;
	}
	return jst;
}
}
