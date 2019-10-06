package birol.bill;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import birol.dto.InputParams;
import birol.dto.Response;




@Controller
public class BillController {
	
	@Autowired
	BillingService service= new BillingService();
	
	@RequestMapping(value = "/process", method = RequestMethod.POST)
	public ResponseEntity<Response> saveProduct(@RequestBody InputParams inputParams) throws SQLException {		
		Response rsp= new Response();
		rsp= service.billProcess(inputParams);		
		return new ResponseEntity<Response>(rsp, HttpStatus.OK);
	}

}
