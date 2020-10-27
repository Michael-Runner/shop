package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List <Goods> market = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        String name;
        int quantity;
        int price;
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter name of product: ");
            name = scanner.next();
            quantity = rnd.nextInt(11);
            price = rnd.nextInt(101);
            market.add(new Goods(name, quantity, price));
        }

        List <Goods> cart = new ArrayList<>();

        byte menu;
        int subtotal = 0;
        do{
            System.out.println("Enter name of product what you are looking for: ");
            name = scanner.next();

            byte checker = 0;
            for(int i = 0; i<market.size(); i++)
            {
                if(market.get(i).getName().contains(name) && market.get(i).getQuantity() > 0)
                {
                    cart.add(new Goods(market.get(i).getName(), 1, market.get(i).getPrice()));
                    market.get(i).setQuantity(market.get(i).getQuantity()-1);
                    subtotal = subtotal + market.get(i).getPrice();
                    checker++;
                    System.out.println("Product successfully added!!!");
                    System.out.println("it cost you " + market.get(i).getPrice());
                    System.out.println("There are " + market.get(i).getQuantity() + " " + market.get(i).getName() + " left");
                }
            }
            if(checker == 0)
            {
                System.out.println("Sorry, but this product doesn't exist...");
            }

            System.out.println("Do you want to continue? (Y-1 | N-0)");
            menu = scanner.nextByte();

        }while(menu != 0);

        System.out.println("Subtotal: " + subtotal);
    }
}
/*
Я использую список, так как в данном задании не важен порядок размещения элементов.
 */
