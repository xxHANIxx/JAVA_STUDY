﻿/*
  
작성자 : xxHANIxx
작성일자 : 2019.02.18.

요구사항 6. 아래와 같이 출력하시오.

출력]
    1    2    4    7   11
    3    5    8   12   16
    6    9   13   17   20
   10   14   18   21   23
   15   19   22   24   25
   
추가조건]
- 테이블의 행/열을 입력받아 출력한다.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex33_06 {

	public static void main(String[] args) throws Exception {
		
		output();

	}

	private static void output() throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("행과 열의 갯수 : ");
		int line = Integer.parseInt(reader.readLine());		
		
		int n = 0;
		
		int[][] nums = new int[line][line];
		
		for (int i=0; i<(nums.length*2)-1; i++) { //EX. 5 X 5 행렬은 9회전을 함 -> (5 * 2) -1
			
			for (int j=0; j<nums.length; j++) { //행의 위치
				
				int k = i - j; //k는 열의 위치를 지정해주는 변수
				
				if(k>=0 && k<line) {
					n++;
					nums[j][k] = n;
				}
			}
		}
		
		print(nums);
		
	}//output

	private static void print(int[][] nums) {
		
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[0].length; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
	}//print

}