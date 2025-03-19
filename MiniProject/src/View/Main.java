package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.Controller;
import Model.MemberDTO;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Controller control = new Controller();

		while (true) {
			System.out.print("메뉴 선택 [1]게임실행 [2]랭킹확인 [3]회원가입 [4]회원탈퇴 [5]종료 >>");
			int input = sc.nextInt();

			if (input == 1) {

				System.out.println("플레이 인원 수 선택 : ");
				int input2 = sc.nextInt();

				/**
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 */

			} else if (input == 2) { // 랭킹확인

			} else if (input == 3) {
				System.out.println("==회원가입==");

				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("이름 : ");
				String name = sc.next();

				// controller에 필요한 정보를 담아서,
				// Model이 로직을 수행하게끔
				int result = control.Con_join(id, pw, name);

				// return된 result의 값으로 성공 여부를 확인
				if (result > 0) {
					System.out.println("회원가입 성공!");
				} else {
					System.out.println("회원가입 실패ㅠ");
				}
			} else if (input == 4) {
				// 회원탈퇴
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();

				int result = control.Con_delete(id, pw);

				if (result > 0) {
					System.out.println("회원탈퇴 성공!");
				} else {
					System.out.println("회원탈퇴 실패ㅠ");
				}
			} else if (input == 5) {
				break;
			}

		}

	}

}
