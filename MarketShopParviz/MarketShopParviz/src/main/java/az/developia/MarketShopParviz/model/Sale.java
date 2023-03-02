package az.developia.MarketShopParviz.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sales")
@Data
@NoArgsConstructor
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String barcode;
	private Double price;
	private Double cost;
	private LocalDate sale_date;
	private Integer quantity;
	private BigDecimal percent;
	private Integer categoryId;       	
	
	
	
	
	
	
	
	
	
	
	

}
