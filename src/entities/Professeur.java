package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professeur extends Personne {
    private Grade grade;
    private List<String> matieres = new ArrayList<>();


    public Professeur() {
    }

    public Professeur(Grade grade, List<String> matieres) {
        this.grade = grade;
        this.matieres = matieres;
    }

    public Professeur(String nom, String prenom, int age, Grade grade, List<String> matieres) {
        super(nom, prenom, age);
        this.grade = grade;
        this.matieres = matieres;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public List<String> getMatieres() {
        return matieres;
    }

    public void setMatieres(List<String> matieres) {
        this.matieres = matieres;
    }

    public void saisieProf(){
        Scanner scan = new Scanner(System.in);
        saisieP();
        int choice,nbMatieres;
        do {
            System.out.println("Donner le grade");
            System.out.println("0- TECHNICIEN");
            System.out.println("1- INGENIEUR");
            System.out.println("2- DOCTEUR");
            System.out.println("Faites votre choix");
            choice= scan.nextInt();
        }while (choice<0 && choice>2);
        switch (choice){
            case 0:
                grade=Grade.TECHNICIEN;

            case 1:
                grade=Grade.INGENIEUR;

            case 2:
                grade= Grade.DOCTEUR;

        }

        do {
            System.out.println("Donner le nombre de matiere:");
            nbMatieres = scan.nextInt();

        }while(nbMatieres<0 || nbMatieres>5);
        for (int i = 0; i < nbMatieres; i++) {
            System.out.println(" entrer la Matiere:" + (i+1));
            String mat = scan.nextLine();
            scan.nextLine();
            matieres.add(mat);
        }
    }
    public void afficheProf(){
        afficheP();
        System.out.println("Grade:" + grade);
        System.out.println("Matieres:");
        for (String mat : matieres){
            System.out.print(mat.toUpperCase() + "\t");
        }
    }
}
