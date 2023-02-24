package az.developia.MarketShopParviz.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {
	
	private String message;
	private LocalDateTime date;
	private HttpStatus errorCode;
	
	

}
