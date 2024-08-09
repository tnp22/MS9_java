package day04.Class;

public class Raichu extends Pikachu {

	
	//alt + shift + S : c
	public Raichu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Raichu(int energy, String type) {
		super(energy, type);
		// TODO Auto-generated constructor stub
	}
	//alt + shift + S : v
	
	
	public String cAttack() {
		return "아이언테일";
	}

	@Override
	public String aAttack() {
		// TODO Auto-generated method stub
		return "천만볼트";
	}

	@Override
	public String bAttack() {
		// TODO Auto-generated method stub
		return "볼트체인지";
	}
	
	
}
