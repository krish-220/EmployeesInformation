package com.example.EmployeeDetails.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeDetails.Repo.EmployeesRepo;
import com.example.EmployeeDetails.model.Employees;
import com.example.EmployeeDetails.service.EmployeesService;

@Service
public class EmployeesServImpl implements EmployeesService {
	@Autowired
	private EmployeesRepo employeerepo;

	@Override
	public List<Employees> findAllEmployees() {
		return (List<Employees>) employeerepo.findAll();
	}

	@Override
	public Employees findById(int id) {
		return employeerepo.findById(id).get();
	}

	@Override
	public Employees saveEmployeesService(Employees service) {

		return employeerepo.save(service);
	}

	@Override
	public void deleteById(int id) {

		employeerepo.deleteById(id);

	}

}
