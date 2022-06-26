package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {

	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "ljh";
	private static String password = "java";
	private static Connection con = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;
	
	/*
	 * Map<String, Object> selectOne(String sql) : select를 하기 위한 메소드. select의 결과가 한 줄일 때 사용하는 메소드
	 * Map<String, Object> selectOne(String sql, List<Object> param)
	 * List<Map<String, Object>> selectList(String sql) : select의 결과가 여러 줄일 때 사용하는 메소드
	 * List<Map<String, Object>> selectList(String sql, List<Object> param)
	 * int update(String sql) : select를 제외한 나머지 쿼리는 이 메소드를 사용. 몇 개의 행이 영향 받았는지 리턴
	 * int update(String sql, List<Object> param)
	 * 
	 * 메소드가 두 개씩 있으나 파라미터가 다름. 쿼리 안에 물음표 존재 여부 차이. 파라미터가 있는 메소드가 쿼리에 물음표가 있을 때 사용. 파라미터 = 물음표에 넣을 값 메소드로 같이 넘기는 것
	 */
	
	//쿼리 실행 후 결과를 map에 담아서 리턴
	//물음표 없는 selectOne
	public static Map<String, Object> selectOne(String sql){
		Map<String, Object> map = null;
		
		try {
			con = DriverManager.getConnection(url, user, password); //db에 연결
			
			ps = con.prepareStatement(sql); //만들고
			
			rs = ps.executeQuery(); //실행
			
			ResultSetMetaData metaData = rs.getMetaData(); //result에서 메타 데이터 가져오기
			
			int columnCount = metaData.getColumnCount();
			
			while(rs.next()) {
				map = new HashMap<String, Object>();
				for(int i = 1; i <= columnCount; i++) {
					map.put(metaData.getColumnName(i), rs.getObject(i)); //해쉬맵에 넣어 줌. 키는 컬럼 명. 메타데이터에 있는 getColumnName으로 컬럼명을 알아내서 저장
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		
		return map;
	}
	
	/////////////////////////////////////////////////////////////////////
	
	//물음표 있는 selectOne (위의 코드 복붙 후 수정)
		public static Map<String, Object> selectOne(String sql, List<Object> param){ //list는 물음표를 위한 리스트
			Map<String, Object> map = null;
			
			try {
				con = DriverManager.getConnection(url, user, password);
				
				ps = con.prepareStatement(sql);
				for(int i = 0; i < param.size(); i++) { //이 for문이 쿼리에 ?를 세팅하는 내용. set으로 시작하는 메소드를 통해 물음표를 세팅.
					ps.setObject(i+1, param.get(i)); //물음표의 값이 list에 들어가 있음. 물음표 몇 개인지 모르니까. 그래서 for문 돌려서 차례대로 넣은 것
				}
				
				rs = ps.executeQuery(); //실행
				
				ResultSetMetaData metaData = rs.getMetaData();
				
				int columnCount = metaData.getColumnCount();
				
				while(rs.next()) {
					map = new HashMap<String, Object>();
					for(int i = 1; i <= columnCount; i++) {
						map.put(metaData.getColumnName(i), rs.getObject(i));
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if(rs != null) try {rs.close();} catch(Exception e) {}
				if(ps != null) try {ps.close();} catch(Exception e) {}
				if(con != null) try {con.close();} catch(Exception e) {}
			}
			
			return map;
		}
	
	
		/////////////////////////////////////////////////////////////////////
	
		//selectList 메소드
		//조회 결과가 여러 개일 때 사용. map 대신 list를 만들어서 시작
		//대부분 map을 list로 바꾼 것
	
		public static List<Map<String, Object>> selectList(String sql){
			List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
			
			try {
				con = DriverManager.getConnection(url, user, password);
				
				ps = con.prepareStatement(sql);
				
				rs = ps.executeQuery();
				
				ResultSetMetaData metaData = rs.getMetaData();
				
				int columnCount = metaData.getColumnCount();
				
				while(rs.next()) {
					HashMap<String, Object> map = new HashMap<String, Object>();
					for(int i = 1; i <= columnCount; i++) {
						map.put(metaData.getColumnName(i), rs.getObject(i));
					}
					list.add(map);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if(rs != null) try {rs.close();} catch(Exception e) {}
				if(ps != null) try {ps.close();} catch(Exception e) {}
				if(con != null) try {con.close();} catch(Exception e) {}
			}
			
			return list;
		}
	
	
		/////////////////////////////////////////////////////////////////////
		
	
		//물음표가 있는 selectList 메소드
			
		public static List<Map<String, Object>> selectList(String sql, List<Object> param){
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
					
		try {
			con = DriverManager.getConnection(url, user, password);
						
			ps = con.prepareStatement(sql);
			for(int i = 0; i < param.size(); i++) {
				ps.setObject(i+1, param.get(i));
			}
						
			rs = ps.executeQuery();
						
			ResultSetMetaData metaData = rs.getMetaData();
					
			int columnCount = metaData.getColumnCount();
					
			while(rs.next()) {
				HashMap<String, Object> map = new HashMap<String, Object>();
				for(int i = 1; i <= columnCount; i++) {
					map.put(metaData.getColumnName(i), rs.getObject(i));
				}
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
			
		return list;
		}
	
	
		/////////////////////////////////////////////////////////////////////
	
	
		//int update 메소드
		public static int update(String sql){
			int result = 0;
			
			try {
				con = DriverManager.getConnection(url, user, password); //db에 연결
				
				ps = con.prepareStatement(sql); //만들고
				
				result = ps.executeUpdate(); //실행 메소드
				
				//select를 했을 때 필요한 내용
//				rs = ps.executeQuery(); //실행
//				
//				ResultSetMetaData metaData = rs.getMetaData(); //result에서 메타 데이터 가져오기
//				
//				int columnCount = metaData.getColumnCount();
//				
//				while(rs.next()) {
//					map = new HashMap<String, Object>();
//					for(int i = 1; i <= columnCount; i++) {
//						map.put(metaData.getColumnName(i), rs.getObject(i)); //해쉬맵에 넣어 줌. 키는 컬럼 명. 메타데이터에 있는 getColumnName으로 컬럼명을 알아내서 저장
//					}
//				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if(rs != null) try {rs.close();} catch(Exception e) {}
				if(ps != null) try {ps.close();} catch(Exception e) {}
				if(con != null) try {con.close();} catch(Exception e) {}
			}
			
			return result;
		}
	
	
		/////////////////////////////////////////////////////////////////////
		
		
		//물음표 있는 int update 메소드
		public static int update(String sql, List<Object> param){
			int result = 0;

			try {
				con = DriverManager.getConnection(url, user, password); //db에 연결

				ps = con.prepareStatement(sql); //만들고
				for(int i = 0; i < param.size(); i++) {
					ps.setObject(i+1, param.get(i));
				}

				result = ps.executeUpdate(); //실행 메소드
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if(rs != null) try {rs.close();} catch(Exception e) {}
				if(ps != null) try {ps.close();} catch(Exception e) {}
				if(con != null) try {con.close();} catch(Exception e) {}
			}

			return result;
		}
	
	
	
}
