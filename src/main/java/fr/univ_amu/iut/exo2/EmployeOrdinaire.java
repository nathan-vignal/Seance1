package fr.univ_amu.iut.exo2;
import fr.univ_amu.iut.exo1.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeOrdinaire extends Employe{


    public EmployeOrdinaire(int num, String numSecu, String nom, String prenom, int echelon, LocalDate dateDeNaissance
            , LocalDate dateEmbauche, double base, double nbHeures) {
        super(num, numSecu, nom, prenom, echelon, dateDeNaissance, dateEmbauche, base, nbHeures);
    }

    public void effectuerTacheOrdinaire(){

    }
    @Override
    public String toString(){
        return  "Employé Ordinaire :"+'\n' +super.toString();
    }
}
