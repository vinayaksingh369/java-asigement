class circle{
   double r;
   public void setDetails(double r){
   this.r = r;
}
   public String getDetails(){
   return "radiusof circle is:"+r+"unit";
}
 public String getArea(){
   return"Area of circle is: "+Math.PI*r*r+"Square unit";
}
public String getCircumference(){
  return"Circumference of circle is: "+2*Math.PI*r+"unit";
}
public String getDiameter(){
  return"Diameter of circle is:"+2*r+"unit";

} 
}