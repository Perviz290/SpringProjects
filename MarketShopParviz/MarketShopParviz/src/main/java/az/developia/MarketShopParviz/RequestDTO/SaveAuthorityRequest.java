package az.developia.MarketShopParviz.RequestDTO;

import java.util.List;
import java.util.Set;

import az.developia.MarketShopParviz.model.AuthorityList;
import lombok.Data;

@Data
public class SaveAuthorityRequest {

	private String username;
	
	private Set<AuthorityList>list;
	
	
	
}
