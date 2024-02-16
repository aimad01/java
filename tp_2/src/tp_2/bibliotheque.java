package tp_2;
import java.util.ArrayList;
import java.util.List;

public class bibliotheque {
	private List<Livre> books;

    public bibliotheque() {
        this.books = new ArrayList<>();
    }
    
    public void ajouter(Livre book) {
    	books.add(book);
    }
    
    public void afficher() {
    	for(Livre livre : books ) {
    		livre.afficherInfos();
    	}
    }
    
    public static void main(String[] arg) {
		Livre ktab= new Livre("book","mee" , 2012);
		Livre ktab1= new Livre("book1","mee1" , 2013);
		Livre ktab2= new Livre("book2","mee2" , 2014);
		bibliotheque bib= new bibliotheque();
		
		bib.ajouter(ktab);
		bib.ajouter(ktab1);
		bib.ajouter(ktab2);
		
		bib.afficher();
		
	}
}
