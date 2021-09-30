package kodlamaio.hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
//@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cities")
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobPosting"})
public class City {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="city")
	private String city;
	
	
	/*@JsonIgnore
	@OneToMany(mappedBy = "city")
	private List<JobPosting> jobPostings;*/
	
	
}
