package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * Object put(Object key, object value) : 저장된 키와 값을 저장
		 * Object remove(Object key) : 지정된 키로 저장된 값을 제거
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환
		 * Set keySet() : 저장된 모든 키를 Set으로 반환
		 */

		HashMap<String, Object> map = new HashMap<String, Object>();
		//스트링 타입 많이 사용
		
		map.put("age",  10); //put으로 값 저장
		map.put("name",  "홍길동");
		map.put("date",  new Date());
		System.out.println(map); //hash map은 인덱스가 없기 때문에 순서가 존재하지 않음
		
		System.out.println("---------------------------------------------------");
		
		map.put("name",  "이순신"); // 기존의 것을 덮어씀. 가장 마지막의 덮어쓴 값이 남게 됨
		System.out.println(map); //이순신으로 바뀌어 있음
		
		System.out.println("---------------------------------------------------");
		
		map.remove("age");
		System.out.println(map); //age 사라짐
		
		System.out.println("---------------------------------------------------");
		
		Object value = map.get("name"); //제네릭으로 지정했던 타입으로 리턴. 제일 첫 줄 <String, Object>부분
		System.out.println(value);
		
		System.out.println("---------------------------------------------------");
		
		//꺼냈을 때(리턴) Object 타입이라 뭘 어떻게 할 수 없음. 실제 객체는 String이나 Object 타입의 변수에 들어있음.
		//String 클래스에 존재하는 메소드를 사용할 수 없음. 타입이 Object니까
		//다형성 때문에 Object 클래스 안에 있는 메소드만 사용 가능한 상태
		
//		value.substring(1,2); //Object라서 String의 메소드를 사용할 수 없음
//		(String)value.substring(1,2); // 딱 이만큼만 String으로 형변환 하는거라 이렇게 쓰면 안 되고
		((String)value).substring(1,2); //아예 형변환을 싹 시켜주고 실행
		String str = (String)map.get("name"); //혹은 이렇게 형변환. 타입이 확실할 때에 사용
		
		
		//keySet
		Set<String> keys = map.keySet(); //set은 같은 값이 저장되지 않음
		//set의 문제점. get이 존재하지 않아서 값은 하나씩 꺼낼 수 없음
		//iterator를 사용해도 되지만 굳이..?
		
		//향상된 for문. iterator보다 간편
		for(String key : keys) { //콜론 앞 = 값을 저장할 변수, 콜론 뒤 : 순서가 있는 배열같은 것(배열, Array List, Set 등)
			System.out.println(key + " : " + map.get(key));
		}
		
		
		//hashmap 왜? 어디에 쓰는가?
		//자바와 db를 연결해서 쓸 예정
		//db는 컬럼이 있고 값이 존재
		//그 db의 구조를 표현할 수 있는 방법이 필요함
		//컬럼 하나씩 담는 방법이 2가지가 있음
		//1. 클래스 만든 후 변수로 컬럼을 만듦 -> 행 이름을 변수를 만들어서 array list에 값을 저장
		
		ArrayList<Dept> deptTable = new ArrayList<Dept>(); // 클래스 dept 만들어서 arraylist에 저장
		
		
		//2. array list에 hash map을 저장
		ArrayList<HashMap<String, Object>> anyTable = new ArrayList<HashMap<String,Object>>();
		//hash map은 key를 통해 값을 저장
		//key는 컬럼 명, 값은 컬럼 값
		//hash map에 컬럼명, 컬럼값 3개를 저장하면 한 행 저장 완성
		//그걸 array list에 저장하면 테이블의 형태가 됨
		
		//장단점
		//1번 장정 : 클래스를 보면 테이블 구조 쉽게 파악 가능 (컬럼, 타입 등)
		//1번 단점 : 테이블 수만큼 클래스도 생성해야 함
		//2번 장점 : array list  하나로 모든 테이블을 만들 수 있음
		//2번 다점 : 테이블 구조를 알기 힘듦
		//1번은 구조를 알기 쉽기에 주로 중요한 테이블을 만들 때 사용 ex) 회원테이블
		//2번은 구조 파악이 중요한 것이 않은, 그리 중요치 않은 테이블을 만들 때 주로 사용.
		
		
		//2번 방법 해보기
		System.out.println("---------------------------------------------------");
		
		ArrayList<HashMap<String, Object>> table = new ArrayList<HashMap<String,Object>>();
		HashMap<String, Object> row = new HashMap<String, Object>()	;
		//10 accounting new york을 넣을 것
		row.put("DEPTNO", 10);
		row.put("DNAME", "ACCOUNTING");
		row.put("LOC", "NEW YORK");
		table.add(row);
		
		row = new HashMap<String, Object>();
		row.put("DEPTNO", 20);
		row.put("DNAME", "RESEARCH");
		row.put("LOC", "DALLAS");
		table.add(row);
		
		System.out.println(table);
		
		
		
		//직접 해보기
		System.out.println("---------------------------------------------------");

		ArrayList<HashMap<String, Object>> colleage = new ArrayList<HashMap<String,Object>>();
		HashMap<String, Object> rows = new HashMap<String, Object>();
		
		rows.put("COLL_CODE", "W01");
		rows.put("COLL_NAME", "솔아시아매니지먼트");
		colleage.add(rows);
		
		rows = new HashMap<String, Object>();
		rows.put("COLL_CODE", "W02");
		rows.put("COLL_NAME", "외식조리");
		colleage.add(rows);
		
		rows = new HashMap<String, Object>();
		rows.put("COLL_CODE", "W03");
		rows.put("COLL_NAME", "철도물류");
		colleage.add(rows);
		
		rows = new HashMap<String, Object>();
		rows.put("COLL_CODE", "W04");
		rows.put("COLL_NAME", "디지털미디어");
		colleage.add(rows);
		
		rows = new HashMap<String, Object>();
		rows.put("COLL_CODE", "W05");
		rows.put("COLL_NAME", "보건복지");
		colleage.add(rows);
		
		System.out.println(colleage);
		for(int i = 0; i < colleage.size(); i++) {
			rows = colleage.get(i);
			for(String key : rows.keySet()) {
				System.out.println(i + " : " + key + " / " + rows.get(key));
			}
			System.out.println("--------------------------");
		}
		
		for(int i = 0; i < colleage.size(); i++) {
			rows = colleage.get(i);
			System.out.println(rows.get("COLL_NAME"));
			System.out.println(rows.get("COLL_CODE"));
			for(String key : rows.keySet()) {
				System.out.println(i + " : " + key + " / " + rows.get(key));
			}
			System.out.println("--------------------------");
		}
		
	}

}


class Dept{
	int deptNo;
	String dName;
	String loc;
}
