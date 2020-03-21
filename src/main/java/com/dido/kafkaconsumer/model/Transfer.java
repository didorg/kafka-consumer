package com.dido.kafkaconsumer.model;

public class Transfer {
    private int fromAccount;
    private int toAccount;
    private Long amount;

    public Transfer() {
    }

    public Transfer(int fromAccount, int toAccount, Long amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    public int getFromAccount() {
        return fromAccount;
    }

    public int getToAccount() {
        return toAccount;
    }

    public Long getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "fromAccount=" + fromAccount +
                ", toAccount=" + toAccount +
                ", amount=" + amount +
                '}';
    }
}
