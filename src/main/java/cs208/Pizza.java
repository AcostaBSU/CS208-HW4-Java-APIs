package cs208;

import java.util.Random;

public class Pizza {
    String[] pizza = {"Cheese", "Veggie", "BBQ Chicken", "Hawaiian", "Pepperoni"};
    public String getRandomPizza()
    {
        Random random_number = new Random();
        return pizza[random_number.nextInt(pizza.length)];
    }

}
