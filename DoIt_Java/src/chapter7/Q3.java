package chapter7;

public class Q3 {
	
	public static void main(String[] args) {
		int[] q3 = new int[5];
		int sum = 0;
		int count =0;
		
		for(int i = 1; i < 11; i++) {
			if(i%2 == 0) {
				q3[count] = i;
				sum+=i;
				count++;
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		for(int i = 0; i < q3.length; i++) {
			System.out.println(q3[i] + "//" + sum);
		}
	}

}
