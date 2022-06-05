package j_collection;

import java.util.HashSet;
import java.util.Set;

public class MemberExample {

	public static void main(String[] args) {
		
		//HashSet<Member> hashSet = new HashSet<Member>(); -> ctrl + 1 눌러서
		Set<Member> set = new HashSet<Member>();
		Member member1 = new Member("홍길동", 30);
		
		set.add(member1);
		set.add(member1);
		set.add(member1);
		set.add(member1); //이렇게 추가하면 주소가 같은 것을 추가하는 것이기에 중복 저장되지 않음

		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		set.add(new Member("이순신", 20));
		set.add(new Member("홍길동", 25));
System.out.println(set.size());
	}

}
