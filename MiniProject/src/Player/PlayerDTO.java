package Player;

public class PlayerDTO {
	private String name ;
	private int position = 0; // 현재 위치
	private int round = 0;    // 몇 바퀴 돌았는지
	private int money = 100;  // 플레이어의 초기 지급 금액
	private final int income = 20; //월급
	
	//player생성자
	public PlayerDTO(String name) {
        this.name = name;
        this.position = 0;
        this.round = 0;
        this.money = 100;
	}
	
	

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getIncome() {
		return income;
	}
	

	
}
