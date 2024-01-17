package loopsconditions;
public class Person {
public String personAge(int age){
    if(age>=13 && age<=19)
        return "teen";
    else if(age<13)
        return "kid";
    else if(age>19)
        return "adult";
    return "none";
}
public static void main(String args[]){
    Person p = new Person();
    System.out.println(p.personAge(15));

    }
}
