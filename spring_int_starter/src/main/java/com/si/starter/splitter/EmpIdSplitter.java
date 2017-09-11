package com.si.starter.splitter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.messaging.Message;

import com.si.starter.beans.Employee;

public class EmpIdSplitter {

	public List<Integer> splitEmpId(Message<List<Employee>> employees){
		
		List<Integer> empIdList = new ArrayList<>();
		
		for (Employee employee: employees.getPayload()) {
			empIdList.add(employee.getId());
		}
		
		return empIdList;
		
		
	}
}
