package az.developia.MarketShopParviz.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import az.developia.MarketShopParviz.model.Manager;
import az.developia.MarketShopParviz.repository.CashierRepository;
import az.developia.MarketShopParviz.repository.ManagerRepository;

@Service
public class ManagerService {
	
	@Autowired
	private ManagerRepository managerRepository;
	
	
	//Creat Manager method
	public void creatManager(String name,String surname,Date birthday,
			String mail,String phoneNumber,String username) {
		
		Manager manager=new Manager();
		manager.setName(name);
		manager.setSurname(surname);
		manager.setBirthday(birthday);
		manager.setMail(mail);
		manager.setPhoneNumber(phoneNumber);	
		manager.setUsername(username);
		managerRepository.save(manager);
	}
	
	
	
	
	

}
