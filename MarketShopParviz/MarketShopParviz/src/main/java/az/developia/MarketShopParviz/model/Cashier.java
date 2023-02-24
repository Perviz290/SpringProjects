package az.developia.MarketShopParviz.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cashiers")
@Data
@NoArgsConstructor
public class Cashier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String surname;
	
	private Date birthday;
	
	private String mail;
	
	private String phoneNumber;
	
	private String username;
	
	
	
	

}
