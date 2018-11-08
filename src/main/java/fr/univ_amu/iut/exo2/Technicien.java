package fr.univ_amu.iut.exo2;
import fr.univ_amu.iut.exo1.*;
import java.time.LocalDate;

public class Technicien extends Employe {
    private int nbUnitesProduites;
    private double TauxCommissionUnite;


    public Technicien(int num, String numSecu, String nom, String prenom, int echelon, LocalDate dateDeNaissance,
                      LocalDate dateEmbauche, double base, double nbHeures) {
        super(num, numSecu, nom, prenom, echelon, dateDeNaissance, dateEmbauche, base, nbHeures);
    }

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

    public double getTauxCommissionUnite() {
        return TauxCommissionUnite;
    }

    public void setTauxCommissionUnite(double tauxCommissionUnite) {
        TauxCommissionUnite = tauxCommissionUnite;
    }
}
