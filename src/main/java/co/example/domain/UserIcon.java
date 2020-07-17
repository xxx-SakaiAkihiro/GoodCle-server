package co.example.domain;

import lombok.Data;

/**
 * ユーザーアイコンのドメインクラス.
 * 
 * @author sakai
 *
 */
@Data
public class UserIcon {

	/** アイコンID */
	private Integer iconId;
	/** アイコン画像パス */
	private String iconImagePath;
	
}
