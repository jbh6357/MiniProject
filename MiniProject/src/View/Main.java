package View;

import java.util.ArrayList;
import java.util.Scanner;

import Model.BuildingDTO;
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

	public static void game(ArrayList<MemberDTO> players) {
		Scanner sc = new Scanner(System.in);
		Controller control = new Controller();
		ArrayList<BuildingDTO> buildings = control.Con_list();
		for(MemberDTO player : players)
		{
			// TODO : 보유머니 지급
		}
		boolean isPlay = true;
		
		while(isPlay) {
			
			for(int i = 0; i<players.size(); i++)
			{
				print();   // 부루마블 판 보여주기
				           
				/* TODO : 주사위던지기(두 번)
				
				
				
				*/  
				
				/* TODO : 이동하기
				  
				  
				*/
				
				/* TODO : 출발지점을 다시 넘었으면 월급 주기
				          
				  
				 
				*/
				
				/* TODO : 위치계산하여 무인도이면 턴 종료하기 
				 
				 
				 
				*/
				
				
				/* TODO : 더블주사위면 축하메세지 출력하고 i--;하기
				  
				  
				 
				*/
				
				
				/* TODO : buildings.get(위치)해서 불러온 다음 정보 출력하기
				          ex) ***님의 소유지입니다! 
				              통행료 : 100
				              인수가격 : 200
				          ex2) 빈 땅입니다!
				               통행료 : 100
				               구매가 : 100
				 
				*/
				
				/* TODO : 통행료 지불(빈 땅이거나 자기 소유지인 경우 패스) 
				          통행료 지불이 불가한 경우 isPlay = false로 바꾸고 break;하기
				  
				  
				*/
				
				/* TODO : 구매 or 인수(단, 금액이 충분치 않으면 불가능하다고 출력하고 차례 넘기기)
				  
				 
				*/
				 System.out.println("임시출력");
				 int temp = sc.nextInt();
				
			}
			
		} // while 문 종료
		
		/* TODO 등수 산정 후 출력 + 플레이어 DB 갱신하기(승점, 판수, 레벨)
		  
		 
		*/
				
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
					ArrayList<MemberDTO> players = new ArrayList<MemberDTO>();
					for (int i = 0; i < input2; i++) {
						System.out.println((i + 1) + "번째 플레이어에 로그인하세요 !");
						System.out.print("ID : ");
						String id = sc.next();
						System.out.print("PW : ");
						String pw = sc.next();
						
						players.add(control.Con_login(id, pw));
						
						if (players.get(i) != null) {
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
					
					game(players);

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
