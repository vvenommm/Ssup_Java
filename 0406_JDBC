package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
		/*
		 * JDBC(Java Database Connectivity)
		 * 자바와 데이터베이스를 연결해주는 라이브러리
		 * ojdbc : 오라클 JDBC
		 * 
		 * JDBC 작성 단계
		 * 1. Connection 생성(db 연결)
		 * 2. Statement 생성(쿼리 작성)
		 * 3. Query 실행
		 * 4. ResultSet에서 결과 추출(select인 경우)
		 * 5. ResultSet, Statement, Connection 닫기
		 */

		
		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "ljh";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		//try and catch로 감싸야 하기 때문에 변수 먼저 만듦
		
		try {
			con = DriverManager.getConnection(url, user, password); //드라이버 : 서로 다른 것들을 연결해주는 다리
			
			String sql = "select * from member";
			ps = con.prepareStatement(sql);
			
			//select
			rs = ps.executeQuery(); //조회 결과
			
			//insert, update, delete
//			int result = ps.executeUpdate(); //영향받은 행의 수
			
			while(rs.next()) { //next는 첫 번째 줄을 가져옴. 다음 행의 여부를 알려줌. 다음 행이 없을 땐 false가 되면서 종료
				String memId = rs.getString(1); //getString
				String memPass = rs.getString("MEM_PASS"); //getString
				System.out.println("MEM_ID : " + memId + " / MEM_PASS : " + memPass);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {rs.close();} catch(Exception e) {}
			if(con != null) try {rs.close();} catch(Exception e) {}
		}
		
		
		
		
	}

}
