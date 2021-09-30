package kodlamaio.hrms.entities.concretes;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="resume_educations")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "education"})
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne(targetEntity = Resume.class)
	@JoinColumn(name="resume_id", referencedColumnName = "id")
	private Resume resume;
	
	@Column(name="school_name")
	@NotBlank(message="Boş geçilemez")
	private String schoolName;
	
	
	@ManyToOne(targetEntity = Graduate.class )
	@JoinColumn(name = "graduate_id" , referencedColumnName = "id", nullable = false)
	private Graduate graduate;
	
	@Column(name="school_department")
	@NotBlank(message="Boş geçilemez")
	private String schoolDepartment;
	
	@Column(name="started_date")
	private LocalDate startedDate;
	
	@Column(name="ended_date")
	private LocalDate endedDate;
	
	
	
	@Column(name="created_date")
	private LocalDate createdDate;


	

	
	
	
	
}
