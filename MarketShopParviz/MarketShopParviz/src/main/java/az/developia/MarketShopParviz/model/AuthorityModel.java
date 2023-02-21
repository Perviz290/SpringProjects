package az.developia.MarketShopParviz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "authorities")
@Data
@NoArgsConstructor
public class AuthorityModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private String username;
	
	private String authority;
	
	
	/*
	 * @ManyToMany
	 * 
	 * @JoinTable(name = "user_authorities", joinColumns
	 * = @JoinColumn(name="authorities_id"), inverseJoinColumns
	 * = @JoinColumn(name="user_id"))
	 * 
	 * @JsonIgnoreProperties(value = "authorityModels") List<UserModel>userModels;
	 */
	
	
	
	
	
	
	
	
	
	
	
}
