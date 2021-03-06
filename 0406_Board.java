package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

import e_oop.ScanUtil;

public class Board {

	public static void main(String[] args) {
		/*
		 * 목록 > 조회 > 수정
		 * 				    > 삭제
		 * 		  > 등록
		 * 
		 * ----------------------------
		 * 번호 제목		작성자	작성일
		 * 5	  안녕		홍길동	04/06
		 * 4	  안녕		홍길동	04/06
		 * 3	  안녕		홍길동	04/06
		 * 2	  안녕		홍길동	04/06
		 * 1	  안녕		홍길동	04/06
		 * 
		 * 1. 조회 2. 등록 0. 종료
		 */
		
		//목록은 제목만, 조회는 내용까지
		
		SimpleDateFormat f = new SimpleDateFormat("mm/dd");
		String time = f.format(System.currentTimeMillis());
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		HashMap<String, Object> a = new HashMap<String, Object>();
		
		Post p = new Post();
		
////		a.put("번호", 1);
//		a.put("제목", "안녕");
//		a.put("작성자", "홍길동");
//		a.put("작성일", "04/01");
//		a.put("내용", "오늘 만우절~");
//		list.add(a);
//		
//		a = new HashMap<String, Object>();
////		a.put("번호", 2);
//		a.put("제목", "헬로우");
//		a.put("작성자", "후후리");
//		a.put("작성일", "04/04");
//		a.put("내용", "오마갓 4월 4일 4시 44분임!");
//		list.add(a);
//		
//		a = new HashMap<String, Object>();
////		a.put("번호", 3);
//		a.put("제목", "오늘 점심");
//		a.put("작성자", "아라리");
//		a.put("작성일", "04/05");
//		a.put("내용", "오늘 점심으로 김치찌개 땡겨요");
//		list.add(a);
//		
//		a = new HashMap<String, Object>();
////		a.put("번호", 4);
//		a.put("제목", "다들 피곤하시죠?");
//		a.put("작성자", "우르사");
//		a.put("작성일", "04/05");
//		a.put("내용", "점심 먹고나니 졸음이 쏟아지네요");
//		list.add(a);
//		
//		a = new HashMap<String, Object>();
////		a.put("번호", 5);
//		a.put("제목", "근력 운동 최고");
//		a.put("작성자", "근돼");
//		a.put("작성일", "04/06");
//		a.put("내용", "오늘도 운동 화이팅!");
//		list.add(a);
		
//		System.out.println(list);
//		System.out.println(time);
		
		new Board().start(list, a, p);
	}
	
		////////////////////////////////////////////////////////////
		
		void start(ArrayList<HashMap<String, Object>> list, HashMap<String, Object> a, Post p) {
		while(true) {
		System.out.println("---------------------------------------------");
		System.out.println("번호\t\t제목\t\t작성자\t\t작성일");
		p.print(list, a);
		System.out.println("---------------------------------------------");
		System.out.println("1. 글 읽기\t\t2. 글 작성\t\t3. 글 수정 \t\t0. 종료\n->");
		int input = ScanUtil.nextInt2();
		
		switch(input) {
		case 1:
			System.out.println("보고싶은 글 번호를 입력해주세요. (00. 홈)\n->");
			int input2 = ScanUtil.nextInt2();
			if(input2 == 00) {
				break;
			}else {
			p.click(list, a, input2);
			break;
			}
//			for(int i = 0; i < list.size(); i++) {
//				a = list.get(i);
//				System.out.print(i+1 + "\t\t");
//				System.out.print(a.get("제목") + "\t\t");
//				System.out.print(a.get("작성자") + "\t\t");
//				System.out.println(a.get("작성일"));
//			}
			
		case 2:
			p.writing(list);
			System.out.println();
			break;
		case 3:
			System.out.println("몇 번 글을 수정하시겠습니까?\n->");
			input = ScanUtil.nextInt2();
			p.edit(list, a, input);
			break;
		case 0:
			System.out.println("종료합니다.");
			System.exit(0);
		}
		
		
		}
		
		
		
		
		

	}

}
