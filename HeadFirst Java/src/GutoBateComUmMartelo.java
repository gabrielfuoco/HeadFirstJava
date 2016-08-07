
public class GutoBateComUmMartelo {

	public static void main(String[] args){
		
	
		int contador = 1;
		
		while (contador < 6){
		
			if (contador == 1){
				
				System.out.println("Guto bate com " + contador + " martelo,");
				System.out.println(contador + " martelo, " + contador + " martelo.");
				System.out.println("Guto bate com " + contador + " martelo, ");
				System.out.println("Então bate com " + (contador + 1));
			
			}else if (contador == 5) {
				
				System.out.println("Guto bate com " + contador + " martelos,");
				System.out.println(contador + " martelos, " + contador + " martelos.");
				System.out.println("Guto bate com " + contador + " martelos, ");
				System.out.println("E depois vai dormir.");
			}else {
				
				System.out.println("Guto bate com " + contador + " martelos,");
				System.out.println(contador + " martelos, " + contador + " martelos.");
				System.out.println("Guto bate com " + contador + " martelos, ");
				System.out.println("Então bate com " + (contador + 1));
			}
		
			contador = contador + 1;

		}
	}
		
}
