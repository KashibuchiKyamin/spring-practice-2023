package com.kashibuchikyamin.beanvalidation;

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
	String name;
	
	
	/**
	 * メールアドレス
	 */
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
