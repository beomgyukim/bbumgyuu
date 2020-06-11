class Sport2{
	String name;
	int inwon;
	
	Sport2(String name, int inwon){
		this.name = name;
		this.inwon = inwon;
	}
	
	void show() {
		System.out.println(name);
		System.out.println(inwon);
	}
	
}//Sport2
class Baseball2 extends Sport2{
	
	double ta;
	Baseball2(String name, int inwon, double ta){
		super(name,inwon);
		this.ta = ta;
	}
	
	void show() {
		super.show();
		System.out.println("Ÿ��: " + ta);
	}
	
}//Baseball2
class Football2 extends Sport2{
	int goal;
	
	Football2(String name, int inwon, int goal){
		super(name,inwon);
		this.goal = goal;
		
	}
	
	void show() {
		super.show();
		System.out.println("����: "+ goal);
	}
	
}//Football2

public class Ex06_02 {

	public static void main(String[] args) {
		
		
//		Baseball2 ��ü => ������ ���� ����
		Baseball2 b = new Baseball2("�߱�",10,1.2);
		b.show();
		
		
//		Football2 ��ü => ������ ���� ����
		Football2 f = new Football2("�౸",5,4);
		f.show();
		
		
		
	}//main

} // class
