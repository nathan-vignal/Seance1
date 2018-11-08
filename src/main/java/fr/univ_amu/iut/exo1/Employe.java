package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employe {

    private int num;
    private String numSecu;
    private String nom;
    private String prenom;
    private int echelon;
    private LocalDate dateDeNaissance;
    private LocalDate dateEmbauche;
    private double base;
    private double nbHeures;

    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String DateDeNaissanceFormate = dateDeNaissance.format(formatter);
        String DateEmbaucheFormate = dateEmbauche.format(formatter);
        return "num ="+num+'\n'+
        "numSecu ="+numSecu +'\n'+
        "nom ="+nom +'\n'+
        "prenom ="+prenom +'\n'+
        "echelon ="+echelon +'\n'+
        "date de naissance ="+ DateDeNaissanceFormate +'\n'+
        "date d'embauche ="+DateEmbaucheFormate+'\n'+
        "base = "+ base+'\n'+
        "nbHeurese = "+nbHeures+'\n'
                ;

    }

    public double getSalaireBrut(){
        return base * nbHeures;

    }

    public double getSalaireNet(){
        return 0.8* getSalaireBrut();
    }



    public Employe(int num, String numSecu, String nom, String prenom, int echelon,
                   LocalDate dateDeNaissance, LocalDate dateEmbauche,double base, double nbHeures ) {
        this.num = num;
        this.numSecu = numSecu;
        this.nom = nom;
        this.prenom = prenom;
        this.echelon = echelon;
        this.dateDeNaissance = dateDeNaissance;
        this.dateEmbauche = dateEmbauche;
        this.base = base;
        this.nbHeures = nbHeures;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNumSecu() {
        return numSecu;
    }

    public void setNumSecu(String numSecu) {
        this.numSecu = numSecu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getEchelon() {
        return echelon;
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
}



