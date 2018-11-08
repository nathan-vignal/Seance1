package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class GestionEntreprises {
    public static void main(String[] args) {
        Employe bernard = new Employe(123,"1","FAMILLE","bernard",1,
                LocalDate.of(1999, Month.OCTOBER, 8),LocalDate.of(2017, Month.OCTOBER,
                5),7.60,35);
        Employe sara = new Employe(456,"2","FAMILLE","sara",2,
                LocalDate.of(1995, Month.OCTOBER, 20),LocalDate.of(2017, Month.OCTOBER,
                5),7.60,35);


        Entreprise entreprise = new Entreprise("nasa",new ArrayList<Employe>());
        entreprise.ajouterEmploye(bernard);
        entreprise.ajouterEmploye(sara);
        System.out.println(entreprise);




    }
}