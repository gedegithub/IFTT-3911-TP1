import java.util.Collection;
import java.util.Scanner;

public class Main {

	/**
	 * 
	 * @param args
	 */
	public void main(String[] args) {

		System.out.println("Ecrire 'client' pour client.");
		System.out.println("Ecrire 'admin' pour admin.");

		Scanner myObj = new Scanner(System.in);
		String response = myObj.nextLine();

		switch(response) {
			case "client" :
				ClientView client = new ClientView();
				break;

			case "admin" :
				AdminView admin = new AdminView();
				break;

			default :
				System.out.println("Mauvais choix");
				break;
		}

	}

}