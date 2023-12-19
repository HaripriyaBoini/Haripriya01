package ex12.reference_demo;

public class Method_Overriding {

	public static void main(String[] args) {
		Math_Operation m=new Add_Operation();
        System.out.println(m.add(1,200));
        System.out.println(((Add_Operation)m).add(1,2,3));
        
        
        Add_Operation a=new Add_Operation();
        System.out.println(a.add(1, 20));
        System.out.println(a.add(1, 20,30));

	}

}
