package fr.univ_amu.iut.exo2;
import fr.univ_amu.iut.exo1.*;
import java.time.LocalDate;

public class Technicien extends Employe {
    private int nbUnitesProduites;

    public Technicien(int num, String numSecu, String nom, String prenom, int echelon, LocalDate dateDeNaissance,
                      LocalDate dateEmbauche, double base, double nbHeures, int nbUnitesProduites, double tauxCommissionUnite) {
        super(num, numSecu, nom, prenom, echelon, dateDeNaissance, dateEmbauche, base, nbHeures);
        this.nbUnitesProduites = nbUnitesProduites;
        this.tauxCommissionUnite = tauxCommissionUnite;
    }

    public double getTauxCommissionUnite() {
        return tauxCommissionUnite;
    }

    public void setTauxCommissionUnite(double tauxCommissionUnite) {
        this.tauxCommissionUnite = tauxCommissionUnite;
    }

    private double tauxCommissionUnite;




    public void fabriquerProduit(){
        System.out.println("appel  fabriquerProduit");

    }

    @Override
    public String toString(){
        return  "Technicien :"+'\n' +super.toString();
    }

    @Override
    public double getSalaireBrut(){
        return super.getSalaireBrut() + getNbUnitesProduites() * getTauxCommissionUnite();
    }

    public int getNbUnitesProduites() {
        return nbUnitesProduites;
    }

    public void setNbUnitesProduites(int nbUnitesProduites) {
        this.nbUnitesProduites = nbUnitesProduites;
    }
}
