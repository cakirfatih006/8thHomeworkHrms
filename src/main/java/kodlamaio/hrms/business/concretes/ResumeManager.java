package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.ResumeService;
import kodlamaio.hrms.core.cloudinary.CloudinaryService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.DataSuccessResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ResumeDao;

import kodlamaio.hrms.entities.concretes.Resume;
@Service
public class ResumeManager implements ResumeService{

	private ResumeDao resumeDao;
	private CloudinaryService cloudinaryService;
	
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao,CloudinaryService cloudinaryService) {
		super();
		this.resumeDao = resumeDao;
		this.cloudinaryService = cloudinaryService;
	}


	@Override
	public Result add(Resume resume) {
	
		
		resumeDao.save(resume);
		return new SuccessResult("iş ilanı eklendi");
	}


	@Override
	public DataResult<List<Resume>> getAll() {
		
		return new DataSuccessResult<List<Resume>>(this.resumeDao.findAll(), "data listelendi");
	}


	@Override
	public Result saveImage(MultipartFile file, int resumeId) {
		
		
		Map<String, String> uploader = (Map<String, String>) 
				cloudinaryService.save(file).getData(); 
		String imageUrl= uploader.get("url");
		Resume Cv = resumeDao.getOne(resumeId);
		Cv.setPhotoLink(imageUrl);
		resumeDao.save(Cv);
		return new SuccessResult("Kayıt Başarılı");
	}


	@Override
	public Resume getById(int resumeId) {
		
		return this.resumeDao.findById(resumeId).get();
	}
	


}
