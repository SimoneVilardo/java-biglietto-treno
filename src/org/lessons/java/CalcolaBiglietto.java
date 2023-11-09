package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Quanti chilometri devi percorrere?");
		String strKm = in.nextLine();
		int intKm = Integer.valueOf(strKm);
		
		
		System.out.print("Quanti anni hai?");
		String strEta = in.nextLine();
		int intEta = Integer.valueOf(strEta);
		
		in.close();
		
		double price = intKm * 0.21;
		
		double newPrice = 0;
		
		if (intEta < 18) {
			newPrice = price * 0.8;
		}else if (intEta > 65) {
			newPrice = price * 0.6;
		}else {
			newPrice = price;
		}
		
		String formattedPrice = String.format("%.2f", newPrice);
		
		System.out.println("Il prezzo del tuo biglietto è di:" + formattedPrice + "€");
	}

}
