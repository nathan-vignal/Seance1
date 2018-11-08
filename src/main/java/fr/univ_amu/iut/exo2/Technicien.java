package fr.univ_amu.iut.exo2;
import fr.univ_amu.iut.exo1.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.EnumMap;

public class Technicien extends Employe {

    public Technicien(int num, String numSecu, String nom, String prenom, int echelon, LocalDate dateDeNaissance,
                      LocalDate dateEmbauche, double base, double nbHeures) {
        super(num, numSecu, nom, prenom, echelon, dateDeNaissance, dateEmbauche, base, nbHeures);
    }

    public void fabriquerProduit(){

    }

    @Override
    public String toString(){
        return  "Technicien :"+'\n' +super.toString();
    }
}
