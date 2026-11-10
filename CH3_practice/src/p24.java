
public class p24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car24 car1;
		car1 = new Car24();
		
		//可定義相同的方法名稱setCar，但會因為參數的型別和數量影響傳入的方法
		//此方式名為多載(overloading)
		car1.setCar(1234, 20.5);
		car1.show();
		
		System.out.println("只變更車號");
		car1.setCar(2345);
		car1.show();
		
		System.out.println("只變更汽油量");
		car1.setCar(30.5);
		car1.show();
	}

}

class Car24{
	private int num24;
	private double gas24;
	
	public void setCar(int n) {
		num24 = n;
		System.out.println("將車號設為" + num24);
	}
	
	public void setCar(double g) {
		gas24 = g;
		System.out.println("將汽油量設為" + gas24);
	}
	
	public void setCar(int n, double g) {	
		num24 = n;
		gas24 = g;
			
		System.out.println("將車號設為" + num24 + "，汽油量設為" + gas24);
	}
	
	public void show(){
		System.out.println("車號是" + num24);
		System.out.println("汽油量是" + gas24);
	}
}