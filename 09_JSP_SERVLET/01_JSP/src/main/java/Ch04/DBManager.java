package Ch04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBManager {

    private  DBManager() {}

    public static Connection getConnection() throws SQLException {
	
        String driver   = "com.mysql.cj.jdbc.Driver";
        String url      = "jdbc:mysql://localhost:3306/SampleDB?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
        String user     = "root";
        String password = "1234";		
        
        // TODO 2) Class.forName(driver)
        //fwoiejowiejiof
    
        try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			throw new RuntimeException("DBManager's getConnection() Class.forName..."+e.getCause());
		} 
        
        return DriverManager.getConnection(url, user, password);

    }

    /** AutoCloseable 자원 여러 개 안전 close */
    public static void close(AutoCloseable... closeables) {
        // TODO: for-each + null 체크 + try { c.close(); } catch (Exception ignored) {}
    	for(AutoCloseable c : closeables ) {
    		if(c!=null) {
    			try {
					c.close();
    			} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    	}
    	
    }
}