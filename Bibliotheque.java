import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Document> documents;

    public Bibliotheque() {
        this.documents = new ArrayList<>();
    }

    public void ajouter(Document d) {
        boolean exists = false;
        for (Document doc : documents) {
            if (doc.getId() == d.getId()) {
                exists = true;
                break;
            }
        }
        
        if (!exists) {
            documents.add(d);
            System.out.println("Document ajouté: " + d);
        } else {
            System.out.println("Erreur: Un document avec l'ID " + d.getId() + " existe déjà.");
        }
    }

    public List<Document> chercherParTitre(String motCle) {
        List<Document> resultats = new ArrayList<>();
        for (Document doc : documents) {
            if (doc.getTitre().toLowerCase().contains(motCle.toLowerCase())) {
                resultats.add(doc);
            }
        }
        return resultats;
    }
}
