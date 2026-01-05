
public class EmployePermanent extends Employe implements Payable {

    public EmployePermanent(String nom, double salaireBase) {
        super(nom, salaireBase);
    }

    @Override
    public double calculerSalaire() {
        // Example logic: base salary + bonus
        return salaireBase + calculerPrime();
    }

    @Override
    public double calculerPrime() {
        // Example logic: 10% of base salary
        return salaireBase * 0.10;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Prime: " + calculerPrime());
    }
}
