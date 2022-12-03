package basic;

public class DataTypeDemo 
	{
	public static void main(String[] args) 
	{
	//boolean example
	boolean IoT = true;
		System.out.println(IoT);
		
	//byte example
	byte range;
	range = 127;
		System.out.println(range);
		
   //short example
	short range1;
	range1 = -127;
		System.out.println(range1);
		
	//int example
	int range2 = 300000000;
		System.out.println(range2);
		
	//long example
	long range3 = 30000000000l;
		System.out.println(range3);
		
	//double example
	double number = 99.9d;
		System.out.println(number);
		
	//float example
	float number1 = 99.9235f;
		System.out.println(number1);
		
	//char example (Unicode value of A is '\u0041')
	char letter = '\u0041';
		System.out.println(letter);
	char letter2 = 65;              // ASCII value of 'A' is 65
		System.out.println(letter2);
	char letter3 = 'A';
		System.out.println(letter3);
	}
}
