package kodlamaio.hrms.core.abstracts;

import kodlamaio.hrms.entities.concretes.User;

public interface EmailValidationService { // genel üye olma email kontrol
	
	
	boolean isActivate(User user);
	
}
