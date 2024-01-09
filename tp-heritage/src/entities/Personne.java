package entities;

import java.util.Scanner;

public class Personne {
    protected String nom,prenom;
    protected int age;

    public Personne() {

    }

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void saisieP(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Donner le nom");
        nom = scan.nextLine();
        System.out.println("Donner le prenom");
        prenom = scan.nextLine();
        do {
            System.out.println("Donner l'age");
            age = scan.nextInt();
        }while(age<0);
    }
     public void afficheP(){
         System.out.println("Nom:" + nom.toUpperCase());
         System.out.println("Prenom:" + prenom.toUpperCase());
         System.out.println("Age:" + age + "ans");
     }
}
