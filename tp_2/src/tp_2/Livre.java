package tp_2;

public class Livre {
	private String titre;
	private String auteur;
	private int anneePublication;
	
	public Livre(String titre, String auteur, int annePublication) {
		this.titre = titre;
		this.auteur = auteur;
		this.anneePublication = annePublication;
		}

	public void afficherInfos() {
		
		System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Année de publication: " + anneePublication);
	}
	

}
