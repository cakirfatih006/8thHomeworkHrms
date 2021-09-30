package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.LanguageService;
import kodlamaio.hrms.core.dtoConverter.DtoConverterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.DataSuccessResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.LanguageDao;
import kodlamaio.hrms.entities.concretes.Language;
import kodlamaio.hrms.entities.dtos.LanguageDto;
@Service
public class LanguageManager implements LanguageService{

	
	private LanguageDao languageDao;
	private DtoConverterService dtoConverterService;
	
	
	@Autowired
	public LanguageManager(LanguageDao languageDao, DtoConverterService dtoConverterService) {
		super();
		this.languageDao = languageDao;
		this.dtoConverterService = dtoConverterService;
	}

	@Override
	public Result add(Language language) {
		languageDao.save(language);
		return new SuccessResult("Başarıyla Eklendi");
	}

	@Override
	public DataResult<List<Language>> getAll() {
		return new DataSuccessResult<List<Language>>(languageDao.findAll(), "Başarıyla Listelendi");
	}


	@Override
	public Result addDto(LanguageDto languageDto) {
		languageDao.save((Language) dtoConverterService.dtoClassConverter(languageDto, Language.class));
		return new SuccessResult("Başarıyla Eklendi");
	}

	@Override
	public DataResult<List<LanguageDto>> getAllDto() {
		return new DataSuccessResult<List<LanguageDto>>
		(this.dtoConverterService.dtoConverter(languageDao.findAll(),LanguageDto.class), "Data Listelendi");
	}

}
