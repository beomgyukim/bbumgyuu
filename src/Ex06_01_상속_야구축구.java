class Sports{
	String name;
	int inwon;
	
	Sports(String name, int inwon){
		this.name = name;
		this.inwon = inwon;
	}
	
	void display() {
		System.out.println("�����̸�: "+name);
		System.out.println("�ο���: "+inwon);
	}
	
}// Sports

class Baseball extends Sports{ // Sport�ȿ��ִ� ������ ������ ��������~ ��ӹ޴´�. "" �ڽ� extends �θ� ""
//	String name; 
//	int inwon;
	double ta;
	Baseball(String name , int inwon, double ta) {
		super(name,inwon); // super() < �θ� �����ҋ� ����ϴ� �ܾ�. �������� ù�ٿ��� ����.
//		this.name = name;
//		this.inwon = inwon;
		this.ta = ta;
	}
	
	void display() {
//		System.out.println("�����̸�: "+name);
//		System.out.println("�ο�: "+inwon);
//		display(); < �̰��ϸ� ���ȣ���!!! �ȿ��� ��
		super.display(); // < �տ� super. �ٿ�����
		System.out.println("Ÿ��: "+ta);
	}
	
}
class Football extends Sports{
//	String name;
//	int inwon;
	int goal;
	
	Football(String name, int inwon, int goal){
		super(name,inwon);
//		this.name = name;
//		this.inwon = inwon;
		this.goal = goal;
	}
	
	void display() {
//		System.out.println("�����̸�: "+name);
//		System.out.println("�ο�: "+inwon);
		super.display();
		System.out.println("��: "+goal);
	}
	
}


public class Ex06_01_���_�߱��౸ {

	public static void main(String[] args) {
		
		Sports s = new Sports("������",1);
		s.display();
		System.out.println();
		
		Baseball b = new Baseball("�߱�",10,0.2);
		b.display();
		System.out.println();
		
		Football f = new Football("�౸",11,3);
		f.display();
		
	}//main

}//class
