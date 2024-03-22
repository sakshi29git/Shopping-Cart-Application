package ArrayList_assign;

import java.util.Scanner;

public class Product {
    int product_id, cost, qty, tcost = 1, avq = 10;
    String pname;
    Scanner sc = new Scanner(System.in);

    Product() {
        System.out.println("Enter product details: ");
        System.out.println("Below are the list of product: ");
        System.out.println("Please click on one product: ");
        System.out.println("1. Watch \n2.Sandals \n3.Trousers \n4.Formals\n5.Stationary");
        System.out.println("Enter product name: ");
        pname = sc.next();
        pname = pname.toUpperCase();
        if (!pname.equals("WATCH") && !pname.equals("SANDALS") && !pname.equals("TROUSERS") && !pname.equals("FORMALS") && !pname.equals("STATIONARY")) {
            System.out.println("Please enter product from cart only");
            return;
        } else {
            System.out.println("Thanks for adding product name");
        }

        if (pname.equals("WATCH")) {
            cost = 1000;
            product_id = 1;
            System.out.println("Available Stock: " + avq);
        } else if (pname.equals("SANDALS")) {
            cost = 500;
            product_id = 2;
            System.out.println("Available Stock: " + avq);
        } else if (pname.equals("TROUSERS")) {
            cost = 700;
            product_id = 3;
            System.out.println("Available Stock: " + avq);
        } else if (pname.equals("FORMALS")) {
            cost = 1200;
            product_id = 4;
            System.out.println("Available Stock: " + avq);
        } else if (pname.equals("STATIONARY")) {
            cost = 100;
            product_id = 5;
            System.out.println("Available Stock: " + avq);
        } else {
            System.out.println("Wrong product");
            return;
        }

        System.out.println("Enter product quantity: ");
        qty = sc.nextInt();
        if (qty > avq) {
            System.out.println("Sorry required quantity is not available at this time");
            return;
        } else {
            avq = avq - qty; // Update avq only if the product is available
        }
        
    }

    void product_cart() {
        System.out.println("Product Id: " + product_id);
        System.out.println("Productname: " + pname);
        System.out.println("Cost per product: " + cost);
        tcost = cost * qty;
        if (tcost > 1500) {
            int dis = 1;
            dis = (int) (tcost * 0.10f);
            tcost = tcost - dis;
            System.out.println("Congratulations....You have got 10% discount on your shopping");
        } else {
            System.out.println("No discount applied");
        }
        System.out.println("Available stock: " + avq + " pieces");
        System.out.println("Qty: " + qty);
        System.out.println("Cost to be paid: " + tcost);
    }
}
