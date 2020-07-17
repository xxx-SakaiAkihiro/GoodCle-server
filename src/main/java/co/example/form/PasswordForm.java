package co.example.form;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class PasswordForm {

	/** パスワードID */
	private Integer passwordId;
	/** メールアドレス */
	private String mailAddress;
	/** パスワード */
	private String password;
	/** 登録日時 */
	private Timestamp registerDate;

}
