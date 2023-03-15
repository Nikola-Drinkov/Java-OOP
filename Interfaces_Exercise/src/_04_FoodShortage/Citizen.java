package _04_FoodShortage;

public class Citizen implements Identifiable, Person, Buyer {
    private int food;
    private String id;
    private String birthDate;
    private String name;
    private int age;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.food = 0;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getFood() {
        return food;
    }
}
