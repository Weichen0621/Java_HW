
public class pCar {
	
	//類別變數，會在變數前加上static修飾子
	public static int sum = 0;
	
	private int pnum;
	private double pgas;
	private String name;
	
	public pCar() {
		
		//也可在此呼叫帶有參數的建構式this(int, double)
		
		pnum = 0;
		pgas = 0.0;
		name = "沒有名稱";
		
		sum++;
		
		System.out.println("生產了車子");
	}
	
	public pCar(int n, double g) {
		
		//呼叫沒帶參數的建構式，this()一定要寫在建構式的第一行
		this();
		
		pnum = n;
		pgas = g;
		
		System.out.println("生產了車號為" + pnum + "，汽油量為" + pgas + "的車子");
	}
	
	public void show() {
		System.out.println("車號是" + pnum);
		System.out.println("汽油量是" + pgas);
		System.out.println("車名是" + name);
	}
	
	public void setpCar(int n, double g) {
		pnum = n;
		pgas = g;
		
		System.out.println("將車號設為" + pnum + "，汽油量設為" + pgas);
	}
	
	//類別方法
	public static void showSum() {
		System.out.println("車子總共有" + sum + "台");
	}
	
	public void setName(String nm) {
		name = nm;
		
		System.out.println("將車名設為" + name);
	}
	
}
