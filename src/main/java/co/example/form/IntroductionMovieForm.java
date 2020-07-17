package co.example.form;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class IntroductionMovieForm {

	/** 紹介映画ID */
	private Integer introductionMovieId;
	/** ユーザーID */
	private Integer userId;
	/** 日付 */
	private Timestamp date;
	/** APIのID */
	private Integer apiId;
	/** 紹介文 */
	private String sentence;
	/** 公開・非公開 */
	private Integer disclosureId;
	/** 紹介ユーザーID */
	private Integer partnerId;
	/** 状態 */
	private Integer statusId;
	/** 更新日時 */
	private Timestamp updateDate;
	/** バージョン */
	private Integer version;

}
