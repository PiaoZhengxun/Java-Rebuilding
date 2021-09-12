package chapter11;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String javaStr = new String("java");
		System.out.println(System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" aa");
		System.out.println(System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr));

	}

}
