package my.rfp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import my.rfp.business.RfpService;
import my.rfp.business.requests.CreateRfpRequest;
import my.rfp.business.requests.UpdateRfpRequest;
import my.rfp.business.responses.GetAllRfpsResponse;
import my.rfp.business.responses.GetByIdRfpsResponse;
import my.rfp.business.rules.RfpBusinessRules;

@RestController // do not forget that , if you do , you can not see funcs on swagger
@RequestMapping("/api/rfps")
public class RfpControllers {
	
	List<GetAllRfpsResponse> rfp1;
	
//	@Autowired // bunu koymadığımda 500 hata
	private RfpService rfpService;
	private GetByIdRfpsResponse getByIdRfpsResponse;

	private RfpBusinessRules rfpBusinessRules;
	  @Autowired
	    public RfpControllers(RfpService rfpService, RfpBusinessRules rfpBusinessRules) {
	        this.rfpService = rfpService;
	        this.rfpBusinessRules = rfpBusinessRules;
	        this.getByIdRfpsResponse= getByIdRfpsResponse;
	    }
	@GetMapping("/allRfps")
	public List<GetAllRfpsResponse> getAllRfps(){
		rfp1=rfpService.getAll();
		
		 for (int i = 0; i < rfp1.size(); i++) {
			  System.out.println(rfp1.get(i).getCommentss());
			  System.out.println(rfp1.get(i).getLevel_of_coverage());
			  System.out.println(rfp1.get(i).getPriority());
			  System.out.println(rfp1.get(i).getRef_no());
			  System.out.println(rfp1.get(i).getRequirement_description());
			  System.out.println(rfp1.get(i).getId()); System.out.println(); 
		  	  System.out.println(rfp1.get(i).getModule_parent());
		  	  System.out.println(rfp1.get(i).getModule_child());
		 }
			return rfp1;
	}

	@PostMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody() @Valid() CreateRfpRequest createRfpRequest) {
		rfpBusinessRules.checkIfRfprequirement_descriptionExists(createRfpRequest.getRequirement_description());
		this.rfpService.add(createRfpRequest);
	}
	
	@GetMapping("/{id}")
	public GetByIdRfpsResponse getById(@PathVariable int id) {
		 rfpBusinessRules.checkIfRfpExistsById(id);
		 return rfpService.getById(id);
	}
	
	@PutMapping
	public void update(@RequestBody() UpdateRfpRequest updateRfpRequest) {
		rfpBusinessRules.checkIfRfpExistsById(updateRfpRequest.getId());
	this.rfpService.update(updateRfpRequest);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.rfpService.delete(id);
	}
	 
}
