package com.baeldung.modules.banking.dto;

public class DebitBankCard extends BankCard {

  public DebitBankCard() {
  }

  public DebitBankCard(String number, User user) {
    super(number, user);
  }
}
