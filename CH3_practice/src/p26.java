
public class p26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car26 car1;
		car1 = new Car26(); //建立了新物件就會呼叫建構式
		
		car1.show();
	}

}

class Car26{
	private int num26;
	private double gas26;
	
	//宣告與類別同名的函式叫建構式
	//被呼叫的建構式通常用作初始化
	public Car26() {
		num26 = 0;
		gas26 = 0.0;
		
		System.out.println("生產了車子");
	}
	
	public void show() {
		System.out.println("車號是" + num26);
		System.out.println("汽油量是" + gas26);
	}
}