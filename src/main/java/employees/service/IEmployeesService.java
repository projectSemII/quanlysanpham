package employees.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import employees.model.Employees;

public interface IEmployeesService {

	Employees getById(Integer id);

	void delete(Employees e);

	void deleteById(Integer emplId);

	long count();

	Optional<Employees> findById(Integer emplId);

	List<Employees> findAllById(List<Integer> emplId);

	List<Employees> findAll(Sort sort);

	Page<Employees> findAll(Pageable pageable);

	List<Employees> findAll();
	
	Employees save(Employees e);
	
}
