package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		
		super(id, bruker, dato, tekst);
		this.url = url;
		
		//throw new UnsupportedOperationException(TODO.constructor("Bilde"));
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		
		super(id, bruker, dato, likes, tekst);
		this.url = url;
		
		//throw new UnsupportedOperationException(TODO.constructor("Bilde"));
	}
	
	@Override
	public String getUrl() {
		
		return url;
		
		//throw new UnsupportedOperationException(TODO.method());

	}

	@Override
	public void setUrl(String url) {
		
		this.url = url; 
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
		//throw new UnsupportedOperationException(TODO.method ());

		return "BILDE" + "\n" + super.getId() + "\n" + super.getBruker() + "\n" + super.getDato() + "\n" + super.getLikes() + "\n" + super.getTekst() + "\n" + url + "\n";
		
	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		StringBuilder bygger = new StringBuilder();
		bygger.append("<h2>" + super.getBruker() + " " + super.getDato() + " " + super.getId() + "</h2>");
		bygger.append("<p>" + super.getTekst() + "</p>");
		bygger.append("<img src=\"" + getUrl() + "\">");
		
		return bygger.toString();
		//throw new UnsupportedOperationException(TODO.method());
				
	}
}
