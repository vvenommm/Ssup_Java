package g_oop2;

public class SampleParent {
	
	/*
	 * 상속
	 * 기존의 클래스를 물려받아 새로운 클래스를 만드는 것
	 * class 자식클래스명 extends 부모클래스명{}
	 * 부모 클래스의 생성자와 초기화블럭을 제외한 모든 멤버를 물려받음
	 * 하나의 클래스만 상속받을 수 있음
	 * 상속받지 않는 모든 클래스는 object클래스를 상속받음
	 * Object 클래스 : 모든 클래스의 부모 클래스
	 * 자식 클래스는 부모 클래스의 멤버 외의 새로운 멤버를 가질 수 있으므로 자식 클래스는 부모 클래스보다 크거나 같음
	 * 두 개 이상의 클래스를 만드는데 공통된 멤버가 있는 경우 부모 클래스로 만듦
	 */
	
	String var;
	{
		var = "초기화 블럭은 물려주지 않는다";
	}
	
	SampleParent(){
		var = "생성자도 물려주지 않는다.";
	}
	
	int method(int a, int b) {
		return a+b;
	}

}

----------------------------------------------------------

	
package g_oop2;

public class SampleChild extends SampleParent{
	
	void childMethod() {
		System.out.println(var); //상속 받은 변수
		System.out.println(method(7, 13)); //상속 받은 메서드
	}
}
