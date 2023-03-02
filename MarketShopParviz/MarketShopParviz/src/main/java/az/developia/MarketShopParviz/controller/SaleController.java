package az.developia.MarketShopParviz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.MarketShopParviz.RequestDTO.SaveProductRequest;
import az.developia.MarketShopParviz.RequestDTO.SaveSaleRequest;
import az.developia.MarketShopParviz.service.SaleService;

@RestController
@RequestMapping("/sale")
public class SaleController {
	
	@Autowired
	private SaleService saleService;
	
	//Satis qeyt etmek.
	@PostMapping
	@PreAuthorize(value = "hasAuthority('save:sale')")
	public void saveSale(@RequestBody SaveSaleRequest save) {
		saleService.saveSale(save);
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

