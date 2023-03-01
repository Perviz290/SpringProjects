package az.developia.MarketShopParviz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import az.developia.MarketShopParviz.RequestDTO.SaveAuthorityRequest;
import az.developia.MarketShopParviz.RequestDTO.SaveProductRequest;
import az.developia.MarketShopParviz.model.AuthorityModel;
import az.developia.MarketShopParviz.model.UserModel;
import az.developia.MarketShopParviz.service.AuthorityService;

@RestController
@RequestMapping("/authority")
public class AuthorityRestController {

	@Autowired
	private AuthorityService authorityService;

	// username gore ona mensub olan huquqlari getirmek
	@GetMapping
	@PreAuthorize(value = "hasAuthority('admin')")
	public List<AuthorityModel> getAllAuthorityByUsername(@RequestParam String username) {
		return authorityService.getAllAuthorityByUsername(username);
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
