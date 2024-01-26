package maps;

import java.util.HashMap;

public class ReturnStudentObject {
      public static HashMap<String, Student> studentObjects() {
          String[] firstnames = {"a", "b","c","d","e","f","g","h"};
          String[] lastnames = {"q", "v","w","x","y","z","k","j"};
          double[] gpa = {3.0,3.1,3.2,3.3,3.4,3.5,3.6,3.7};
          HashMap<String, Student> studentobj = new HashMap<>();
          for(int i=0;i<firstnames.length;i++){
              studentobj.put(firstnames[i],new Student(firstnames[i],lastnames[i],gpa[i]));
          }
          return studentobj;
      }
      public static Student returnStudentObj(HashMap<String,Student> studentobj, String name){
          return studentobj.get(name);
      }
}
