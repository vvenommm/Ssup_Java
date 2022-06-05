package j_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리 반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0~100 사이의 랜덤으로 생성, 아래와 같이 출력해주세요
		 * 이름		국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차
		 * 이정후		90		90		90		90		90		90		90		630		90.00	1
		 * 박다혜		90		90		90		90		90		90		90		630		90.00	1
		 * 이다솜		90		90		90		90		90		90		90		630		90.00	1
		 * 안은실		90		90		90		90		90		90		90		630		90.00	1
		 * 은주영		90		90		90		90		90		90		90		630		90.00	1
		 * 과목합계	450		450		450		450		450		450		450	
		 * 과목평균 90.00		90.00	90.00	90.0	90.00	90.00	90.00
		*/
		
		//과목 이름
		ArrayList<String> title = new ArrayList<String>();
		title.add("이름");
		title.add("국어");
		title.add("영어");
		title.add("수학");
		title.add("사회");
		title.add("과학");
		title.add("Oracle");
		title.add("Java");
		title.add("합계");
		title.add("평균");
		title.add("석차");
		
//		System.out.println(title);
		
		////////////////////////////////////////////////////////////////////////////////
		//학생 이름
		String[] students = {"이정후", "은주영", "박다혜", "이다솜", "윤정영", 
     			"이가은", "이상학", "신현국", "김은태", "황명성", 
     			"이재원", "문승제", "권흥종", "이규범", "안은실", 
     			"이희경", "오세영", "김민정", "최민정", "전윤미", 
     			"김수원", "이소정", "임정은", "최지은", "최지연"};
		ArrayList<String> student = new ArrayList<String>();
		String name = "";
		for(int i = 0; i < students.length; i++) {
			name = students[i];
			student.add(name);
		}
//		System.out.println(student);
		
		////////////////////////////////////////////////////////////////////////////////
		//과목 점수
		
		ArrayList<ArrayList<Integer>> score2 = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i < 25; i++) {
			ArrayList<Integer> score = new ArrayList<Integer>();
			for(int j = 0; j < 7; j++) {
				score.add((int)(Math.random()*101));
			}
			score2.add(score);
		}
		
//		System.out.println(score2);
		
		////////////////////////////////////////////////////////////////////////////////
		//합계, 평균
		ArrayList<Integer> sums = new ArrayList<Integer>();
		ArrayList<Double> avgs = new ArrayList<Double>();
		
		int sum = 0;
		for(int i = 0; i < score2.size(); i++) {
			sum =0;
			for(int j = 0; j < score2.get(i).size(); j++) {
			sum += score2.get(i).get(j);
			}
			sums.add(sum);
			avgs.add(Math.round((double)sums.get(i) / score2.get(0).size()*100)/100.0);
		}
		
//		System.out.println(sums);
//		System.out.println(avgs);
		
		//석차
		int rnk = 0;
		ArrayList<Integer> rank = new ArrayList<Integer>();
		for(int i = 0; i < student.size(); i++) {
			rank.add(1);
		}
		for(int i = 0; i < student.size(); i++) {
			for(int j = 0; j < student.size(); j++) {
				if(sums.get(i) < sums.get(j)) {
					rnk = rank.get(i);
					rnk++;
					rank.set(i, rnk);
				}
			}			
		}
//		System.out.println(rank);
		
		
		//과목 합계 & 평균
		ArrayList<Integer> subSums = new ArrayList<Integer>();
		ArrayList<Double> subAvgs = new ArrayList<Double>();
		int temp = 0;
		for(int i = 0; i < score2.get(i).size(); i++) {
			temp = 0;
			for(int j = 0; j < score2.size(); j++) {//25
				temp += score2.get(j).get(i);
			}
//			System.out.println(temp);
			subSums.add(i, temp);
			subAvgs.add(Math.round((double)subSums.get(i)/student.size()*100)/100.0);
		}
		
		
		////////////////////////////////////////////////////////////////////////////////
		//출력
		
		//타이틀
//		for(int i = 0; i < title.size(); i++) {
//			System.out.print(title.get(i) + "\t");
//		}
//		
//		System.out.println("\n===================================================================================");
//		
//		//이름 + 점수 + 합 & 평 + 석차
//		for(int i = 0; i < student.size(); i++) {
//			System.out.print(student.get(i) + "\t");
//			for(int j = 0; j < score2.get(i).size(); j++) {
//				System.out.print(score2.get(i).get(j) + "\t");
//				
//			}
//			System.out.print(sums.get(i) + "\t");
//			System.out.print(avgs.get(i) + "\t");
//			System.out.println(rank.get(i)); //석차
//
//			
//		}
//		
//		System.out.println("\n===================================================================================");
//		
//		System.out.print("과목합계\t");
//		for(int i = 0; i < subSums.size(); i++) {
//			System.out.print(subSums.get(i) + "\t");
//		}
//		
//		System.out.print("\n과목평균\t");
//		for(int i = 0; i < subAvgs.size(); i++) {
//			System.out.print(subAvgs.get(i) + "\t");
//		}
		
		////////////////////////////////////////////////////////////////////////////////
		
		List<Grades> list = new ArrayList<Grades>();
		Random random = new Random();
		random.nextInt(101);
//		list.add(new Grades("홍길동", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)));
		for(int i =0; i<students.length; i++) {
		      list.add(new Grades(students[i]
		            ,random.nextInt(101)
		            ,random.nextInt(101)
		            ,random.nextInt(101)
		            ,random.nextInt(101)
		            ,random.nextInt(101)
		            ,random.nextInt(101)
		            ,random.nextInt(101)));
		      }

		
		for(int i =0; i<25; i++) {
		System.out.println(list.get(i));
		}
		
		
		System.out.println("\n\n===================================================================================\n\n");
		
		for(Grades grades : list) { // 기준 데이터를 구하기 위한 반복문
			int rankk = 1; //처음에는 1등으로 시작
			for(Grades g : list) {//비교 대상을 나타내는 반복문
				if(grades.getSum() < g.getSum()) {
					rankk++;
				}
			} 
			grades.setRank(rankk);
		}
		
		//혹은
		for ( int i = 0; i < list.size(); i++) {
			int rankkk = 1;
			for(int j = 0; j < list.size(); j++) {
				if(list.get(i).getSum() < list.get(j).getSum()) {
					rankkk++;
				}
			}
			list.get(i).setRank(rankkk);
		}
		
		
		//향상된 for문 : for-each문 jdk1.5부터 사용가능
		//콜론 뒤에 있는게 배열 데이터
		for(Grades grades : list) {
			grades.getAvg();
		}
		System.out.println("이름\t국어\t영어\t수학\t사회\t과학\tOracle\tJava\t합계\t평균\t석차");
		System.out.println("===================================================================================");
		for(Grades grades : list) {
			System.out.println(grades);
		}
		
		
		//과목합계
		int[] sums2 = new int[7];
		for (Grades grades : list) {
			sums2[0] += grades.getKor();
			sums2[1] += grades.getEng();
			sums2[2] += grades.getMath();
			sums2[3] += grades.getSoc();
			sums2[4] += grades.getSci();
			sums2[5] += grades.getOracle();
			sums2[6] += grades.getJava();
		}
		
		//%와 d 사이에 반점을 찍으면 자동으로 3자리 수마다 반점이 찍힘
		System.out.printf("과목합계\t%,d\t%,d\t%,d\t%,d\t%,d\t%,d\t%,d", sums2[0], sums2[1], sums2[2], sums2[3], sums2[4], sums2[5], sums2[6]);
		//printf는 format으로 앞으로 나올 형식에 따라 출력하라는 뜻
		
		
		//과목평균
		double[] avgs2 = new double[7];
		for(Grades grades : list) {
			avgs2[0] = Math.round((double)sums2[0] / sums2.length)*100/100.0;
			avgs2[1] = Math.round((double)sums2[1] / sums2.length)*100/100.0;
			avgs2[2] = Math.round((double)sums2[2] / sums2.length)*100/100.0;
			avgs2[3] = Math.round((double)sums2[3] / sums2.length)*100/100.0;
			avgs2[4] = Math.round((double)sums2[4] / sums2.length)*100/100.0;
			avgs2[5] = Math.round((double)sums2[5] / sums2.length)*100/100.0;
			avgs2[6] = Math.round((double)sums2[6] / sums2.length)*100/100.0;
		}
		System.out.printf("\n과목합계\t%d\t%d\t%d\t%d\t%d\t%d\t%d", avgs2[0], avgs2[1], avgs2[2], avgs2[3], avgs2[4], avgs2[5], avgs2[6]);


	}

}
