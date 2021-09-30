package kodlamaio.hrms.entities.dtos;

import lombok.NoArgsConstructor;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;

import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationDto {
	@JsonIgnore
	private int id;
	private int resumeId;
	private String schoolName;
	@JsonProperty(access = Access.WRITE_ONLY)
	private int graduateId;
	@JsonProperty(access = Access.READ_ONLY)
	private String graduateDescription;
	private String schoolDepartment;
	private LocalDate startedDate;
	private LocalDate endedDate;
	private LocalDate createdDate;
	
}
