package dayfour.thirdassignment;

public class PrivateCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass m=Myclass.getObject();
		m.setId(10);
		
		Myclass m1=Myclass.getObject();
		
		System.out.println(m);
		System.out.println(m1);

	}

}