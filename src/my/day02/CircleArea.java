package my.day02;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// ���� ������ ����ϴ� ���α׷� �ۼ��ϱ�
		// ���� �������� ����ڷ� ���� �Է¹޾Ƽ� ����Ͻÿ�.
		// Scanner ��ü�� ����ϼ���.
		
		double radius;
		double area;
		System.out.println("�������� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		radius = scan.nextDouble();
		area = radius*radius*3.14;
		System.out.println(area);

	}

}
