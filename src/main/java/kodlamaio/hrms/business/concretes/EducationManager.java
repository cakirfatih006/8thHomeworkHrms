package kodlamaio.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import kodlamaio.hrms.business.abstracts.EducationService;

import kodlamaio.hrms.core.dtoConverter.DtoConverterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.DataSuccessResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EducationDao;
import kodlamaio.hrms.entities.concretes.Education;
import kodlamaio.hrms.entities.dtos.EducationDto;
@Service
public class EducationManager implements EducationService {

	private EducationDao educationDao;
	private ModelMapper modelMapper;
	private DtoConverterService dtoConverterService;
	//private ResumeService resumeService;
	
	
	
	@Autowired
	public EducationManager(EducationDao educationDao,ModelMapper modelMapper,DtoConverterService dtoConverterService) {
		super();
		this.educationDao = educationDao;
		this.modelMapper = modelMapper;
		this.dtoConverterService = dtoConverterService;
		
	}
	
	private List<EducationDto> dtoManuelConverter(List<Education> education){
		List<EducationDto> eduDto = new ArrayList <EducationDto>();
		education.forEach(x -> {
			EducationDto dto = this.modelMapper.map(x, EducationDto.class);
			eduDto.add(dto);
		});
		
		return eduDto;
	}


	
	@Override
	public DataResult<List<EducationDto>> getAllDto() { // manuel ile
		
		return new DataSuccessResult<List<EducationDto>>
		(this.dtoManuelConverter(this.educationDao.findAll()),"liste getirildi");
	}

	@Override
	public DataResult<List<EducationDto>> findAllByResumeIdOrderByEndedDateDesc(int id) { // manuel ile
		
		return new DataSuccessResult<List<EducationDto>>(this.dtoManuelConverter(this.educationDao.findAllByResumeIdOrderByEndedDateDesc(id)),"Tarihe göre listelendi.");
	}

	@Override
	public Result addDto(EducationDto educationDto) { // ortak converter ile
		//Education education= (Education) dtoConverterService.dtoClassConverter(educationDto, Education.class);
		//education.setResume(this.resumeService.getById(educationDto.getResumeId())); 
		
		educationDao.save((Education) dtoConverterService.dtoClassConverter(educationDto, Education.class));
		
		return new SuccessResult("Başarıyla eklendi.");
	}
	
	/*@Override
	public Result add(Education education) {
		
		educationDao.save(education);
		
		return new SuccessResult("başarıyla eklendi.");
	}*/

	/*@Override
	public DataResult<List<Education>> getAll() {
		
		return new DataSuccessResult<List<Education>>(this.educationDao.findAll(), "okul listesi getirildi.");
	}*/


	

	
	
	
}
