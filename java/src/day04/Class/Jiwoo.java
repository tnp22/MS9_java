package day04.Class;

public class Jiwoo {
	public static void main(String[] args) {
		Pikachu pikachu = new Pikachu();

		System.out.println(":::::피카츄:::::");
		System.out.println("에너지 : " + pikachu.energy);
		System.out.println("타입 : " + pikachu.type);
		System.out.println("공격A : " + pikachu.aAttack());
		System.out.println("공격B : " + pikachu.bAttack());
		System.out.println();

		Pikachu pikachu2 = new Pikachu(1000000, "노말-전기");

		System.out.println(":::::피카츄2:::::");
		System.out.println("에너지 : " + pikachu2.energy);
		System.out.println("타입 : " + pikachu2.type);
		System.out.println("공격A : " + pikachu2.aAttack());
		System.out.println("공격B : " + pikachu2.bAttack());
		System.out.println();
		
		Raichu raichu = new Raichu(300,"전기전기");

		System.out.println(":::::라이츄:::::");
		System.out.println("에너지 : " + raichu.energy);
		System.out.println("타입 : " + raichu.type);
		System.out.println("공격A : " + raichu.aAttack());
		System.out.println("공격B : " + raichu.bAttack());
		System.out.println("공격C : " + raichu.cAttack());
		System.out.println();
	}
}
