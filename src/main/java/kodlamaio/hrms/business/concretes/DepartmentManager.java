package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.DepartmentService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.DepartmentDao;
import kodlamaio.hrms.entites.concretes.Department;

@Service
public class DepartmentManager implements DepartmentService{

	private DepartmentDao departmentDao;

	@Autowired
	public DepartmentManager(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}

	@Override
	public Result add(Department department) {
		// TODO Auto-generated method stub
		this.departmentDao.save(department);
		return new SuccessResult(department.getName() + " başarıyla eklendi!");
	}

	@Override
	public DataResult<List<Department>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Department>>(this.departmentDao.findAll(), "Data başarıyla listelendi!");
	}
	
	
	
	
	
}