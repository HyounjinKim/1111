package chap03;

class OperatorEx1 {
	public static void main(String args[]) {
		int i=5;
		i++;		// i=i+1;�� ���� �ǹ��̴�. ++i;�� �ٲ� �ᵵ ����� ����.
		i += 1;
		System.out.println(i);

		i=5;		      //	����� ���ϱ� ���� i���� �ٽ� 5�� ����.
		++i;
		i += 1;
		System.out.println(i);
	}
}
