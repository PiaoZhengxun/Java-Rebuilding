package chapter7;

public class Alphabet {
	
	public static void main(String[] args) {
		char[][] alphabets = new char[13][2];
		char alpha = 'A';
		
		for(int i = 0; i < alphabets.length; i++) {
			for(int j = 0; j < alphabets[i].length; j++) {
				alphabets[i][j] = alpha;
				System.out.print(alphabets[i][j]);
				alpha++;
			}
			System.out.println("");
			
		}
	}

}
