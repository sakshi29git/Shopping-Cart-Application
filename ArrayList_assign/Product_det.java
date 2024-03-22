package ArrayList_assign;

import java.util.ArrayList;
import java.util.Scanner;

public class Product_det {
	int tot=0;
	ArrayList<Product> obj=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	ArrayList<Product> add_cart()
	{
		System.out.println("Add Product in cart");
		Product op=new Product();
		obj.add(op);
		return obj;
	}
	
	void empty_cart(ArrayList<Product> obj)
	{
		if(obj.isEmpty()) {
			System.out.println("Sorry can't remove/display product...cart is empty");
			return;
		}
		
		else {
			System.out.println("Your cart is not empty");
		}
	}
	
	
	void serarch_remove(ArrayList<Product> obj)
	{
		int n = 0;
		String name;
		boolean found=false;
		System.out.println("Enter Product name:");
		name=sc.next();
		name=name.toUpperCase();
		for(Product ele : obj)
		{
			if(ele.pname.equals(name))
			{
				n=obj.indexOf(ele);
				found=true;
				
			}
		}
		
		if(found)
		{
			obj.remove(n);
			tot--;
			System.out.println("Product removed sucessfully....");
		}
		
		else {
			System.out.println("Cant find product....");
		}
		
	}
	
	void search_pro(ArrayList<Product> obj)
	{
		String name;
		int count=0;
		boolean found=false;
		System.out.println("Enter Product name:");
		name=sc.next();
		name=name.toUpperCase();
		for(Product ele : obj)
		{
			if(ele.pname.equals(name))
			{
				ele.product_cart();
				count++;
				
			}
		}
		
		if(count==0)
		{
				System.out.println("Cant find product....");
			
		}
		
		
	}
	
void show_cart(ArrayList<Product> obj)
{
	int i=1;
	boolean found=false;
	for(Product ele:obj)
	{
		System.out.println("Product " + i + ": ");
		ele.product_cart();
		i++;
		
		found=true;
	}
	if(found)
	{
		tot=obj.size();
		System.out.println("Total products in cart: " + tot);
	}
	else {
		System.out.println("Your cart is empty");
	}
	
	
}

void buy_product(ArrayList<Product> obj)

{
	String name,upi;
	int pay, m = 0,op,n=0;
	
	if(obj.size()==1)
	{
		for(Product ele: obj)
		{
			ele.product_cart();
			m=obj.indexOf(ele);
			ele.avq=ele.avq-ele.qty;
		}
		obj.remove(m);
	}
	else if(obj.size()>1){
		System.out.println("Enter name of product you want to buy");
		name=sc.next();
		name=name.toUpperCase();
		for(Product ele: obj)
		{
			if(ele.pname.equals(name))
			{
				ele.product_cart();
				tot--;
				n++;
				m=obj.indexOf(ele);
				ele.avq=ele.avq-ele.qty;
				
			}
		}
		if(n>0)
		{
			System.out.println("Product found");
		}
	
		
	}
	else {
		System.out.println("Please enter correct product");
		return;
	}
	
	
		
		System.out.println("Please choose method of payment");
		System.out.println("1. Phonepe \n2.Cash on Delivery");
		System.out.print("Enter option: ");
		pay=sc.nextInt();
		if(pay==1)
		{
			System.out.println("Pleae enter your upi id: ");
			upi=sc.next();
			System.out.println("Please check your phonepe and do payment of given link...");
			System.out.println("Pleae click belwo option: \n1. Link recieved \n2. Link not recived");
			op=sc.nextInt();
			if(op==1)
			{
				System.out.println("Payment done....");
				System.out.println("Amount is deducted from your account....");
			}
			
			else {
				System.out.println("Wrong upi");
			}
			
		}
		
		else if(pay==2) {
			System.out.println("Please pay amount after delivery of product");
		}
		else {
			System.out.println("Wrong option...Please select correct method of payment");
			return;
		}
		
		
		
	}
	
	


void show_product()
{
	System.out.println("1. Watch \n2.Sandals \n3.Trousers \n4.Formals\n5.Stationary");
}

}
