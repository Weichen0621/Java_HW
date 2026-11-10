
public class p51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//準備好Car[]型態陣列變數並宣告3個Car類別型態的陣列元素
		Car[] car1;
		car1 = new Car[3];
		
		//建立3個新物件，分別指定給3個陣列元素
		for(int i = 0; i < car1.length; i++) {
			car1[i] = new Car();
		}
		
		car1[0].setNumGas(1234, 20.5);
		car1[1].setNumGas(2345, 30.5);
		car1[2].setNumGas(3456, 40.5);
		
		for(int i = 0; i < car1.length; i++) {
			car1[i].show();
		}
	}

}
