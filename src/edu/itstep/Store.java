package edu.itstep;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private ArrayList<Product> productList;
    private Scanner sc;

    public Store() {
        productList = new ArrayList<>();
        productList.add(new Television(1, "Xiaomi Mi TV 4A", 700000,
                32, "HD (1366x768)", "LED"));
        productList.add(new Television(1, "Philips 43PUS7506/12", 1200000,
                43, "4K (3840x2160)", "LED"));
        productList.add(new Microwave(2, "Xiaomi Mijia MWBLXE1ACM", 250000,
                20, 700));
        productList.add(new Microwave(2, "Panasonic NN-ST254MZPE", 290000,
                20, 800));
        productList.add(new Refrigerator(3, "Viomi BCD-301WMSAYM", 1790000,
                "Інвенторний", 190));
        productList.add(new Refrigerator(3, "Bosch KGN39XI326", 1949900,
                "Інвенторний", 203));
        sc = new Scanner(System.in);
    }

    private void selectedProductCategoryMenu() {
        boolean running = true;

        while (running) {
            System.out.println("\n1.Телевізори\n2.Мікрохвильовки\n3.Холодильники\n0.Вихід");

            System.out.print("\nВиберіть категорію: ");
            int option = sc.nextInt();
            System.out.println();

            switch (option) {
                case 0:
                    running = false;
                    break;
                case 1:
                    selectedProductModelMenu(1);
                    break;
                case 2:
                    selectedProductModelMenu(2);
                    break;
                case 3:
                    selectedProductModelMenu(3);
                    break;
                default:
                    System.out.println("Щось пішло не так ... Спробуйте ще!");
            }
        }
    }

    private void selectedProductModelMenu(int categoryID) {
        while (true) {
            int productID = 0;

            for (int i = 0; i < productList.size(); i++) {
                productList.get(i).setId(0);

                if (productList.get(i).getCategoryID() == categoryID) {
                    System.out.println(
                            ++productID +
                        "." +
                    productList.get(i).briefInformation());

                    productList.get(i).setId(productID);
                }
            }
            System.out.println("0.Назад*");

            System.out.print("\nВиберіть продукт: ");
            int choice = sc.nextInt();
//            System.out.println();

            if (choice == 0)
                break;

            selectedProductModelInfoMenu(choice);
        }
    }

    private void selectedProductModelInfoMenu(int option) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == option) {
                System.out.println("\nОпис " + productList.get(i).toString());
                break;
            }
        }
        while (option != 0) {
            System.out.print("\nНатисніть 0 для повернення в попереднє меню: ");
            option = sc.nextInt();
            System.out.println();

            if (option != 0)
                System.out.println("Введіть 0 для продовження ... ");
        }
    }

    public void start() {
        selectedProductCategoryMenu();
    }
}
