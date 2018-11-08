package fr.univ_amu.iut.exo2;
import fr.univ_amu.iut.exo1.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Commercial extends Employe {
    private double chiffreAffaire;
    private double tauxComission;

    public Commercial(int num, String numSecu, String nom, String prenom, int echelon, LocalDate dateDeNaissance,
                      LocalDate dateEmbauche, double base, double nbHeures, double chiffreAffaire, int tauxComission) {
        super(num, numSecu, nom, prenom, echelon, dateDeNaissance, dateEmbauche, base, nbHeures);
        this.chiffreAffaire = chiffreAffaire;
        this.tauxComission = tauxComission;
    }


    public void negocierTransaction(){
        System.out.println("appel negocierTransaction");

    }

    @Override
    public String toString(){
        return  "Commercial :"+'\n' +super.toString();
    }

    @Override
    public double getSalaireBrut(){
        return getBase()* getNbHeures() + getEchelon()*100;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getTauxComission() {
        return tauxComission;
    }

    public void setTauxComission(double tauxComission) {
        this.tauxComission = tauxComission;
    }
}
