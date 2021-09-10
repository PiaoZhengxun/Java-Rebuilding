package chapter3;

public class OperationEx2 {
	
	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore = gameScore++;
		System.out.println(lastScore); //151
		System.out.println(gameScore); //151
	}

}
