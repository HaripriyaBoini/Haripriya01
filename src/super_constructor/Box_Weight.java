package super_constructor;

public class Box_Weight extends Box {
private double weight;
         Box_Weight(){
        	 weight=-1;
System.out.println("box weight class default constructor");
 }
         Box_Weight(double length,double width,double height,double weight){
        	 super(length,width,height);
        	 this.weight=weight;
         }
          
        	 
         Box_Weight(double side,double weight){
        	 super(side);
        	 this.weight=weight;
        	  }
         void display_Weight()
         {
System.out.println("weight"+weight);
         }
}

