package az.developia.MarketShopParviz.advice;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import az.developia.MarketShopParviz.exception.EnumNotFoundException;
import az.developia.MarketShopParviz.exception.ErrorResponse;
import az.developia.MarketShopParviz.exception.IdNotFoundException;
import az.developia.MarketShopParviz.exception.NotFoundException;
import az.developia.MarketShopParviz.exception.UsernameAlreadyDefinedException;

@RestControllerAdvice
public class GlobalAdvice {

	
	@ExceptionHandler(UsernameAlreadyDefinedException.class)
	public ResponseEntity<Object> handleUsernameAlreadyDefinedException(UsernameAlreadyDefinedException exception) {
		ErrorResponse response = new ErrorResponse();
		response.setMessage(exception.getMessage());
		response.setDate(LocalDateTime.now());
		response.setErrorCode(HttpStatus.CONFLICT);
		return new ResponseEntity<Object>(response, HttpStatus.CONFLICT);
	}

	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public String handleEnumNotFoundException(EnumNotFoundException exception) {
		return exception.getMessage();
	}
	
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object> handleIdNotFoundException(IdNotFoundException exception) {
		ErrorResponse response = new ErrorResponse();
		response.setMessage(exception.getMessage());
		response.setDate(LocalDateTime.now());
		response.setErrorCode(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Object>(response, HttpStatus.NOT_FOUND);
	}
	
	
	

	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public String handleNotFoundException(NotFoundException exception) {
		return exception.getMessage();
	}
	
	
	
	
	
	
}