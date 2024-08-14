package day08.DesignPattern.Builder;

/**
 * 	빌더 패턴
 *  : 복잡한 객체를 단계적으로 구성할 수 있도록 해주는 디자인 패턴
 */
public class Pikachu {
	
	private int energy;
	private String type;
	private int level;
	
	public int getEnergy() {
		return energy;
	}
	
	public String getType() {
		return type;
	}
	
	public int getLevel() {
		return level;
	}
	
	private Pikachu(Builder builder) {
		this.energy = builder.energy;
		this.type = builder.type;
		this.level = builder.level;
	}
	// static 이너 클래스
	public static class Builder{
		
		private int energy;
		private String type;
		private int level;
		
		public Builder() {
			this(100,"",1);
		}
		public Builder(int energy, String type, int level) {
			this.energy = energy;
			this.type = type;
			this.level = level;
		}
		// 각각 변수를 지정하고 지정도니 객체를 반환하는 메소드
		
		public Builder energy(int energy) {
			this.energy = energy;
			return this;
		}
		public Builder type(String type) {
			this.type = type;
			return this;
		}
		public Builder level(int level) {
			this.level = level;
			return this;
		}
		
		// 객체 생성해주는 메소드
		public Pikachu build() {
			return new Pikachu(this);
		}
	}//builder 클래스 끝
	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + ", level=" + level + "]";
	}
	
	
	
	
}
