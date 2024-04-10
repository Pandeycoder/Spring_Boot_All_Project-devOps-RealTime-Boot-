package in.nareshit.raghu.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.exception.UomNotFoundException;
import in.nareshit.raghu.model.Uom;
import in.nareshit.raghu.service.IUomService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "UOM SERVICES FOR PART SUPPORT")
@RestController
@RequestMapping("/uom")
public class UomRestController {
	
	private static final Logger LOG = LoggerFactory.getLogger(UomRestController.class);

	@Autowired
	private IUomService service;
	
	//1. fetch all
	@ApiOperation("TO FETCH ALL UOMS FROM DATABASE")
	@GetMapping("/all")
	public ResponseEntity<?> getAllUoms() {
		LOG.info("ENTERED INTO GET ALL UOMS METHOD");
		ResponseEntity<?> response = null;
		try {
			
			List<Uom> list = service.getAllUoms();
			response = new ResponseEntity<List<Uom>>(
					list,
					HttpStatus.OK);//200
			LOG.debug("DATA LOADED IS {}",list.toString());
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("UNABLE TO PROCESS LOADING {}",e.getMessage());
			response = new ResponseEntity<String>(
					e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);//500
		}
		LOG.info("ABOUT TO LEAVE FETCH ALL");
		return response;
	}
	
	
	//2. fetch one
	@GetMapping("/fetch/{id}")
	public ResponseEntity<?> getOneUom(
			@PathVariable Integer id
			) 
	{
		LOG.info("ENTERED INTO FETCH ONE UOM");
		ResponseEntity<?> response = null;
		
		try {
			Uom uom = service.getOneUom(id);
			response = new ResponseEntity<Uom>(
					uom,
					HttpStatus.OK);
			LOG.debug(" UOM FOUND {}",uom);
			
		} catch (UomNotFoundException unfe) {
			LOG.error("UNABLE TO FETCH UOM : {}",unfe.getMessage());
			throw unfe;
			
		} catch (Exception e) {
			LOG.error("UNABLE TO PROCESS REQUEST : {}",e.getMessage());
			e.printStackTrace();
			response = new ResponseEntity<String>(
					e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		LOG.info("ABOUT TO LEAVE FETCH ONE");
		return response;
	}
	
	
	//3. save
	@ApiOperation("TO CREATE NEW UOM AT APPLIATION")
	@PostMapping("/create")
	public ResponseEntity<String> createUom(
			@RequestBody Uom uom) 
	{
		LOG.info("ENTERED INTO SAVE UOM");
		ResponseEntity<String> response  = null;
		try {
			Integer id = service.saveUom(uom);
			String message = "Uom '"+id+"' created!";
			response = new ResponseEntity<String>(
					message,
					HttpStatus.CREATED);//201
			LOG.debug(message);
		} catch (Exception e) {
			LOG.error("UNABLE TO PROCESS REQUEST : {}",e.getMessage());
			e.printStackTrace();
			response = new ResponseEntity<String>(
					e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR); //500
		}
		LOG.info("ABOUT TO LEAVE SAVE UOM");
		return response;
		
	}
	
	
	//4. delete
	//@ApiIgnore
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> removeUom(
			@PathVariable Integer id) 
	{
		LOG.info("ENTERED INTTO DELETE UOM");
		ResponseEntity<String> response = null;
		
		try {
			service.deleteUom(id);
			String message = "Uom '"+id+"' Deleted";
			response = new ResponseEntity<String>(
					message,
					HttpStatus.OK
					);
			LOG.debug(message);
		}  catch (UomNotFoundException unfe) {
			LOG.error("UNABLE TO FETCH UOM : {}",unfe.getMessage());
			throw unfe;
		}  catch (Exception e) {
			LOG.error("UNABLE TO PROCESS REQUEST : {}",e.getMessage());
			e.printStackTrace();
			response = new ResponseEntity<String>(
					e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		LOG.info("ABOUT TO LEAVE DELETE METHOD");
		return response;
	}
	
	
	//5. update
	@PutMapping("/modify")
	public ResponseEntity<String> updateUom(
			@RequestBody Uom uom
			) 
	{
		LOG.info("ENTERED INTO UPDATE METHOD");
		ResponseEntity<String> response = null;
		try {
			
			 service.updateUom(uom);
			 String message = "Uom updated!!";
			 response = new ResponseEntity<String>(
					 message,
					 HttpStatus.OK);
			
		} catch (UomNotFoundException unfe) {
			LOG.error("UNABLE TO FETCH UOM : {}",unfe.getMessage());
			throw unfe;
			
		} catch (Exception e) {
			LOG.error("UNABLE TO PROCESS REQUEST : {}",e.getMessage());
			e.printStackTrace();
			response = new ResponseEntity<String>(
					e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		LOG.info("ABOUT TO LEAVE UPDATE METHOD");
		return response;
	}
	
}
