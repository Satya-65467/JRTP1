package in.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.Repository.EmpRepository;
import in.ashokit.entity.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		
		EmpRepository empRepo=context.getBean(EmpRepository.class);
		
	/*	Employee e= new Employee();
		e.setEmpName("Milan");
		e.setEmpSalary(4000.00);
		
		Address a1= new Address();
		a1.setCity("BBSR");
		a1.setState("Odisha");
		a1.setCountry("India");
		a1.setEmp(e);
		
		Address a2= new Address();
		a2.setCity("Hyd");
		a2.setState("Tg");
		a2.setCountry("India");
		a2.setEmp(e);
		
		List <Address> addrList=Arrays.asList(a1, a2);
		e.setAddr(addrList);
		empRepo.save(e); */
		
		//empRepo.deleteById(1);
		
		//AddressRepository addrRepo=context.getBean(AddressRepository.class);
		//addrRepo.deleteById(4);
		
		Optional <Employee> s1=empRepo.findById(2);
		System.out.println(s1);
		
		
		System.out.println("Record Inserted...");
		
		
		
		
		
	
	}

}
