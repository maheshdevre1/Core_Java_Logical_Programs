package PatternProgram;

public class CrossStarPattern {

	public static void main(String[] args) {
		int star = 9, space = -1;
		for (int i = 1; i <= 7; i++) {
			if (i <= 4) {
				star = star - 2;
				space = space + 1;
			} else {
				star = star + 2;
				space = space - 1;
			}
            for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
