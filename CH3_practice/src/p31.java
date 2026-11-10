
public class p31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//不需要建立物件就可呼叫類別方法
		pCar.showSum();
		
		pCar car1;
		car1 = new pCar();
		car1.setpCar(1234, 20.5);
		
		pCar.showSum();
		
		pCar car2;
		car2 = new pCar();
		car2.setpCar(4567, 30.5);
	}

}
