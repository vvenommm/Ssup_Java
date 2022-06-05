package i_api;

public class StringSpeedTest {

	public static void main(String[] args) {
		String str = "a";
		str += "a"; //기존 문자열에 붙는 게 아니라 aa라는 문자열이 새로 만들어짐
		System.out.println(str);
		System.out.println("=================================");
		
//		long start = System.currentTimeMillis();
//		for(int i = 0; i < 20000; i++) {
//			str += "a";
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start + "ms");
		
		StringBuffer sb = new StringBuffer("a");
		long start = System.currentTimeMillis();
		for(int i = 0; i < 20000; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
		
		//많은 문자열 변환이 필요할 땐 string buffer로 해주면 빨리 됨

	}

}
