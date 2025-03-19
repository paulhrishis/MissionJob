package Number;

import java.util.Scanner;
//Armstrong: when sum of cube of each digit of number is same as of number
public class Armstrong {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int original = num;
      sc.close();
      double sum=0;
      while(num!=0){
          int temp = num%10;
          sum = sum +Math.pow(temp, 3);
          num /=10;
      }
      if(original == sum)
      System.out.println("number is armstrong");
      else
      System.out.println("number is not armstrong");
  }
}