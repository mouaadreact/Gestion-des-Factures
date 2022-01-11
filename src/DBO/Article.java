package DBO;

public class Article {
	static int n=1;
	private int NulArt;
	private String Libelle;
	//--------------------------------------
	public Article() {}
	public Article(String Libelle) {	
		NulArt=n++;
		this.Libelle=Libelle;
	}
	//-------------------------------------
	public int getNulArt() {
		return NulArt;
	}
	public void setNulArt(int nulArt) {
		NulArt = nulArt;
	}
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
	
}
