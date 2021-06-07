import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */


public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double men = 0.73;
        final double women = 0.66;
        final double con = 5.14;
        final double constant = .015;
        final double legal = 0.08;

        //Prevent the user from entering non-numeric values.

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        int b;
        while (true) {
            try {
                String gender = in.nextLine();
                b = Integer.parseInt(gender);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid Input, try again: ");
            }
        }


        System.out.print("How many ounces of alcohol did you have? ");

        int a;
        while (true) {
            try {
                String alc = in.nextLine();
                a = Integer.parseInt(alc);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid Input, try again: ");
            }
        }

        System.out.print("Enter your weight, in pounds: ");
        int w;
        while (true) {
            try {
                String weight = in.nextLine();
                w = Integer.parseInt(weight);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid Input, try again: ");
            }
        }

        System.out.print("How many hours has it been since your last drink? ");

        int h;
        while (true) {
            try {
                String hours = in.nextLine();
                h = Integer.parseInt(hours);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid Input, try again: ");
            }
        }

        double alcohol = a * con;
        double male = w * men;
        double female = w * women;
        double hour = constant * h;

        if(b == 1){
            double m = alcohol / male;
            double fin = m - hour;
        if (fin >= legal){
            System.out.print("Your BAC is " + fin + "\nIt is not legal for you to drive.");
        }if (fin < legal){
            System.out.print("Your BAC is " + fin + "\nIt is legal for you to drive.");
            }
        }
        if(b == 2){
            double f = alcohol / female;
            double bac = f - hour;
        if (bac >= legal){
            System.out.print("Your BAC is " + bac + "\nIt is not legal for you to drive.");
        }if (bac < legal){
                System.out.print("Your BAC is " + bac + "\nIt is legal for you to drive.");
            }
        }
    }
}

