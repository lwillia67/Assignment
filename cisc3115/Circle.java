//Thomas Chen 
//Cisc 3115 
//Assignment #3

public class Circle extends Shape {
   public Circle()	{
      super();
   }
   public String draw(){
      return " drawing circle";
   }
    public String erase(){
      return " Eraseing circle";
   }
   public static void main (String[]args){
      Circle myc= new Circle();
      System.out.println(myc.draw());
      System.out.println(myc.erase());
   } 	
}
