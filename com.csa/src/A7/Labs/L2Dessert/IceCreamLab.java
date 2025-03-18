package A7.Labs.L2Dessert;

import A7.Labs.L2Dessert.Dessert;
import A7.Labs.L2Dessert.IceCreamShop;
import java.util.Scanner;

public class IceCreamLab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of your ice cream shop:");
        String name = scan.nextLine();
        IceCreamShop shop = new IceCreamShop(name);

        int sel = 0;
        while (sel >= 0 && sel <= 6) {
            System.out.print("\n-Zom Menu-\n1. View Shop's Menu\n2. Add / Change Menu Item 1\n3. Add / Change Menu Item 2\n4. Add / Change Special\n5. Sale\n6. Exit\nEnter selection:\n\n");
            sel = scan.nextInt();
            if (sel == 1) {
                System.out.println(shop.toString());
                continue;
            }
            if (sel == 2) {
                System.out.println("Enter menu item 1..");
                System.out.print("Enter the item's Name: \n");
                scan.nextLine();
                String itemName = scan.nextLine();

                System.out.print("Enter the item's container type (0-Cone/1-Bowl/2-Waffle Cone): \n");
                int container = scan.nextInt();
                scan.nextLine();

                System.out.print("Enter the item's flavor: \n");
                String flavor = scan.nextLine();

                System.out.print("Enter the item's toppings: \n");
                String topps = scan.nextLine();

                System.out.print("Enter the item's cost: \n");
                double cost = scan.nextDouble();

                Dessert d1 = new Dessert(itemName, container, flavor, topps, cost);
                shop.setMenuItem1(d1);
                continue;
            }
            if (sel == 3) {
                System.out.println("Enter menu item 2..");
                System.out.print("Enter the item's Name: \n");
                scan.nextLine();
                String itemName = scan.nextLine();

                System.out.print("Enter the item's container type (0-Cone/1-Bowl/2-Waffle Cone): \n");
                int container = scan.nextInt();
                scan.nextLine();

                System.out.print("Enter the item's flavor: \n");
                String flavor = scan.nextLine();

                System.out.print("Enter the item's toppings: \n");
                String topps = scan.nextLine();

                System.out.print("Enter the item's cost: \n");
                double cost = scan.nextDouble();

                Dessert d2 = new Dessert(itemName, container, flavor, topps, cost);
                shop.setMenuItem2(d2);
                continue;
            }
            if (sel == 4) {
                System.out.println("Enter menu item special..");
                System.out.print("Enter the item's Name: \n");
                scan.nextLine();
                String itemName = scan.nextLine();

                System.out.print("Enter the item's container type (0-Cone/1-Bowl/2-Waffle Cone): \n");
                int container = scan.nextInt();
                while (container < 0 || container > 2) {
                    System.out.print("Enter the item's container type (0-Cone/1-Bowl/2-Waffle Cone): \n");
                    container = scan.nextInt();
                }
                scan.nextLine();

                System.out.print("Enter the item's flavor: \n");
                String flavor = scan.nextLine();

                System.out.print("Enter the item's toppings: \n");
                String topps = scan.nextLine();

                System.out.print("Enter the item's cost: \n");
                double cost = scan.nextDouble();

                Dessert s = new Dessert(itemName, container, flavor, topps, cost);
                shop.setSpecial(s);
                continue;
            }
            if ((sel == 5) && (shop.getMenuItem1() != null)) {
                System.out.println(shop.getMenuItem1());
                System.out.print("Enter the new price for the above item: \n");
                double cost1 = scan.nextDouble();
                shop.getMenuItem1().setCost(cost1);

                System.out.println(shop.getMenuItem2());
                System.out.print("Enter the new price for the above item: \n");
                double cost2 = scan.nextDouble();
                shop.getMenuItem2().setCost(cost2);

                System.out.println(shop.getSpecial());
                System.out.print("Enter the new price for the above item: \n");
                double costS = scan.nextDouble();
                shop.getSpecial().setCost(costS);
                continue;
            }
            if (sel == 6) {
                System.out.print("Goodbye.");
                break;
            } else {
                System.out.println("You must first add items to the menu.");
            }
        }
    }
}
      