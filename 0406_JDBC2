package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {
		//JDBC에서 한 거 다시 해보기
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "ljh";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
//		try {
//			con = DriverManager.getConnection(url, user, password); //driver는 연결하기 위해 먼저 선언, try catch로 감싸줘야 에러 안 남
//		
//			String sql = "select *" //띄어쓰기를 다 살려서 써줘야 쿼리가 정상쿼리로 인식되어 결과가 잘 나옴
//					+ " from cart"
//					+ " where cart_member = ?" //물음표를 넣어두고 물음표에 들어갈 값을 따로 세팅해놓으면 그때 그때 유동적으로 원하는 값으로 검색 가능. 물음표는 값만 대신할 수 있음. 컬럼명이나 테이블명은 대신할 수 없음
//					+ " and cart_qty > ?";
//			ps = con.prepareStatement(sql);
//			//아래 두 문장은 ?에 값을 넣은 것. 첫 자리는 인덱스, 두 번째 자리는 물음표에 들어갈 값
//			ps.setString(1, "a001");
//			ps.setInt(2, 5);
//			
//			rs = ps.executeQuery(); //조회된 컬럼의 갯수를 알아내는 게 중요함
//			ResultSetMetaData metaData = rs.getMetaData(); //메타데이터 : 데이터에 대한 데이터. 컬럼의 수를 알 수 있음
//			
//			int columnCount = metaData.getColumnCount();
//			
//			while(rs.next()) {
//				for(int i = 1; i <= columnCount; i++) { //컬럼 수만큼 for문 돌리기. 모든 컬럼을 한 번에 꺼내는 것이라 타입이 다를 경우가 많음. 타입을 다 구분할 수 없으니 getObject로 값을 꺼내옴
//					System.out.print(rs.getObject(i) + "\t");
//				}
//				System.out.println();
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if(rs != null) try {rs.close();} catch(Exception e) {}
//			if(ps != null) try {rs.close();} catch(Exception e) {}
//			if(con != null) try {rs.close();} catch(Exception e) {}
//		}
		
		
		
		////////////////////////////////////////////////////////////////////////////
		
		//select
//		try {
//			con = DriverManager.getConnection(url, user, password);
//		String sql = "select * from copyStudents";
//		ps = con.prepareStatement(sql);
//		
//		rs = ps.executeQuery(); 
//		ResultSetMetaData metaData = rs.getMetaData(); 
//		
//		int columnCount = metaData.getColumnCount();
//		
//		while(rs.next()) {
//			for(int i = 1; i <= columnCount; i++) { 
//				System.out.print(rs.getObject(i) + "\t");
//			}
//			System.out.println();
//		}
//		
//	} catch (SQLException e) {
//		e.printStackTrace();
//	} finally {
//		if(rs != null) try {rs.close();} catch(Exception e) {}
//		if(ps != null) try {rs.close();} catch(Exception e) {}
//		if(con != null) try {rs.close();} catch(Exception e) {}
//	}
		
		
	////////////////////////////////////////////////////////////////////////////
		
		//insert
//		try {
//			con = DriverManager.getConnection(url, user, password);
//			
//			String sql = "insert into"
//					+ " copyStudents(STUD_NO, STUD_NAME, STUD_DEP)"
//					+ " values (2022030006, '후후리', 407)";
//			ps = con.prepareStatement(sql);
//			ps.executeQuery();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally {
//			if(rs != null) try {rs.close();} catch(Exception e) {}
//			if(ps != null) try {rs.close();} catch(Exception e) {}
//			if(con != null) try {rs.close();} catch(Exception e) {}
//		}
		
		
		
		
		
	}

}
