package in.ashokit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
