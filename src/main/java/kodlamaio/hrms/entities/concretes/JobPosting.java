package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
//@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_postings")
public class JobPosting {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	
	/*@ManyToOne(targetEntity = JobTitle.class)
	@JoinColumn(name="job_titles_id")
	private JobTitle jobTitle;
	
	@ManyToOne(targetEntity = Employer.class)
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	@ManyToOne(targetEntity = City.class)
	@JoinColumn(name="city_id")
	private City city;*/
	
	@ManyToOne(targetEntity = City.class, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="city_id",referencedColumnName = "id", nullable = false)
	private City city;
	
	
	@ManyToOne(targetEntity = Employer.class, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="employer_id",referencedColumnName = "id", nullable = false)
	private Employer employer;
	
	
	@ManyToOne(targetEntity = JobTitle.class, fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="job_titles_id",referencedColumnName = "id", nullable = false)
	private JobTitle jobTitle;
	
	@Column(name="job_details")
	private String jobDetails;
	
	@Column(name="min_salary")
	private double minSalary;
	
	@Column(name="max_salary")
	private double maxSalary;
	
	@Column(name="quota_position")
	private int quotaPosition;
	
	@Column(name="application_deadline")
	//@Future
	private LocalDate applicationDeadline;
	
	@Column(name="is_activated")
	private boolean isActive=true;
	
	
	
	@Column(name="created_date",updatable = false)
	
	/*@CreationTimestamp 
	@Temporal(TemporalType.DATE)*/
	private LocalDate createdDate;

	
	
	
	
	

}
