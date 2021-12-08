package edu.itstep;

public class Microwave extends Product {
    private int amount;
    private int power;

    public Microwave(int categoryID, String title, int price, int amount, int power) {
        super(categoryID, title, price);
        this.amount = amount;
        this.power = power;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "\tМікрохвильовка " + briefInformation() +
                "\n\t\tОб`єм: " + amount + "л, Потужність: " + power + "Вт";
    }
}
