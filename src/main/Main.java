package main;

import entities.Professeur;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Professeur> profs = new ArrayList<>();
        int N, nb=0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Donner le nombre de professeur:");
            N = scanner.nextInt();
        }while(N<0);
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            System.out.println("Prof: " + (i+1));
            Professeur p = new Professeur();
            p.saisieProf();
            profs.add(p);
        }
        System.out.println("la liste des professeurs");
        for (int i = 0; i < profs.size(); i++) {
            profs.get(i).afficheProf();
            if(profs.get(i).getMatieres().contains("Java"))
                nb++;
        }
        System.out.println("\t"+"Nombre de professeurs dispensant Java: " + nb);
    }
}