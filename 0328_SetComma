package i_api;

import e_oop.ScanUtil;

public class SetComma {

	public static void main(String[] args) {
		//Q. 숫자를 입력 받고, 입력 받은 숫자에 3자리 마다 반점을 붙여 출력해주세요.
		System.out.println("아무 숫자나 입력해주세요.\n->");
		String input = ScanUtil.nextLine();
		
//		for(int i = 1; i <= 0; i++) {
//			for(int j = input.length()/3*i; j <= 0; j++) {
//				String temp = (String)input.charAt(j);
//			}
//			
//		}
		
//		input.split(regex)
		
		
		
		
//		String a;
//	    String b;
//	    if((input.length()%3)>0) {
//	    	b = input.substring(0, input.length()%3);
//	    	System.out.print(b+ ",");
//	    	}
//	    for(int i=(input.length()/3)-1; i >= 0 ; i--) {
//	    	a = input.substring(input.length()-(3*(i+1)) , input.length()-(3*i));
//	    	System.out.print(a);
//	    	if (i!=0) {
//	    		System.out.print(",");
//	    		}
//	    	}
	    
//		String temp = "";
//		for(int i = input.length()-1; i >= 0; i--) {//str의 문자열을 오른쪽부터 한 글자씩 가져오기
//			temp += input.charAt(i);
//		}
//		String a = temp.substring(0, 3);
//		String b = temp.substring(2, 6);
//		String c = temp.substring(5, 9);
//		String d = "";
//		if(temp.length() > 9) {
//			d += temp.substring(9);
//		}
//		String sum = "";
//		sum += a + "," + b + "," + c + "," + d;
//		for(int i = sum.length()-1; i >= 0; i--) {//str의 문자열을 오른쪽부터 한 글자씩 가져오기
//			temp += sum.charAt(i);
//		}
//		
//	System.out.println(temp);
		
		
		String com = "";
		
		int count = 0;
		for(int i = input.length() -1; i >= 0; i--) {
			com = input.charAt(i) + com;
			count++;
			if(count %3 == 0 && count != input.length()) {
				com = "," + com;
			}
		}
		System.out.println(com);
		
		
	}

}
