package hwExt;

public class TestPen {

	public static void main(String[] args) {

		Pen p1 = new Pencil("雄獅",20);
		Pen p2 = new InkBrush("萬寶龍", 10000);
		
		p1.write();
		System.out.println(p1.getPrice() + "元");
		p2.write();
		System.out.println(p2.getPrice() + "元");
		
		
	}

}
