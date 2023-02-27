package az.developia.MarketShopParviz.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import az.developia.MarketShopParviz.model.UserModel;


public interface UserRepository extends JpaRepository<UserModel, Integer> {

	UserModel findByUsername(String username);

	
  

	
	
	
	
	
}
