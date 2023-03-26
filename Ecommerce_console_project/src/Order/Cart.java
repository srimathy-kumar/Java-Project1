package Order;

import Product.Product;

public class Cart {
	private String cartId;
	private Product[] productList;
	
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	
	public Product[] getProductList() {
		return productList;
	}
	public void setProductList(Product[] productList) {
		this.productList = productList;
	}
	public Boolean checkOut(){
		return true;
	}
}
