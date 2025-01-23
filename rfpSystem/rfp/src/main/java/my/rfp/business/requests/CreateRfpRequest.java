package my.rfp.business.requests;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRfpRequest {
  
	private int id;
	private String ref_no;
	private String requirement_description;
	private String  priority;
	private String  level_of_coverage;
	private String commentss;
	private String module_parent;
	private String module_child;
}
