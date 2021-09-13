package chapter13;

public class CalcTest {

	public static void main(String[] args) {
		Calc c1 = (n1, n2) -> (n1+n2);
		int a =c1.add(3, 4);
		System.out.println(a);
		
		Calc c2 = (n1, n2) -> n1+n2;
		System.out.println(c2.add(5, 8));

	}

}
