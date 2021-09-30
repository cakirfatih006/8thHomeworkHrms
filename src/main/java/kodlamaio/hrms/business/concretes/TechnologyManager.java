package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.TechnologyService;
import kodlamaio.hrms.core.dtoConverter.DtoConverterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.DataSuccessResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.TechnologyDao;
import kodlamaio.hrms.entities.concretes.Technology;
import kodlamaio.hrms.entities.dtos.TechnologyDto;
@Service
public class TechnologyManager implements TechnologyService{

	private TechnologyDao technologyDao;
	private DtoConverterService dtoConverterService;
	
	
	@Autowired
	public TechnologyManager(TechnologyDao technologyDao, DtoConverterService dtoConverterService) {
		super();
		this.technologyDao = technologyDao;
		this.dtoConverterService = dtoConverterService;
	}

	@Override
	public DataResult<List<Technology>> getAll() {
		
		return new DataSuccessResult<List<Technology>>(this.technologyDao.findAll(), "teknolohiler getirildi.");
	}

	@Override
	public Result add(Technology technology) {
		this.technologyDao.save(technology);
		return new SuccessResult("başarıyla eklendi.");
	}
	
	@Override
	public Result addDto(TechnologyDto technologyDto) {
		technologyDao.save((Technology) dtoConverterService.dtoClassConverter(technologyDto, Technology.class));
		return new SuccessResult("Başarıyla Eklendi");
	}

	@Override
	public DataResult<List<TechnologyDto>> getAllDto() {
		return new DataSuccessResult<List<TechnologyDto>>
		(dtoConverterService.dtoConverter(technologyDao.findAll(),TechnologyDto.class),"Başarıyla Listelendi");
	}


	
	
}
