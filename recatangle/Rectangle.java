class Rectangle{
	double l;
	double w;
	public void setDetails(double l, double w){
		this.l=l;
		this.w=w;
	}
	public String getDetails(){
	return "Length is: "+l+" Unit\nWidth is: "+w+"Unit\n======***=====";
	}
	public String getArea(){
	return "Area of Rectangle is: "+l*w+" Sq. Unit";
	}
	public double getPerimeter(){
	return 2*(l+w);
	}		
}


