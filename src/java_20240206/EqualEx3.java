package java_20240206;

public class EqualEx3 {

	public static void main(String[] args) {

		Box2 b1 = new Box2(10);
		Box2 b2 = new Box2(10);

		System.out.println(b1 == b2);  //주소값 비교 => false

		System.out.println(b1.equals(b2));  //참조 주소 안 값을 비교 => true
		}

	}

	class Box2{
		int x;
		public Box2(int x) {
			this.x = x;
	}
	@Override
	public boolean equals(Object obj) {
			return x == ((Box2)obj).x;
		}
}
