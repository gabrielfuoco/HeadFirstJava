
public class GoodDogTestDrive {

	public static void main (String[] args){
		
		GoodDog one = new GoodDog();
		one.setSize(70);
		
		GoodDog two = new GoodDog();
		two.setSize(8);
		
		System.out.println("Dog 1: " +one.getSize());
		System.out.println("Dog 2: " +two.getSize());
		
		one.bark();
		two.bark();
		
	}
	
}
