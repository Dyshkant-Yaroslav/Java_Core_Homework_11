package ua.lviv.desctop.part2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Autho[][] a = new Autho[(int) (Math.random() * 10 + 1)][(int) (Math.random() * 10 + 1)];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = new Autho((int) (Math.random() * 1001), (int) (Math.random() * 71 + 1950),
						new SteeringWheel((int) (Math.random() * 101), randomMatherial()),
						new Engine((int) (Math.random() * 13)));
			}
		}

		while (true) {
			menu();
			switch (sc.nextInt()) {
			case 1: {
				System.out.println(Arrays.deepToString(a));

			}
				break;
			case 2: {
				Autho[][] a1 = new Autho[(int) (Math.random() * 11)][(int) (Math.random() * 11)];
				Autho newAutho = new Autho(250, 2002, new SteeringWheel(50, "Leather"), new Engine(12));
				for (Autho[] authos : a1) {
					Arrays.fill(authos, newAutho);
				}

				System.out.println(Arrays.deepToString(a1));
			}
				break;
			}

		}

	}

	public static String randomMatherial() {
		String[] math = { "Leather", "Nubuk", "Velour", "Wood" };
		String val = math[(int) (Math.random() * 4)];

		return val;
	}

	public static void menu() {
		System.out.println("Please enter 1 for display toString() of array values");
		System.out.println("Please enter 2 for setting same values for all array objects ");
	}
}
