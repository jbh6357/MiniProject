package Player;

import java.util.Random;

public class Player  {
	
	 String name;
	 int position = 0; // 현재 위치
	 int round = 0;    // 몇 바퀴 돌았는지
	 int money = 100;  // 플레이어의 초기 지급 금액
	 final int income = 20; //월급

	    public void move() {
	        Random random = new Random();
	        int dice1 = random.nextInt(6) + 1;
	        int dice2 = random.nextInt(6) + 1;
	        int dicetotal = dice1 + dice2;

	        int newPosition = position + dicetotal;

	        // 보드를 넘어가면 0부터 다시 시작
	        if (newPosition > 22) {
	            newPosition = newPosition % 23;
	            round++;
	            money += income; // 월급
	        }

	        position = newPosition;  
		
	    //결과
        System.out.println("주사위 1, 주사위 2 : 주사위 합계: " + dice1 +","+ dice2 +" : "+ dicetotal);
        System.out.println("이동 후 위치: " + position);
        System.out.println("현재 라운드: " + round);
        System.out.println("현재 보유 금액: " + money);	
	}

		public static void main(String[] args) {
		
	    	Player player = new Player();
	    	player.move();
		}


	


}