package java_20240206;

public class SplitEx01 {

	public static void main(String[] args) {

		String animals = "dog, cat, bear";
		String[] arr = animals.split(",", 2);
		
		//System.out.println(arr);
		
		for(String a : arr)
			System.out.println(a);
		
		System.out.println("--------------------------");
		
		arr = animals.split(", ");
		
		for(String a: arr)
			System.out.println(a);
		
		int i = "aaa".compareTo("aaa");    // i = 0
		int i2 = "aaa".compareTo("bbb");    // i2 = -1
		int i3 = "bbb".compareTo("aaa");     // i3 = 1
		StringBuffer sb = new StringBuffer("kor").append("eng").append(123);
		System.out.println(sb);
	}

	
}
