package az.developia.MarketShopParviz.model;

public enum Role {
	
	ADMIN("admin"), 
    CASHIER("cashier");
	
	String role;
	
	Role(String role){
		this.role=role;
	}

}
