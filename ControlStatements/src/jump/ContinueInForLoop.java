package jump;

public class ContinueInForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==5) 
				continue;
		System.out.println("i="+ i);
		}
			
		System.out.println("\n outside loop");
	}

}
