package kodlamaio.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.LanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Language;
import kodlamaio.hrms.entities.dtos.LanguageDto;


@RestController
@RequestMapping("/api/language")
public class LanguageController {
	
	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Language>> getAll(){
		return this.languageService.getAll();
	}
	
	
	@PostMapping("/add")
	public Result add(@Valid @RequestBody Language language) {
		return this.languageService.add(language);
	  }
	
	@GetMapping("/getallDto")
	public DataResult<List<LanguageDto>> getAllDto(){
		return this.languageService.getAllDto();
	}
	
	
	@PostMapping("/addDto")
	public Result addDto(@Valid @RequestBody LanguageDto languageDto) {
		return this.languageService.addDto(languageDto);
	  }

}
