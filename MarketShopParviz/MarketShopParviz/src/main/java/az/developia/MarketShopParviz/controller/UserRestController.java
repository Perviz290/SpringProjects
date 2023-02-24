package az.developia.MarketShopParviz.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import az.developia.MarketShopParviz.RequestDTO.SaveUserRequest;
import az.developia.MarketShopParviz.model.UserModel;
import az.developia.MarketShopParviz.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	
	
	// create user  
	@PostMapping
	@PreAuthorize(value = "hasAuthority('admin')")
	public void saveContract(@RequestBody SaveUserRequest save) {	
		userService.save(save);
	}
	
	// Get all Username
	@GetMapping
	@PreAuthorize(value = "hasAuthority('admin')")
	public List<UserModel>findAllUser(){
		return userService.getAllUser();
}
	
	

	
	
	
	
	
	

	
}