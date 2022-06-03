package employees.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import employees.model.Employees;
import employees.repository.EmployeesRepository;
import employees.service.IEmployeesService;
@Service
public class IEmployeesServiceImpl implements IEmployeesService{

	@Autowired
	private EmployeesRepository employeesRepository;

	@Override
	public Employees save(Employees e) {
		return employeesRepository.save(e);
	}

	@Override
	public List<Employees> findAll() {
		return employeesRepository.findAll();
	}

	@Override
	public Page<Employees> findAll(Pageable pageable) {
		return employeesRepository.findAll(pageable);
	}

	@Override
	public List<Employees> findAll(Sort sort) {
		return employeesRepository.findAll(sort);
	}

	@Override
	public List<Employees> findAllById(List<Integer> emplId) {
		return employeesRepository.findAllById(emplId);
	}

	@Override
	public Optional<Employees> findById(Integer emplId) {
		return employeesRepository.findById(emplId);
	}
	@Override
	public long count() {
		return employeesRepository.count();
	}

	@Override
	public void deleteById(Integer emplId) {
		employeesRepository.deleteById(emplId);
	}

	@Override
	public void delete(Employees e) {
		employeesRepository.delete(e);
	}

	@Override
	public Employees getById(Integer id) {
		return employeesRepository.getById(id);
	}

	
}
