package az.developia.MarketShopParviz.model;

public enum Role {
	
	admin("admin"),
	manager("manager"),
    cashier("cashier");
	
	String role;
	
	Role(String role){
		this.role=role;
	}
	
}
