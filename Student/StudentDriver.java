public class StudentDriver {
    public static void main (String[]args){
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.setDetails("RAHUL",2,23,"A","SCIENCE");
        s2.setDetails("mohit",3,21,"A1","commerce");
        s3.setDetails("vinayak",1,24,"A++","math");
        System.out.println(s1.getDetails());
        System.out.println(s2.getDetails());
        System.out.println(s3.getDetails());
    }

}