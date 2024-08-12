package day04.Class;

public class Pikachu {

	public int energy;
	public String type;
	
	public Pikachu() {
		this(100, "전기");
	}

	//알트 쉬프트 s: o
	public Pikachu(int energy, String type) {
		super();
		this.energy = energy;
		this.type = type;
	}

	public String aAttack() {
		return "십만볼트";
	}

	public String bAttack() {
		return "전광석화";
	}

	//toString()
	//반환값
	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + "]";
	}

}
