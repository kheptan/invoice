package kp.com.invoice.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class PaymentConverter implements AttributeConverter<Payment, Integer> {

	@Override
	public Integer convertToDatabaseColumn(Payment attribute) {
		if (attribute == null)
		     return null;
		
		switch (attribute) {
			case PAID:
				return 1;
			case UNPAID:
				return 2;
			case OVERDUE:
				return 3;
			default:
		            throw new IllegalArgumentException(attribute + " not supported.");
			}
	}

	@Override
	public Payment convertToEntityAttribute(Integer dbData) {
		if (dbData == null)
            return null;
		
		switch (dbData) {
			case 1: 
				return Payment.PAID;
			case 2: 
				return Payment.UNPAID;
			case 3:
				return Payment.OVERDUE;
			default:
	            throw new IllegalArgumentException(dbData + " not supported.");
	        
		}
	}

}
