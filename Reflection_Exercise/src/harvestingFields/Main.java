package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Class<RichSoilLand> aClass = RichSoilLand.class;
		Field[] fields = aClass.getDeclaredFields();

		String input = sc.nextLine();
		while (!input.equals("HARVEST")){
			switch (input){
				case"private":
					Arrays.stream(fields).filter(x->Modifier.isPrivate(x.getModifiers()))
							.forEach(x-> System.out.println(getAccessModifierName(x.getModifiers())+
									" "+x.getType().getSimpleName()+" "+x.getName()));
					break;
				case"public":
					Arrays.stream(fields).filter(x->Modifier.isPublic(x.getModifiers()))
							.forEach(x-> System.out.println(getAccessModifierName(x.getModifiers())+
									" "+x.getType().getSimpleName()+" "+x.getName()));
					break;
				case"protected":
					Arrays.stream(fields).filter(x->Modifier.isProtected(x.getModifiers()))
							.forEach(x-> System.out.println(getAccessModifierName(x.getModifiers())+
									" "+x.getType().getSimpleName()+" "+x.getName()));
					break;
				case"all":
					Arrays.stream(fields).forEach(x-> System.out.println(getAccessModifierName(x.getModifiers())+
									" "+x.getType().getSimpleName()+" "+x.getName()));
					break;
			}
			input = sc.nextLine();
		}
	}
	public static String getAccessModifierName(int modifier){
		if(Modifier.isPublic(modifier)) return "public";
		if(Modifier.isPrivate(modifier)) return "private";
		if(Modifier.isProtected(modifier)) return "protected";
		return "";
	}
}
