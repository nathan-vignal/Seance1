package fr.univ_amu.iut.exo4;
import fr.univ_amu.iut.exo1.*;
import fr.univ_amu.iut.exo2.*;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class GestionEntreprises {
    public static void main(String[] args) {

                Employe bernard = new EmployeOrdinaire(123,"1","FAMILLE","bernard",1,
                        LocalDate.of(1999, Month.OCTOBER, 8),LocalDate.of(2017, Month.OCTOBER,
                        5),7.60,35);
                Employe sara = new Commercial(456,"2","FAMILLE","sara",2,
                        LocalDate.of(1995, Month.OCTOBER, 20),LocalDate.of(2017, Month.OCTOBER,
                        5),7.60,35, 10000,10);
                Employe representant = new Representant(456,"2","FAMILLE","representant",2,
                        LocalDate.of(1995, Month.OCTOBER, 20),LocalDate.of(2017, Month.OCTOBER,
                        5),7.60,35, 10000,10);
                Employe vendeur=  new Vendeur(456,"2","FAMILLE","vendeur",2,
                        LocalDate.of(1995, Month.OCTOBER, 20),LocalDate.of(2017, Month.OCTOBER,
                        5),7.60,35, 10000,10);

                Employe technicien =  new Technicien(456,"2","FAMILLE","technicien",2,
                        LocalDate.of(1995, Month.OCTOBER, 20),LocalDate.of(2017, Month.OCTOBER,
                        5),7.60,35, 10,10);


                Entreprise entreprise = new Entreprise("nasa",new ArrayList<Employe>());
                entreprise.ajouterEmploye(bernard);
                entreprise.ajouterEmploye(sara);
                entreprise.ajouterEmploye(representant);
                entreprise.ajouterEmploye(vendeur);
                entreprise.ajouterEmploye(technicien);
                //System.out.println(entreprise);
                entreprise.distribuerBonus(400);



        // EXO 4 START //////////////////////////////////////////////////////////////////////////
        try {
            //écriture
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("saveEmployes.txt"));
            o.writeObject(entreprise.getEmployes());
            o.close();
            //Lecture
            ObjectInputStream e = new ObjectInputStream(new FileInputStream("saveEmployes.txt"));
            ArrayList<Employe> y = (ArrayList<Employe>) e.readObject();
            e.close();

        /*
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("xxx"));
            o.writeObject(x);
            o.close();
            ObjectInputStream e = new ObjectInputStream(new FileInputStream("xxx"));
            X y = (X)e.readObject();
            e.close();
         */
        } catch (FileNotFoundException e) {
            System.out.println("no file ");
        } catch (IOException e) {
            System.out.println("ça s'est mal passé ");
        } catch (ClassNotFoundException e) {
            System.out.println("class not found");
        }



    }
}