package com.si.starter.service.activator;

import org.springframework.messaging.Message;

import com.si.starter.beans.Employee;

public class EmpDeptService {

	public Employee getEmpDept(Message<Integer> empId) {
		// outbound call to micro service or IE

		Employee eDept = new Employee();
		eDept.setDept("CBGT");
		eDept.setId(empId.getPayload());

		return eDept;
	}
}
