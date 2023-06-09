package esercizio4.fumetteria;

public class Fumetto extends Libro {
	
	// Attributi
	private String nome;
	private String disegnatore;
	
	// Costruttore parametrizzato
	public Fumetto(String titolo, String autore, int annoPubblicazione, int costo, String editore, String nome,
			String disegnatore) {
		super(titolo, autore, annoPubblicazione, costo, editore);
		this.nome = nome;
		this.disegnatore = disegnatore;
	}
	
	// Ridefinizione di toString()
	@Override
	public String toString() {
		return super.toString() + "\nTitolo fumetto: " + nome + "\nDisegnatore: " + disegnatore;
	}
	
	
	// Getter e Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisegnatore() {
		return disegnatore;
	}

	public void setDisegnatore(String disegnatore) {
		this.disegnatore = disegnatore;
	}
	
	
	
	

}
