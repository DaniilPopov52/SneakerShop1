package com.example.sneakershop1;

import android.content.res.Resources;

import java.util.List;
import java.util.Vector;

public class ShoppingCartHelper {

    public static final String PRODUCT_INDEX = "PRODUCT_INDEX";

    private static List<Product> catalog;
    private static List<Product> cart;

    public static List<Product> getCatalog(Resources res){
        if(catalog == null) {
            catalog = new Vector<Product>();
            catalog.add(new Product("Adidas Streetball", res
                    .getDrawable(R.drawable.sneaker1),
                    "Стильная модель с камуфляжными вставками расскажет все о твоем бунтарском духе.", 11999));
            catalog.add(new Product("Adidas BLIZZARE", res
                    .getDrawable(R.drawable.autumn1),
                    "Не бойся холода. Наслаждайся им в этих зимних ботинках. В них тебе будет комфортно в прохладную погоду.", 7999));
            catalog.add(new Product("Adidas Streetball ", res
                    .getDrawable(R.drawable.summer1),
                    "КРОССОВКИ В СТИЛЕ 90-Х ДЛЯ ГОРОДСКИХ ДЖУНГЛЕЙ.", 9999));
            catalog.add(new Product("Nike Air Max 97", res
                    .getDrawable(R.drawable.spring1),
                    "Оригинальный дизайн кроссовок Nike Air Max 97 с волнистыми линиями, вдохновленный японскими скоростными поездами, создает стремительный образ. ", 14499));
            catalog.add(new Product("Air Jordan XXXV “DNA”", res
                    .getDrawable(R.drawable.summer2),
                    "Характерные черты бренда сформировали характер игроков, стремящихся вверх вместе с Jordan. ", 152999));
            catalog.add(new Product("Nike React Infinity Run Flyknit", res
                    .getDrawable(R.drawable.sport3),
                    "Новые кроссовки Nike React Infinity Run Flyknit снижают риск травм и помогают оставаться на дистанции.", 7580));
            catalog.add(new Product("Reebok", res
                    .getDrawable(R.drawable.winter1),
                    "Утепленные кроссовки, в них вы зимой точно не замёрзнете", 12990));
            catalog.add(new Product("Nike", res
                    .getDrawable(R.drawable.sports1),
                    "Хорошие весенние кроссовки", 9000));
            catalog.add(new Product("Nike", res
                    .getDrawable(R.drawable.winter2),
                    "Очень стильные летние кроссовки", 15990));
        }

        return catalog;
    }

    public static List<Product> getCart() {
        if(cart == null) {
            cart = new Vector<Product>();
        }

        return cart;
    }

}
