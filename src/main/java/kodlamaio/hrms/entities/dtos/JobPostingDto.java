package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPostingDto {

	@JsonProperty(access = Access.READ_ONLY)
	private int id;
	private String employerCompanyName;
	private String jobTitleTitle;
	private String cityCity;
	private String jobDetails;
	private double minSalary;
	private double maxSalary;
	private int quotaPosition;
	private LocalDate applicationDeadline;
	private LocalDate createdDate;

	
	
	
}
