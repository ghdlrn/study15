package java_20240206;

public class EqualEx1 {

	public static void main(String[] args) {
		String str1 = new String("korea");
		String str2 = new String("korea");
		
		System.out.println(str1 == str2);  //주소값 비교 => false
		
		System.out.println(str1.equals(str2));  //참조 주소 안 값을 비교 => true
	}

}