package Ch03;

import java.util.Arrays;
import java.util.Scanner;

public class C06Ex {

	public static void main(String[] args) {
//		// 5개의 정수값을 입력 받아 int 형 배열에 저장하고
//		// 최대값, 최소값, 전체 합을 출력합니다.
//		Scanner sc = new Scanner(System.in);
//		int arr[] = new int[5];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//			
//		System.out.println(Arrays.stream(arr).sum());	
//		System.out.println(Arrays.stream(arr).max().getAsInt());	
//		System.out.println(Arrays.stream(arr).min().getAsInt());	
//		}
		
		
		
		// 5명의 학생에 국영수 접수를 입력 받아 2차원 배열 저장
		// 각 학생의 국영수 점수의 합/평균 구하고
		// 각 과목당 합, 평균을 구해보세요
		Scanner sc = new Scanner(System.in);
		int [][] scores = new int[5][3]; //행 (0-4) 학생, 열(0-2) -> 국(0), 영(1), 수(2)
		
		// 입력
		for(int i=0;i<scores.length;i++) {
			//각 학생별 반복
			System.out.printf("%d 번째 학생 국영수 점수 입력 :", i );
			for(int j=0;j<scores[i].length;i++) {
				scores[i][j] = sc.nextInt();
			}
		}
		
		// 학생별 총점 평균
		int students_sum[] = new int[5]; //0-4
		double students_avg[] = new double[5]; //
		for(int i=0;i<scores.length;i++) {
			int sum = 0;
			double avg=0.0;
			for(int j=0;j<scores[i].length;i++) {
				sum+=scores[i][j];
			}
			avg = (double)sum / scores.length;
			
			students_sum[i]=sum;
			students_avg[i]=avg;
			
			
		}	
		// 과목별 총점 평균
		int 과목별총점[] = new int[3]; // 0: 국어 총점, 1: 영어 총점, 2: 수학 ㅗㅇ점
		for(int i=0;i<scores.length;i++) {
			//각 학생별 반복
			for(int j=0;j<scores[i].length;i++) {
				과목별총점[0]+=scores[i][0];
				과목별총점[1]+=scores[i][1];
				과목별총점[2]+=scores[i][2];
			}
		}
		
		
		sc.close();
	}

}
