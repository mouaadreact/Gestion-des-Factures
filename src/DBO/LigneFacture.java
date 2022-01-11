package DBO;


public class LigneFacture {
	private Article article;
	private int qt;
	private double prix;
//--------------------------------
	public LigneFacture() {}
	
	public LigneFacture(Article article,int qt,double prix) {
		this.article=article;
		this.prix=prix;
		this.qt=qt;
	}
	
	public LigneFacture(Article article,double prix) {
		this.article=article;
		this.prix=prix;
		this.qt=1;
	}
	
	//----------------------------------------
	
	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public int getQt() {
		return qt;
	}

	public void setQt(int qt) {
		this.qt = qt;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
}