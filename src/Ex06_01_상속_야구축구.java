class Sports{
	String name;
	int inwon;
	
	Sports(String name, int inwon){
		this.name = name;
		this.inwon = inwon;
	}
	
	void display() {
		System.out.println("종목이름: "+name);
		System.out.println("인원수: "+inwon);
	}
	
}// Sports

class Baseball extends Sports{ // Sport안에있는 변수를 가져다 쓸수있음~ 상속받는다. "" 자식 extends 부모 ""
//	String name; 
//	int inwon;
	double ta;
	Baseball(String name , int inwon, double ta) {
		super(name,inwon); // super() < 부모에 접근할떄 사용하는 단어. 생성자의 첫줄에만 들어간다.
//		this.name = name;
//		this.inwon = inwon;
		this.ta = ta;
	}
	
	void display() {
//		System.out.println("종목이름: "+name);
//		System.out.println("인원: "+inwon);
//		display(); < 이거하면 재귀호출됨!!! 안에서 돔
		super.display(); // < 앞에 super. 붙여야함
		System.out.println("타율: "+ta);
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
//		System.out.println("종목이름: "+name);
//		System.out.println("인원: "+inwon);
		super.display();
		System.out.println("골: "+goal);
	}
	
}


public class Ex06_01_상속_야구축구 {

	public static void main(String[] args) {
		
		Sports s = new Sports("스포츠",1);
		s.display();
		System.out.println();
		
		Baseball b = new Baseball("야구",10,0.2);
		b.display();
		System.out.println();
		
		Football f = new Football("축구",11,3);
		f.display();
		
	}//main

}//class
