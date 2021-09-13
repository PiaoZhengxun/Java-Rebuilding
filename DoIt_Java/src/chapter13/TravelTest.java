package chapter13;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
	
	public static void main(String[] arg) {
		TravelCustomer c1 = new TravelCustomer("¤²", 40, 100);
		TravelCustomer c2 = new TravelCustomer("¤¸", 20, 100);
		TravelCustomer c3 = new TravelCustomer("¤¾", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		
		customerList.stream().map(c -> c.getName()).forEach(n -> System.out.println(n));
		
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total);
		
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
