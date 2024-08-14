package day08.DesignPattern.Builder;

public class Builder {
	public static void main(String[] args) {
		Pikachu pikachu = new Pikachu.Builder()
									 .level(10)
									 .energy(100)
									 .type("전기")
									 .build();
		System.out.println(pikachu);
		System.out.println(pikachu.getEnergy());
	}
}
