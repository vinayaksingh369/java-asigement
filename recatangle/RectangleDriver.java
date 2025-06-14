class RectangleDriver{
	public static void main(String[] args){
				
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		Rectangle r3=new Rectangle();
				
		r1.setDetails(12.4, 8.2);
		r2.setDetails(20, 8);
		r3.setDetails(52.4, 28.2);

		System.out.println(r1.getDetails());
		System.out.println(r1.getArea());
		System.out.println("Perimter of rectangle is: "+r1.getPerimeter()+" Unit");
		System.out.println("==================================================");
		System.out.println(r2.getDetails());
		System.out.println(r2.getArea());
		System.out.println("Perimter of rectangle is: "+r2.getPerimeter()+" Unit");
		System.out.println("==================================================");
		System.out.println(r3.getDetails());
		System.out.println(r3.getArea());
		System.out.println("Perimter of rectangle is: "+r3.getPerimeter()+" Unit");
		System.out.println("==================================================");


	}
}


