package HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Class<Reflection> clazz = Reflection.class;
        Field[] allFields = clazz.getDeclaredFields();
        Method[] allMethods = clazz.getDeclaredMethods();

        Arrays.stream(allFields).filter(f->!Modifier.isPrivate(f.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(f-> System.out.printf("%s must be private!%n",f.getName()));

        Arrays.stream(allMethods)
                .filter(Main::isGetter)
                .filter(f->!Modifier.isPublic(f.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(f-> System.out.printf("%s have to be public!%n",f.getName()));

        Arrays.stream(allMethods)
                .filter(Main::isSetter)
                .filter(f->!Modifier.isPrivate(f.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(f-> System.out.printf("%s have to be private!%n",f.getName()));
    }
    private static boolean isGetter(Method m){
        if(!m.getName().startsWith("get")) return false;
        if(m.getReturnType().equals(void.class)) return false;
        if(m.getParameterCount()>0) return false;
        return true;
    }
    private static boolean isSetter(Method m){
        if(!m.getName().startsWith("set")) return false;
        if(!m.getReturnType().equals(void.class)) return false;
        if(m.getParameterCount()==0) return false;
        return true;
    }
}
