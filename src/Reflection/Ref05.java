package Reflection;

import java.lang.reflect.Field;

public class Ref05 {

  public static void main(String[] args) throws Exception{
    Main r = new Main();
    
    Field [] fields =  r.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n", fields.length);
    
    for(Field f : fields) {
      System.out.printf("field name=%s type=%s value=%d\n", 
          f.getName(), f.getType(), f.getLong(r));
   
    }
  }
}