package StringManipulation;

public class DigitSumOutOfString {
public static void main(String[] args) {
	//This is for calculating sum of digits written in string i.e "Rihsi1234" > 10..
	String str = "Rishi123";
	String str1 = str.replaceAll("^[A-Z][a-z]+","");
	int sum = digitSum(Integer.parseInt(str1));
	System.out.println(sum);
	
	//This logic is written to calculate sum of integers given in array of string
	String[] strArray = {"1","3","5"}; //should be 9
	int arraySum = 0;
	for(String temp :strArray) {
		arraySum += Integer.parseInt(temp);
	}System.out.println("arraySum " +arraySum);
	
}
public static int digitSum(int x) {
	int sum = 0;
	while(x!=0) {
		int num = x%10; 
		x /= 10;
		sum += num;
	}
	return sum;
}
}
