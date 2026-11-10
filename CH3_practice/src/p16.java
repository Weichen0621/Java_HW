
public class p16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car16 car1;
		car1 = new Car16();
		
		car1.setCar16(123);
		
		int number = car1.getNum16();
		
		System.out.println("調查紀錄得知:");
		System.out.println("車號為" + number);
	}

}

class Car16{
	int num16;
	
	void setCar16(int n) {
		num16 = n;
		
		System.out.println("將車號設為" + num16);
	}
	
	int getNum16() {
		System.out.println("調查車號");
		return num16;
	}
}
