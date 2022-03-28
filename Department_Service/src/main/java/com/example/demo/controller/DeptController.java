package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Department;
import com.example.demo.Service.DeptServiceImpl;

@RestController
@RequestMapping("/department")
public class DeptController {
	
	@Autowired
	private DeptServiceImpl ds;
	
	@GetMapping("/{id}")
	public Department findByDepartmentID(@PathVariable("id")Integer deptID){	
		return ds.findByDepartmentID(deptID);
	}
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		return ds.saveDepartment(department);
		
	}

}
