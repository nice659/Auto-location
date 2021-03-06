package sn.Illoki;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private String nom;
    private String prenom;
    private  String Date_Reservation;
    private String Date_Retour;
    public static void main(String[] args) {

        System.out.println("Bienvenue sur l AUTO location");
        System.out.println("> l lister les prestations ");
        Scanner scanner = new Scanner(System.in);
        String menu = scanner.next();
        if ("l".equalsIgnoreCase(menu))
        {
            System.out.println(" > R Rechercher une voiture par sa marque ");
            System.out.println("reservation d une voiture");
            String Rechercher = scanner.next();

            if("R".equalsIgnoreCase(Rechercher))
            {
                System.out.println("> 1 BMW");
                System.out.println("> 2 BMW");
                System.out.println("> 3 BMW");
                String BMW = scanner.next();
                if ("1".equalsIgnoreCase(BMW))
                {
                    System.out.println("Marque: BMW Model:C5 type:Diesel");
                }
                if ("2".equalsIgnoreCase(BMW))
                {
                    System.out.println("Marque: BMW Model:Double moteur type:Gazoil");
                }
                else
                {
                    System.out.println("Marque: BMW Model:Double moteur type:Gazoil  tres belle voiture ");
                }
            }
            else
            {
                System.out.println("cette voiture n existe pas dans notre garage");
            }
            System.out.println("Reserver");
            System.out.println("> r Remplir cette formulaire");
            String reserver = scanner.next();
            if ("r".equalsIgnoreCase(reserver))
            {
                System.out.println("sasir votre nom svp");
                String nom = scanner.next();
                System.out.println("sasir votre prenom svp");
                String prenom = scanner.next();
                System.out.println("saisir votre la date de location");
                String Date_Reservation = scanner.next();
                System.out.println("sasir la date de retour de la voiture");
                String Date_Retour = scanner.next();
                System.out.println("merci beaucoup veillez vous rapprocher de l'agence pour confimer votre reservation");
            }
            else
            {
                System.out.println("erreur veillez appuyer r pour renseigner votre identite svp");
            }

            


        }
        else
        {
            System.out.println("choix inconnu");
        }

    }
}
