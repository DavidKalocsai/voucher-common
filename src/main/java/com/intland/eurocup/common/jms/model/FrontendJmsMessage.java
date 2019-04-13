package com.intland.eurocup.common.jms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class FrontendJmsMessage {
	private String voucher;
	private String email;
	private String territory;
}
