package az.developia.MarketShopParviz.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import az.developia.MarketShopParviz.RequestDTO.SaveUserRequest;
import az.developia.MarketShopParviz.model.Role;
import az.developia.MarketShopParviz.model.UserModel;

@Service
public class UserService {

	
	// create user service
	public void save(@Valid SaveUserRequest save) {
		UserModel user=new UserModel();
		user.setRole(Role.values());
		
		
		
		
		
	}

	
}
