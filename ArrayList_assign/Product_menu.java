package ArrayList_assign;

import java.util.ArrayList;
import java.util.Scanner;

public class Product_menu {
	public static void main(String[] args) {
		ArrayList<Product> obj=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		Product_det op=new Product_det();
		String name;
		Double mob = null;
		
		int choice;
		System.out.println("Enter your name please: ");
		name=sc.next();
		System.out.println("Enter your mobile number: ");
		mob=sc.nextDouble();
		if(mob instanceof Double)
		{System.out.println("Registration done sucessfully....");
		}
		else {
			System.out.println("Please enter valid number");
		}
		
		System.out.println("Wlecome " + name + " to Shopping.com");
		
		
		do {
			System.out.println();
			System.out.println("Please select any one option");
			System.out.println("1. Show Product");
			System.out.println("2. Add to cart");
			System.out.println("3. Search Product");
			System.out.println("4. Remove Product");
			System.out.println("5. Check wheather your cart is empty or not");
			System.out.println("6. See cart");
			System.out.println("7. Buy product");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println();
				op.show_product();
				break;
				
			case 2:
				System.out.println();
				obj=op.add_cart();
				break;
				
			case 3:
				System.out.println();
				op.search_pro(obj);
				break;
				
			case 4:
				System.out.println();
				op.serarch_remove(obj);
				break;
				
			case 5:
				System.out.println();
				op.empty_cart(obj);
				break;
				
			case 6:
				System.out.println();
				op.show_cart(obj);
				break;
				
			case 7:
				System.out.println();
				op.buy_product(obj);
				break;
				
			case 8:
				System.out.println();
				System.out.println("Exit");
				break;
				
			default:
				System.out.println();
				System.out.println("Wrong choice");
				
				
			}
		}while(choice!=8);

	}
}
