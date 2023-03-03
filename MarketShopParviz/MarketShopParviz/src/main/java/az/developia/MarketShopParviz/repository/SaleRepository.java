package az.developia.MarketShopParviz.repository;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import az.developia.MarketShopParviz.RequestDTO.Barcode;
import az.developia.MarketShopParviz.model.Sale;

@Transactional
public interface SaleRepository extends JpaRepository<Sale, Long> {

	List<Sale> findAllByBarcode(Barcode barcode);

	
	
	@Query(value = "select * from sales where sale_date >=?1 and sale_date<=?2",nativeQuery = true)
	@Modifying
	List<Sale> findAllByDate(LocalDate from, LocalDate to);

	
	
	
	
	
	
}
