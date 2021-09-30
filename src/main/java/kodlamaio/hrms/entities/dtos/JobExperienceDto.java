package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;

import javax.validation.constraints.Past;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobExperienceDto {

	@JsonIgnore
	private int id;
	private int resumeId;
	private String companyName;
	@Past
	private LocalDate startedDate;
	private LocalDate endedDate;
	private int jobTitleId;
	
	
}
