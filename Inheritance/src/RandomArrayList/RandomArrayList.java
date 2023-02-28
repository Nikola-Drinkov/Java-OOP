package RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {
    private Random random;

    public RandomArrayList() {
        super();
    }
    public T getRandomElement(){
        random = new Random();
        int index = random.nextInt(super.size());
        T element = super.get(index);
        super.remove(element);
        return element;
    }
}
