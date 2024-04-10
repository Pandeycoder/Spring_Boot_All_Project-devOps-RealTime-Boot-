package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nareshit.raghu.model.Uom;

public interface UomRepository extends JpaRepository<Uom, Integer>
{

	@Query("SELECT count(uomCode) FROM Uom WHERE uomCode=:uomCode")
	Integer getUomCodeCount(String uomCode);
	
}
