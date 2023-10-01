package advisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String[] in = input.split(" ");
            if (in[0].equalsIgnoreCase("exit")) {
                exit();
                break;
            } else {
                commandHandler(in);
            }
        }


    }

    static void commandHandler(String[] in) {
        switch (in[0]) {
            case "featured":
                featured();
                break;
            case "new":
                newRelease();
                break;
            case "categories":
                categories();
                break;
            case "playlists":
                playlists(in[1]);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    public static void featured() {
        System.out.println("---FEATURED---");
        System.out.println("""
                Mellow Morning
                Wake Up and Smell the Coffee
                Monday Motivation
                Songs to Sing in the Shower
                """);
    }

    public static void newRelease() {
        System.out.println("---NEW RELEASES---");
        System.out.println("""
                Mountains [Sia, Diplo, Labrinth]
                Runaway [Lil Peep]
                The Greatest Show [Panic! At The Disco]
                All Out Life [Slipknot]
                """);
    }

    public static void categories() {
        System.out.println("---CATEGORIES---");
        System.out.println("""
                Top Lists
                Pop
                Mood
                Latin
                """);
    }

    public static void playlists(String category) {
        System.out.println("---" + category.toUpperCase() + " PLAYLISTS---");

        if(category.equalsIgnoreCase("mood")) {
            System.out.println("""
                Walk Like A Badass
                Rage Beats
                Arab Mood Booster
                Sunday Stroll
                """);
        }

    }

    public static void exit() {
        System.out.println("---GOODBYE!---");
    }


}







/*
playlists Mood
---MOOD PLAYLISTS---
Walk Like A Badass
Rage Beats
Arab Mood Booster
Sunday Stroll

 */