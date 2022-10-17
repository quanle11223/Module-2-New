package Bai5;

public class StaticProperty {
   private String name;
   private String enige;

   public static int numberofCars;

   public StaticProperty (String name , String enige) {
       this.name = name;
       this.enige = enige;
       numberofCars++;
   }
}
