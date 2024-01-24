package OOPS;
abstract class Department {
    int size = 120;
    abstract int getDepartmentSize();
}

class Deptsize extends Department{
    public int getDepartmentSize()
    {
        return size;

    }
}
public class Main{
  public static void main(String args[]) {
      Deptsize dept = new Deptsize();
      System.out.println(dept.getDepartmentSize());
}
}
