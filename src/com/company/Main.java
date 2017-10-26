package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String tabAns="y";

        Browser browser = new Browser();
        System.out.println("enter browser name?");
        String browserName = keyboard.nextLine();

        if(!browserName.equalsIgnoreCase("Internet Explorer")) {
            browser.setName(browserName);
            do {

                if (tabAns.equalsIgnoreCase("y")) {
                    Tab tab = new Tab();
                    System.out.println("enter a tab title?");
                    tab.setTitle(keyboard.nextLine());

                    System.out.print("enter tab url?");
                    tab.setUrl(keyboard.nextLine());

                    browser.addTab(tab);
                }

                System.out.println("do you want to enter other tab? (y/n)");
                tabAns = keyboard.next();
                keyboard.nextLine();

            } while (!tabAns.equalsIgnoreCase("n"));

            System.out.println(browser.toString());
        }else {
        System.out.println("Use a different browser!");
        }


    }
}
