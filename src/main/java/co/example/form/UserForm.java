package co.example.form;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class UserForm {

	/** ユーザーID */
	private Integer userId;
	/** ユーザー名 */
	private String userName;
	/** ユーザーアドレス */
	private String mailAddress;
	/** 登録日時 */
	private Timestamp registerDate;
	/** ステータスID */
	private Integer statusId;

}
