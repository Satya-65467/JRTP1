package in.ashokit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
