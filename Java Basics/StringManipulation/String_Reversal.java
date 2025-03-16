package StringManipulation;
import java.util.Scanner;
public class String_Reversal {
    public static void main(String[] args) {
        System.out.println("Enter Y for using inbuilt method else enter N");
        Scanner sc = new Scanner(System.in);
        char in = sc.nextLine().charAt(0);
        System.out.println("Please enter string that you wanna reverse");
        String str = sc.next();
        sc.close();
        if(in == 'Y' || in == 'y'){
            StringBuilder sb = new StringBuilder();
            char[] charArray = str.toCharArray();
            for(char temp :charArray){
                sb.append(temp);
            }
            sb.reverse();
            System.out.println(sb);
        }else{
            String reverse = "";
            int strSize = str.length()-1;
            for(int i=strSize; i>=0;i--){
                reverse += str.charAt(i);
            }
            System.out.println(reverse);
        }
    }
}
