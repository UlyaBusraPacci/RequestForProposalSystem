package my.rfp.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import my.rfp.entities.Rfp;
@Repository
public interface RfpRepository extends JpaRepository<Rfp, Integer>{

}
 