package CH2_practice;

import java.io.*;

public class p15 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("請輸入整數");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		switch(num) {
		
		case 1: {
			System.out.println("輸入的是1"); //若在switch()中沒用break跳出函式，會持續執行下方的敘述，直到遇到break或是程式結束為止
			//break;
		}
		
		case 2: {
			System.out.println("輸入的是2");
			//break;
		}
		
		default: {
			System.out.println("請輸入1或2");
			//break;
		}
		
		}
	}

}
