package kodlamaio.hrms.core.adapters;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.abstracts.EmailValidationService;
import kodlamaio.hrms.entities.concretes.User;

@Service
public class EmailValidationAdapter implements EmailValidationService {

	@Override
	public boolean isActivate(User user) {
		
		return true;
	}

}
