package DM;

import java.util.Random;

public class Dice {
	public static void main(String[] args) {
		int []list1 = new int [7];
		int []list2 = new int [7];
		for(int i = 1;i < 7;i++) {
			list1[i] = i;
			list2[i] = i;
		}
		Random r = new Random();
		Integer rd1 = list1[r.nextInt(6)];
		Integer rd2 = list2[r.nextInt(6)];

		System.out.println(rd1);
		System.out.println(rd2);
		System.out.println(rd1+rd2);
	}
}
