public class Student {
    String name;
    int id;
    int age;
    String grade;
    String Courses;
    public void setDetails(String name, int id, int age, String grade, String Courses){
        this.name=name;
        this.id=id;
        this.age=age;
        this.grade=grade;
        this.Courses=Courses;
    }
    public String getDetails(){
        return "name is:"+name+"\t id is:"+id+"\t age is:"+age+"\t grade is:"+grade+"\t Courses: "+Courses;
    }
}