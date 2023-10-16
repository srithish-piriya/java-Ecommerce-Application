/**
 * 
 */
package com.gqt.OnlineShopping.project;
import java.util.Scanner;

/**
 * 
 *
 */
public class Homepage {

	/**
	 * main Method 
	 * @param args
	 */        
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("\t \t Welcome to Online Shopping");
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println(" Enter your choice:\n"+
				"1.Home Decors \n"+
				"2.Electronics \n"+
				"3.Fashion \n"+
				"4.Instamart \n"+
				"5.Sports \n"+
				"6.Exit \n");
		int Choice=sc.nextInt();
		int key;
		// TODO Auto-generated method stub
		switch(Choice) {
		case 1:{
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("Home Decors:");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("What are you looking for??:");
			System.out.println();
			System.out.println(HomeDecors.options);
			int choice2 =sc.nextInt();
			switch(choice2) {
			case 1:{
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Furnitures:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(HomeDecors.fu_options);
				key=sc.nextInt();
				if(key==1) {
					System.out.println(HomeDecors.dfuOne);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                       "+HomeDecors.fuOne);
						System.out.println();
						System.out.println("Product Price                                      30000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(HomeDecors.fuOne + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}


				}
				else {
					System.out.println(HomeDecors.dfuTwo);
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                       "+HomeDecors.fuTwo);
						System.out.println();
						System.out.println("Product Price                                      7000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(HomeDecors.fuTwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}


				}

				break;	
			}
			case 2:{
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Blankets:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(HomeDecors.Bl_options);
				key=sc.nextInt();
				if(key==1) {
					System.out.println(HomeDecors.dblOne);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                       "+HomeDecors.blOne);
						System.out.println();
						System.out.println("Product Price                                      3000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(HomeDecors.blOne + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}



				}
				else {
					System.out.println(HomeDecors.dblTwo);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                       "+HomeDecors.blTwo);
						System.out.println();
						System.out.println("Product Price                                      3500/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(HomeDecors.blTwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}

				}
				break;	
			}
			case 3:{
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Carpets:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(HomeDecors.ca_options);
				key=sc.nextInt();
				if(key==1) {
					System.out.println(HomeDecors.dcaOne);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                       "+HomeDecors.caOne);
						System.out.println();
						System.out.println("Product Price                                      2000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(HomeDecors.caOne + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}

				}
				else {
					System.out.println(HomeDecors.dcaTwo);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                       "+HomeDecors.caTwo);
						System.out.println();
						System.out.println("Product Price                                      2000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(HomeDecors.caTwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}


					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}
				}
				break;	
			}
			case 4:{
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Kitchen Decors:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(HomeDecors.kOptions);
				key=sc.nextInt();
				if(key==1) {

					System.out.println(HomeDecors.dkOne);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                       "+HomeDecors.dkOne);
						System.out.println();
						System.out.println("Product Price                                      1000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(HomeDecors.dkOne + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}


				}
				else {
					System.out.println(HomeDecors.dkTwo);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                       "+HomeDecors.dkTwo);
						System.out.println();
						System.out.println("Product Price                                      5000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(HomeDecors.dkTwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}

				}
				break;	
			}

			}
			break;

		}
		case 2:{
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("Electronics:");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("What are you looking for??:");
			System.out.println();
			System.out.println(Electronics.options);
			int choice3 =sc.nextInt();
			switch(choice3) {
			case 1:{
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Mobiles:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(Electronics.opt_mobile);
				key=sc.nextInt();
				if(key==1) {
					System.out.println(Electronics.dmbOne);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                       "+Electronics.mbOne);
						System.out.println();
						System.out.println("Product Price                                      80000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Electronics.mbOne + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}


				}
				else {
					System.out.println(Electronics.dmbOne);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                       "+Electronics.mbTwo);
						System.out.println();
						System.out.println("Product Price                                      150000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Electronics.mbTwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}

				}
				break;	
			}
			case 2:{
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Laptops:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(Electronics.La_options);
				key=sc.nextInt();
				if(key==1) {
					System.out.println(Electronics.dlaOne);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                       "+Electronics.laOne);
						System.out.println();
						System.out.println("Product Price                                      80000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Electronics.laOne + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}


				}
				else {

					System.out.println(Electronics.dlaTwo);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                       "+Electronics.laTwo);
						System.out.println();
						System.out.println("Product Price                                      90000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Electronics.laTwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}

				}
				break;	
			}
			case 3:{
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Mobile Accessories:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(Electronics.Mo_options);
				key=sc.nextInt();
				if(key==1) {

					System.out.println(Electronics.dAccOne);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                       "+Electronics.AccOne);
						System.out.println();
						System.out.println("Product Price                                      1000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Electronics.AccOne + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}


				}
				else {

					System.out.println(Electronics.dAccTwo);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                       "+Electronics.AccTwo);
						System.out.println();
						System.out.println("Product Price                                      500/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Electronics.AccTwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}

				}
				break;	
			}
			case 4:{
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Speakers:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(Electronics.S_options);
				key=sc.nextInt();
				if(key==1) {
					System.out.println(Electronics.dSpOne);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                       "+Electronics.SpOne);
						System.out.println();
						System.out.println("Product Price                                      1000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Electronics.SpOne + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}


				}
				else {

					System.out.println(Electronics.dSpTwo);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                       "+Electronics.SpTwo);
						System.out.println();
						System.out.println("Product Price                                      800/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Electronics.SpTwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}

				}
				break;	
			}
			}
			break;
		}
		case 3:{
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("Fashion:");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("What are you looking for??:");
			System.out.println();
			System.out.println(Fashion.options);
			int choice4 =sc.nextInt();
			switch(choice4) {
			case 1:{
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Men:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(Fashion.opt_Men);
				key=sc.nextInt();
				if(key==1) {
					System.out.println(Fashion.dmenone);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                 "+Fashion.menone);
						System.out.println();
						System.out.println("Product Price                                                900/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Fashion.menone + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}





				}
				else {

					System.out.println(Fashion.dmentwo);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                     "+Fashion.mentwo);
						System.out.println();
						System.out.println("Product Price                                                    500/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Fashion.mentwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}
				}
				break;	
			}
			case 2:{
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Women:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(Fashion.opt_Women);
				key=sc.nextInt();
				if(key==1) {

					System.out.println(Fashion.dwomenone);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                              "+Fashion.womenone);
						System.out.println();
						System.out.println("Product Price                                                             1000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Fashion.womenone + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}


				}
				else {

					System.out.println(Fashion.dwomentwo);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                                 "+Fashion.womentwo);
						System.out.println();
						System.out.println("Product Price                                                                600/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Fashion.womentwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thankyou for Choosing Online shopping...");
						main(null);
					}

				}
				break;	
			}
			case 3:{
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Kids:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(Fashion.opt_Kids);
				key=sc.nextInt();
				if(key==1) {

					System.out.println(Fashion.dkidone);
					String opt=sc.next();
					System.out.println();
					System.out.println("Do you want to buy the product??");
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                                   "+Fashion.kidone);
						System.out.println();
						System.out.println("Product Price                                                                  700/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Fashion.kidone + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}


				}
				else {

					System.out.println(Fashion.dkidtwo);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                                   "+Fashion.kidtwo);
						System.out.println();
						System.out.println("Product Price                                                                  300/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Fashion.kidtwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}

				}
				break;	
			}
			}

			break;


		}
		case 4:{
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("Instamart:");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("What are you looking for??:");
			System.out.println();
			System.out.println(Instamart.options);
			int choice5 =sc.nextInt();
			switch(choice5) {
			case 1:{
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Snacks:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(Instamart.opt_Snacks);
				key=sc.nextInt();
				if(key==1) {
					System.out.println(Instamart.dsnacksone);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                              "+Instamart.snacksone);
						System.out.println();
						System.out.println("Product Price                                                             50/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Instamart.snacksone + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);
					}





				}
				else {

					System.out.println(Instamart.dsnackstwo);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                              "+Instamart.snackstwo);
						System.out.println();
						System.out.println("Product Price                                                             40/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Instamart.snackstwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank you for Choosing Online shopping...");
						main(null);

					}
				}
				break;	
			}
			case 2:{
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Fruits:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(Instamart.opt_Fruits);
				key=sc.nextInt();
				if(key==1) {
					System.out.println(Instamart.dfruitsone);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                              "+Instamart.fruitsone);
						System.out.println();
						System.out.println("Product Price                                                             200/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Instamart.fruitsone + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thank"
								+ "you for Choosing Online shopping...");
						main(null);

					}
				}
				else {

					System.out.println(Instamart.dfruitstwo);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                              "+Instamart.fruitstwo);
						System.out.println();
						System.out.println("Product Price                                                             50/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Instamart.fruitstwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thankyou for Choosing Online shopping...");
						main(null);
					}
				}


				break;	
			}
			case 3:{
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Juices:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(Instamart.opt_Juice);
				key=sc.nextInt();
				if(key==1) {
					System.out.println(Instamart.djuicesone);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                              "+Instamart.juicesone);
						System.out.println();
						System.out.println("Product Price                                                             80/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Instamart.juicesone + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thankyou for Choosing Online shopping...");
						main(null);
					}


				}
				else {

					System.out.println(Instamart.djuicestwo);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                              "+Instamart.juicestwo);
						System.out.println();
						System.out.println("Product Price                                                             90/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Instamart.juicestwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thankyou for Choosing Online shopping...");
						main(null);
					}}


				break;	
			}
			case 4:{
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Vegetables:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(Instamart.opt_Veg);
				key=sc.nextInt();
				if(key==1) {

					System.out.println(Instamart.dvegone);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                                 "+Instamart.vegone);
						System.out.println();
						System.out.println("Product Price                                                                30/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Instamart.vegone + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thankyou for Choosing Online shopping...");
						main(null);


					}
				}
				else {

					System.out.println(Instamart.dvegtwo);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("                                   Recipet                                                    ");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                                 "+Instamart.vegtwo);
						System.out.println();
						System.out.println("Product Price                                                                80/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Instamart.vegtwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}
					}
					else {
						System.out.println("Thankyou for Choosing Online shopping...");
						main(null);


					}
				}
			}


			break;	
			}

			break;


		}
		case 5:{
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("Sports:");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("What are you looking for??:");
			System.out.println();
			System.out.println(Sports.options);
			
			int choice6 =sc.nextInt();
			switch(choice6) {
			case 1:{
				System.out.println("Sport Clothing:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(Sports.opt_clot);
				key=sc.nextInt();
				if(key==1) {
					System.out.println(Sports.dclone);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("\t \t Recipet");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                                     "+Sports.clone);
						System.out.println();
						System.out.println("Product Price                                                                    400/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Sports.clone + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thankyou for Choosing Online shopping...");
						main(null);
					}


				}
				else {
					System.out.println(Sports.dcltwo);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("\t \t Recipet");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                                     "+Sports.cltwo);
						System.out.println();
						System.out.println("Product Price                                                                    800/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Sports.cltwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thankyou for Choosing Online shopping...");
						main(null);
					}



				}
				break;	
			}
			case 2:{
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Sports Equipment:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(Sports.opt_Equi);
				key=sc.nextInt();
				if(key==1) {
					System.out.println(Sports.deqone);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("\t \t Recipet");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                                     "+Sports.eqone);
						System.out.println();
						System.out.println("Product Price                                                                    1000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Sports.eqone + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thankyou for Choosing Online shopping...");
						main(null);
					}




				}
				else {
					System.out.println(Sports.deqtwo);
					String opt=sc.next();
					System.out.println();
					System.out.println("Do you want to buy the product??");
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("\t \t Recipet");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                                     "+Sports.eqtwo);
						System.out.println();
						System.out.println("Product Price                                                                    1000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Sports.eqtwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thankyou for Choosing Online shopping...");
						main(null);
					}

				}
				break;	
			}
			case 3:{
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Sport Shoes:");
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.println("Select Any Item from the Following to Buy:");
				System.out.println(Sports.opt_shoe);
				key=sc.nextInt();
				if(key==1) {
					System.out.println(Sports.dshone);
					System.out.println();
					System.out.println("Do you want to buy the product??");
					String opt=sc.next();
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("\t \t Recipet");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                                     "+Sports.shone);
						System.out.println();
						System.out.println("Product Price                                                                    1000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Sports.shone + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}

					}
					else {
						System.out.println("Thankyou for Choosing Online shopping...");
						main(null);
					}






				}
				else {

					System.out.println(Sports.dshtwo);
					String opt=sc.next();
					System.out.println();
					System.out.println("Do you want to buy the product??");
					if(opt.equals("yes")) {
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println("\t \t Recipet");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println();
						System.out.println("Product Name                                                                     "+Sports.shtwo);
						System.out.println();
						System.out.println("Product Price                                                                    1000/-");
						System.out.println("----------------------------------------------------------------------------------------------");
						System.out.println(Sports.shtwo + " Purchased Successfully!!");
						System.out.println();
						System.out.println("Do you want to Shop more?? (Yes/No)");
						String ask=sc.next();
						if(ask.equalsIgnoreCase("yes")) {
							main(null);
						}
						else {
							System.exit(0);
						}


					}
					else {
						System.out.println("Thankyou for Choosing Online shopping...");
						main(null);
					}




				}
				break;	
			}


			}
		}
		case 6:{
			System.exit(0);
		}
		default:
			System.out.println("Entered Choice is Invalid");
			main(null);

		}

		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("/t /tThankyou for Choosing Online Shoping,Comeback again");
		System.out.println("----------------------------------------------------------------------------------------------");

	}

}
