package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobPosting;




public interface JobPostingDao extends JpaRepository<JobPosting, Integer>{

	List<JobPosting> findByIsActive(boolean status);
	List<JobPosting> findByIsActiveOrderByApplicationDeadline(boolean status);
	List<JobPosting> findByIsActiveAndEmployer_CompanyName(boolean status, String companyName);
	
	
	
	
	
	/*
	//DTO
	@Query("select new kodlamaio.hrms.entities.dtos.JobPostingDto"
			+ "(e.companyName,"
			+ "t.title,c.city,"
			+ "j.jobDetails,"
			+ "j.minSalary,"
			+ "j.maxSalary,"
			+ "j.quotaPosition,"
			+ "j.applicationDeadline) " +
            "from JobPosting j inner join j.employer e inner join j.jobTitle t inner join j.city c")		
		 List<JobPostingAddDto> getJobPostingDto();										
		 
		 // select * from Category c inner join Product p 
		 // on c.categoryId = p.categoryId
	*/
	/*@Query("From JobPosting where isActivated=true")
	List<JobPosting> getByIsActivated();*/
}
