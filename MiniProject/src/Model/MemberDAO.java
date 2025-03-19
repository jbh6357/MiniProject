package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	// [DAO]
	// -> Database Access Object

	Connection conn = null; // DB연결
	PreparedStatement psmt = null; // sql구문셋팅/실행
	int result = 0; // return되는 int 형태 결과를 저장
	ResultSet rs = null; // return되는 테이블 형태 결과를 저장

	public void getConn() { // DB 접속 메소드
		// DB 드라이버 로드
		try {
			// getConn
			// - 드라이버 로딩, url/user/pw로 db접속
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DB연결에 필요한 설정값
			String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1523:xe";
			String user = "hapjeong_24SW_DS_p1_3";
			String pw = "smhrd3";
			conn = DriverManager.getConnection(url, user, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() { // 객체를 반납할 수 있는 메소드
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int join(MemberDTO dto) { // 회원가입 쿼리 메소드

		getConn();

		String sql = "INSERT INTO USER_INFO(ID,PW,NAME) VALUES(?,?,?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			result = psmt.executeUpdate(); // 실행

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(); // 도구 반납
		}

		return result;
	}

	public int delete(MemberDTO dto) { // 회원탈퇴 쿼리 메소드
		
		getConn();

		String sql = "DELETE FROM USER_INFO WHERE ID = ? AND PW = ?";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			result = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return result;
	}

}
