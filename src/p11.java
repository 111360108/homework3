
public class p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carp11 car1;
		car1 = new Carp11();
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
		car1.show();
	}

}
class Carp11
{
	int num;
	double gas;

	void show()
	{
		System.out.println("車號是"+ num);
		System.out.println("汽油量是"+ gas);
	}

}