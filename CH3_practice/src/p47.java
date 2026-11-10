
public class p47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pCar car1;
		car1 = new pCar();
		
		car1.show();
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "1號車";
		
		car1.setpCar(number, gasoline);
		car1.setName(str);
		
		car1.show();
	}

}
