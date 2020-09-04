package part1.ex1.elseif;

import java.util.Scanner;

public class Program{
		
public static void main(String[] args) {
	
	int kor1, kor2, kor3;
	int total;
	float avg;
	int menu;

	Scanner scan = new Scanner(System.in);
	
	kor1 = 0;
	kor2 = 0;
	kor3 = 0;

	while (true) {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           메인 메뉴                  │");
		System.out.println("└───────────────────────────┘");
		System.out.println("\t1. 성적입력 ");
		System.out.println("\t2. 성적출력 ");
		System.out.println("\t3. 종료 ");
		System.out.println("\t선택> ");
		menu = scan.nextInt();

		
		//input the grade
		if(menu == 1) {
			
			System.out.println("┌───────────────────────────┐");
			System.out.println("│           성적  입력                 │");
			System.out.println("└───────────────────────────┘");
			System.out.println();

			
			do {
				System.out.printf("국어1 : ");
				kor1 = scan.nextInt();

				if (kor1 < 0 || 100 < kor1)
					System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

			} while (kor1 < 0 || 100 < kor1);
			
			do {
				System.out.printf("국어2 : ");
				kor2 = scan.nextInt();

				if (kor2 < 0 || 100 < kor2)
					System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

			} while (kor2 < 0 || 100 < kor2);
			
			
			do {
				System.out.printf("국어3 : ");
				kor3 = scan.nextInt();

				if (kor3 < 0 || 100 < kor3)
					System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

			} while (kor3 < 0 || 100 < kor3);

			System.out.println("─────────────────────────────");
			
		}
	
		
		//print grade
		
		else if(menu == 2) {
			
			total = kor1 + kor2 + kor3;
			avg = total / 3.0f;

			System.out.println("┌───────────────────────────┐");
			System.out.println("│           성적  출력                   │");
			System.out.println("└───────────────────────────┘");
			System.out.println();

			
			for (int i = 0; i < 3; i++) {
				System.out.printf("\t국어 %d : %3d\n", i+1, kor1);
			}

			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("─────────────────────────────");

		}
		
		else if(menu ==3) {
			
			System.out.println("good bye~");
			break;
		}
		
		else {
			System.out.println("입력 오류 1~3까지만 입력할 수 있습니다");

		}
		
	}
  }
}

