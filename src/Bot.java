/**
 * Created by Matthew on 11/2/16.
 */

import java.util.Scanner;

public class Bot {

	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		(new Bot()).run();
	}

	public void run() {
		while (scan.hasNextLine()) {
			String line = scan.nextLine();

			if (line.length() == 0) {
				continue;
			}

			String[] parts = line.split(" ");

			if (parts[0].equals("pick_starting_region")) {
				System.out.println("give me randomly");
			} else if (parts.length == 3 && parts[0].equals("go")) {
				String output = "";

				if (parts[1].equals("place_armies")) {
					for (int i = 1; i <= 5; i++) {
						output.concat("myBot place_armies " + i + " 1,");
					}
				} else if (parts[1].equals("attack/transfer")) {
					for (int i = 1; i <= 5; i++) {
						output.concat("myBot attack/transfer " + i + " " + i + 1 + " 1,");
					}
				}

				System.out.println(output);
			} else { // Game settings, round information and opponent moves are also given
				// Store it or something
			}
		}
	}
}
