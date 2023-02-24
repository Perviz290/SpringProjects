package az.developia.MarketShopParviz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.MarketShopParviz.model.UserModel;


public interface UserRepository extends JpaRepository<UserModel, Integer> {

	UserModel findByUsername(String username);

}
