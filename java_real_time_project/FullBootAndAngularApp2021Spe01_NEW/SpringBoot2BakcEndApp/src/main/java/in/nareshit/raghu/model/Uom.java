package in.nareshit.raghu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="uom_tab")
public class Uom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="uom_id_col")
	private Integer id;

	@Column(name="uom_type_col",nullable = false,length = 12)
	private String uomType;

	@Column(name="uom_model_col",nullable = false,length = 16,unique = true)
	private String uomCode;

	@Column(name="uom_desc_col",nullable = false,length = 110)
	private String uomDesc;
}
