import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	// StudentDAO 클래스에서 모든 데이터를 가져오는 메소드
	public List<StudentVO> fetch() {

		// 리턴할 리스트를 생성
		// 여러 개를 리턴할 경우, null을 리턴하지 않는 것이 좋다.
		// 왜냐하면 List는 특별한 경우가 아니라면 빠른 열거를 이용해서 접근하는데 null이면
		// NullPointerException 에러가 발생하기 때문이다.
		// 그래서 null을 만들지 않기 위해서 인스턴스를 생성해서 리턴한다.
		List<StudentVO> list = new ArrayList<StudentVO>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 드라이버 클래스 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 데이터 베이스 연결
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");

			// SQL 실행 객체 생성
			pstmt = con.prepareStatement(" select num, name, subject, score, age, gender " + " from student ");

			// SQL 실행
			rs = pstmt.executeQuery();

			while (rs.next()) {

				StudentVO vo = new StudentVO(rs.getString("num"), rs.getString("name"), rs.getString("subject"),
						rs.getInt("score"), rs.getInt("age"), rs.getString("gender"));
				list.add(vo);

			}

		} catch (Exception e) {

			// 예외 발생의 내용을 확인하기 위해서 작성
			System.out.println("읽기 오류 : " + e.getMessage());

			// 예외 발생의 위치를 확인하기 위해서 작성
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
			}
		}

		return list;

	}

}
