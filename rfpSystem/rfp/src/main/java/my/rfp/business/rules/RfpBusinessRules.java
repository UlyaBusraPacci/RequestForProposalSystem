package my.rfp.business.rules;

import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import my.rfp.dataAccess.RfpRepository;
import my.rfp.entities.Rfp;

@AllArgsConstructor
@Service
public class RfpBusinessRules {

	private RfpRepository rfpRepository;
	
	public Rfp checkIfRfpExistsById(int id){
        Optional<Rfp> rfp = rfpRepository.findById(id);

        if(!rfp.isPresent()){
            throw new RuntimeException("ID is invalid because RFP does not exists");
        }

        return rfp.get();
    }

	public void checkIfRfprequirement_descriptionExists(String requirement_description) {
		String checkingUrl="l";
	}
}
