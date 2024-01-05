package chap03;

class OperatorEx31 {
	public static void main(String[] args) {
		int dec  = 1234; 
		int hex  = 0xABCD;
		int mask = 0xF;
		
		System.out.println(hex);
		System.out.println(mask);

		System.out.printf("hex=%X%n", hex);
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
	} // main�� ��
}
