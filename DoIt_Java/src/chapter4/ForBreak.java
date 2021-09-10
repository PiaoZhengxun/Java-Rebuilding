package chapter4;

public class ForBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum=0;
		
		for( int i =0;;i++) {
			sum+=i;
			if(sum >= 100) {
				break;
			}
		}
		System.out.println(sum);

	}

}
