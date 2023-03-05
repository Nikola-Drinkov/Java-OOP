package animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        checkBlank(name);
        this.name = name;
        if(age<0)  throw new IllegalArgumentException("Invalid input!");
        this.age = age;
        checkBlank(gender);
        this.gender = gender;
    }
    private void checkBlank(String input){
        if(input==null||input.trim().isEmpty())
            throw new IllegalArgumentException("Invalid input!");
    }
    public String produceSound(){
        return "";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(System.lineSeparator())
                .append(String.format("%s %d %s",name,age,gender)).append(System.lineSeparator())
                        .append(produceSound());
        return sb.toString();
    }
}
