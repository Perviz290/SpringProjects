package az.developia.MarketShopParviz.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class UserModel {
	
	@Id
	private String username;
	
	private String password;
	
	private Boolean enabled;
	
	@Enumerated(value = EnumType.STRING)
	private Role role;
	
	
	//@ManyToMany
	//@JoinTable(name = "authorities",
	//joinColumns = @JoinColumn(name="username"),
	//inverseJoinColumns = @JoinColumn(name="authority"))
	//@JsonIgnoreProperties(value = "users")
	//List<AuthorityList>authoritylist;
	
	
}
