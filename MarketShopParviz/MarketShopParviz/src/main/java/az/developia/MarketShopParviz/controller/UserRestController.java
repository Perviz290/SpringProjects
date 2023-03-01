package az.developia.MarketShopParviz.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import az.developia.MarketShopParviz.RequestDTO.SaveUserRequest;
import az.developia.MarketShopParviz.RequestDTO.disableUserDTO;
import az.developia.MarketShopParviz.RequestDTO.editUserDTO;
import az.developia.MarketShopParviz.editdto.editProductDTO;
import az.developia.MarketShopParviz.model.Product;
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
	
	//user disable
	@PatchMapping
	@PreAuthorize(value = "hasAuthority('admin')")
	public UserModel disableUser(@RequestBody disableUserDTO disable) {
		return userService.disableUser(disable);
	}
	
	// user update only password
	@PutMapping
	@PreAuthorize(value = "hasAuthority('edituser:password')")
	public UserModel editUser(@RequestBody editUserDTO edit) {
		return userService.editUser(edit);
	}	
}