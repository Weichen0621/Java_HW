package CH2_practice;

import java.io.*;

public class p34 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("要跳過第幾次的處理呢?(1~10)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int res = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= 10; i++) {
			if(i == res) continue;
			
			System.out.println("第" + i + "次的處理");
		}
	}

}
