package j_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		/*
		 * Set(집합) 쓸 일이 거의 없음
		 * 데이터 중복 X, 중복 데이터는 들어가지 않음
		 * set : HashSet, TreeSet
		 */
		
		Set<String> set = new HashSet<String>(); //<> 안에는 데이터 타입을 넣어줌
		set.add("홍길동");
		set.add("자바");
		set.add("java");
		set.add("java");
		set.add("java");
		System.out.println(set.size());
		//java가 중복이기 때문에 포함되지 않아서 3이 출력 됨
		System.out.println("=======================================");
		
		//반복자
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
			System.out.println("=======================================");
		}
		
		for(String string : set) {
			System.out.println(string);
		}
		

	}

}
