package az.developia.MarketShopParviz.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import az.developia.MarketShopParviz.model.AuthorityModel;

public interface AuthorityRepository extends JpaRepository<AuthorityModel, Integer> {

	
	public List<AuthorityModel> findAllByUsername(String username);

	
	
}
