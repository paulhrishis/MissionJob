package StringManipulation;

import java.util.HashMap;
import java.util.Scanner;
// this peice of code is written for counting words i string..
public class WordCount {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    String [] strArray = str.split("\\s{1,}");
    HashMap<String, Integer> hm = new HashMap<>();
    for(String temp : strArray){
        if(hm.containsKey(temp))
        hm.put(temp, hm.get(temp)+1);
        else
        hm.put(temp, 1);
    }
    System.out.println(hm);
}
}