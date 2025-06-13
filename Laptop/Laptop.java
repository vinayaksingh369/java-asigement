class Laptop{
     String brand;
     String model;
     String price;
     String color;
    public void setDetails(String brand,String model, String price, String color){
   this.brand = brand;
   this.model = model;
   this.price = price;
   this.color = color;
}
  public String getDetails(){
       return"Brand of laptopis:"+brand+"\tModel:"+model+"\tprice:"+price+"\t color:"+color;
}
}
     