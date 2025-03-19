package StringManipulation;

public class CharCountSerially {
    public static void main(String[] args) {
        String str = "aaaabbcca";
        char [] strArray = str.toCharArray();
        int count =1;
        StringBuilder sb = new StringBuilder();
        for(int i=0,j=1;i<strArray.length-1;i++,j++){
            if(strArray[i]==strArray[j])
            count++;
            else{
                sb.append(strArray[j-1]+""+count);
                count =1;
            } 
        }
        sb.append(strArray[strArray.length-1]+""+count);
        System.out.println(sb);
    }
}