package oracleuse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DeptRead1 {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		// select 구문의 결과를 저장하기 위한 변수
		ResultSet rs = null;

		try {
			// 오라클 드라이버 클래스 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 데이터 베이스 연결
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("접속 성공");
			// SQL 실행 객체 생성
			pstmt = con.prepareStatement("select deptno, dname, loc from dept");
			String sql = "select deptno, dname, loc from dept";
		
			// select하는 sql 실행
			rs = pstmt.executeQuery(sql);
			
			// 데이터 전체 읽기
			while (rs.next()) {
				System.out.print(rs.getInt("deptno")+":");
				System.out.print(rs.getString("dname")+":");
				System.out.print(rs.getString("loc")+"\n");
			}
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
			}
		}

	}

}
