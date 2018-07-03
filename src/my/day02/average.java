package my.day02;

import java.util.Scanner;

public class average {

	public static void main(String[] args) {

		double kor;
		double math;
		double eng;
		double average;
	
	Scanner	scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		kor = scan.nextDouble();
		System.out.println("수학 점수를 입력하세요");
		math = scan.nextDouble();
		System.out.println("영어 점수를 입력하세요");
		eng = scan.nextDouble();
		average = (kor+math+eng)/3;
		System.out.println("평균점수는 "+average+"입니다");

		if(kor > average) 
			System.out.println("국어 점수는 평균 이상입니다");
		 else if (kor < average) 
			System.out.println("국어 점수는 평균 이하입니다");
		 else 
			System.out.println("국어 점수는 평균입니다");
	
		if(math > average) 
			System.out.println("수학 점수는 평균 이상입니다");
		 else if (math < average) 
			System.out.println("수학 점수는 평균 이하입니다");
		 else 
			System.out.println("수학 점수는 평균입니다");
		
		if(eng > average) 
			System.out.println("영어 점수는 평균 이상입니다");
		 else if (eng < average) 
			System.out.println("영어 점수는 평균 이하입니다");
		 else 
			System.out.println("영어 점수는 평균입니다");
	}
	
}

	

