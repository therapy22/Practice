package part1.ex5.narray;

import java.util.Scanner;

public class Program{
		
public static void main(String[] args) {
	
	int[] kors = new int[3*3];
	int total = 0;
	float avg = 0;
	int menu;

	Scanner scan = new Scanner(System.in);
	
	for(int j=0; j<3; j++)
		for(int i=0; i<3; i++) 
			kors[3*j + i] = 0;

	종료:
	while (true) {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           메인 메뉴                  │");
		System.out.println("└───────────────────────────┘");
		System.out.println("\t1. 성적입력 ");
		System.out.println("\t2. 성적출력 ");
		System.out.println("\t3. 종료 ");
		System.out.println("\t선택> ");
		menu = scan.nextInt();

		
		switch(menu) {
		
		//input the grade
		case 1: 
			System.out.println("┌───────────────────────────┐");
			System.out.println("│           성적  입력                 │");
			System.out.println("└───────────────────────────┘");
			System.out.println();

			for(int j=0; j<3; j++)
				for(int i=0; i<3; i++)
					do {
						System.out.printf("%d학년 국어%d : ", j+1, i+1);
						kors[3*j + i] = scan.nextInt();
		
						if (kors[3*j + i] < 0 || 100 < kors[3*j + i])
							System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
		
				} while (kors[3*j + i] < 0 || 100 < kors[3*j + i]);
					
			System.out.println("─────────────────────────────");
			
			break;
			
		case 2:
		
		//print grade

			System.out.println("┌───────────────────────────┐");
			System.out.println("│           성적  출력                   │");
			System.out.println("└───────────────────────────┘");
			System.out.println();

			for(int j=0; j<3; j++) {
				
				System.out.printf("<%d학년 국어성적>-----------------\n", j+1);
				
					for (int i = 0; i < 3; i++) {
						System.out.printf("\t%d학년 국어 %d : %3d\n", j+1 ,i+1, kors[3*j + i]);			
					}
					
				total = kors[3*j + 0] + kors[3*j + 1] + kors[3*j + 2];
				avg = total / 3.0f;
				
				System.out.printf("\t총점 : %3d\n", total);
				System.out.printf("\t평균 : %6.2f\n", avg);
				System.out.println("─────────────────────────────");
			}  
					
			
			break;
		case 3:
			break 종료;
	
		
		default:
			System.out.println("입력 오류 1~3까지만 입력할 수 있습니다");
	  }
	}
	
	System.out.println("good bye~");

  }
}

