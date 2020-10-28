package shop;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List <Goods> market = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        market.add(new Goods("tomato", 5, 10));
        market.add(new Goods("door", 3, 15));
        market.add(new Goods("guitar", 3, 20));

        List <Goods> cart = new ArrayList<>();

        String name;
        byte menu;
        int total = 0;
        do{
            System.out.println("Enter name of product what you are looking for: ");
            name = scanner.next();

            Goods tmp = new Goods(name, 0, 0);

            if(market.contains(tmp)) {
                int i = market.indexOf(tmp);
                cart.add(new Goods(market.get(i).getName(), 1, market.get(i).getPrice()));
                market.get(i).quantityMinus();
                System.out.println("Product successfully added!!!");
                System.out.println("it cost you " + market.get(i).getPrice());
                System.out.println("There are " + market.get(i).getQuantity() + " " + market.get(i).getName() + " left");
                total = total + market.get(i).getPrice();
            }
            else {
                System.out.println("Sorry, there is no product like this...");
            }

            System.out.println("Do you want to continue? (Y-1 | N-0)");
            menu = scanner.nextByte();

        }while(menu != 0);

        System.out.println("Total: " + total);
    }
}

/*
Я использую список, так как в данном задании не важен порядок размещения элементов.
 */