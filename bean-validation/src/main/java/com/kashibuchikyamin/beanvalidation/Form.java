package com.kashibuchikyamin.beanvalidation;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * 入力フォームクラス
 *
 */
@Data
public class Form {

	/**
	 * 氏名
	 */
	@NotBlank
	String name;

	/**
	 * メールアドレス
	 */
	@NotBlank
	@Email
	String email;

	/**
	 * 電話連絡可能
	 */
	boolean useTel;

	/**
	 * 電話番号
	 */
	String telNumber;

}
