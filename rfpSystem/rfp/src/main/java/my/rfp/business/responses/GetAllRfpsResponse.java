package my.rfp.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class GetAllRfpsResponse {
	private int id;
    private String ref_no;
    private String requirement_description;
    private String  priority;
    private String  level_of_coverage;
    private String commentss;
    private String module_parent;
    private String module_child;  
}
