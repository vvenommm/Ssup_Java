package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCTest {

	public static void main(String[] args) {
		
		//select를 해보자
		String sql = "select *"
				+ " from cart"
				+ " where cart_member = ?"; //어랏? 물음표가 있네?
		List<Object> param = new ArrayList<Object>(); //그리고 여러 줄이 출력 되겠네?
		param.add("a001");
		
		//위의 내용을 메소드에 넘겨주면 됨. 여러 줄에 물음표 있으니 selectList에 변수 2개인 메소드
		List<Map<String, Object>> list = JDBCUtil.selectList(sql, param);
		
		System.out.println(list);
		
		
		//insert일 때
		sql = "insert into cart values (?, ?, ?, ?)";
		param = new ArrayList<Object>();
		param.add("a001");
		param.add("2005040100001");
		param.add("P302000004");
		param.add("10");
		
		int result = JDBCUtil.update(sql, param);
		System.out.println(result);

	}

}
