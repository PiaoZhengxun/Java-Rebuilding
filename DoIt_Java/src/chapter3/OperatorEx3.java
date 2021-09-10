package chapter3;

public class OperatorEx3 {
	
	public static void main(String[] args) {
		int num = 0B00000101;
		System.out.println(num << 2); //20
		System.out.println(num >> 2); //1.2 = integer 1
		System.out.println(num >>> 2); // 00000101 00000001 = 1
		
		num = num << 2;
		System.out.println(num); // 20
		
		// 0010
		// 1010
		//&: 0010=2  |: 1010=10  ^: 1000=8 ~: 11110101 = 0 0001010 = 0 0001011 = 11 -11
		
		System.out.println("self check");
		int num1 = 0B00000010;
		int num2 = 0B00001010;
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1^num2);
		System.out.println(~num2);
		
		
	}

}
