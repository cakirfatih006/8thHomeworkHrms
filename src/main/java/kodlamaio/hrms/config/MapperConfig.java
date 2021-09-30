package kodlamaio.hrms.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

	
	@Bean // class olarak kullanabilmeliyiz. managerda yeniden newlemicez
			// newlemeden modelmapper dan nesne kullanabiliriz.
	public ModelMapper modelMapper() {
		
		return new ModelMapper();
		
	}
	
}
