package Reflection;

public class Ref03 {

  public static void main(String[] args) {
    Main r = new Main();
    System.out.println("class =" + r.getClass());
    System.out.println("class name =" + r.getClass().getName());
    System.out.println("Simple name =" + r.getClass().getSimpleName());
    System.out.println("Canonical name =" + r.getClass().getCanonicalName());
}
}