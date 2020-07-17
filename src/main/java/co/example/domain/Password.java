package co.example.domain;

import java.sql.Timestamp;

import lombok.Data;

/**
 * パスワードのドメインクラス.
 * 
 * @author sakai
 *
 */
@Data
public class Password {

	/** パスワードID */
	private Integer passwordId;
	/** メールアドレス */
	private String mailAddress;
	/** パスワード */
	private String password;
	/** 登録日時 */
	private Timestamp registerDate;
	
}
