package entities;

public class Personne {
	  private Long id_personne ; 
      private String nom ; 
      private String adress ; 
      private String matricule  ;
	public Long getId_personne() {
		return id_personne;
	}
	public void setId_personne(Long id_personne) {
		this.id_personne = id_personne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	} 
      
      
      
}
