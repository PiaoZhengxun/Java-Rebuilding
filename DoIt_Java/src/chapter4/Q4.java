package chapter4;

public class Q4 {
	
	public static void main(String[] args) {
		
		int lineCount =10;
		int spaceCount = lineCount/2+1;
		int starCount = 1;
		
		for(int i = 0; i < lineCount; i++) {
			for(int q = 0; q < spaceCount; q++) {
				System.out.print(" ");
			}
			for(int j = 0; j < starCount; j++) {
				System.out.print("*");
			}
			for(int w = 0; w < lineCount; w++) {
				System.out.print(" ");
			}
			if(i < 4) {
				spaceCount -= 1;
				starCount += 2;	
			} else {
				spaceCount += 1;
				starCount -= 2;
			}
			
			System.out.print("\n");
		}
		
		
	}

}
