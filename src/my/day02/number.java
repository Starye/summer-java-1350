package my.day02;

public class number {

	public static void main(String[] args) {
		
		int a1 = 0;
		int a2 = 0;
		
		for(int i = 1 ; i < 11 ; i++) {
			int result = i % 2;

		switch (result) {
		case 0:
			a2 = a2 + i;
			break;
		case 1: 
			a1 = a1 + i;
			break;
		default: 
			break;
		}
		}
		System.out.println("1���� 10������ ¦���� ����"+ a2+"�Դϴ�");
		System.out.println("1���� 10������ Ȧ���� ����"+ a1+"�Դϴ�");
		
	

}
}