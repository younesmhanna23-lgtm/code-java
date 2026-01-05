public class Livre extends Document {
    private String auteur;
    private int annee;

    public Livre(int id, String titre, String auteur, int annee) {
        super(id, titre);
        this.auteur = auteur;
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Livre [id=" + getId() + ", titre=" + getTitre() + ", auteur=" + auteur + ", annee=" + annee + "]";
    }
}
