package chapter4;

public class Times {
	
	public static void main(String[] args) {
		int d,t;
		for(d = 2; d<=9; d++) {
			for(t = 1; t<=9; t++) {
				System.out.println(d + "x" + t + "=" + (d*t) +"\n");
			}
		}
	}
}
