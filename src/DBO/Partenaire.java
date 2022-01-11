package DBO;

public class Partenaire {
	

	private String NomPartenaire;
	 private String AdressePartenaire;
	 private String ContactPartenaire;
	 private String TypePartenaire;
	 
	 //-------------------------------------------------
	 
	 
	 
	 public Partenaire() {}
		public Partenaire(String nomPartenaire, String adressePartenaire, String contactPartenaire,String Type) {
			this.NomPartenaire = nomPartenaire;
			this.AdressePartenaire = adressePartenaire;
			this.ContactPartenaire = contactPartenaire;
			this.TypePartenaire=Type;
		}
		
	//--------------------------------------------------------------
	 public String getTypePartenaire() {
		return TypePartenaire;
	}
	public void setTypePartenaire(String typePartenaire) {
		TypePartenaire = typePartenaire;
	}	

	//----------------------------------------------------
	public String getNomPartenaire() {
		return NomPartenaire;
	}

	public void setNomPartenaire(String nomPartenaire) {
		NomPartenaire = nomPartenaire;
	}

	public String getAdressePartenaire() {
		return AdressePartenaire;
	}

	public void setAdressePartenaire(String adressePartenaire) {
		AdressePartenaire = adressePartenaire;
	}

	public String getContactPartenaire() {
		return ContactPartenaire;
	}

	public void setContactPartenaire(String contactPartenaire) {
		ContactPartenaire = contactPartenaire;
	}

}
