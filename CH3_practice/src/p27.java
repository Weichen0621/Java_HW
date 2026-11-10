
public class p27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//呼叫沒預設值的建構式
		Car27 car1;
		car1 = new Car27();
		car1.show();
		
		//呼叫有預設兩個參數的建構式
		Car27 car2;
		car2 = new Car27(1234, 25.0);
		car2.show();
	}

}

class Car27{
	private int num27;
	private double gas27;
	
	//注意在修飾子為private的情況下，建構子的宣告不能為private
	public Car27(){
		num27 = 0;
		gas27 = 0.0;
		
		System.out.println("生產了車子");
	}
	
	public Car27(int n, double g) {
		num27 = n;
		gas27 = g;
		
		System.out.println("生產了車號為" + num27 + "，汽油量為" + gas27 + "的車子");
	}
	
	public void show() {
		System.out.println("車號是" + num27);
		System.out.println("汽油量是" + gas27);
	}
}