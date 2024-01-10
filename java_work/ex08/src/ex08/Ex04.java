package ex08;

public class Ex04 {
	public static void main(String[] args) {
		for (int k = 0; k < 10; k++)
			aa : for (int i = 0; i < 10; i++) {
				System.out.println("i = " + i);
				for (int j = 0; j < 10; j++) {
					if (j == 0 || j % 3 == 0) {
						continue;
					}

					if (j == 7) {
						i += 1;
						System.out.println("11");
						break aa;
					}
					System.out.println("\t j = " + j);

				}
			}
	}

}
