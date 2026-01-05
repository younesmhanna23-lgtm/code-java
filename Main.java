import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Création de la bibliothèque
        Bibliotheque biblio = new Bibliotheque();

        // 2. Création de documents et livres
        Document doc1 = new Document(1, "Guide Java");
        Livre livre1 = new Livre(2, "Harry Potter", "J.K. Rowling", 1997);
        Livre livre2 = new Livre(3, "Le Seigneur des Anneaux", "J.R.R. Tolkien", 1954);
        Document docDoublon = new Document(1, "Autre Guide"); // Même ID que doc1

        // 3. Ajout à la bibliothèque
        System.out.println("--- Ajout des documents ---");
        biblio.ajouter(doc1);
        biblio.ajouter(livre1);
        biblio.ajouter(livre2);
        biblio.ajouter(docDoublon); // Test doublon

        // 4. Recherche
        System.out.println("\n--- Recherche 'java' ---");
        List<Document> res1 = biblio.chercherParTitre("java");
        for (Document d : res1) System.out.println(d);

        System.out.println("\n--- Recherche 'anneau' ---");
        List<Document> res2 = biblio.chercherParTitre("anneau");
        for (Document d : res2) System.out.println(d);
    }
}
