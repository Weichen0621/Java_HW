import java.io.*;

public class p37 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("請輸入英文字母");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String str_up = str.toUpperCase();
		String str_lo = str.toLowerCase();
		
		System.out.println("轉換成大寫時為" + str_up);
		System.out.println("轉換成小寫時為" + str_lo);
	}

}
