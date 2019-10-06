package birol.utility;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import birol.dto.Reading;


public interface ReadingRepository extends CrudRepository<Reading, Integer>{	
	
	@Query(value="select * from VIEW_METER_READING where customer_id= ?1 and BILLING_MONTH=?2 and BILLING_YEAR=?3", nativeQuery=true)
	public List<Reading> findReadingbyIdMonthYear(String cus_id, int m, int y);
	
	@Query(value="select mmr.* from VIEW_METER_READING mmr, CUSTOMER c where MMR.CUSTOMER_ID= C.CUSTOMER_ID and C.CUSTOMER_CATEGORY=?1 and BILLING_MONTH=?2 and BILLING_YEAR=?3", nativeQuery=true)
	public List<Reading> findReadingbyCategoryMonthYear(String cat_id, int m, int y);	
	
	@Query(value="select mmr.* from VIEW_METER_READING mmr, CUSTOMER c where MMR.CUSTOMER_ID= C.CUSTOMER_ID and C.AREA=?1 and BILLING_MONTH=?2 and BILLING_YEAR=?3", nativeQuery=true)
	public List<Reading> findReadingbyAreaMonthYear(String area_id, int m, int y);	
	
	
}
