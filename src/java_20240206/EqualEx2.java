package java_20240206;

public class EqualEx2 {

	public static void main(String[] args) {

		Box b1 = new Box("korea");
		Box b2 = new Box("korea");

		System.out.println(b1 == b2);  //주소값 비교 => false

		System.out.println(b1.equals(b2));  //참조 주소 안 값을 비교 => true
		}

	}

	class Box{

		String str;
		public Box(String str) {
			this.str = str;
	}
}
