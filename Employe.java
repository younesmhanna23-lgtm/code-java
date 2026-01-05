
public abstract class Employe {
    protected String nom;
    protected double salaireBase;

    public Employe(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    public abstract double calculerSalaire();

    public void afficher() {
        System.out.println("Nom: " + nom);
        System.out.println("Salaire: " + calculerSalaire());
    }
}
