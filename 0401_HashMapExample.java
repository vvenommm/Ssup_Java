package j_collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>(); //key와 value의 약자
		map.put("홍길동", 30);
		map.put("홍길동", 30);
		map.put("이순신", 25);
		map.put("신용권", 15);
		
		System.out.println(map.get("이순신"));
		
		System.out.println(map.size());
		
		Map<Integer, Grades> students = new HashMap<Integer, Grades>();
		students.put(1, new Grades("이정후", 50, 60, 70, 80, 90, 100, 100));
		students.put(2, new Grades("은주영", 80, 70, 90, 50, 100, 23, 43));
		System.out.println(students.get(2).getSoc());
	}

}
