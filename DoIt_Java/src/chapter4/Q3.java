package chapter4;

public class Q3 {
	
	public static void main(String[] args) {
		
		for(int i = 2; i <= 9; i++) {
			for(int q = 1; ; q++) {
				if(i < q) {
					break;
				}
				System.out.println(i + "x"+q+"="+(i*q));
			}
		}
	}

}
