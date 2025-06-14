class vehicle{
    String make;
    String model;
    String year;
   public void setDetails(String make, String model,String year){
       this.make = make;
       this.model = model;
       this.year = year;
}
   public String getDetails(){
  return"Make by:"+make+"\t model:" +model+"\t year"+year;
}
}