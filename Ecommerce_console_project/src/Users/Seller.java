package Users;

import Order.Cart;
import Product.Product;

public class Seller extends User {


		private Product[] productListed;

	public Product[] getProductListed() {
			return productListed;
		}

		public void setProductListed(Product[] productListed) {
			this.productListed = productListed;
		}

	@Override
	public Boolean VerifyUser() {
		
		return true;
	}



}
