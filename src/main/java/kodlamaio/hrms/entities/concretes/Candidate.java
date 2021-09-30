package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="candidates")
@PrimaryKeyJoinColumn(name="id") 
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Candidate extends User{
	
	
	@NotBlank(message="Ad Alanı Boş olamaz")
	@Size(min = 3, message = "İsim alanında en az 3 karakter kullanmanız gerekiyor") 
	@Column(name="first_name")
	private String firstName;
	
	
	@NotBlank(message="Soyad Alanı Boş olamaz")
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	@Size(min = 11, max=11, message = "TCKimlik No 11 hane olmalıdır")
	@NotBlank(message="TC Kimlik Numarası Alanı Boş Olamaz") 
	private String identityNumber;
	
	
	@Column(name="birth_year")
	@NotBlank(message="Doğum Yılı Alanı Boş Olamaz")
	private int birthYear;
	
	
	
}
