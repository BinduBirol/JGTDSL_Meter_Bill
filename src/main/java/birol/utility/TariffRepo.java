package birol.utility;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import birol.dto.TariffDTO;

public interface TariffRepo extends CrudRepository<TariffDTO, String>{
	
	@Query(value="select * from MST_TARIFF", nativeQuery=true)
	public List<TariffDTO> getAlltariffs();

}
