package RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<Object> randomArrayList = new RandomArrayList<>();
        randomArrayList.add(5);
        randomArrayList.add(11);
        randomArrayList.add(31);
        randomArrayList.add(314);

        System.out.println(randomArrayList.getRandomElement());
    }
}
