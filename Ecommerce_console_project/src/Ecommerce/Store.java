package Ecommerce;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import Order.Cart;
import Order.Order;
import Product.Catalog;
import Product.Product;
import Users.Customer;
import Users.Seller;


public class Store {

	public static void main(String[] args) {
		System.out.println("Welcome To the Ecommerce Website");
		System.out.println("Which user are you? 1.Customer  2.Seller  3.Admin");
		Scanner input=new Scanner(System.in);
		int numChoice=input.nextInt();
		String TypeUser;
		if(numChoice==1) {
			TypeUser="Customer";
			Customer customer=new Customer();
			System.out.println("Enter the userId:");
			input.nextLine();
			customer.setUserId(input.nextLine());
			System.out.println("Enter your password:");
			//input.nextLine();
			customer.setPassword(input.nextLine());
			if(customer.VerifyUser()==true) {
				System.out.println("User verified!");
				while(true) {
				System.out.println("Do you want to- 1. View Products 2. View Cart 3. Contact Us 4. Exit");
				numChoice=input.nextInt();
				if(numChoice==1) {
					Catalog catalog=new Catalog();
					System.out.println("Choose the category");
					System.out.println("1. Clothes 2. Electronics 3. Furniture");
					input.nextLine();
					int choice=input.nextInt();
					if(choice==1) {
						System.out.println("Clothes");
						Product[] allProducts1=catalog.getListAllClothes();
						for(int i=0;i<allProducts1.length;i++) {
							System.out.println(allProducts1[i].getProductId()+" "+allProducts1[i].getProductName());
						}
						System.out.println("Do you want to add any products to the Cart? Y/N");	
						input.nextLine();
						char addToCart=input.next().charAt(0);
						if(addToCart=='Y'||addToCart=='y') {
							System.out.println("Enter the product id of the product to add to the cart:");
							input.nextLine();
							String productId1=input.nextLine();
							Product[] cartProducts1=new Product[1];
							for(int i=0;i<allProducts1.length;i++) {
								if(allProducts1[i].getProductId().equals(productId1)) {
									cartProducts1[0]=allProducts1[i];								
								}
							}						
							Cart cart=new Cart();
							cart.setCartId("1");
							cart.setProductList(cartProducts1);
							System.out.println(cartProducts1[0].getProductName());
							customer.setCart(cart);
							System.out.println("The product is successfully added into the cart");
						}
					}
					else if(choice==2) {
						System.out.println("Electronics");
						Product[] allProducts2=catalog.getListAllElectronics();
						for(int i=0;i<allProducts2.length;i++) {
							System.out.println(allProducts2[i].getProductId()+" "+allProducts2[i].getProductName());
						}
						System.out.println("Do you want to add any products to the Cart? Y/N");					
						char addToCart=input.next().charAt(0);
						if(addToCart=='Y'||addToCart=='y') {
							System.out.println("Enter the product id of the product to add to the cart:");
							input.nextLine();
							String productId2=input.nextLine();
							Product[] cartProducts2=new Product[1];
							for(int i=0;i<allProducts2.length;i++) {
								if(allProducts2[i].getProductId().equals(productId2)) {
									cartProducts2[0]=allProducts2[i];								
								}
							}						
							Cart cart=new Cart();
							cart.setCartId("1");
							cart.setProductList(cartProducts2);
							System.out.println(cartProducts2[0].getProductName());
							customer.setCart(cart);
							System.out.println("The product is successfully added into the cart");
						}
					}
					
					else if(choice==3) {
						System.out.println("Furnitures");
						Product[] allProducts3=catalog.getListAllFurniture();
						for(int i=0;i<allProducts3.length;i++) {
							System.out.println(allProducts3[i].getProductId()+" "+allProducts3[i].getProductName());
						}
						System.out.println("Do you want to add any products to the Cart? Y/N");					
						char addToCart=input.next().charAt(0);
						if(addToCart=='Y'||addToCart=='y') {
							System.out.println("Enter the product id of the product to add to the cart:");
							input.nextLine();
							String productId3=input.nextLine();
							Product[] cartProducts3=new Product[1];
							for(int i=0;i<allProducts3.length;i++) {
								if(allProducts3[i].getProductId().equals(productId3)) {
									cartProducts3[0]=allProducts3[i];								
								}
							}						
							Cart cart=new Cart();
							cart.setCartId("1");
							cart.setProductList(cartProducts3);
							System.out.println(cartProducts3[0].getProductName());
							customer.setCart(cart);
							System.out.println("The product is successfully added into the cart");
						}
					}
					else {
						System.out.println("Product Not Found...");
					}
				}
				else if(numChoice==2) {
					Product[] cartProducts=customer.getCart().getProductList();
					System.out.println(customer.getCart().getCartId());
					Cart cart=new Cart();
					cart.setCartId("1");
					customer.setCart(cart);					
					try {
						if((cartProducts.length)>0) {					
							for(int i=0;i<cartProducts.length;i++) {
								System.out.println(cartProducts[i].getProductId()+" "+cartProducts[i].getProductName()+" "+cartProducts[i].getCost());						
							}
						}
					}
					catch(Exception e) {
						System.out.println("Cart is empty");
					}
					System.out.println("Do you want checkout? Y/N");
					input.nextLine();
					char checkOut=input.next().charAt(0);
					if(checkOut=='Y'||checkOut=='y') { 
						if(customer.getCart().checkOut()) {
							Order order=new Order();
							order.setUser(customer);
							order.setOrderId("1");
							System.out.println("Your Order is "+order.getOrderId()+" for the "+order.getUser().getUserId()+" is placed successfully..");
							String customerId=order.getUser().getUserId();
							System.out.println("Creating Receipt");
							try {
								File f=new File(customerId+".txt");
								FileWriter w=new FileWriter(f,true);
								w.write("Your order Id is "+order.getOrderId());
								w.write("\n");
								w.write("For the user "+order.getUser().getUserId());
								w.write("Thank You!!!");
								System.out.println("Receipt Created...");
								w.close();
							}
							catch(IOException ie) {
								System.out.println("Receipt is not created...");
								ie.printStackTrace();
							}
						}
					}
				}
					
				else if(numChoice==3) {
					System.out.println("To contact us, please email on store@ecommerce.com");
				}
				else if(numChoice==4) {
					System.out.println("Exited");
					break;
				}
				else {
					System.out.println("Invalid choice, Try 1 to 4..");
				}
				}	
			}
		}			
		else if(numChoice==2) {//Seller part
			TypeUser="Seller";
			Seller sell=new Seller();
			System.out.println("Enter the Seller id: ");
			input.nextLine();
			sell.setUserId(input.nextLine());
			System.out.println("Enter the Seller Password: ");
			input.nextLine();
			sell.setPassword(input.nextLine());
			if(sell.VerifyUser()==true) {
				System.out.println("Seller verified!");
				while(true) {
				System.out.println("Do you want to 1. View Products 2. Add a product 3. Contact Us 4. Exit");
				numChoice=input.nextInt();
				if(numChoice==1) {
					Catalog catalog=new Catalog();
					System.out.println("Choose the category");
					System.out.println("1. Clothes 2. Electronics 3. Furniture");
					input.nextLine();
					int choice=input.nextInt();
					if(choice==1) {
						System.out.println("Clothes");
						Product[] sellProducts1=catalog.getListAllClothes();
						for(int i=0;i<sellProducts1.length;i++) {
							System.out.println(sellProducts1[i].getSeller()+" - "+sellProducts1[i].getProductId()+" "+sellProducts1[i].getProductName());//with seller information, product is displayed
						}
					}
					else if(choice==2) {
						System.out.println("Electronics");
						Product[] sellProducts2=catalog.getListAllElectronics();
						for(int i=0;i<sellProducts2.length;i++) {
							System.out.println(sellProducts2[i].getSeller()+" - "+sellProducts2[i].getProductId()+" "+sellProducts2[i].getProductName());
						}
					}
					
					else if(choice==3) {
						System.out.println("Furnitures");
						Product[] sellProducts3=catalog.getListAllFurniture();
						for(int i=0;i<sellProducts3.length;i++) {
							System.out.println(sellProducts3[i].getSeller()+" - "+sellProducts3[i].getProductId()+" "+sellProducts3[i].getProductName());
						}
					}
					else {
						System.out.println("Product Not Found...");
					}
				}
			else if(numChoice==2) {
					System.out.println("Do you want to add any products to the Cart? Y/N");	
					input.nextLine();
					char addToCart=input.next().charAt(0);
					if(addToCart=='Y'||addToCart=='y') {
						System.out.println("Choose the category");
						System.out.println("1. Clothes 2. Electronics 3. Furniture");
						input.nextLine();
						int choice=input.nextInt();
						if(choice==1) {	
							System.out.println("Clothes");
							Catalog catalog=new Catalog();
							Product[] allProducts3=catalog.getListAllClothes();
							for(int i=0;i<allProducts3.length;i++) {
								System.out.println(allProducts3[i].getSeller()+" - "+allProducts3[i].getProductId()+" "+allProducts3[i].getProductName());
							}
							System.out.println("Select the product id of the product to add:");
							input.nextLine();
							String sellproductId=input.nextLine();
							Product[] sellerProducts1=catalog.getListAllClothes();
							Product[] sellAddProducts=new Product[1];
					
							for(int i=0;i<sellAddProducts.length;i++) {
								if(sellerProducts1[i].getProductId().equals(sellproductId)) {
									sellAddProducts[0]=sellerProducts1[i];								
								}
								sell.setProductListed(sellAddProducts);
								System.out.println("Product successfully added..");
							}
					
						}
						else if(choice==2) {
							System.out.println("Electronics");
							Catalog catalog=new Catalog();
							Product[] allProducts3=catalog.getListAllElectronics();
							for(int i=0;i<allProducts3.length;i++) {
								System.out.println(allProducts3[i].getSeller()+" - "+allProducts3[i].getProductId()+" "+allProducts3[i].getProductName());
							}
							System.out.println("Select the product id of the product to add:");
							input.nextLine();
							String sellproductId=input.nextLine();
							Product[] sellerProducts1=catalog.getListAllElectronics();
							Product[] sellAddProducts=new Product[1];
					
							for(int i=0;i<sellAddProducts.length;i++) {
								if(sellerProducts1[i].getProductId().equals(sellproductId)) {
									sellAddProducts[0]=sellerProducts1[i];								
								}
								sell.setProductListed(sellAddProducts);
								System.out.println("Product successfully added..");
							}
					
						}
						else if(choice==3) {	
							System.out.println("Furnitures");
							Catalog catlog=new Catalog();
							Product[] allProducts3=catlog.getListAllFurniture();
							for(int i=0;i<allProducts3.length;i++) {
								System.out.println(allProducts3[i].getSeller()+" - "+allProducts3[i].getProductId()+" "+allProducts3[i].getProductName());
							}
							System.out.println("Select the product id of the product to add:");
							input.nextLine();
							String sellproductId=input.nextLine();
							
							Product[] sellerProducts1=catlog.getListAllFurniture();
							Product[] sellAddProducts=new Product[1];
					
							for(int i=0;i<sellAddProducts.length;i++) {
								if(sellerProducts1[i].getProductId().equals(sellproductId)) {
									sellAddProducts[0]=sellerProducts1[i];								
								}
								sell.setProductListed(sellAddProducts);
								System.out.println("Product successfully added..");
							}
					
						}
						else {
							System.out.println("Invalid choice, try 1 to 3");
						}
					}
					else {
						System.out.println("invalid option...");
					}
				}
				else if(numChoice==3) {
						System.out.println("To contact is, please mail to the store@ecommerce.com");
				}
				else if(numChoice==4) {
					System.out.println("Exited...");
					break;
				}
				else{
					System.out.println("Invalid choice...");
				}
			}
			}
		}
		
	else if(numChoice==3) {
			TypeUser="Admin";
			while(true) {			
				System.out.println("Do you want to- 1. View all the Products 2. Exit");
				input.nextLine();
				char choice=input.next().charAt(0);
				if(choice=='1') {
					Catalog cat=new Catalog();
					Product[] adminView=cat.getListAllProducts();
					for(int i=0;i<adminView.length;i++) {
						System.out.println(adminView[i].getProductId()+" "+adminView[i].getProductName()+" "+adminView[i].getCost());
					}
					System.out.println(" ");
					Product[] adminView1=cat.getSellerProducts();
					for(int i=0;i<adminView1.length;i++) {
						System.out.println(adminView1[i].getProductId()+" "+adminView1[i].getProductName()+" "+adminView1[i].getCost()+" - "+adminView1[i].getSeller());
					}
				}
				else if(choice=='2') {
					System.out.println("Exited");
					break;
				}
				else {
						System.out.println("Invalid choice...");
					}
				
			}
		}
			
		else {
			System.out.println("Invalid user! Try again..");
		}	
		
	}

}