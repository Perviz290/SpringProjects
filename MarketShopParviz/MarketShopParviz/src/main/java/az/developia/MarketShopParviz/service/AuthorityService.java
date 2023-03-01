package az.developia.MarketShopParviz.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.MarketShopParviz.RequestDTO.SaveAuthorityRequest;
import az.developia.MarketShopParviz.exception.UsernameAlreadyDefinedException;
import az.developia.MarketShopParviz.model.AuthorityList;
import az.developia.MarketShopParviz.model.AuthorityModel;
import az.developia.MarketShopParviz.model.UserModel;
import az.developia.MarketShopParviz.repository.AuthorityRepository;
import az.developia.MarketShopParviz.repository.UserRepository;

@Service
public class AuthorityService {

	@Autowired
	private AuthorityRepository aRepository;
	@Autowired
	private UserRepository userRepository;

	// creat Authority
	public void creatAuthority(String username, String role) {
		AuthorityModel model = new AuthorityModel();
		model.setAuthority(role);
		model.setUsername(username);
		aRepository.save(model);
	}

	// username gore ona mensub olan huquqlari getirmek
	public List<AuthorityModel> getAllAuthorityByUsername(String username) {

		UserModel findedUser = userRepository.findByUsername(username);
		if (findedUser == null) {
			throw new UsernameAlreadyDefinedException(username + "-Username is null");
		}
		List<AuthorityModel> list = aRepository.findAllByUsername(username);

		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
