package Product;

public class Catalog {
	
	private Product[] listAllClothes=new Product[10];
	private Product[] listAllElectronics=new Product[10];
	private Product[] listAllFurniture=new Product[10];
	private Product[] listAllProducts=new Product[30];
	private Product[] SellerProducts=new Product[30];
	

	public Product[] getSellerProducts() {
		Product product1=new Product();
		product1.setProductId("1");
		product1.setProductName("Black Shirt");
		product1.setCost("500");
		product1.setSeller("Seller 1");
		Product product2=new Product();
		product2.setProductId("2");
		product2.setProductName("Blue Jean");
		product2.setCost("1000");
		product2.setSeller("Seller 2");
		Product product3=new Product();
		product3.setProductId("3");
		product3.setProductName("Sarees");
		product3.setCost("2000");
		product3.setSeller("Seller 3");
		Product product4=new Product();
		product4.setProductId("4");
		product4.setProductName("Kurta and Kurtis");
		product4.setCost("500");
		product4.setSeller("Seller 4");
		Product product5=new Product();
		product5.setProductId("5");
		product5.setProductName("Nighties");
		product5.setCost("700");
		product5.setSeller("Seller 5");
		Product product6=new Product();
		product6.setProductId("6");
		product6.setProductName("Track Phant");
		product6.setCost("500");
		product6.setSeller("Seller 6");
		Product product7=new Product();
		product7.setProductId("7");
		product7.setProductName("T-shirt");
		product7.setCost("600");
		product7.setSeller("Seller 7");
		Product product8=new Product();
		product8.setProductId("8");
		product8.setProductName("Legging");
		product8.setCost("350");
		product8.setSeller("Seller 8");
		Product product9=new Product();
		product9.setProductId("9");
		product9.setProductName("Drowser");
		product9.setCost("450");	
		product9.setSeller("Seller 9");
		Product product10=new Product();
		product10.setProductId("10");
		product10.setProductName("Jumpsuits");
		product10.setCost("500");
		product10.setSeller("Seller 10");
		Product product11=new Product();
		product11.setProductId("11");
		product11.setProductName("Fan");
		product11.setCost("300");
		product11.setSeller("Seller 11");
		Product product12=new Product();
		product12.setProductId("12");
		product12.setProductName("Television");
		product12.setCost("20,000");
		product12.setSeller("Seller 12");
		Product product13=new Product();
		product13.setProductId("13");
		product13.setProductName("Air Cooler");
		product13.setCost("10,000");
		product13.setSeller("Seller 13");
		Product product14=new Product();
		product14.setProductId("14");
		product14.setProductName("Refridgerator");
		product14.setCost("30,000");
		product14.setSeller("Seller 14");
		Product product15=new Product();
		product15.setProductId("15");
		product15.setProductName("Washing Machine");
		product15.setCost("25,000");
		product15.setSeller("Seller 15");
		Product product16=new Product();
		product16.setProductId("16");
		product16.setProductName("Mixer and Grinder");
		product16.setCost("20,000");
		product16.setSeller("Seller 16");
		Product product17=new Product();
		product17.setProductId("17");
		product17.setProductName("Mobile Devices");
		product17.setCost("15,000");
		product17.setSeller("Seller 17");
		Product product18=new Product();
		product18.setProductId("18");
		product18.setProductName("Laptop");
		product18.setCost("50,000");
		product18.setSeller("Seller 18");
		Product product19=new Product();
		product19.setProductId("19");
		product19.setProductName("Desktop_Monitor");
		product19.setCost("20,000");
		product19.setSeller("Seller 19");
		Product product20=new Product();
		product20.setProductId("20");
		product20.setProductName("KeyboardsAndMouse");
		product20.setCost("1000");
		product20.setSeller("Seller 20");	
		Product product21=new Product();
		product21.setProductId("21");
		product21.setProductName("Bed");
		product21.setCost("20,000");
		product21.setSeller("Seller 21");
		Product product22=new Product();
		product22.setProductId("22");
		product22.setProductName("Wardrobe");
		product22.setCost("15,000");
		product22.setSeller("Seller 22");
		Product product23=new Product();
		product23.setProductId("23");
		product23.setProductName("Dining Table");
		product23.setCost("30,000");
		product23.setSeller("Seller 23");
		Product product24=new Product();
		product24.setProductId("24");
		product24.setProductName("Dressing Table");
		product24.setCost("10,000");
		product24.setSeller("Seller 24");
		Product product25=new Product();
		product25.setProductId("25");
		product25.setProductName("Tv Stand");
		product25.setCost("8,000");
		product25.setSeller("Seller 25");
		Product product26=new Product();
		product26.setProductId("26");
		product26.setProductName("Coffee Table");
		product26.setCost("4,000");
		product26.setSeller("Seller 26");
		Product product27=new Product();
		product27.setProductId("27");
		product27.setProductName("Stool");
		product27.setCost("1000");
		product27.setSeller("Seller 27");
		Product product28=new Product();
		product28.setProductId("28");
		product28.setProductName("Wooden Door");
		product28.setCost("15,000");
		product28.setSeller("Seller 28");
		Product product29=new Product();
		product29.setProductId("29");
		product29.setProductName("Wooden Clock");
		product29.setCost("1000");
		product29.setSeller("Seller 29");
		Product product30=new Product();
		product30.setProductId("30");
		product30.setProductName("Chairs");
		product30.setCost("1000");
		product30.setSeller("Seller 30");
		SellerProducts[0]=product1;
		SellerProducts[1]=product2;
		SellerProducts[2]=product3;
		SellerProducts[3]=product4;
		SellerProducts[4]=product5;
		SellerProducts[5]=product6;
		SellerProducts[6]=product7;
		SellerProducts[7]=product8;
		SellerProducts[8]=product9;
		SellerProducts[9]=product10;
		SellerProducts[10]=product11;
		SellerProducts[11]=product12;
		SellerProducts[12]=product13;
		SellerProducts[13]=product14;
		SellerProducts[14]=product15;
		SellerProducts[15]=product16;
		SellerProducts[16]=product17;
		SellerProducts[17]=product18;
		SellerProducts[18]=product19;
		SellerProducts[19]=product20;
		SellerProducts[20]=product21;
		SellerProducts[21]=product22;
		SellerProducts[22]=product23;
		SellerProducts[23]=product24;
		SellerProducts[24]=product25;
		SellerProducts[25]=product26;
		SellerProducts[26]=product27;
		SellerProducts[27]=product28;
		SellerProducts[28]=product29;
		SellerProducts[29]=product30;
		return SellerProducts;
	}

	public void setSellerProducts(Product[] sellerProducts) {
		SellerProducts = sellerProducts;
	}

	public Product[] getListAllClothes() {
		Product product1=new Product();
		product1.setProductId("1");
		product1.setProductName("Black Shirt");
		product1.setCost("500");
		product1.setSeller("Seller 1");
		Product product2=new Product();
		product2.setProductId("2");
		product2.setProductName("Blue Jean");
		product2.setCost("1000");
		product2.setSeller("Seller 2");
		Product product3=new Product();
		product3.setProductId("3");
		product3.setProductName("Sarees");
		product3.setCost("2000");
		product3.setSeller("Seller 3");
		Product product4=new Product();
		product4.setProductId("4");
		product4.setProductName("Kurta and Kurtis");
		product4.setCost("500");
		product4.setSeller("Seller 4");
		Product product5=new Product();
		product5.setProductId("5");
		product5.setProductName("Nighties");
		product5.setCost("700");
		product5.setSeller("Seller 5");
		Product product6=new Product();
		product6.setProductId("6");
		product6.setProductName("Track Phant");
		product6.setCost("500");
		product6.setSeller("Seller 6");
		Product product7=new Product();
		product7.setProductId("7");
		product7.setProductName("T-shirt");
		product7.setCost("600");
		product7.setSeller("Seller 7");
		Product product8=new Product();
		product8.setProductId("8");
		product8.setProductName("Legging");
		product8.setCost("350");
		product8.setSeller("Seller 8");
		Product product9=new Product();
		product9.setProductId("9");
		product9.setProductName("Drowser");
		product9.setCost("450");
		product9.setSeller("Seller 9");
		Product product10=new Product();
		product10.setProductId("10");
		product10.setProductName("Jumpsuits");
		product10.setCost("500");
		product10.setSeller("Seller 10");
		listAllClothes[0]=product1;
		listAllClothes[1]=product2;
		listAllClothes[2]=product3;
		listAllClothes[3]=product4;
		listAllClothes[4]=product5;
		listAllClothes[5]=product6;
		listAllClothes[6]=product7;
		listAllClothes[7]=product8;
		listAllClothes[8]=product9;
		listAllClothes[9]=product10;
		return listAllClothes;
	}

	public void setListAllClothes(Product[] listAllClothes) {
		this.listAllClothes = listAllClothes;
	}

	public Product[] getListAllElectronics() {	
		Product product11=new Product();
		product11.setProductId("11");
		product11.setProductName("Fan");
		product11.setCost("300");
		product11.setSeller("Seller 11");
		Product product12=new Product();
		product12.setProductId("12");
		product12.setProductName("Television");
		product12.setCost("20,000");
		product12.setSeller("Seller 12");
		Product product13=new Product();
		product13.setProductId("13");
		product13.setProductName("Air Cooler");
		product13.setCost("10,000");
		product13.setSeller("Seller 13");
		Product product14=new Product();
		product14.setProductId("14");
		product14.setProductName("Refridgerator");
		product14.setCost("30,000");
		product14.setSeller("Seller 14");
		Product product15=new Product();
		product15.setProductId("15");
		product15.setProductName("Washing Machine");
		product15.setCost("25,000");
		product15.setSeller("Seller 15");
		Product product16=new Product();
		product16.setProductId("16");
		product16.setProductName("Mixer and Grinder");
		product16.setCost("20,000");
		product16.setSeller("Seller 16");
		Product product17=new Product();
		product17.setProductId("17");
		product17.setProductName("Mobile Devices");
		product17.setCost("15,000");
		product17.setSeller("Seller 17");
		Product product18=new Product();
		product18.setProductId("18");
		product18.setProductName("Laptop");
		product18.setCost("50,000");
		product18.setSeller("Seller 18");
		Product product19=new Product();
		product19.setProductId("19");
		product19.setProductName("Desktop_Monitor");
		product19.setCost("20,000");
		product19.setSeller("Seller 19");
		Product product20=new Product();
		product20.setProductId("20");
		product20.setProductName("KeyboardsAndMouse");
		product20.setCost("1000");
		product20.setSeller("Seller 20");
		listAllElectronics[0]=product11;
		listAllElectronics[1]=product12;
		listAllElectronics[2]=product13;
		listAllElectronics[3]=product14;
		listAllElectronics[4]=product15;
		listAllElectronics[5]=product16;
		listAllElectronics[6]=product17;
		listAllElectronics[7]=product18;
		listAllElectronics[8]=product19;
		listAllElectronics[9]=product20;
		return listAllElectronics;
	}

	public void setListAllElectronics(Product[] listAllElectronics) {
		this.listAllElectronics = listAllElectronics;
	}

	public Product[] getListAllFurniture() {
		
		Product product21=new Product();
		product21.setProductId("21");
		product21.setProductName("Bed");
		product21.setCost("20,000");
		product21.setSeller("Seller 21");
		Product product22=new Product();
		product22.setProductId("22");
		product22.setProductName("Wardrobe");
		product22.setCost("15,000");
		product22.setSeller("Seller 22");
		Product product23=new Product();
		product23.setProductId("23");
		product23.setProductName("Dining Table");
		product23.setCost("30,000");
		product23.setSeller("Seller 23");
		Product product24=new Product();
		product24.setProductId("24");
		product24.setProductName("Dressing Table");
		product24.setCost("10,000");
		product24.setSeller("Seller 24");
		Product product25=new Product();
		product25.setProductId("25");
		product25.setProductName("Tv Stand");
		product25.setCost("8,000");
		product25.setSeller("Seller 25");
		Product product26=new Product();
		product26.setProductId("26");
		product26.setProductName("Coffee Table");
		product26.setCost("4,000");
		product26.setSeller("Seller 26");
		Product product27=new Product();
		product27.setProductId("27");
		product27.setProductName("Stool");
		product27.setCost("1000");
		product27.setSeller("Seller 27");
		Product product28=new Product();
		product28.setProductId("28");
		product28.setProductName("Wooden Door");
		product28.setCost("15,000");
		product28.setSeller("Seller 28");
		Product product29=new Product();
		product29.setProductId("29");
		product29.setProductName("Wooden Clock");
		product29.setCost("1000");
		product29.setSeller("Seller 29");
		Product product30=new Product();
		product30.setProductId("30");
		product30.setProductName("Chairs");
		product30.setCost("1000");
		product30.setSeller("Seller 30");
		listAllFurniture[0]=product21;
		listAllFurniture[1]=product22;
		listAllFurniture[2]=product23;
		listAllFurniture[3]=product24;
		listAllFurniture[4]=product25;
		listAllFurniture[5]=product26;
		listAllFurniture[6]=product27;
		listAllFurniture[7]=product28;
		listAllFurniture[8]=product29;
		listAllFurniture[9]=product30;
		return listAllFurniture;
	}

	public void setListAllFurniture(Product[] listAllFurniture) {
		this.listAllFurniture = listAllFurniture;
	}
	
	public Product[] getListAllProducts() {
		Product product1=new Product();
		product1.setProductId("1");
		product1.setProductName("Black Shirt");
		product1.setCost("500");
		product1.setSeller("Seller 1");
		Product product2=new Product();
		product2.setProductId("2");
		product2.setProductName("Blue Jean");
		product2.setCost("1000");
		product2.setSeller("Seller 2");
		Product product3=new Product();
		product3.setProductId("3");
		product3.setProductName("Sarees");
		product3.setCost("2000");
		product3.setSeller("Seller 3");
		Product product4=new Product();
		product4.setProductId("4");
		product4.setProductName("Kurta and Kurtis");
		product4.setCost("500");
		product4.setSeller("Seller 4");
		Product product5=new Product();
		product5.setProductId("5");
		product5.setProductName("Nighties");
		product5.setCost("700");
		product5.setSeller("Seller 5");
		Product product6=new Product();
		product6.setProductId("6");
		product6.setProductName("Track Phant");
		product6.setCost("500");
		product6.setSeller("Seller 6");
		Product product7=new Product();
		product7.setProductId("7");
		product7.setProductName("T-shirt");
		product7.setCost("600");
		product7.setSeller("Seller 7");
		Product product8=new Product();
		product8.setProductId("8");
		product8.setProductName("Legging");
		product8.setCost("350");
		product8.setSeller("Seller 8");
		Product product9=new Product();
		product9.setProductId("9");
		product9.setProductName("Drowser");
		product9.setCost("450");	
		product9.setSeller("Seller 9");
		Product product10=new Product();
		product10.setProductId("10");
		product10.setProductName("Jumpsuits");
		product10.setCost("500");
		product10.setSeller("Seller 10");
		Product product11=new Product();
		product11.setProductId("11");
		product11.setProductName("Fan");
		product11.setCost("300");
		product11.setSeller("Seller 11");
		Product product12=new Product();
		product12.setProductId("12");
		product12.setProductName("Television");
		product12.setCost("20,000");
		product12.setSeller("Seller 12");
		Product product13=new Product();
		product13.setProductId("13");
		product13.setProductName("Air Cooler");
		product13.setCost("10,000");
		product13.setSeller("Seller 13");
		Product product14=new Product();
		product14.setProductId("14");
		product14.setProductName("Refridgerator");
		product14.setCost("30,000");
		product14.setSeller("Seller 14");
		Product product15=new Product();
		product15.setProductId("15");
		product15.setProductName("Washing Machine");
		product15.setCost("25,000");
		product15.setSeller("Seller 15");
		Product product16=new Product();
		product16.setProductId("16");
		product16.setProductName("Mixer and Grinder");
		product16.setCost("20,000");
		product16.setSeller("Seller 16");
		Product product17=new Product();
		product17.setProductId("17");
		product17.setProductName("Mobile Devices");
		product17.setCost("15,000");
		product17.setSeller("Seller 17");
		Product product18=new Product();
		product18.setProductId("18");
		product18.setProductName("Laptop");
		product18.setCost("50,000");
		product18.setSeller("Seller 18");
		Product product19=new Product();
		product19.setProductId("19");
		product19.setProductName("Desktop_Monitor");
		product19.setCost("20,000");
		product19.setSeller("Seller 19");
		Product product20=new Product();
		product20.setProductId("20");
		product20.setProductName("KeyboardsAndMouse");
		product20.setCost("1000");
		product20.setSeller("Seller 20");	
		Product product21=new Product();
		product21.setProductId("21");
		product21.setProductName("Bed");
		product21.setCost("20,000");
		product21.setSeller("Seller 21");
		Product product22=new Product();
		product22.setProductId("22");
		product22.setProductName("Wardrobe");
		product22.setCost("15,000");
		product22.setSeller("Seller 22");
		Product product23=new Product();
		product23.setProductId("23");
		product23.setProductName("Dining Table");
		product23.setCost("30,000");
		product23.setSeller("Seller 23");
		Product product24=new Product();
		product24.setProductId("24");
		product24.setProductName("Dressing Table");
		product24.setCost("10,000");
		product24.setSeller("Seller 24");
		Product product25=new Product();
		product25.setProductId("25");
		product25.setProductName("Tv Stand");
		product25.setCost("8,000");
		product25.setSeller("Seller 25");
		Product product26=new Product();
		product26.setProductId("26");
		product26.setProductName("Coffee Table");
		product26.setCost("4,000");
		product26.setSeller("Seller 26");
		Product product27=new Product();
		product27.setProductId("27");
		product27.setProductName("Stool");
		product27.setCost("1000");
		product27.setSeller("Seller 27");
		Product product28=new Product();
		product28.setProductId("28");
		product28.setProductName("Wooden Door");
		product28.setCost("15,000");
		product28.setSeller("Seller 28");
		Product product29=new Product();
		product29.setProductId("29");
		product29.setProductName("Wooden Clock");
		product29.setCost("1000");
		product29.setSeller("Seller 29");
		Product product30=new Product();
		product30.setProductId("30");
		product30.setProductName("Chairs");
		product30.setCost("1000");
		product30.setSeller("Seller 30");
		listAllProducts[0]=product1;
		listAllProducts[1]=product2;
		listAllProducts[2]=product3;
		listAllProducts[3]=product4;
		listAllProducts[4]=product5;
		listAllProducts[5]=product6;
		listAllProducts[6]=product7;
		listAllProducts[7]=product8;
		listAllProducts[8]=product9;
		listAllProducts[9]=product10;
		listAllProducts[10]=product11;
		listAllProducts[11]=product12;
		listAllProducts[12]=product13;
		listAllProducts[13]=product14;
		listAllProducts[14]=product15;
		listAllProducts[15]=product16;
		listAllProducts[16]=product17;
		listAllProducts[17]=product18;
		listAllProducts[18]=product19;
		listAllProducts[19]=product20;
		listAllProducts[20]=product21;
		listAllProducts[21]=product22;
		listAllProducts[22]=product23;
		listAllProducts[23]=product24;
		listAllProducts[24]=product25;
		listAllProducts[25]=product26;
		listAllProducts[26]=product27;
		listAllProducts[27]=product28;
		listAllProducts[28]=product29;
		listAllProducts[29]=product30;
		return listAllProducts;
	}

	public void setListAllProducts(Product[] listAllProducts) {
		this.listAllProducts = listAllProducts;
	}

	public Product[] getProductListed() {
		// TODO Auto-generated method stub	
		return null;
	}

	
	
	
}
