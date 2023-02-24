package az.developia.MarketShopParviz.bean;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Decimal {
	
	
	public BigDecimal findPercent(Double price,Double cost ) {
		BigDecimal decimalP=new BigDecimal(price);
		BigDecimal decimalC=new BigDecimal(cost);
		BigDecimal subtract = decimalP.subtract(decimalC);
		BigDecimal divide = subtract.divide(decimalC,RoundingMode.HALF_UP);
		return divide.multiply(new BigDecimal(100));		
		}
	

}
