package lession22_1;

public class Main {

	public static void main(String[] args) {
		
		Pet cov = s -> System.out.println(s);
		cov.voice("Я корова- Мууу-Мууу");

		Pet dog = s -> System.out.println(s);
		dog.voice("Я пес - Гаууу-Гаууу");

		Pet cat = s -> System.out.println(s);
		cat.voice("Я кіт- Мяууу-Мяууу");
}

}
