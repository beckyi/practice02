package prob2;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	
	public Goods(){
	}
	
//	public Goods(String name, int price, int countStock){	//셍성자 (리턴타입X)
//		this.name=name;	//파라미터 변수와 이름이 같을 때 this를 사용하여 구별
//		this.price = price;
//		this.countStock = countStock;
//	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price<0){
			price = 0;
		}
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	
	public void printGoods(){
		System.out.println(name+"(가격: "+price+" 원)이 "+countStock+"개 입고 되었습니다.");
	}
	
	
	
}
