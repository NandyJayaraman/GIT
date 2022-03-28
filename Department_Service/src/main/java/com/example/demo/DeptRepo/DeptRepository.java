package com.example.demo.DeptRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Department;


@Repository
public interface DeptRepository extends JpaRepository< Department , Integer>{
	
   Department findBydeptID(Integer deptID);
}




