package example;

public class Assign_Rectangle {
             int length;
             int breadth;
             public  void rectangle(int length,int breadth) {
            	 int area;
            	 area=length*breadth;}
            	 public void setlength(int l) {
            		  length=l; }
            		 public void setBreadth(int b) {
            			  breadth=b; }
            			 public int getLength() {
            				 return length;
            			 }
            			 public int getBreadth()
            			 {       
            			        return breadth;
            				 }
            			 public void printArea() {
            				 int area=(length*breadth);
            				 System.out.println("area of rectangle is:"+area);
            			 }
            			
            		 
            			 public void printPerimeter() {
            				 int perimeter=2*((length+breadth));
            				 System.out.println("perimeter of a rectangle is"+perimeter);
            			 }
            				 
            				 
            			 public void printDiagonal() {
            				 double diagonal=(Math.sqrt((length*length)+(breadth*breadth)));
            				 System.out.println("diagonal of a rectangle"+diagonal);
            			 }

         

	
}

