package com.intland.eurocup.common.jms.model;

import com.intland.eurocup.common.model.DrawResult;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class BackendJmsMesage {
	private Long requestId;
	private String voucher;
	private String email;
	private DrawResult drawResult;
}
