package com.company;

import java.util.Scanner;

public class Main {
    static Compte acc = new Compte("1512", "Douglas", "15/12/2001", 5000);


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bonjour, USER sur votre ATM");
        System.out.println("Choisir un choix en entrant un nombre");
        System.out.println("-------------------------------------");
        System.out.println("1: Retirer de l'argent");
        System.out.println("2: Modifier un compte");
        System.out.println("3: Mon compte");
        int codeSwitch = sc.nextInt();
        switch (codeSwitch){
            case 1:
                System.out.println("1: Vous avez choisi de retirer de l'argent");
                break;
            case 2:
                System.out.println("2: Vous avez choisi de Modifier un compte");
                AccountModify();
                break;
            case 3:
                System.out.println("3: Vous avez choisi mon compte");
                break;
            default:
                System.out.println("Fin");
        }

    }

    public static void AccountCheck(){
        System.out.println("User: " + acc.getmUser());
        System.out.println("Date du compte: " + acc.getmDateUser() );
        System.out.println("code User: " + acc.getmCodeUser());
        System.out.println("Argent sur le compte: " + acc.getmArgentUser());
    }
    public static void AccountModify(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Modifier le User");
        String user = sc.next();
        acc.setmUser(user);
        System.out.println("Voici le nouveau User: " + acc.getmUser());
    }
}
