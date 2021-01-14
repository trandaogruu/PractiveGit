package single.responsibility.cohension.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentRepository {

    public boolean saveToDatabase() throws SQLException {
        String url = "jdbc:msql://xxx.yyyy.zzz.lll:3306/Demo";
        Connection conn = DriverManager.getConnection(url, "", "");
        Statement st = conn.createStatement();
        st.executeUpdate("INSERT INTO Customers " +
                "VALUES (1001, 'Simpson', 'Mr.', 'Springfield', 2001)");

        return true;
    }
}
