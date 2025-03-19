package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.Controller;
import Model.MemberDTO;

public class Main {

	public static void print() {
		System.out.println("+---------+--------+-----------+--------+--------+-----------+-----------+\r\n"
				+ "|  START  | TAIBEI |  BEIJING  | MANILA |  JEJU  | SINGAPORE |    CAIRO   |\r\n"
				+ "+---------+--------+-----------+--------+--------+-----------+------------+\r\n"
				+ "| NEW YORK|                                                  |  ISTANBUL  |\r\n"
				+ "+---------+                                                  +------------+\r\n"
				+ "|  PARIS  |                                                  |   ATHENS   |\r\n"
				+ "+---------+                                                  +------------+\r\n"
				+ "|  TOKYO  |                                                  | COPENHAGEN |\r\n"
				+ "+---------+                                                  +------------+\r\n"
				+ "|  MADRID |                                                  |  STOCKHOLM |\r\n"
				+ "+---------+                                                  +------------+\r\n"
				+ "|  LISBON |                                                  |    BERN    |\r\n"
				+ "+---------+--------+-----------+--------+--------+-----------+------------+\r\n"
				+ "|  HAWAII | SYDNEY |  HONGKONG |  SWISS | OTTAWA |   BERLIN  |   ISLAND   |\r\n"
				+ "+---------+--------+-----------+--------+--------+-----------+------------+\r\n" + "");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Controller control = new Controller();

		while (true) {
			System.out.print("메뉴 선택 [1]게임실행 [2]랭킹확인 [3]회원가입 [4]회원탈퇴 [5]종료 >>");
			int input = sc.nextInt();

			if (input == 1) {

				System.out.println("플레이 인원 수 선택 : ");
				int input2 = sc.nextInt();
				boolean check = true;
				if (input2 > 1 && input2 <= 4) {
					for (int i = 0; i < input2; i++) {
						System.out.println((i + 1) + "번째 플레이어에 로그인하세요 !");
						System.out.print("ID : ");
						String id = sc.next();
						System.out.print("PW : ");
						String pw = sc.next();

						int result = control.Con_login(id, pw);

						if (result > 0) {
							System.out.println(id + "회원님 로그인 성공!");
						} else {
							System.out.println(id + "회원님 로그인 실패 ㅠㅠ");
							check = false;
							break;
						}
					}
					if (!check)
						continue;
					System.out.println("\n" + "     ⢀⣠⣤⣴⣶⣶⣤⣤⡀    ⠀⠀ ⣠⣤⣤⣤⣤⠀⠀ ⠀⠀⠀⣤⣤⣤⣤⣤⠀⠀ ⣠⣤⣤⣤⣤⣤⠀⠀⢠⣤⣤⣤⣤⣤⣤⣤⣤⣤⠀⠀⣾⣿⣿\r\n"
							+ "⠀⡀⢀⣴⣿⣿⣿⠿⠿⠿⢿⣿⡿⠃⠀ ⠀⠀⣰⣿⣿⣿⣿⣿⡇    ⢰⣿⣿⣿⣿⣿⡇⠀⢠⣿⣿⣿⣿⣿⡇⠀⠀⣿⣿⣿⣿⣿⣿⠿⠿⠿⠏⠀⠀⣾⣿⣿⡏⠀\r\n"
							+ "⡀⢠⣿⣿⣿⠏⠀⠀⠀⠀  ⠀⠀⠀   ⣼⣿⣿⡟⢹⣿⣿⣿⡏  ⡀⣼⣿⣿⣿⣿⣿⡇⢀⣿⣿⡏⣿⣿⣿⠁⠀⢠⣿⣿⣿⣇⣀⣀⣀⣀⠀⠀⠀⠀⣿⣿⣿⠁⠀⠀\r\n"
							+ "⢀⣿⣿⣿⡟⠀⠀⣼⣿⣿⣿⣿⣿⠀⠀ ⣼⣿⣿⡟⠀⢸⣿⣿⣿⡅  ⢀⣿⣿⡟⣿⣿⣿⡇⣼⣿⡿⢸⣿⣿⡏⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⢸⣿⣿⡏⠀⠀⠀\r\n"
							+ "⠘⣿⣿⣿⣧⠀⠀⠛⠛⢻⣿⣿⡏⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡗  ⢸⣿⣿⠇⢻⣿⣿⣿⣿⡿⠁⣾⣿⣿⠃⠀⠀⣿⣿⣿⡏⠉⠉⠉⠉⠁⠀⠀⠀⠸⠟⠛⠁⠀⠀⠀\r\n"
							+ "⠀⠹⣿⣿⣿⣷⣤⣤⣴⣾⣿⣿⠃⢀⣾⣿⣿⣏⠍⠭⠟⠋⢻⣿⣿⣷⠶⠂⣿⣿⣿⠀⢸⣿⣿⣿⣿⠃⢨⣿⣿⣿⠀⠀⢸⣿⣿⣿⣷⣶⣶⣶⣶⣶⡆⠀⢰⣶⣶⣶⠀⠀⠀\r\n"
							+ " ⠀⠙⠙⠛⠿⠿⠿⠿⠛⠋⠁⠀⠚⠛⠛⠋⠀      ⠘⠛⠛⠛⠀⠐⠛⠛⠋⠀⠘⠛⠛⠛⠃⠀⠘⠛⠛⠃⠀⠀⠚⠛⠛⠛⠛⠛⠛⠛⠛⠛⠀⠀⠚⠛⠛⠋⠀⠀⠀⠀\r\n");

					print();

				} else {
					System.out.println("인원수를 다시 선택해주세요. 2 ~ 4명이 플레이 할 수 있는 게임입니다.");
				}


			} else if (input == 2) { // 랭킹확인
				System.out.println("랭킹확인");

				System.out.println("ID\t이름\t승점\t레벨");

				ArrayList<MemberDTO> result = control.Con_lank();

				for (MemberDTO r : result) {
					System.out.println(r.getId() + "\t" + r.getName() + "\t" + r.getWinnum() + "\t" + r.getLv());
				}

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
