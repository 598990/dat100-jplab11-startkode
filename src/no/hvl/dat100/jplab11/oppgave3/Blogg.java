package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable
	private Innlegg[] innleggtabell;
	private int nesteledige;

	public Blogg() {
		
		innleggtabell = new Innlegg[20];
		nesteledige = 0;
		
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		
		innleggtabell = new Innlegg[lengde];
		nesteledige = 0;
		
		//throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		
		return nesteledige;
		
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public Innlegg[] getSamling() {
		
		return innleggtabell;
		
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		for(int i = 0; i < nesteledige; i++) {
			if(innleggtabell[i].getId() == innlegg.getId()) {
				return i;
			}
		}
		return -1;
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		
		int pos = finnInnlegg(innlegg);
		if(pos == -1) 
			return false;
		
		return true;
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		
		if(innleggtabell.length == nesteledige) 
			return false;
		
		return true;
		
		//throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {
		
		if(finnes(innlegg))
			return false;
		
		if(!ledigPlass())
			return false;
		
		innleggtabell[nesteledige] = innlegg;
		nesteledige++;
		return true;
		
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		
		String ut = "";
		
		for(Innlegg innlegg: innleggtabell) {
			ut += innlegg.toString();
		}
		return nesteledige + "\n" + ut;
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		
		Innlegg[] nytabell = new Innlegg[innleggtabell.length*2];
		for(int i = 0; i < innleggtabell.length; i++) {
			nytabell[i] = innleggtabell[i];
		}
		innleggtabell = nytabell;
		 
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		
		if(!ledigPlass()) {
			utvid();
		}
		
		return leggTil(innlegg);
		
		//throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		int pos = finnInnlegg(innlegg);
		if(pos == -1) 
			return false;
		
		Innlegg[] ny = new Innlegg[innleggtabell.length];
		int nyAntall = 0;
		for(int i = 0; i < nesteledige; i++) {
			if(innleggtabell[i].getId() == innlegg.getId()) {
				
			}
			else {
				ny[nyAntall] = innleggtabell[i];
				nyAntall++;
			}
		}
		nesteledige = nyAntall;
		innleggtabell = ny;
		return true;
		
		//throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		int[] ider = new int[nesteledige];
		int pos = 0;
		for(int i = 0; i < nesteledige; i++) {
			if(innleggtabell[i].getTekst().contains(keyword)) {
				ider[pos] = innleggtabell[i].getId();
				pos++;
			}
		}
		return ider;
		
		//throw new UnsupportedOperationException(TODO.method());

	}
}