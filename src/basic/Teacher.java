package basic;

public class Teacher {
    String designation ="Teacher";
    String collegeName = "Beginnersbook";
    void does(){
        System.out.println("Teaching");

    }
}
   class PhysicsTeacher extends Teacher{
    String mainsubject = "Physics";
    public static void main (String[] args){
        PhysicsTeacher obj = new PhysicsTeacher();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainsubject);
        obj.does();
    }
}