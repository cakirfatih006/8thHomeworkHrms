package kodlamaio.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="users")
public class User {
	
	@Id							
	@GeneratedValue(strategy = GenerationType.IDENTITY)				
	@Column(name="id") 
	private int id;
	
	@Email(message = "Lütfen Geçerli Bir Mail Adresi Giriniz")
	@NotBlank(message="Mail Alanı Boş olamaz")
	@Column(name="email")
	private String email;
	
	@NotBlank(message="Şifre Alanı Boş olamaz")
	@Size(min=6, max=16, message="Şifre en az 6, en fazla 16 karakterden oluşabilir")
	@Column(name="password")
	private String password;
	
	
	

	@NotBlank(message="Şifre Alanı Boş olamaz")
	@Transient
	@JsonProperty(access = Access.WRITE_ONLY)
	private String repeatPassword;
	
	
	
	
	
}
