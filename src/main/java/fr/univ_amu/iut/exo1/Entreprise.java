package fr.univ_amu.iut.exo1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

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

    public void distribuerBonus(double bonus){
        Comparator<Employe> comparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                if (e1.getAnciennete() < e2.getAnciennete()) {
                    return 1;
                }
                return 0;
            }
        };

        PriorityQueue<Employe> listeAnciennete = new PriorityQueue<Employe>(employes.size(),comparator);

        listeAnciennete.addAll(employes);

        while(bonus>0 && !listeAnciennete.isEmpty()) {
            Employe courant = listeAnciennete.poll();
            double bonusPotentiel = 10 *courant.getAnciennete();

            if( bonusPotentiel < bonus ){
                System.out.println(courant.getPrenom() + " gagne " + bonusPotentiel + "en bonus !");
                bonus -= bonusPotentiel;
            }
            else if(bonus>0){
                System.out.println(courant.getPrenom() + " gagne le reste" + bonus + "en bonus !");
                bonus =0;

            }
        }
    }




}


