package co.example.domain;

import lombok.Data;

/**
 * 公開・非公開のドメインクラス.
 * 
 * @author sakai
 *
 */
@Data
public class Disclosure {

	/** 公開・非公開ID */
	private Integer disclosureId;
	/** 公開・非公開名 */
	private String disclosureName;
	
}
