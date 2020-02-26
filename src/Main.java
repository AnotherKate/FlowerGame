import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		Flower flower1 = new Flower();
		System.out.println(flower1);
		System.out.println("You lose water and fertilizer everyday! (If sun is more then 2 you lose even 2 pionts of water!");
		Scanner scan = new Scanner(System.in);
		
	
		while(flower1.isIfAlive()==true) {
			System.out.println("What do you want to do, write the number: 1 - Add Water(+2), 2 - Kill All Worms, 3 - Add Fertilizer(+2). Good Luck!");
			String stringMove = scan.nextLine();
			int move = Integer.valueOf(stringMove);


			while(move<1 || move >3 ) {
				System.out.println("You need to write a correct number: ");
				stringMove = scan.nextLine();
				move = Integer.valueOf(stringMove);
			}
			flower1.getdayCykle();
			if (move == 1) {
				System.out.println("You chose to add water.");
				flower1.getWater();
				flower1.getSun();
				flower1.isIfAlive();
			}
			else if(move == 2) {
				System.out.println("You chose to kill all warms!");
				flower1.getWorms();
				flower1.getSun();
				flower1.isIfAlive();

			}else {
				System.out.println("You chose to add fertlilzer");
				flower1.getFertilizer();

			}
			flower1.getSun();
			flower1.isIfAlive();
			System.out.println("Your flower is alive! Great choice!");
			System.out.println(flower1);
		}
		System.out.println("You lose! Try some other time!");
		scan.close();
		
	}	
	
	}

