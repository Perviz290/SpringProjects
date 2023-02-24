package az.developia.MarketShopParviz.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import az.developia.MarketShopParviz.exception.IdNotFoundException;
import az.developia.MarketShopParviz.model.Category;
import az.developia.MarketShopParviz.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	
	public Category findById(Integer id) {
		Optional<Category> findId = categoryRepository.findById(id);
		if (findId.isEmpty()) {
			throw new IdNotFoundException("-ID not Found!");
		}
		Category category=findId.get();
	    return category;
	}
	
	
	
	
	
	
	
	
	

}
