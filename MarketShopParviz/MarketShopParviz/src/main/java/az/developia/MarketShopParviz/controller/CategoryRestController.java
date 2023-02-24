package az.developia.MarketShopParviz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.MarketShopParviz.service.CategoryService;

@RestController
@RequestMapping(path = "/category")
public class CategoryRestController {

	@Autowired
	private CategoryService categoryService;
	
	
	
	
	
	
	
}
