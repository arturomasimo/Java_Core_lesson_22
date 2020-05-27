package lession22_2;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
	
		Summ1 summ1 = (int x) -> x;
		Summ2 summ2 = (int x, int y) -> x+y; 
		Summ3 summ3 = (int x, int y, int z) -> x+y+z;
		Direction d1 = () -> { 
		int rand = new Random().nextInt(100) % 6; 
		switch (rand)
		{
			case 1:{System.out.print("направо "); break;}
			case 2:{System.out.print("наліво ");  break;}
			case 3:{System.out.print("вперед ");  break;}
			case 4:{System.out.print("вверх ");  break;}
			case 5:{System.out.print("вниз ");  break;}
			case 0:{System.out.print("назад ");   break;}
		}
		};
		
		System.out.println("100="+summ1.add(100));

		System.out.println("10+10="+summ2.add(10, 10));
		 
		System.out.println("10+10+10="+summ3.add(10, 10, 10));

		for (int i = 0; i < 7; i++) {
			d1.movemoment();
		}
	}

}
