class Sphere{
      double r;
      public void setDetail(double r){
      this.r = r;
}
public String getDetail(){
  return"Sphere radius is"+r+"\t and diameter is "+2*r+"Square unit";
}
public String getSurfacearea(){
    return"Sphere Surface area is: " + (4*Math.PI*r*r)+"\t Square unit";
} 
public String getVolume(){
    return"volume of sphere is:" + (4/3*Math.PI*r*r*r) + "\t cubic unit";
}
}