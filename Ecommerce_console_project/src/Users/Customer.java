package Users;

import Order.Cart;

public class Customer extends User{
	private Cart cart;
	
	
	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}


	@Override
	public Boolean VerifyUser() {
		
		return true;
	}

	public String getUserId() {
		return userId;
		
	}
	public void setUserId(String userId) {
	this.userId=userId;	
	}
	

}
