package employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employees.model.Employees;
@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer>{

}
