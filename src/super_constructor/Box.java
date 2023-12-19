package super_constructor;

public class Box {
 private double length;
 private double width;
 private double height;
 
 public Box() {
	 length=width=height=-1;
 }
 public Box(double length,double width,double height){
	 this.length=length;
	 this.width=width;
	 this.height=height;
 }
 
 public Box(double side) {
	 length=width=height=side;
 }
 public void display() {
	 System.out.println(length+","+width+","+height);
 }
}
