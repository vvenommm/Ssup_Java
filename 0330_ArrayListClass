package j_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * Collection Framework : 여러개의 데이트를 다루기위한 클래스를 표준화한것.
		 * List => 인터페이스(부모의 역할)/ArrayList (상속받은 아이)
		 * Map => 인터페이스(부모의 역할) /CashMap (상속받은 아이)
		 * Set => 인터페이스(부모의 역할)
		 * 
		 * ArrayList의 주요 메소드 : 생긴건 배열처럼 생겼으나 길이를 정하지 않는다.(유동적인 배열을 사용)
		 * - boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환 
		 * 		=> 마지막에 계속 추가하는 방법
		 * 
		 * - void add(int index, Object obj) : 지정된 위치에 객체를 추가
		 * 		=>인덱스를 지정해서 그 위치에 obj데이터를 저장해주고, 기존에 그 인덱스에 있던 데이터는 한칸씩 뒤로 밀려남.
		 * 
		 * - Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환
		 * 		=>인덱스를 지정해서 그 위치에 obj데이터를 저장하고, 기존에 그 위치에 저장되어있던 데이터는 리턴해줌. 
		 * 
		 * - Object get(int index) : 지정된 위치의 객체를 반환
		 * 		=>인덱스를 지정해주면 그 인덱스에 위치한 데이터를 얻을 수 있음.
		 * 
		 * - int size() : 저장된 객체의 수를 반환
		 * 		=>length가 아닌 size를 사용하여 저장된 객체수를 반환.
		 * 
		 * - Object remove(int index) : 지정된 위치의 객체를 제거
		 */
		
		
		//기본적으로 Array List는 아무거나 Object라면 저장 가능
		ArrayList sample = new ArrayList();
		
		sample.add("abc");
		sample.add(100);
		sample.add(new Scanner(System.in));
		//꺼낼 때 어떤 타입인지 예측이 안 되니  generic을 만듦
		
		
		ArrayList<Integer> list = new ArrayList<Integer>(); //<>안에 있는 게 generic, 무엇을 저장할 것인가 지정해주는 것
		//객체만 저장할 수 있기 때문에 int는 저장을 못 함. 그래서 Integer를 만들어줌
		list.add(10);
//		list.add("abc"); //Integer만 저장이기 때문에 컴파일 에러 발생
		
		list.add(new Integer(10)); //원래는 이렇게 저장해야 하는데 list.add(10);도 허용
		
		/*
		 * Wrapper Class
		 * - byte : Byte
		 * - short : Short
		 * - int : Integer
		 * - long : Long
		 * - float : Float
		 * - double : Double
		 * - boolean : Boolean
		 * - char : Character
		 */
		
		System.out.println(list.add(30));//저장하게 되면 boolean타입을 저장. 저장 성공여부를 true, false로
		
		list.add(1, 40); //인덱스와 저장값을 입력, 1번 인덱스부터 뒤로 밀고 값을 저장
		
		System.out.println(list);
		
//		list.add(5, 50); //런타임 에러 발생
		
		Integer before = list.set(2,  50);
		System.out.println("before : " + before);
		System.out.println(list);
		
		
		int get = list.get(2); //get이라는 메소드는 값을 얻을 수 있는 메소드. () 안에 인덱스를 넣으면 인덱스에 해당하는 값을 받음. 자동 형변환 되기 때문에 int 변수에 받아도 됨
		System.out.println(get);
		
//		for(int i= 0; i < list.size(); i++) {
//			System.out.println(i + " : " + list.remove(i));
//		}
//		System.out.println(list); //없어지면서 하나씩 땡겨오기 때문에 제대로 삭제가 되지 않음
		
		System.out.println("==========================");
		
		for(int i = list.size()-1; i >= 0; i--) {
			System.out.println(i + " : " + list.remove(i));
		} //뒤에서부터 삭제해야 제대로 삭제 됨
		System.out.println(list);
		
		System.out.println("==========================");
		
		//list에 1~100 사이의 랜덤값을 10개 저장해주세요.
		for(int i = 0; i < 10; i++) { //length란 값을 넣으면 안 되고 10을 써줘야 함
			int random = (int)(Math.random()*100)+1;
			list.add(random);
		}
		System.out.println(list);
		
		
		System.out.println("==========================");
		
		//lsit에 저장된 값의 합계와 평균을 구해주세요.
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		double avg = (double)sum / list.size();
		System.out.println(sum + " / " + avg);
		
		//list에서 최소값과 최대값을 구해주세요.
		int min = list.get(0);
		int max = list.get(0);
		
		for(int i = 0; i < list.size()-1; i++) {
			if(list.get(i) < min) {
				min = list.get(i);
			}
			if(max < list.get(i)) {
				max = list.get(i);
			}
		}
		
		System.out.println("==========================");

		//list를 오름차순으로 정렬해주세요.
		int temp = list.get(0);
		int num = 0;
		for(int i = 0; i < list.size()-1; i++) {
			num = i;
			for(int j = i+1; j < list.size(); j++) {
				if(list.get(j) < list.get(num)) {
					num = j;
				}
			}
//			temp = list.get(i);
//			list.set(i, list.get(min));
//			list.set(min,  temp);
			list.set(num,  list.set(i,  list.get(num))); //이렇게 위의 3줄을 한 줄로 바꿀 수 있다
			System.out.println(list);
		}
		
		System.out.println("==========================");
		
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
		
		list = new ArrayList<Integer>(); //생성했지만 비어있는 객체가 됨
		list.add(10);
		list.add(20);
		list.add(30);
		
		list2.add(list); //배열 하나를 저장
		
		list = new ArrayList<Integer>(); //새로운 객체 또 생성
		
		list.add(40);
		list.add(50);
		list2.get(1).add(60);
		
		list2.add(list); //또 저장

		System.out.println(list2);
		
		for(int i = 0; i < list2.size(); i++) {
			for(int j = 0; j < list2.get(i).size(); j++) {
				System.out.println(list2.get(i).get(j));
			}			
		}
		
		System.out.println("==========================");
		
		//학생 3명의 5과목에 대한 0~100점의 랜덤한 점수를 2차원 Arraylist에 저장해주세요
		ArrayList<ArrayList<Integer>> student = new ArrayList<ArrayList<Integer>>();
		ArrayList sub = new ArrayList<String>();
		sub.add("국어");
		sub.add("영어");
		sub.add("수학");
		
		ArrayList score = new ArrayList<Integer>(); 
		score.add((int)(Math.random()*101));
		score.add((int)(Math.random()*101));
		score.add((int)(Math.random()*101));
		score.add((int)(Math.random()*101));
		score.add((int)(Math.random()*101));
		
		student.add(score);
		
		score = new ArrayList<Integer>(); 
		score.add((int)(Math.random()*101));
		score.add((int)(Math.random()*101));
		score.add((int)(Math.random()*101));
		score.add((int)(Math.random()*101));
		score.add((int)(Math.random()*101));
		
		student.add(score);
		
		score = new ArrayList<Integer>(); 
		score.add((int)(Math.random()*101));
		score.add((int)(Math.random()*101));
		score.add((int)(Math.random()*101));
		score.add((int)(Math.random()*101));
		score.add((int)(Math.random()*101));
		
		student.add(score);
		
		System.out.println(student);
		
		System.out.println("==========================");

		//혹은 for문으로
		list2 = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < 3; i++) {
			list = new ArrayList<Integer>();
			for(int j = 0; j < 5; j++) {
				list.add((int)(Math.random()*101));
			}
			list2.add(list);
			System.out.println(list);
		}
		
		System.out.println("==========================");

		//각 학생별 합계와 평균을 구해주세요
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for(int i = 0; i < 3; i++) {
				sum1 += list2.get(0).get(i);
				sum2 += list2.get(1).get(i);
				sum3 += list2.get(2).get(i);
			}
		double avg1 = (double)sum1 / list2.get(0).size();
		double avg2 = (double)sum2 / list2.get(0).size();
		double avg3 = (double)sum3 / list2.get(0).size();
		
		System.out.println(sum1 + " / " + sum2 + " / " + sum3 + " / " + avg1 + " / " + avg2 + " / " + avg3);
		
		System.out.println("==========================");
		//정답
		
		ArrayList<Integer> sums = new ArrayList<Integer>();
		ArrayList<Double> avgs = new ArrayList<Double>();
		
		//어레이에 저장할 때 첫 값은 add를 하고 그 후에는 set을 해줘야함 -> 번거롭기 때문에 다르게 해보겠음
		for(int i = 0; i < list2.size(); i++) {
			sum = 0;
			for(int j = 0; j < list2.get(i).size(); j++) {
				sum += list2.get(i).get(j);
			}			
			sums.add(sum);
			avgs.add((double)sum / list2.get(i).size());
		}
		System.out.println(sums);
		System.out.println(avgs);
		
	}

}
