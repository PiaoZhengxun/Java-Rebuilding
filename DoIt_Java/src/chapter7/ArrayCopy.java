package chapter7;

public class ArrayCopy {
	
	public static void main(String[] args) {
		
		int[] a1 = new int[] {10, 20, 30 ,40, 50};
		int[] a2 = new int[] {1,2,3,4,5};
		
		System.arraycopy(a1, 0, a2, 1, 4);
		for(int i = 0; i<a2.length;i++) {
			System.out.println(a2[i]);
		}
	}

}
