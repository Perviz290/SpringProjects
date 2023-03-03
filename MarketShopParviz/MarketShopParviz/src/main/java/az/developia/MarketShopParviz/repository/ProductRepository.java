package az.developia.MarketShopParviz.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.MarketShopParviz.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findAllByCategoryId(Integer id);

	Product findByBarcode(String barcode);

	

}
