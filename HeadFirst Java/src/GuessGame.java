public class GuessGame {

	//váriaveis de jogadores
	
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		
		// cria os jogadores
		p1 = new Player ();
		p2 = new Player ();
		p3 = new Player ();
		
		// cria variaveis para guardar o # de tentativas
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		// variaveis para setarem se o jogador esta correto - tipo boolean (V/F)
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		//número que o jogador tem que tentar acertar
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9 ...");
	
	while(true){
		System.out.println("Number to guess is " + targetNumber);
	
		//chama o método guess da classe Player para cada jogador
		p1.guess();
		p2.guess();
		p3.guess();

		//altera o valor da varriavel guessp* baseado no número que retornou do jogador
		guessp1 = p1.number;
		System.out.println("Player one guessed " + guessp1);
	
		guessp2 = p2.number;
		System.out.println("Player two guessed " + guessp2);
		
		guessp3 = p3.number;
		System.out.println("Player three guessed " + guessp3);
		
		//condições que verificam se o jogador adivinhou o número correto ou não
		if (guessp1 == targetNumber){
			p1isRight = true;
		}
		if (guessp2 == targetNumber){
			p2isRight = true;
		}
		if (guessp3 == targetNumber){
			p3isRight = true;
		}
		
		//verifica se algum ganhou e printa no console
		if (p1isRight || p2isRight || p3isRight) {
			
			System.out.println("We have a winner!!!");
			System.out.println("Player one got it right? " + p1isRight);
			System.out.println("Player two got it right? " + p2isRight);
			System.out.println("Player three got it right? " + p3isRight);
			System.out.println("Game is over.");
			break; //fecha o loop
		} else {
			
			//se ngm tiver ganho
			System.out.println("Players will have to try again");
			}
		}
	
	}
}
