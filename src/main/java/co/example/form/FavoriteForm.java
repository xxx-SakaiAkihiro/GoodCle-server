package co.example.form;

import lombok.Data;

@Data
public class FavoriteForm {

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
