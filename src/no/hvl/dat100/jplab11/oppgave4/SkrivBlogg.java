package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;
import no.hvl.dat100.jplab11.oppgave1.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		try {
			PrintWriter skriver = new PrintWriter(filnavn);
			for(Innlegg blogg : samling.getSamling()) {
				if(blogg != null) {
					skriver.println(blogg.toString());
				}
			}
			skriver.close();
			return true;
		} 
		catch (FileNotFoundException e) {
			return false;
		}
		
		//throw new UnsupportedOperationException(TODO.method());
	}
}
