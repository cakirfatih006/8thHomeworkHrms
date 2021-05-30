package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="verification_codes")
@Inheritance(strategy = InheritanceType.JOINED)
public class VerificationCode { // base 

	@Id							
	@GeneratedValue(strategy = GenerationType.IDENTITY)				
	@Column(name="id")	
	private int id;
	
	
	@Column(name="code")
	private String code;
	
	@Column(name="is_verified")
	private boolean isVerified;
	
	@Column(name="verified_date")
	private Date verifiedDate;
	
	
	
	
	
}
