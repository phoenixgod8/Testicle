import java.util.Scanner;

public class bigTestes {

	public static void main(String[] args) {
	
		int amount;
		
		Scanner kb = new Scanner(System.in);
		int balls[];
		
		System.out.println("Enter amount of nums: ");
		amount = kb.nextInt();
		balls = new int[amount];
		
		for(int x = 0;x < amount;x++){
			System.out.println("Enter next number: ");
			balls[x] = kb.nextInt();
			
		}
		for(int y = amount;y > 0;y--){
			System.out.print(balls[y-1]);
		}
		

	}

}
