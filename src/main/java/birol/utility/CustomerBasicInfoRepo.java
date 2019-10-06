package birol.utility;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import birol.dto.CustomerBasicDto;

public interface CustomerBasicInfoRepo extends CrudRepository<CustomerBasicDto, String> {
	
	@Query(value="select * from mview_customer_info where customer_id=? and AREA_ID=? and ismetered=1", nativeQuery=true)
	List<CustomerBasicDto> getByIndividual(String customer_id, String area_id);
	
	@Query(value="select * from mview_customer_info where CATEGORY_ID=? and AREA_ID=? and ismetered=1 and status=1", nativeQuery=true)
	List<CustomerBasicDto> getByCategory(String category_id, String area_id);
	
	@Query(value="select * from mview_customer_info where AREA_ID=? and ismetered=1 and status=1", nativeQuery=true)
	List<CustomerBasicDto> getByArea(String area_id);
}
