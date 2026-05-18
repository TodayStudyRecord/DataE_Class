package Ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C01DBConn {

	public static void main(String[] args) {
		//DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/opendatadb";
		
		//JDBC 참조변수
		Connection conn = null; 			// DMBS의 특정 DB와 연결되는 객체
		PreparedStatement pstmt = null;		// SQL Query 전송용 개체
		ResultSet rs = null; 				// Select 결과물을 담을 객체
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success...");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB CONNECTED...");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {conn.close();}catch(Exception e2) {e2.printStackTrace();}
		}
		
		
	}

}
