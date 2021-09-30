package kodlamaio.hrms.entities.dtos;


import lombok.NoArgsConstructor;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LanguageDto {

	private int resumeId;
	private String language;
	private char langLevel;
	private LocalDate createdDate;
	
}
