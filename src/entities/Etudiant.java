package entities;

import java.util.Scanner;

public class Etudiant  extends Personne{

    private String matricule;
    private double moyenne;

    public Etudiant(String nom, String prenom, int age, double moyenne) {
        super(nom, prenom, age);
        this.moyenne = moyenne;
        matricule = genererMat();
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    private String genererMat(){
        String mat = nom.charAt(0) + prenom.charAt(prenom.length()-1) +
                nom + "@groupeisi.com";
        return mat.toLowerCase();
    }
    public void saisieEt(){
        Scanner scan = new Scanner(System.in);
        saisieP();
        matricule = genererMat();
        do {
            System.out.println("Donner la moyenne");
            moyenne = scan.nextDouble();
        }while(moyenne<0 && moyenne>20);
    }
    public void afficheEt(){
        afficheP();
        System.out.println("Matricule: " + matricule);
        System.out.println("Moyenne: " + moyenne);
    }
}

