package com.si.starter.service.activator;

import org.springframework.messaging.Message;

import com.si.starter.beans.Employee;

public class EmpDetailsService {

	public Employee getEmpDetails(Message<Integer> empId) {
		// outbound call to micro service or IE

		Employee eDetails = new Employee();
		eDetails.setId(empId.getPayload());
		eDetails.setAddress("Hyderabad");
		eDetails.setDept("CBGT");
		eDetails.setName("Akhil");

		return eDetails;
	}
}
