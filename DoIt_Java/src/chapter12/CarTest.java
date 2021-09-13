package chapter12;


public class CarTest {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car sonata1 = factory.createCar("오빠차");
		Car sonata2 = factory.createCar("아빠차");
		System.out.println(sonata1 == sonata2);
		
		Car avante1 = factory.createCar("애미차");
		Car avante2 = factory.createCar("니엄차");
		System.out.println(avante1 == avante2);
		
		System.out.println(sonata1 == avante1);
	
	}

}

