package CH2_practice;

public class p41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test;
		test = new int[5];
		
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;
		
		//test[10] = 75;  若宣告超過陣列索引值的值，程式執行到這行時會發生例外(Exception，報錯?)
		
		for(int i = 0; i < 5; i++) {
			System.out.println("第" + (i+1) + "個人的分數是" + test[i] + "分");
		}
	}

}
