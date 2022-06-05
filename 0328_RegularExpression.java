package i_api;

import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^	뒤 문자로 시작
		 * $	앞 문자로 종료
		 * .	임의의 문자(줄바꿈 제외)
		 * *	앞 문자가 0개 이상
		 * +	앞 문자가 1개 이상
		 * ?	앞 문자가 없거나 1개
		 * []	문자의 집합이나 범위([a-z]: a부터 z까지, [^a-z]: a부터 z가 아닌 것)
		 * {}	앞 문자의 개수({2}: 2개, {2,4}: 2개 이상 4개 이하)
		 * ()	그룹화(1개의 문저처럼 인식)
		 * |	OR 연산
		 * \s	공백, 탭, 줄바꿈
		 * \S	공백, 탭, 줄바꿈이 아닌 문자
		 * \w	알파벳이나 숫자
		 * \W	알파벳이나 숫자가 아닌 문자
		 * \d	숫자
		 * \D	숫자가 아닌 문자
		 * (?i)	뒷 문자의 대소문자 구분 안 함
		 * \	정규 표현식에서 사용되는 특수문자 표현. 위의 특수문자를 문자로 사용하고 싶을 때 역슬래시를 사용
		*/
		
		String str = "abc123";
		
		//위 문자열을 검사할 정규 표현식
//		String regex = "[a-z]{3}\\d{1,3}"; // = abc123을 검사할 수 있음. 자바에겐 /가 탈출문자(\t, \n 등)이기 때문에 탈출문자로 사용하는 게 아니면 컴파일 에러 발생. 탈출문자로 사용하려는게 아니기 때문에 /를 2번 씀. 정규 표현식에는 공백도 공백으로 인식하기 때문에 공백을 함부로 넣으면 안 됨.
		
//		String regex = "[a-z0-9]+";
		
		String regex = "\\w*";
		
		boolean result = Pattern.matches(regex, str);
		System.out.println(result);
		
		
		
		//Q. 아이디, 전화번호, 이메일 주소의 유효성을 검사하는 정규 표현식을 만들어주세요.
		
		String id = "3Fjdkwoj90";
		regex = "[a-z0-9]{5,10}";
		result = Pattern.matches(regex, id);
		System.out.println("id : " + result);
		//정답
		//[a-z0-9_-]{5,20}
		

		
		String ph = "010-2323-1234 ";
		regex = "[0-1]{3}\\-[0-9]{3,4}\\-[0-9]{4}";
		result = Pattern.matches(regex, ph);
		System.out.println("ph : " + result);
		//정답
		//^0\\d{1,3}-//d{3,4}-//d{4}
		
		
		String email = "aj392@naver.com";
		regex = "[a-z]{1,20}//@//[a-z]{5,8}";
		result = Pattern.matches(regex, email);
		System.out.println("email : " + result);
		//정답
		//[a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z{2}\\.kr))$
		
		
	}

}
