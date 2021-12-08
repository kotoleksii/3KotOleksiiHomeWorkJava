package edu.itstep;

public class Refrigerator extends Product {
    private String compressorType;
    private int height;

    public Refrigerator(int categoryID, String title, int price, String compressorType, int height) {
        super(categoryID, title, price);
        this.compressorType = compressorType;
        this.height = height;
    }

    public String getCompressorType() {
        return compressorType;
    }

    public void setCompressorType(String compressorType) {
        this.compressorType = compressorType;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "\tХолодильник " + briefInformation() +
                "\n\t\tТип компресора: " + compressorType + ", Висота: " + height + "см";
    }
}
