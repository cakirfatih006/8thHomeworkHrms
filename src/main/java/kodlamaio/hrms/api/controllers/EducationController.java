package kodlamaio.hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;


import kodlamaio.hrms.entities.dtos.EducationDto;

@RestController
@RequestMapping("/api/education")
public class EducationController {

	private EducationService educationService;
	@Autowired
	public EducationController(EducationService educationService) {
		super();
		this.educationService = educationService;
	}
	
	
	

	
	@PostMapping("/add")
	public Result addDto(@Valid @RequestBody EducationDto educationDto) {
		
		return this.educationService.addDto(educationDto);
	}
	
	
	
	@GetMapping("/get")
	public DataResult<List<EducationDto>> getAllDto() {
		
		return this.educationService.getAllDto();
		
	}
	
	@GetMapping("/getOrderByDate")
	public DataResult<List<EducationDto>> findAllByResumeIdOrderByEndedDateDesc(int id){
		
		return this.educationService.findAllByResumeIdOrderByEndedDateDesc(id);
		
	}
}
