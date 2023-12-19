package interfacedemo;

public class TestFunctionalInterface {

	public static void main(String[] args) {
		MyInterface myInterface=new MyInterfaceImpl();
		myInterface.sayHello();
	}

}
