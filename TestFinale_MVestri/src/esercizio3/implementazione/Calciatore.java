package esercizio3.implementazione;

// importo l'interfaccia
import esercizio3.interfaccia.GiocatoreProfessionista;

public class Calciatore implements GiocatoreProfessionista {
	
	// Attributi
	private String nome;
	private String cognome;
	private int annoNascita;
	private String luogoNascita;
	private String squadra;
	private String ruolo;
	private int costoCartellino;
	private int anniContratto;
	private int stipendioAnnuo;
	
	// Costruttore
	public Calciatore(String nome, String cognome, int annoNascita, String luogoNascita, String squadra, String ruolo,
			int costoCartellino, int anniContratto, int stipendioAnnuo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.annoNascita = annoNascita;
		this.luogoNascita = luogoNascita;
		this.squadra = squadra;
		this.ruolo = ruolo;
		this.costoCartellino = costoCartellino;
		this.anniContratto = anniContratto;
		this.stipendioAnnuo = stipendioAnnuo;
	}

	//-------------------------------------------------------
	// Funzioni Override
	@Override
	public void stampaDati() {
		System.out.println("Nome: " + nome + "\nCognome: " + cognome + "\nAnno di Nascita: " + annoNascita 
				+ "\nLuogo di Nascita: " + luogoNascita + "\nSquadra: " + squadra + "\nRuolo: " + ruolo
				 + "\nCosto Cartellino: " + costoCartellino + "\nAnni di contratto: " + anniContratto + "\nStipendio Annuo: " + stipendioAnnuo);

	}

	@Override
	public int calcolaStipendioMensile() {
		
		// creo che anche i calciatori hanno la tredicesima
		return (stipendioAnnuo/13);
	}
	
	
	
	//-------------------------------------------------------
	//Get e Set
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getAnnoNascita() {
		return annoNascita;
	}

	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public String getSquadra() {
		return squadra;
	}

	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public int getCostoCartellino() {
		return costoCartellino;
	}

	public void setCostoCartellino(int costoCartellino) {
		this.costoCartellino = costoCartellino;
	}

	public int getAnniContratto() {
		return anniContratto;
	}

	public void setAnniContratto(int anniContratto) {
		this.anniContratto = anniContratto;
	}

	public int getStipendioAnnuo() {
		return stipendioAnnuo;
	}

	public void setStipendioAnnuo(int stipendioAnnuo) {
		this.stipendioAnnuo = stipendioAnnuo;
	}
	
	

}
