package C09NetWorking;
import java.io.*;
import java.net.*;
import java.nio.charset.*;
import java.sql.*;

// 가장 db에 접근해서 가져오는 오래된 기술 : jdbc
public class C03DbConnect {
    public static void main(String[] args) throws IOException, SQLException {
        //        mysql드라이버 별도 다운로드 및 추가
//        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
        String url = "jdbc:mysql://localhost:3307/board?useSSL=false"; // board << 스키마명
        String userName = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection(url, userName, password);

//        Statement객체에 쿼리를 담아 db에 전달
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select * from post where id=1"); // 쿼리를 db로 전송

//        rs.next()를 통해 데이터를 1row씩 read
        while (rs.next()) {
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("title"));
            System.out.println(rs.getString("contents"));
        }

        connection.close();
    }
}







