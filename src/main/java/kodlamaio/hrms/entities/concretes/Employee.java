package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employees")
@PrimaryKeyJoinColumn(name="id") 
public class Employee extends User{ // biz

	@NotBlank(message= "ad alanı boş olamaz")
	@Column(name="first_name")
	private String firstName;
	
	@NotBlank(message= "soyad alanı boş olamaz")
	@Column(name="last_name")
	private String lastName;


	
}
