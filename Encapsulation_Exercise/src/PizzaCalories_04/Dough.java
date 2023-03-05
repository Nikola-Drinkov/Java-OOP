package PizzaCalories_04;

import java.util.*;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    private static final Map<String, Double> flours;
    static {
        flours = new LinkedHashMap<>();
        flours.put("White",1.5);
        flours.put("Wholegrain", 1.0);
    }
    private static final Map<String, Double> techniquesMap;
    static {
        techniquesMap = new LinkedHashMap<>();
        techniquesMap.put("Crispy",0.9);
        techniquesMap.put("Chewy", 1.1);
        techniquesMap.put("Homemade", 1.0);
    }


    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }
    private void setWeight(double weight){
        if(weight<1||weight>200) throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        this.weight = weight;
    }
    private void setFlourType(String flourType) {
        if(!flours.containsKey(flourType)) throw new IllegalArgumentException("Invalid type of dough.");
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if(!techniquesMap.containsKey(bakingTechnique)) throw new IllegalArgumentException("Invalid type of dough.");
        this.bakingTechnique = bakingTechnique;
    }
    public double calculateCalories(){
        double doughModifier = flours.get(flourType);
        double techniqueModifier = techniquesMap.get(bakingTechnique);
        return (2*weight)*doughModifier*techniqueModifier;
    }
}
