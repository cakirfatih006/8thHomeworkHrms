package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPostingAddDto {

	@JsonIgnore
	private int id;
	private int employerId;
	private int jobTitleId;
	private int quotaPosition;
	private double minSalary;
	private double maxSalary;
	private int cityId;
	private LocalDate applicationDeadline;
	private LocalDate createdDate;
	private String jobDetails;
}
