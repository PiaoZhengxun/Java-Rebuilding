package chapter4;

public class Q2 {

	public static void main(String[] args) {


		for(int i = 2; i <= 9; i++) {
			if(i%2 != 0) {
				continue;
			}
			for(int t = 1; t <= 9; t++) {
				System.out.println(i + "X" + t + "=" + (i*t));
			}
		}


	}

}
