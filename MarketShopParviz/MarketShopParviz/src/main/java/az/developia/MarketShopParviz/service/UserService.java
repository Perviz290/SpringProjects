package az.developia.MarketShopParviz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import az.developia.MarketShopParviz.RequestDTO.SaveUserRequest;
import az.developia.MarketShopParviz.RequestDTO.disableUserDTO;
import az.developia.MarketShopParviz.RequestDTO.editUserDTO;
import az.developia.MarketShopParviz.editdto.editProductDTO;
import az.developia.MarketShopParviz.exception.EnumNotFoundException;
import az.developia.MarketShopParviz.exception.IdNotFoundException;
import az.developia.MarketShopParviz.exception.UsernameAlreadyDefinedException;
import az.developia.MarketShopParviz.model.Role;
import az.developia.MarketShopParviz.model.UserModel;
import az.developia.MarketShopParviz.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CashierService cashierService;
	@Autowired
	private ManagerService managerService;
	@Autowired
	private AuthorityService authorityService;

	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	// create user service
	public void save(SaveUserRequest save) {

		UserModel findUser = userRepository.findByUsername(save.getUsername());
		if (findUser != null) {
			throw new UsernameAlreadyDefinedException("This username exists");
		} else {
			switch (save.getRole()) {
			case manager: {
				managerService.creatManager(save.getName(), save.getSurname(), save.getBirthday(), save.getMail(),
						save.getPhoneNumber(),save.getUsername());
				authorityService.creatAuthority(save.getUsername(), "manager");

				creatUsername(save.getUsername(), save.getPassword(), save.getRole());
			}
				break;
			case cashier: {
				cashierService.creatCashier(save.getName(), save.getSurname(), save.getBirthday(), save.getMail(),
						save.getPhoneNumber(),save.getUsername());
				authorityService.creatAuthority(save.getUsername(), "cashier");
				
				creatUsername(save.getUsername(), save.getPassword(), save.getRole());
			}
				break;
			default:
				throw new EnumNotFoundException("Role Not_Found");
			}

		}
	}

	
	private void creatUsername(String username, String password, Role role) {
		UserModel user = new UserModel();
		user.setUsername(username);
		user.setRole(role);
		user.setEnabled(true);
		user.setPassword(encoder.encode(password));
		userRepository.save(user);
	}

	//findAllUser
	public List<UserModel> getAllUser() {
		return userRepository.findAll();
	}

	// User Disable and Enable 
	public UserModel disableUser(disableUserDTO disable) {
		
		UserModel username = userRepository.findByUsername(disable.getUser());
		if (username==null) {
			throw new UsernameAlreadyDefinedException
			(disable.getUser()+"-This username does not exist");
		}
		if (disable.getEnable()==true) {
			username.setEnabled(true);
		}
		else if (disable.getEnable()==false) {
			username.setEnabled(false);
		}
		else {
			throw new RuntimeException("null");
		}
		return userRepository.save(username);
	}


	// user edit only password
	public UserModel editUser(editUserDTO edit) {
		UserModel username = userRepository.findByUsername(edit.getUser());
		if (username==null) {
			throw new UsernameAlreadyDefinedException
			(edit.getUser()+"-This username does not exist");
		}
		username.setPassword(encoder.encode(edit.getPassword()));
		UserModel editModel= userRepository.save(username);
		return editModel ;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
