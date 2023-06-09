package esercizio4.fumetteria;

public class Libro {
	
	// Attributi
	private String titolo;
	private String autore;
	private int annoPubblicazione;
	private int costo;
	private String editore;

	// Costruttore parametrizzato
	public Libro(String titolo, String autore, int annoPubblicazione, int costo, String editore) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.annoPubblicazione = annoPubblicazione;
		this.costo = costo;
		this.editore = editore;
	}
	
	// Metodo toString()
	@Override
	public String toString() {
		return "Titolo: " + titolo + "\nAutore: " + autore + "\nAnno di pubblicazione: " + annoPubblicazione + "\nCosto: " + costo + "\nEditore: " + editore;
	}

	
	// Getter e Setter
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}
	
	
	

}
