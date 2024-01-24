public class Student {
    public String getName(){
        String name = "Saipriya Reddy";
        return name;
    }
    public static void main(String[] args){
        Student student = new Student();

        String name = student.getName();
        System.out.println(name);

    }
}
