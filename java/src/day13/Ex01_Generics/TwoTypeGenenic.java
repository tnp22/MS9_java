package day13.Ex01_Generics;

// 제네릭 기법으로 타입 매개변수 2개 지정
class keyValue<K, V> {

	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}

public class TwoTypeGenenic {
	public static void main(String[] args) {
		keyValue<String, Integer> kv = new keyValue<String, Integer>();
		kv.setKey("java");
		kv.setValue(100);

		keyValue<Integer, String> kv2 = new keyValue<Integer, String>();
		kv2.setKey(100);
		kv2.setValue("java2");

		System.out.println("kv - key : " + kv.getKey());
		System.out.println("kv - value : " + kv.getValue());

		System.out.println("kv2 - key : " + kv2.getKey());
		System.out.println("kv2 - value : " + kv2.getValue());

		// K 타입은 지정하고, V 타입은 지정하지 않으려면?
		// Void : 해당 타입에는 변수를 사용하지 않도록 지정
		keyValue<String, Void> kv3 = new keyValue<>();
		kv3.setKey("키 만");
		String key3 = kv3.getKey();
		System.out.println("key3 : " + key3);

	}
}
