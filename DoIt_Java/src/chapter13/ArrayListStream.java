package chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("1a ");
		sList.add("2ww ");
		sList.add("3dd ");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s));
		System.out.println("");
		
		sList.stream().sorted().forEach(s->System.out.print(s));

	}

}
