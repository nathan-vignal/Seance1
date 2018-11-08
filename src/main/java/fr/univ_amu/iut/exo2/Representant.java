package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Representant extends Commercial {

    public Representant(int num, String numSecu, String nom, String prenom, int echelon, LocalDate dateDeNaissance,
                        LocalDate dateEmbauche, double base, double nbHeures, double chiffreAffaire, int tauxComission) {
        super(num, numSecu, nom, prenom, echelon, dateDeNaissance, dateEmbauche, base, nbHeures, chiffreAffaire, tauxComission);
    }

    @Override
    public double getSalaireBrut(){
        EmployeOrdinaire employeOrdinaire = new EmployeOrdinaire(super.getNum(),super.getNumSecu(),super.getNom(),super.getPrenom(),
                super.getEchelon(),super.getDateDeNaissance(),super.getDateEmbauche(),super.getBase(),super.getNbHeures());
        return employeOrdinaire.getSalaireBrut() ;

    }
}
