class cylinder{
  double r;
  double h;
  public void setDetails(double r,double h){
   this.r = r;
   this.h = h;
}
  public String getDetails(){
      return "Cylinder radius is:"+r+"unit"+"\t Heightof Cylinder is:"+h+"unit";
}
 public String getTSA(){
    return"Cylinder TSA is:"+2*Math.PI*r*(r+h)+"\t Square unit";
}
Public String getLSA(){
   return"Cylinder LSA is" "+2*Math.PI*r*h+"\t Square unit";
}
}