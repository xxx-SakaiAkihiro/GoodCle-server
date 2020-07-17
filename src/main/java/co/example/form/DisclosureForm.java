package co.example.form;

import lombok.Data;

@Data
public class DisclosureForm {

	/** 公開・非公開ID */
	private Integer disclosureId;
	/** 公開・非公開名 */
	private String disclosureName;

}
