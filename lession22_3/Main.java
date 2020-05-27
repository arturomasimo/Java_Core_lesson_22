package lession22_3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		
		Amphibia fish = new Frog("predator");
		System.out.println(fish);

		fish.eat();
		fish.sleep();
		fish.walk();
		fish.swin();
/*---------------------------------------*/
		System.out.println();
		FishAction f = Frog::new;

		Amphibia fish1 = f.create("omnivorous");
		System.out.println(fish1);

		Method[] fields = Amphibia.class.getDeclaredMethods();

		for (Method method : fields) {
			// System.out.println(method.getName());
			if (!method.getName().equalsIgnoreCase("toString")) {
				try {
					Method methodRun = Amphibia.class.getMethod(method.getName(), method.getParameterTypes());
					methodRun.setAccessible(true);
					methodRun.invoke(fish1);
				} catch (NoSuchMethodException e) {
				} catch (SecurityException e) {
				} catch (IllegalAccessException e) {
				} catch (IllegalArgumentException e) {
				} catch (InvocationTargetException e) {
				}
			}
		}

	}

}

interface FishAction {
	Frog create(String type);
}