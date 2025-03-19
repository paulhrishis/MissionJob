package StringManipulation;
import java.util.Scanner;
public class MaxRepeatedCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        char [] charArray = str.toCharArray();
        int max =0;
        char index=0;
        for(int i =0; i<charArray.length;i++){
            int count =0;
            for(int j =0; j<charArray.length;j++){
                if(charArray[i] == charArray[j]){
                    count++;
                    
                }
                if(max<count){
                    max = count; 
                    index = charArray[j];
                }
                
            }
        }
        System.out.println("most repeated word in this string is  - "+index+ " repeated " + max + " times");
    }
}
