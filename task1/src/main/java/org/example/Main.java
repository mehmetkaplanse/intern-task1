package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* Ödev 1 */
        Item item = new Item("Laptop","TechSupplier",22000.0,4500.0);
        System.out.println("Ürün adı : " + item.getProductName());
        System.out.println("Tedarikçi adı : " + item.getSupplier());
        System.out.println("Satış Fiyatı: " + item.getSalePrice());

        item.increaseSalePriceBy20Percent();
        System.out.println("%20 arttırılmış satış fiyatı :"+item.getSalePrice());

        double profit = item.calculateProfit();
        System.out.println("Kar :"+profit);

        /* Ödev 2 */
        Item item1 = new Item("Laptop1","TechSupplier1",12000.0,1500.0);
        Item item2 = new Item("Laptop2","TechSupplier2",22000.0,2500.0);
        Item item3 = new Item("Laptop3","TechSupplier3",32000.0,3500.0);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Sepetin toplam fiyatı: " + totalPrice);



        /* Ödev 3 */
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("Dikdörtgenin alanı: " + area);
        System.out.println("Dikdörtgenin çevresi: " + perimeter);


        /* Ödev 4 */
        for(int i=1; i<=100; i++) {
            if(i%3==0 && i%5==0) {
                System.out.println(i + " hem 3'e hem de 5'e bölünebilir.");
            }
        }

    }
}