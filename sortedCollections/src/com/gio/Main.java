package com.gio;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.5, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.4, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet())
            System.out.println(s);

        Basket giosBasket = new Basket("Gio");
        sellItem(giosBasket, "car", 1);
        System.out.println(giosBasket);

        sellItem(giosBasket, "car", 1);
        System.out.println(giosBasket);

        if(sellItem(giosBasket, "car", 1) != 1)
            System.out.println("There are no more cars in stock");

        sellItem(giosBasket, "car", 1);
        sellItem(giosBasket, "spanner", 5);
        System.out.println(giosBasket);

        sellItem(giosBasket, "juice", 4);
        sellItem(giosBasket, "cup", 12);
        sellItem(giosBasket, "bread", 1);
        System.out.println(giosBasket);

        System.out.println(stockList);

//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp); // will throw error, as map is unmodifiableMap

        stockList.Items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);

        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet())
            System.out.println(price.getKey() + " costs " + price.getValue());
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.reserveStock(item, quantity) != 0)
            return basket.addToBasket(stockItem, quantity);

        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if(basket.removeFromBasket(stockItem, quantity) == quantity)
            return stockList.unreserveStock(item, quantity);

        return 0;
    }

    public static void checkout(Basket basket) {
        for(Map.Entry<StockItem, Integer> item: basket.Items().entrySet())
            stockList.sellStock(item.getKey().getName(), item.getValue());
        basket.clearBasket();
    }
}
