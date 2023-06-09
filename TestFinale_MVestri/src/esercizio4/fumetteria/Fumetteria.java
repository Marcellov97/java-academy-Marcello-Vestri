package esercizio4.fumetteria;

public class Fumetteria {
	
	// Attributi
	private String nome;
	private String via;
	private String titolare;
	private int numeroFumettiMax;
	private Fumetto[] fumetti;
	
	// Costruttore parametrizzato
	public Fumetteria(String nome, String via, String titolare, int numeroFumettiMax, Fumetto[] fumetti) {
		super();
		this.nome = nome;
		this.via = via;
		this.titolare = titolare;
		this.numeroFumettiMax = numeroFumettiMax;
		this.fumetti = fumetti;
	}
	
	public void stampaDati() {
		System.out.println("Nome fumetteria: " + nome + "\nVia: " + via + "\nTitolare: " + titolare + "\nNumero fumetti massimi: " + numeroFumettiMax + "\n");
		
		for(int i=0; i<fumetti.length; i++) {
			System.out.println(fumetti[i] + "\n");
		}
	}

	
	// Getter e Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getTitolare() {
		return titolare;
	}

	public void setTitolare(String titolare) {
		this.titolare = titolare;
	}

	public int getNumeroFumettiMax() {
		return numeroFumettiMax;
	}

	public void setNumeroFumettiMax(int numeroFumettiMax) {
		this.numeroFumettiMax = numeroFumettiMax;
	}

	public Fumetto[] getFumetti() {
		return fumetti;
	}

	public void setFumetti(Fumetto[] fumetti) {
		this.fumetti = fumetti;
	}
	
	

}
