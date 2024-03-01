package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Witamy na imprezie integracyjnej! jak masz na imię? \n");
        Scanner scanner = new Scanner(System.in);
        String name;
        name = scanner.nextLine();


        if (name.equals("Donald"))
        {
            System.out.println("Jesteś rudy " + name + "\n" + "Nie masz zaproszenia");
        }
        else
        {
            System.out.println("Witamm " + name + "\n" + "Życzymy miłej zabawy");
        }

    }
}