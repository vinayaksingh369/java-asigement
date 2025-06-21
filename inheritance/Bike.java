package inheritance_practise;

class Bike extends TwoWheler{
	int c=30;
	int x=90;
	public void test() {
		int d=40;
		int x=100;
		System.out.println("this is test method");
		System.out.println("local d is:"+d);
		System.out.println("c of bike"+c);
		System.out.println("b of two wheeler:"+b);
		System.out.println(a);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		System.out.println(super.getXofVehicle());
		
		
	}
}