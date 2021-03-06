package g_oop2;

public class Store {

	public static void main(String[] args) {
		//여러가지 물건을 파는 가게
		Desktop d = new Desktop();
		AirCon ac = new AirCon();
		TV tv = new TV();
		
		Customer c = new Customer();
		
		c.buy(d);
		c.buy(ac);
		c.buy(tv);

	}

}


//부모 클래스
class Product{
	String name; //이름
	int price; //가격
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
}


//물건들 클래스
class Desktop extends Product{ //super에 파라미터가 있기 때문에 Desktop에 컴파일 오류가 생김
	Desktop(){
		super("삼성 컴퓨터", 1000000);
	}
}

class AirCon extends Product{
	AirCon(){
		super("LG 에어컨", 2000000);
	}
}
class TV extends Product{
	TV(){
		super("LG TV", 3000000);
	}
}
	
class Customer{
	int money = 10000000;
	Product[] item = new Product[10]; //TV, AirCon, Desktop으로는 각자 자기꺼밖에 담지 못하므로  부모클래스인 Product 타입으로 배열을 만들어줘야 물건을 배열에 담을 수 있음 = 다형성

	void buy(Product p) {//뭘 구매할지를 파라미터를 정해줘야 함. 다형성
		if(money < p.price) {
			System.out.println("잔돈이 부족합니다");
			return;
		}
		
		money -= p.price;
		
		for(int i = 0; i < item.length; i++) {
			if(item[i] == null) {
				item[i] = p;
				break;
			}
		}
		System.out.println(p.name + "을 구매했습니다.");
		System.out.println(this.money + "원 남았습니다.");
		
	}
}	
