package edu.itstep;

public abstract class Product {
    private int id;
    private int categoryID;
    private String title;
    private int price;

    public String briefInformation() {
        return title + " \t" + getPriceHR() + "грн";
    }

    public Product(int categoryID, String title, int price) {
        this.categoryID = categoryID;
        this.title = title;
        this.price = price;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPriceHR() {
        return price / 100;
    }
}
