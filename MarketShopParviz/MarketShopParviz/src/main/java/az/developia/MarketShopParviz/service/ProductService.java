package az.developia.MarketShopParviz.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import az.developia.MarketShopParviz.RequestDTO.SaveProductRequest;
import az.developia.MarketShopParviz.bean.Decimal;
import az.developia.MarketShopParviz.editdto.editProductDTO;
import az.developia.MarketShopParviz.exception.IdNotFoundException;
import az.developia.MarketShopParviz.model.Category;
import az.developia.MarketShopParviz.model.Product;
import az.developia.MarketShopParviz.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryService categoryService;

	// save Product
	public void save(SaveProductRequest save) {
		Category id = categoryService.findById(save.getCategoryId());
		Product product = new Product();
		product.setName(save.getName());
		product.setBarcode(save.getBarcode());
		product.setCategoryId(id.getId());
		product.setPrice(save.getPrice());
		product.setCost(save.getCost());
		product.setRegisterDate(LocalDate.now());
		product.setQuantity(save.getQuantity());
		product.setUpdateDate(null);
		Decimal decimal = new Decimal();
		BigDecimal findPercent = decimal.findPercent(save.getPrice(), save.getCost());
		product.setPercent(findPercent);
		productRepository.save(product);
	}

	// Get All Product
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	// Get All Product with CategoryId
	public List<Product> getAllProductByCategoryId(Integer categoryId) {
		Category findId = categoryService.findById(categoryId);
		return productRepository.findAllByCategoryId(findId.getId());
	}

	// Get One Product findById
	public Product findById(Long id) {
		Optional<Product> byId = productRepository.findById(id);
		if (byId.isEmpty()) {
			throw new IdNotFoundException("-This ID not Found!");
		}
		Product product = byId.get();
		return product;
	}

	// Delete By Id-product
	public void deleteProduct(Long id) {
		Product product = findById(id);
		productRepository.deleteById(product.getId());
	}

	// Edit Product
	public Product editProduct(editProductDTO edit, Long id) {
		Optional<Product> byId = productRepository.findById(id);
		if (byId.isPresent()) {
			Category category = categoryService.findById(edit.getCategoryId());
			Product editProduct = byId.get();
			editProduct.setCategoryId(category.getId());
			editProduct.setId(id);
			editProduct.setName(edit.getName());
			editProduct.setBarcode(edit.getBarcode());
			editProduct.setPrice(edit.getPrice());
			editProduct.setCost(edit.getCost());
			editProduct.setUpdateDate(LocalDate.now());
			editProduct.setUpdateDate(editProduct.getRegisterDate());
			editProduct.setQuantity(edit.getQuantity());

			Decimal decimal = new Decimal();
			BigDecimal editPercent = decimal.findPercent(edit.getPrice(), edit.getCost());
			editProduct.setPercent(editPercent);
			productRepository.save(editProduct);
			return editProduct;
		} else {
			throw new IdNotFoundException("-This ID not Found!");
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
