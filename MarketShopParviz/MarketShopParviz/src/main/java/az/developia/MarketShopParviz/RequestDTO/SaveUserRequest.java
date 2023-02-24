package az.developia.MarketShopParviz.RequestDTO;

import java.sql.Date;

import javax.persistence.Enumerated;

import az.developia.MarketShopParviz.model.Role;
import lombok.Data;

@Data
public class SaveUserRequest {
	
	private Role role;
	
	private String username;
	
	private String password;

    private String name;
	
	private String surname;
	
	private Date birthday;
	
	private String mail;
	
	private String phoneNumber;
	

	
	

}
