package Users;
import Order.Cart;

public abstract class User {
	String userId="";
	String password="";
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		public abstract Boolean VerifyUser();
	

}
