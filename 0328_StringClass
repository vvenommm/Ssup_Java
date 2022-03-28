package i_api;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
		/*
		 * String
		 * : 여러 개의 문자를 사용하기 쉽게 만들어 놓은 클래스
		 * 
		 * String의 주요 메소드
		 * : equals() : 문자열의 내용이 같은지 반환
		 * : length() : 문자열의 길이를 반환
		 * : charAt() : 특정 인덱스에 위치한 문자를 반환
		 * : substring() : 문자열의 특정 부분을 잘라서 반환
		 * : indexOf() : 문자열 내의 특정 문자의 인덱스를 반환(문자 한 개)
		 * : contains() : 문자열이 특정 문자열을 포함하고 있는지 여부를 반환
		 * : split() : 문자열을 특정 문자를 기준으로 나누어 배열 형태로 반환
		 * : replace() : 문자열 내의 특정 문자를 다른 문자로 바꿔서 반환
		 * : trim() : 문자열 앞&뒤의 공백을 제거해 반환
		 * : valueOf() : 다른 타입의 데이터를 문자열로 변환해 반환
		*/
		
		boolean equals = "문자열".equals("문자열");
		System.out.println(equals);
		System.out.println("=================================");
		
		String str = "일2삼4오";
		int length = str.length();
		for(int i = 0; i < length; i++) {//str의 문자열 길이만큼 for문 실행
			char charAt = str.charAt(i);
			System.out.println(charAt);
		}
		
		//문자열 뒤집기
		System.out.println("=================================");
		String rev = "";
		for(int i = str.length()-1; i >= 0; i--) {//str의 문자열을 오른쪽부터 한 글자씩 가져오기
			rev += str.charAt(i);
		}
		System.out.println(rev);
		
		
		//substring
		System.out.println("=================================");
		str = "0123456789";
		String sub1 = str.substring(3); //얼만큼 자를건지 매개변수로 정해줌
		System.out.println(sub1);

		String sub2 = str.substring(3, 9); //3에서 잘라 4부터 출력, 끝나는 인덱스 전까지만 출력 됨
		System.out.println(sub2);
	
		
		//index
		System.out.println("=================================");
		str = "수박 오렌지 귤 블루베리";
		int index = str.indexOf("오렌지");
		System.out.println(index);
		
		
		//조합해서 사용하기
		System.out.println("=================================");
		String[] menu = {
				"수박 20000원",
				"오렌지 100000원",
				"귤 500원",
				"블루베리 3000원"
		};
		
		//menu에서 과일의 이름만 잘라오기
		//문자열의 규칙을 찾아 활용하라 -> 과일 이름 뒤에는 항상 공백이 온다는 규칙을 발견
		System.out.println("=================================");
		for(int i = 0; i < menu.length; i++) {
			String name = menu[i].substring(0, menu[i].indexOf(" "));
			System.out.println(name);
		} 
		
		//가격만 잘라서 int에 저장하기
		System.out.println("=================================");
		for(int i = 0; i < menu.length; i++) {
			for(int j = 0; j < menu.length; j++) {
			String pri = menu[i].substring(menu[j].indexOf(" "), menu[i].indexOf("원"));
			System.out.println(pri);
//			int price = (int)pri;
			}
		}
		
		//가격만 잘라서 int에 저장하기 정답
		System.out.println("=================================");
		for(int i = 0; i < menu.length; i++) {
//		int price2 = menu[i].substring(menu[i].indexOf(" ")+1, menu[i].indexOf("원")); //+1까지가 시작부분
		//참조형 타입을 바로 int 타입으로 형변환 할 수 없음
		int price2 = Integer.parseInt(menu[i].substring(menu[i].indexOf(" ")+1, menu[i].indexOf("원"))); //+1까지가 시작부분
		System.out.println(price2);
		}
		
		
		
		//contains
		System.out.println("=================================");
		str = "abcd";
		boolean contains = str.contains("c");
		System.out.println(contains);
		
		
		//오렌지가 메뉴의 몇 번 인덱스에 있는지 찾아보기
		System.out.println("=================================");
		for(int i = 0; i < menu.length; i++) {
			if(menu[i].contains("오렌지")){
				System.out.println("오렌지는 " + i + "번 인덱스에 있습니다."); //true일 때만 출력
			}
		}		
		
		
		//split 어떤 항목을 기준으로 문자열을 나누고 싶을 때. 배열로 묶어서 리턴. 기준 문자는 제외하고 나눠서 배열에 담음
		System.out.println("=================================");
		str = "a/b/c";
		String[] split = str.split("/");
		System.out.println(Arrays.toString(split));
		System.out.println(split[0]);
		
		//메뉴명과 가격 나누기
		System.out.println("=================================");
		for(int i = 0; i < menu.length; i++) {
		split = menu[i].split(" "); //공백으로 쪼개기
		System.out.println("메뉴명 : " + split[0] + " / 가격 : " + split[1]);
		}		
		
		
		//Replace
		System.out.println("=================================");
		str = "123123123";
		str = str.replace("3", "짝 ");
		System.out.println(str);
		
		
		//trim 중간에 존재하는 공백은 없애지 않음
		System.out.println("=================================");
		str = " 문자열";
		String trim = str.trim();
		System.out.println("[" + str + "] -> [" + trim + "]");
		
		
		//형변환 하는 메소드
		System.out.println("=================================");
		int num = 10;
		str = num + ""; //""으로 형변환이 자동으로 됨. 편법임
		str = String.valueOf(num); //다른 타입을 스트링 타입으로 형변환
		System.out.println(str);
	}

}
