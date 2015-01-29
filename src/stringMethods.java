
public class stringMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String gay = "0123456789";
		while (true){
		System.out.println(gay.substring(0,((int)(Math.random()*(11)))));
		Thread.sleep(250);
		}	
	}

}
