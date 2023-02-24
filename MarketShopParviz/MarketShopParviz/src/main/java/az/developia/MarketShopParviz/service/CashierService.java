package az.developia.MarketShopParviz.service;

import java.sql.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import az.developia.MarketShopParviz.model.Cashier;
import az.developia.MarketShopParviz.repository.CashierRepository;

@Service
public class CashierService {
	
	@Autowired
	private CashierRepository cashierRepository;
	
	//Creat Cashier method
		public void creatCashier(String name,String surname,Date birthday,
				String mail,String phoneNumber,String username) {
			
			Cashier cashier=new Cashier();
			cashier.setName(name);
			cashier.setSurname(surname);
			cashier.setBirthday(birthday);
			cashier.setMail(mail);
			cashier.setPhoneNumber(phoneNumber);
			cashier.setUsername(username);	
			cashierRepository.save(cashier);
		}
	
	
	
	

}
