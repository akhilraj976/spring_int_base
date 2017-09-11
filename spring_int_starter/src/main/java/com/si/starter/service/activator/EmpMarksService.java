package com.si.starter.service.activator;

import org.springframework.messaging.Message;

import com.si.starter.beans.Employee;

public class EmpMarksService {

	public Employee getEmpMarks(Message<Integer> empId) {
		// outbound call to micro service or IE

		Employee eMarks = new Employee();
		eMarks.setId(empId.getPayload());
		eMarks.setMarks(123);
		eMarks.setDept("CBGT");

		return eMarks;
	}
}
