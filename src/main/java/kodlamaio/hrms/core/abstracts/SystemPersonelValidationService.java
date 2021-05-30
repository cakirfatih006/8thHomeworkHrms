package kodlamaio.hrms.core.abstracts;

import kodlamaio.hrms.entities.concretes.User;

public interface SystemPersonelValidationService { // sistem personeli tarafından işverene ve iş arayana onay.

	
		boolean isActivate(User User);
}
