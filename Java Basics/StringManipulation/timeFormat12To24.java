package StringManipulation;

public class timeFormat12To24 {
	/*
	 * convert 12 hours time format to 24 hours or military format.. 
	 * */
	public static void main(String[] args) {
		String str = "07:40:22PM";
		int xyz = str.contains("PM") && !str.split(":")[0].equals("12") ? Integer.parseInt(str.split(":")[0])+12:Integer.parseInt(str.split(":")[0]);
		str = str.contains("PM")?str.replace(str.split(":")[0],Integer.toString(xyz)):(str.contains("AM")&&str.split(":")[0].equals("12"))?str.replace(str.split(":")[0],"00"):str;
		str= str.replace((str.contains("PM") ? "PM":"AM")," ");
		System.out.print(str);
		}
}
