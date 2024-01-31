package org.example.item;

import java.util.Scanner;

public class ItemCLI {

    public Item inputItem() {

        Scanner sc = new Scanner(System.in);
        System.out.println("상품이름 입력");
        String nm = sc.nextLine();
        System.out.println("상품설명 입력");
        String detail = sc.nextLine();
        System.out.println("상품 SELL,SOLD_OUT 입력");
        String sell_status = sc.nextLine();
        System.out.println("상품가격");
        int price = sc.nextInt();
        System.out.println("재고");
        int stock = sc.nextInt();

        return Item.builder()
                .item_nm(nm)
                .item_detail(detail)
                .item_sell_status(sell_status)
                .price(price)
                .stock_number(stock)
                .build();
    }
}
