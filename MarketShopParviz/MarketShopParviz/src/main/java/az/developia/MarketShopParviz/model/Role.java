package az.developia.MarketShopParviz.model;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

public enum Role {
	
	admin("admin"),
	manager("manager"),
    cashier("cashier");
	
	String role;
	
	Role(String role){
		this.role=role;
	}
	
}
