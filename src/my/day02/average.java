package my.day02;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {

		double kor;
		double math;
		double eng;
		double average;
	
	Scanner	scan = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���");
		kor = scan.nextDouble();
		System.out.println("���� ������ �Է��ϼ���");
		math = scan.nextDouble();
		System.out.println("���� ������ �Է��ϼ���");
		eng = scan.nextDouble();
		average = (kor+math+eng)/3;
		System.out.println("��������� "+average+"�Դϴ�");

		if(kor > average) 
			System.out.println("���� ������ ��� �̻��Դϴ�");
		 else if (kor < average) 
			System.out.println("���� ������ ��� �����Դϴ�");
		 else 
			System.out.println("���� ������ ����Դϴ�");
	
		if(math > average) 
			System.out.println("���� ������ ��� �̻��Դϴ�");
		 else if (math < average) 
			System.out.println("���� ������ ��� �����Դϴ�");
		 else 
			System.out.println("���� ������ ����Դϴ�");
		
		if(eng > average) 
			System.out.println("���� ������ ��� �̻��Դϴ�");
		 else if (eng < average) 
			System.out.println("���� ������ ��� �����Դϴ�");
		 else 
			System.out.println("���� ������ ����Դϴ�");
	}
	
}

	

