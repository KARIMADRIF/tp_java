package td3;

import java.util.Scanner;
import java.util.Random;

public class bonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int nombreSecret = rand.nextInt(10) + 1;
        int tentative = 0;
        int choix;

        do {
            System.out.print("Devinez le nombre (1-10) : ");
            choix = sc.nextInt();
            tentative++;

            if (choix < nombreSecret) {
                System.out.println("Plus grand");
            } else if (choix > nombreSecret) {
                System.out.println("Plus petit");
            } else {
                System.out.println("Bravo !");
            }

        } while (choix != nombreSecret);

        System.out.println("Nombre de tentatives : " + tentative);

        int score = 100 - (tentative - 1) * 10;
        if (score < 0) score = 0;

        System.out.println("Score : " + score);

        
    }}
