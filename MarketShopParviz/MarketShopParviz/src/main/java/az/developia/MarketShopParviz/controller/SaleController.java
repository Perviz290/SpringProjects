package az.developia.MarketShopParviz.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import az.developia.MarketShopParviz.RequestDTO.Barcode;
import az.developia.MarketShopParviz.RequestDTO.SaveProductRequest;
import az.developia.MarketShopParviz.RequestDTO.SaveSaleRequest;
import az.developia.MarketShopParviz.model.Product;
import az.developia.MarketShopParviz.model.Sale;
import az.developia.MarketShopParviz.model.UserModel;
import az.developia.MarketShopParviz.service.SaleService;

@RestController
@RequestMapping("/sale")
public class SaleController {

	@Autowired
	private SaleService saleService;

	// Satis qeyt etmek.
	@PostMapping
	@PreAuthorize(value = "hasAuthority('save:sale')")
	public void saveSale(@RequestBody SaveSaleRequest save) {
		saleService.saveSale(save);
	}

	// 2 date arasi satislari getirmek
	@GetMapping
	@PreAuthorize(value = "hasAuthority('admin')")
	public List<Sale> getAllSaleByDate(@RequestParam LocalDate from, 
			@RequestParam(required = false) LocalDate to) {	
		return saleService.getAllSaleByDate(from,to);
	}

	
	
	
	
	// barcoda gore satislari getirmek
	// satisi vazvrat etmek

}
