package br.com.minecart.core.entities;

public class Cash {
    private int quantity;
    private String command;

    public Cash(int quantity, String command) {
        this.quantity = quantity;
        this.command = command;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getCommand() {
        return this.command;
    }
}
