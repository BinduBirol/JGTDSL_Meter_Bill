package birol.utility;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import birol.dto.BillMeteredDTO;

public interface BillMeteredRepo extends CrudRepository<BillMeteredDTO, String>{
	
}
