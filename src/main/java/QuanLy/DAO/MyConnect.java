package QuanLy.DAO;

import MyCustom.MyDialog;
import com.mysql.jdbc.Driver;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class MyConnect {

    public static Connection conn = null;
    private String severName;
    private String dbName;
    private String userName;
    private String password;

    public MyConnect() {
        docFileText();
        String strConnect = "jdbc:mysql://localhost:3306/quanlycuahang";
        Properties pro = new Properties();
        pro.put("user", "root");
        pro.put("password", "");
        try {
            com.mysql.jdbc.Driver driver = new Driver();
            conn = driver.connect(strConnect, pro);
            System.out.println("s" + conn);
        } catch (SQLException ex) {
            System.out.println(ex);
            new MyDialog("Không kết nối được tới CSDL!", MyDialog.ERROR_DIALOG);
            System.exit(0);
        }
    }

    private void docFileText() {
        // Xử lý đọc file để lấy ra 4 tham số
        severName = "";
        dbName = "";
        userName = "";
        password = "";

        try {
            FileInputStream fis = new FileInputStream("ConnectVariable.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            severName = br.readLine();
            dbName = br.readLine();
            userName = br.readLine();
            password = br.readLine();

            if (password == null) {
                password = "";
            }

        } catch (Exception e) {
        }
    }

    public static Connection getConn() {
        return conn;
    }
}
