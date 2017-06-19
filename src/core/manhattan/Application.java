package manhattan;

import java.util.Scanner;

import com.github.javafaker.Faker;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Faker fake = new Faker(); 
		int templateSelection = 0;
		String alphabet;
		String toAff;
		int mode;
		
		Template1 temp1 = new Template1();
		Template2 temp2 = new Template2();
		

		do {
			System.out.println("Selectionner un template:\n1- Height: 6 Width: 5\n2- Height: 10 Width: 7");
			templateSelection = ScannerInt(sc);
		} while (templateSelection != 1 && templateSelection != 2);
		System.out.println("Vous avez choisit le template: "+templateSelection+"\n");
		ScannerString(sc);
		System.out.println("Selectionner un alphabet");
			alphabet = ScannerString(sc);
			System.out.println("Vous avez choisit les lettres suivantes: "+alphabet+"\n");
			ScannerString(sc);
			do {
				System.out.println("Mode de selection de la chaine a afficher:\n1- Manuel\n2- automatique\n_>");
				mode = ScannerInt(sc);
			} while (mode != 1 && mode != 2);
			System.out.println("Vous avez choisit le mode: "+mode+"\n");
			ScannerString(sc);
			if (mode == 1) {
				System.out.println("Saisir une chaine de caracteres a afficher:");
				toAff = ScannerString(sc);
				if (templateSelection == 1) {
					temp1.afficherAscii(toAff);
				} else {
					temp2.afficherAscii(toAff);
				}
			} else {
				if (templateSelection == 1) {					
					temp1.afficherAscii(fake.lorem().word());
				} else {
					temp2.afficherAscii(fake.lorem().word());
				}
			}
			sc.close();
	}
	
	public static String ScannerString(Scanner sc){
		String value = "";
		value = sc.nextLine();
		return value;
	}

	public static int ScannerInt(Scanner sc){
		int value = 0;
		value = sc.nextInt();
		return value;
	}
}
