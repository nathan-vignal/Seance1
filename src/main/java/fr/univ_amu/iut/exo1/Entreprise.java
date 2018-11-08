package fr.univ_amu.iut.exo1;

import java.util.ArrayList;

public class Entreprise {
    private String nom;
    private ArrayList<Employe> employes;

    public Entreprise(String nom, ArrayList<Employe> employes) {
        this.nom = nom;
        this.employes = employes;
    }

    public String toString(){
        String string = nom + "\n";

        for(Employe employe: employes ){
            string +="\n\n" +employe;
        }
        return string;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(ArrayList<Employe> employes) {
        this.employes = employes;
    }

    public void ajouterEmploye(Employe employe){
        employes.add(employe);

    }
    public void surpprimerEmploye(Employe employe){
        employes.remove(employe);

    }
}
