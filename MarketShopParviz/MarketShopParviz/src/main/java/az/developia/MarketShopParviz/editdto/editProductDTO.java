package az.developia.MarketShopParviz.editdto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class editProductDTO {

	private String name;
	private String barcode;
	private Double price;
	private Double cost;
	private Integer quantity;
	private Integer categoryId;
	
	
	
	
	
}
