package Factory;

/* Abstract Factory */
// if You have hierarchy of types, you can have hierarchy of Factories

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

interface HotDrink {
    void consume();
}

class Tea implements HotDrink {


    @Override
    public void consume() {
        System.out.println("This tea is delicious");
    }
}

class Coffee implements HotDrink {


    @Override
    public void consume() {
        System.out.println("This Coffee is delicious");
    }
}

interface HotDrinkFactory {
    HotDrink prepare(int amount);
}

class TeaFactory implements HotDrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Put in a tea bag, boiled water, pour " + amount + "ml, add lemon, enjoy!");
        return new Tea();
    }
}

class CoffeeFactory implements HotDrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Grind some beans, boil water, pour " + amount + "ml, add cream and sugar, enjoy!");
        return new Coffee();
    }
}

class HotDrinkMachine {
    private List<KeyPair<String, HotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() throws Exception {
        Set<Class<? extends HotDrinkFactory>> types =  new Reflections("")
                .getSubTypesOf(HotDrinkFactory.class);

        for(Class<? extends HotDrinkFactory> type: types) {
            namedFactories.add(new KeyPair<>(
                    type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance()
            ));
        }
    }

    public HotDrink makeDrink() throws Exception {
        System.out.println("Available drinks: ");
        for (int index = 0; index < namedFactories.size(); ++index) {
            var item = namedFactories.get(index);
            System.out.println("" + index + ": " + item.getKey());
        }

        // ...
        return null;
    }
}

public class DemoAbstractFactory {
    public static void main(String[] args) throws Exception {
        HotDrinkMachine machine = new HotDrinkMachine();
        HotDrink drink = machine.makeDrink();
        drink.consume();
    }
}
