package az.developia.MarketShopParviz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.MarketShopParviz.model.AuthorityModel;
import az.developia.MarketShopParviz.repository.AuthorityRepository;

@Service
public class AuthorityService {
	
	@Autowired
	private AuthorityRepository aRepository;
	
	//creat Authority
	public void creatAuthority(String username,String role) {
		AuthorityModel model=new AuthorityModel();
		model.setAuthority(role);
		model.setUsername(username);
		aRepository.save(model);
	}
	
	
	
	
	
	
	
	
	

}
