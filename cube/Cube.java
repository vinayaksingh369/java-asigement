class  Cube{
   double a;
   public void setDetail(double a){
      this.a = a;
}
public String getDetail(){
  return"cube side is:"+a+"\t unit";
}
public String getVolume(){
   return"Cube volume is:"+(a*a*a)+"\t Cube unit";
}
public String getSurfaceArea(){
    return"Cube Surface Area is:" +(6*a*a)+"\t Square unit";
}
public String getLSA(){
    return"Cube LSA is:" +(4*a*a)+"\t Square unit";
}
public String getTSA(){
    return"Cube TSA is:" +(6*a*a)+"\t Square unit";
}
}