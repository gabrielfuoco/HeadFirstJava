public class Loopy {

	public static void main(String[] args){
		
		int x = 1;
		
		System.out.println("Before the loop execution");
		
		while (x < 4) {
			System.out.println("In the loop");
			System.out.println("Value of x: " +x);
			x = x + 1;
		}
		
		System.out.println("this will always appear");
	}
}
