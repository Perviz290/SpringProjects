package az.developia.MarketShopParviz.RequestDTO;

import javax.persistence.Enumerated;

import az.developia.MarketShopParviz.model.Role;
import lombok.Data;

@Data
public class SaveUserRequest {
	
	private String username;
	
	private String password;

	@Enumerated
	private Role role;
	
	

}
