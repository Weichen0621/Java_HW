
public class Car {
	
	int num;
	double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		
		System.out.println("生產了車子");
	}
	
	void show(){
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
	
	void showCar() {
		System.out.println("開始顯示車子資料");
		this.show(); //this也可不加
	}
	
	void setNum(int n) {
		num = n;
		System.out.println("將車號設為" + num);
	}
	
	void setGas(double g) {
		gas = g;
		System.out.println("將汽油量設為" + gas);
	}
	
	void setNumGas(int n, double g) {	
		num = n;
		gas = g;
			
		System.out.println("將車號設為" + num + "，汽油量設為" + gas);
	}
	
	int getNum() { //回傳型別為int的值
		System.out.println("調查車號");
		return num;
	}
	
	double getGas() {
		System.out.println("調查汽油量");
		return gas;
	}
	
}
