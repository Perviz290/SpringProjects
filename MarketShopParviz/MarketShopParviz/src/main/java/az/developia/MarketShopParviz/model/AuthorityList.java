package az.developia.MarketShopParviz.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "authoritylist")
@Data
@NoArgsConstructor
public class AuthorityList {
	
	@Id
	private String authority;
	
	private String description;
	
	
	//@ManyToMany
	//@JoinTable(name = "authorities",
	//joinColumns = @JoinColumn(name="authority"),
	//inverseJoinColumns = @JoinColumn(name="username"))
	//@JsonIgnoreProperties(value = "authoritylist")
	//List<UserModel>users;
	
	

}
