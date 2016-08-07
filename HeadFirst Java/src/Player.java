
public class Player {

	int number = 0; //número da tentativa
	
	public void guess(){
		number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " +number);
	}
}
