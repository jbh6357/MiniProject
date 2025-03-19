package Model;

public class MemberDTO {
	// [DTO]
	// -> Database Transfer Object
	
	private String id;
	private String pw;
	private String name;
	private int playnum;
	private int winnum;
	private int lv;
	
	
	// 회원가입을 위한 생성자 메소드
	public MemberDTO(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public MemberDTO() {
		
	}
	
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}


	public String getName() {
		return name;
	}
	
	public void setId(String id) {
		this.id = id;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}
	
}
