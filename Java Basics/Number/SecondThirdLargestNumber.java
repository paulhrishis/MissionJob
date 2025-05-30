package Number;

public class SecondThirdLargestNumber {
public static void main(String[] args) {
	int [] intArray = {10,20,40,30,50,70};
	int max =0;
	int secondMax =0;
	int ThirdMax = 0;

		for(int j=0;j<intArray.length;j++) {
			if(intArray[j] == max || intArray[j] == secondMax || intArray[j] == ThirdMax) {}
			else {
				if(max < intArray[j]) {
					ThirdMax = secondMax;
					secondMax = max;
					max = intArray[j];
				}else if(secondMax<intArray[j]) {
					ThirdMax = secondMax;
					secondMax=intArray[j];
				}else if(ThirdMax<intArray[j]){
					ThirdMax = intArray[j];
				}	}
		}
		
		if(max !=0)
			System.out.println("max value is "+ max);
		if(secondMax !=0)
			System.out.println("second max is "+secondMax);
		if(ThirdMax!=0)
			System.out.println("third max is "+ ThirdMax);
}
}
