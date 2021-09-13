package chapter15;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) throws IOException {
		System.out.println("enter");
		
		int i ;
		
		try {
			while((i = System.in.read()) != -1) {
				System.out.print(i);
				System.out.print((char)i);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
