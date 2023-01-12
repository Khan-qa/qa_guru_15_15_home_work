package utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DateForTest {

    public List<String> kaspiProductsList = Arrays.asList("Kaspi Gold", "Kaspi Gold для ребенка", "Kaspi Red", "Kaspi Депозит",
            "Кредит на Покупки", "Кредит для ИП", "Кредит наличными");


    public String product = getRandomProduct();

    private static String getRandomProduct() {
        List<String> product = Arrays.asList("Яблоко", "Лимон", "Апельсин");

        return product.get(new Random().nextInt(product.size()));
    }

}
