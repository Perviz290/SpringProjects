package az.developia.MarketShopParviz.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import az.developia.MarketShopParviz.RequestDTO.Barcode;
import az.developia.MarketShopParviz.RequestDTO.SaveSaleRequest;
import az.developia.MarketShopParviz.exception.NotFoundException;
import az.developia.MarketShopParviz.model.Product;
import az.developia.MarketShopParviz.model.Sale;
import az.developia.MarketShopParviz.model.UserModel;
import az.developia.MarketShopParviz.repository.SaleRepository;

@Service
public class SaleService {
	
	@Autowired 
	private SaleRepository saleRepository;
	@Autowired
	private ProductService productService;
	@Autowired
	private UserService userService;

	public void saveSale(SaveSaleRequest save) {	
	// login olan user e gore 	
	UserModel user = userService.findUser();
	//muhsulun barcodu tapilmalidir.	
	Product findBarcode = productService.findBarcode(save.getBarcode());
	//barcoda gore - mehsulun .... name,barcode,price,cost,percent,categoryId-verilmelidir
	Sale sale=new Sale();
	productService.countQuantity(save.getQuantity(), findBarcode);
	sale.setName(findBarcode.getName());
	sale.setBarcode(save.getBarcode());
	sale.setPrice(findBarcode.getPrice());
	sale.setCost(findBarcode.getCost());
	sale.setSaleDate(LocalDate.now());
	sale.setPercent(findBarcode.getPercent());
	sale.setCategoryId(findBarcode.getCategoryId());
	sale.setCreatorUsername(user.getUsername());
	sale.setQuantity(save.getQuantity());
	saleRepository.save(sale);
	}
	

	public List<Sale> getAllSaleByDate(LocalDate from, LocalDate to) {
		return saleRepository.findAllByDate(from,to);	
}


	
	
	
	
	
	
	
}
