package RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {

    public RandomArrayList() {
        super();
    }
    public T getRandomElement(){
        Random random = new Random();
        int index = random.nextInt(super.size());
        T element = super.get(index);
        super.remove(element);
        return element;
    }
}
