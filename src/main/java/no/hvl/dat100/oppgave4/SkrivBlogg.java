package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		// Oppretter en boolean som holder styr på om det ble skrevet en fil eller ikke
		boolean skrevet;

		// Bruker Try Catch for å håndtere FileNotFoundException.
		try {

			// oppretter et nytt PrintWriter opjekt med ønsket filnavn
			PrintWriter skriver = new PrintWriter(filnavn);

			// Skriver samlingen inn til filen ved hjelp av toString metoden fra blogg
			// klassen
			skriver.print(samling.toString());

			// Lukker PrintWriter objektet.
			skriver.close();

			// Endrer boolean til true
			skrevet = true;

		}

		// Fanger FileNotFounException
		catch (FileNotFoundException e) {
			// Skriver i så fall ut at filen ikke eksisterer og oppdaterer boolean til false
			System.out.println("Filen eksisterer ikke");
			skrevet = false;
		}
		// Returnerer boolean.
		return skrevet;
	}
}