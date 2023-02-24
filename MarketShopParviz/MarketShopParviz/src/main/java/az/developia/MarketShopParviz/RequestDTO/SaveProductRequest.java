package az.developia.MarketShopParviz.RequestDTO;

import lombok.Data;

@Data
public class SaveProductRequest {

	private String name;
	
	private String barcode;
	
	private Double price;
	
	private Double cost;
	
	private Integer quantity;
	
	private Integer categoryId;

}
