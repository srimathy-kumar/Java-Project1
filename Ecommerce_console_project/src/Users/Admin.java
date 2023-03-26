package Users;

import Order.Cart;
import Product.Product;

public class Admin extends User{
private Product[] SellProducts;
		

	public Product[] getSellProducts()  {
		
	return SellProducts;
}


public void setSellProducts(Product[] SellProducts) {
	this.SellProducts = SellProducts;
}


	@Override
	public Boolean VerifyUser() {
		return null;
	}

}
