package single.responsibility.cohension.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
    int id;
    String name;
    int age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean saveToDatabase() throws SQLException {
        String url = "jdbc:msql://xxx.yyyy.zzz.lll:3306/Demo";
        Connection conn = DriverManager.getConnection(url, "", "");
        Statement st = conn.createStatement();
        st.executeUpdate("INSERT INTO Customers " +
                "VALUES (1001, 'Simpson', 'Mr.', 'Springfield', 2001)");

        return true;
    }
}
