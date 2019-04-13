package com.intland.eurocup.common.model;

import lombok.Getter;
import lombok.ToString;

/**
 * .
 */
@Getter @ToString
public enum DrawResult {
  WINNER("You have won!"), 
  LOSER("Sorry, but you weren't lucky!"),
  PREVIOUS_WINNER("Voucher previously used! Voucher is a winner!"), 
  PREVIOUS_LOSER("Voucher previously used! Voucher is a loser!"),
  VOUCHER_USED("Voucher was already submitted by someone else"),
  EMAIL_USED("Email is already used! A user can only submit one voucher!"),  
  ERROR("Error");

  private String description;

  DrawResult(final String description) {
    this.description = description;
  }

  public static DrawResult getEnumFromCode(final String description) {
    DrawResult orderStatus = null;
    for (final DrawResult o : DrawResult.values()) {
      if (orderStatus == null && o.getDescription().equals(description)) {
        orderStatus = o;
      }
    }
    return orderStatus;
  }
}
