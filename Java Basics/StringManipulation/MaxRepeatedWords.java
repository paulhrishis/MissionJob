package StringManipulation;

import java.util.Scanner;
//this code should check the most repeated word in string according to latest occurance..
public class MaxRepeatedWords {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      sc.close();
      var max =0;
      String word = null;
      String [] strArray = str.split("\\s{1,}"); //this should be the most repeated word this time because this is..
      for(int i=0;i<strArray.length;i++){
          var count =0;
          for(int j=0;j<strArray.length;j++){
              if(strArray[i].equals(strArray[j])){
                  count++;
              } 
          }
          if(count>=max){
              max = count;
              word = strArray[i];
          }
      }
      System.out.println("the most repeated word in this string is ++ "+ word +" times "+max);
  }
}
