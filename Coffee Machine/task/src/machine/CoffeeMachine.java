package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int qtyWater = 400;
    public static int qtyMilk = 540;
    public static int qtyCoffee = 120;
    public static int qtyCup = 9;
    public static int money = 550;
    public static String str = null;

    public static void main(String[] args) {


        System.out.println("Write action (buy, fill, take, remaining, exit):");
        Scanner scanner = new Scanner(System.in);
        String inputOption = scanner.next();
        if (inputOption.equals("remaining")) {
            System.out.println("The coffee machine has:");
            System.out.println(qtyWater + " of water");
            System.out.println(qtyMilk + " of milk");
            System.out.println(qtyCoffee + " of of coffee beans");
            System.out.println(qtyCup + " of disposable cups");
            System.out.println("$" + money + " of money\n");
            main(args);
        } else if (inputOption.equals("buy")) {
            System.out.println("What do you want to buy? " +
                    "1 - espresso, 2 - latte, 3 - cappuccino, " +
                    "back - to main menu:");
            String orderMenu = scanner.next();
            if (orderMenu.equals("1")) {
                if (qtyWater < 250) {
                    str = "water";
                    System.out.println("Sorry, not enough " + str + " !\n");
                    main(args);
                } else if (qtyCoffee < 16) {
                    str = "coffee beans";
                    System.out.println("Sorry, not enough " + str + " !\n");
                    main(args);
                } else if (qtyCup < 1) {
                    str = "disposable cups";
                    System.out.println("Sorry, not enough " + str + " !\n");
                    main(args);
                } else {
                    System.out.println("I have enough resources, making you a coffee!\n");

                    qtyWater -= 250;
                    qtyMilk -= 0;
                    qtyCoffee -= 16;
                    qtyCup -= 1;
                    money += 4;
                    main(args);
                }
            } else if (orderMenu.equals("2")) {
                if (qtyWater < 350) {
                    str = "water";
                    System.out.println("Sorry, not enough " + str + " !");
                    main(args);
                } else if (qtyCoffee < 20) {
                    str = "coffee beans";
                    System.out.println("Sorry, not enough " + str + " !");
                    main(args);
                } else if (qtyMilk < 75) {
                    str = "milk";
                    System.out.println("Sorry, not enough " + str + " !");
                    main(args);
                } else if (qtyCup < 1) {
                    str = "disposable cups";
                    System.out.println("Sorry, not enough " + str + " !");
                    main(args);
                } else {
                    System.out.println("I have enough resources, making you a coffee!");

                    qtyWater -= 350;
                    qtyMilk -= 75;
                    qtyCoffee -= 20;
                    qtyCup -= 1;
                    money += 7;
                    main(args);
                }
            } else if (orderMenu.equals("3")) {
                if (qtyWater < 200) {
                    str = "water";
                    System.out.println("Sorry, not enough " + str + " !\n");
                    main(args);
                } else if (qtyCoffee < 12) {
                    str = "coffee beans";
                    System.out.println("Sorry, not enough " + str + " !\n");
                    main(args);
                } else if (qtyMilk < 100) {
                    str = "milk";
                    System.out.println("Sorry, not enough " + str + " !\n");
                    main(args);
                } else if (qtyCup < 1) {
                    str = "disposable cups";
                    System.out.println("Sorry, not enough " + str + " !\n");
                    main(args);
                } else {
                    System.out.println("I have enough resources, making you a coffee!\n");

                    qtyWater -= 200;
                    qtyMilk -= 100;
                    qtyCoffee -= 12;
                    qtyCup -= 1;
                    money += 6;
                    main(args);
                }

            } else if (orderMenu.equals("back")) {
                main(args);
            }


        } else if (inputOption.equals("fill")) {
            System.out.println("Write how many ml of water do you want to add:");
            qtyWater += scanner.nextInt();
            System.out.println("Write how many ml of milk do you want to add:");
            qtyMilk += scanner.nextInt();
            System.out.println("Write how many grams of coffee beans do you want to add:");
            qtyCoffee += scanner.nextInt();
            System.out.println("Write how many disposable cups of coffee do you want to add:");
            qtyCup += scanner.nextInt();
            main(args);
        } else if (inputOption.equals("take")) {
            System.out.println("\nI gave you $" + money + "\n");
            money = 0;
            main(args);
        }
    }
}

