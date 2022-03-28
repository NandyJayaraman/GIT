package com.example.demo.Entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer deptID;
	
	
	private String deptname;
	
	
	private Integer deptCode;
	
	
	private String deptAddress;


	


	public Integer getDeptID() {
		return deptID;
	}


	public void setDeptID(Integer deptID) {
		this.deptID = deptID;
	}


	public String getDeptname() {
		return deptname;
	}


	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}


	public Integer getDeptCode() {
		return deptCode;
	}


	public void setDeptCode(Integer deptCode) {
		this.deptCode = deptCode;
	}


	public String getDeptAddress() {
		return deptAddress;
	}


	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}

	
	
	
	
}
