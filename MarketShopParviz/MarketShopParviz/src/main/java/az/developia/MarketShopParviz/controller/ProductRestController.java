package az.developia.MarketShopParviz.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import az.developia.MarketShopParviz.RequestDTO.SaveProductRequest;
import az.developia.MarketShopParviz.editdto.editProductDTO;
import az.developia.MarketShopParviz.model.Product;
import az.developia.MarketShopParviz.service.ProductService;

@RestController
@RequestMapping(path = "/product")
public class ProductRestController {

	@Autowired
	private ProductService productService;

	// Save Product with category
	@PostMapping
	@PreAuthorize(value = "hasAuthority('admin')")
	public void saveProduct(@RequestBody SaveProductRequest save) {
		productService.save(save);
	}

	// Get All Product
	@GetMapping
	@PreAuthorize(value = "hasAuthority('admin')")
	public List<Product> getAllProduct() {
		return productService.findAll();
	}

	// Get All Product with CategoryId
	@GetMapping(path = "/categoryId/{categoryId}")
	@PreAuthorize(value = "hasAuthority('admin')")
	public List<Product> getAllProductByCategoryId(@PathVariable Integer categoryId) {
		return productService.getAllProductByCategoryId(categoryId);
	}

	// Get One Product
	@GetMapping(path = "/{id}")
	@PreAuthorize(value = "hasAuthority('admin')")
	public Product getOneProduct(@PathVariable Long id) {
		return productService.findById(id);
	}

	// Delete By ProductId
	@DeleteMapping(path = "/{id}")
	@PreAuthorize(value = "hasAuthority('admin')")
	public void deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
	}

	// Edit Product 
	@PutMapping
	@PreAuthorize(value = "hasAuthority('admin')")
	public Product editProduct(@RequestBody editProductDTO edit) {
		return productService.editProduct(edit);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
