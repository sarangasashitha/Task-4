package Reflection;
public class Ref02 {
  public static void main(String[] args) {
    Main r = new Main();
    r.squareB();
    long b = r.b;
    System.out.println("ref=" + r);
  }
}