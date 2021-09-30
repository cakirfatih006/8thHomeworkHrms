package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;

import kodlamaio.hrms.entities.dtos.EducationDto;


public interface EducationService {

	//Result add(Education education);
	
	//DataResult<List<Education>> getAll();
	
	DataResult<List<EducationDto>> getAllDto();
	
	DataResult<List<EducationDto>> findAllByResumeIdOrderByEndedDateDesc(int id);
	
	Result addDto (EducationDto educationDto);
	
	
}
