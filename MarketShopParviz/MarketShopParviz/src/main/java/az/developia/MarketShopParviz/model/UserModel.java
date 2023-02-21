package az.developia.MarketShopParviz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class UserModel {
	
	@Id
	@Column(unique = true)
	private String username;
	
	private String password;
	
	private Boolean enabled;
	
	@Enumerated(value = EnumType.STRING)
	private Role role;
	
	
	
	
	
}
