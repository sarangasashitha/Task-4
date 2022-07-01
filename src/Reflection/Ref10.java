package Reflection;

import java.lang.reflect.*;

public class Ref10 {
 public static void main(String[] args) throws Exception {
 Main r = new Main();
 Method m = r.getClass().getDeclaredMethod("setA", long.class);
 m.setAccessible(true);
 m.invoke(r, 86);
 System.out.println(r);
 }
}
