package fr.univ_amu.iut.exo2;
import fr.univ_amu.iut.exo1.*;
import java.time.LocalDate;

public class Vendeur extends Commercial{

    public Vendeur(int num, String numSecu, String nom, String prenom, int echelon, LocalDate dateDeNaissance,
                   LocalDate dateEmbauche, double base, double nbHeures, double chiffreAffaire, int tauxComission) {
        super(num, numSecu, nom, prenom, echelon, dateDeNaissance, dateEmbauche, base, nbHeures, chiffreAffaire, tauxComission);
    }

}
