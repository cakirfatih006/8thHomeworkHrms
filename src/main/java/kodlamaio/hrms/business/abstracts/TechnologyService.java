package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;

import kodlamaio.hrms.entities.concretes.Technology;
import kodlamaio.hrms.entities.dtos.TechnologyDto;

public interface TechnologyService {

	
	DataResult<List<Technology>> getAll();
	
	Result add(Technology technology);
	
	
	Result addDto(TechnologyDto technologyDto);
	
	DataResult<List<TechnologyDto>> getAllDto();
}
