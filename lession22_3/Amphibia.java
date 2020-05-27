package lession22_3;

public class Amphibia {
	private String type;
	public Amphibia() {
	}

	public Amphibia(String type) {
		this.type = type;
	}
	
	public void eat() {
		System.out.println(type+" eating");
	}

	public void sleep() {
		System.out.println(type+" sleeping");
	}

	public void swin() {
		System.out.println(type+" switing");
	}

	public void walk() {
		System.out.println(type+" walking");
	}

	@Override
	public String toString() {
		return "Amphibia [type=" + type + "]";
	}

}
