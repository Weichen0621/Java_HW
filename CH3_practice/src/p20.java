
public class p20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1 = new Car();
		
		car1.num = 1234;
		car1.gas = -10; //若沒有做存取限制，就可能讓外部的任何人隨意存取資料
		
		car1.show();
	}

}
