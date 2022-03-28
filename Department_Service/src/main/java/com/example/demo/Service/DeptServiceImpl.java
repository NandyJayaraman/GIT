package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DeptRepo.DeptRepository;
import com.example.demo.Entity.Department;

@Service
public class DeptServiceImpl  {

	@Autowired
	DeptRepository deptRepo;
	
	
	public Department saveDepartment(Department dept) {
		return deptRepo.save(dept);
		
	}
	
	public Department findByDepartmentID(Integer deptID) {
		return deptRepo.findBydeptID(deptID);
		
	}
}
