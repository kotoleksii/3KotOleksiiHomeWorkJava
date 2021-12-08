package edu.itstep;

public class Television extends Product {
    private int screenDiagonal;
    private String screenResolution;
    private String type;

    public Television(int categoryID, String title, int price,
                      int screenDiagonal, String screenResolution, String type) {
        super(categoryID, title, price);
        this.screenDiagonal = screenDiagonal;
        this.screenResolution = screenResolution;
        this.type = type;
    }

    public int getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(int screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\tТелевізор " + briefInformation() +
                "\n\t\tДіагональ: " + screenDiagonal + "\", Розширення: " +
                screenResolution + ", Тип: " + type;
    }
}
