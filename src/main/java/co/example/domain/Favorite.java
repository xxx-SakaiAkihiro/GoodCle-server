package co.example.domain;

import lombok.Data;

/**
 * お気に入りのドメインクラス.
 * 
 * @author sakai
 *
 */
@Data
public class Favorite {

	/** お気に入りID */
	private Integer favoriteId;
	/** APIのID */
	private Integer apiId;
	/** ユーザーID */
	private Integer userId;
	/** 鑑賞ID */
	private Integer watchId;
	/** 状態ID */
	private Integer statusId;

}
