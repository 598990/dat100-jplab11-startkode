package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

import java.io.*;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		
		File fil = new File(mappe + filnavn);
		Scanner leser;
		
		try {
			leser = new Scanner(fil);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		
		Blogg blogg = null;
		int linjeNr = 1;
		
		String linje;
		
		while(leser.hasNextLine()) {
			linje = leser.nextLine();
		
			if(linjeNr == 1) {
				blogg = new Blogg(Integer.parseInt(linje));
			}
			else {
				if(linje.equals(TEKST)) {
					Tekst tekst = new Tekst(Integer.parseInt(leser.nextLine()), leser.nextLine(), leser.nextLine(), Integer.parseInt(leser.nextLine()), leser.nextLine());
					linjeNr += 5;
					blogg.leggTil(tekst);
				}
				else if(linje.equals(BILDE)) {
					Bilde bilde = new Bilde(Integer.parseInt(leser.nextLine()), leser.nextLine(), leser.nextLine(), Integer.parseInt(leser.nextLine()), leser.nextLine(), leser.nextLine());
					linjeNr += 6;
					blogg.leggTil(bilde);
				}
			}
			
			linjeNr++;
		}
		
		leser.close();
		return blogg;
	}
}
