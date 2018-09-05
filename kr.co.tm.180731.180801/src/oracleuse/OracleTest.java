package oracleuse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class OracleTest {

	public static void main(String[] args) {
		// 데이터 베이스 연결 변수
		Connection con = null;
		// SQL 실행 변수
		PreparedStatement pstmt = null;
		// 정수 입력 받기
		Scanner input = new Scanner(System.in);
		System.out.print("제거할 부서번호 : ");
		int deptno = input.nextInt();
		// 이전에 남아있던 Enter를 제거하기 위한 코드입니다.
		input.close();
		try {
			// 드라이버 클래스 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 데이터 베이스 연결
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			// Auto Commit 해제
			con.setAutoCommit(false);
			String sql = ("delete from dept where deptno = ?");
			// pstmt 생성 - 다른 데이터를 바인딩할 수 있는 PreparedStatement 생성
			pstmt = con.prepareStatement(sql);
			// 데이터 바인딩
			pstmt.setInt(1, deptno);
			// SQL 실행
			// 실행하고 나면 영향받은 행의 개수를 리턴, 조건에 맞는 데이터가 없으면 실패하는게 아니고 삭제하는 행의 개수가 0
			// 실패하면 예외가 발생하므로 Catch로 간다.
			int r = pstmt.executeUpdate();
			if (r > 0) {
				System.out.println(deptno + "번 데이터가 삭제되었습니다.");
				con.commit();
			} else {
				System.out.println("조건에 맞는 데이터가 없습니다.");
			}
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (Exception e1) {
			}
			// 예외의 내용을 출력
			System.out.println(e.getMessage());
			// 예외가 발생한 지점을 역추적
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
			}

		}

	}

}
