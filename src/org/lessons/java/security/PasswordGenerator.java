package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// call out scanner
		Scanner in = new Scanner(System.in);
		
		// user name
		System.out.print("Inserisci il tuo nome: ");
		String userName = in.nextLine();
		
		// user surname
		System.out.print("Inserisci il tuo cognome: ");
		String userSurname =in.nextLine();
		
		// user favorite color
		System.out.print("Inserisci il colore preferito: ");
		String userColor = in.nextLine();
		
		// user birth date converted from string to integer
		System.out.print("Inserisci la data di nascita: ");
		int userBirthDate = Integer.parseInt(in.nextLine());
		
		System.out.print("Inserisci il mese di nascita in numeri: ");
		int userBirthMonth = Integer.parseInt(in.nextLine());

		System.out.print("Inserisci l'anno di nascita: ");
		int userBirthYear = Integer.parseInt(in.nextLine());
		
		// birth date sum
		int sumDates = userBirthDate + userBirthMonth + userBirthYear;
		
		//final output
		System.out.println("La tua password sara: " + userName+"-"+userSurname+"-"+userColor+"-"+sumDates);
		
		//close scanner
		in.close();
		
	}

}
