package co.example.domain;

import lombok.Data;

/**
 * 鑑賞のドメインクラス.
 * 
 * @author sakai
 *
 */
@Data
public class Watch {

	/** 鑑賞ID */
	private Integer watchId;
	/** 鑑賞名 */
	private String watchName;
	
}
