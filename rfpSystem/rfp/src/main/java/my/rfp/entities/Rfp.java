package my.rfp.entities;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
@Entity
@Table(name="hio2") 
@NoArgsConstructor
public class Rfp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "ref_no")
    private String ref_no;
    
    @Column(name = "requirement_description",length = 200000)
    private String requirement_description;
    
    @Column(name = "priority",length = 200000) 
    private String  priority;

    @Column(name = "level_of_coverage",length = 200000)
    private String  level_of_coverage;
     
    @Column(name = "commentss",length = 200000) 
    private String commentss;
    
    @Column(name = "module_parent",length = 200000) 
    private String module_parent;
    
    @Column(name = "module_child",length = 200000) 
    private String module_child;


    public Rfp(int id, String ref_no, String requirement_description, String priority, String level_of_coverage,
		String comments, String module_parent, String module_child) {
		super();
		this.id = id;
		this.ref_no = ref_no;
		this.requirement_description = requirement_description;
		this.priority = priority;
		this.level_of_coverage = level_of_coverage;
		this.commentss = commentss;
		this.module_parent = module_parent;
		this.module_child = module_child;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getRef_no() {
		return ref_no;
	}


	public void setRef_no(String ref_no) {
		this.ref_no = ref_no;
	}


	public String getRequirement_description() {
		return requirement_description;
	}


	public void setRequirement_description(String requirement_description) {
		this.requirement_description = requirement_description;
	} 


	public String  getPriority() {
		return priority;
	}


	public void setPriority(String  priority) {
		this.priority = priority;
	}

	public String getLevel_of_coverage() {
		return level_of_coverage;
	}

	public void setLevel_of_coverage(String level_of_coverage) {
		this.level_of_coverage = level_of_coverage;
	}

	public String getCommentss() {
		return commentss;
	}


	public void setCommentss(String commentss) {
		this.commentss = commentss;
	}

	public String getModule_parent() {
		return module_parent;
	}

	public void setModule_parent(String module_parent) {
		this.module_parent = module_parent;
	}

	public String getModule_child() {
		return module_child;
	}

	public void setModule_child(String module_child) {
		this.module_child = module_child;
	}
}














