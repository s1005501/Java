package DB連線搭配簡易UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBConnectTest {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// 連結到DB
		// 參數第一個是Database Connections裡的DB右鍵內容裡的URL，第二個是DB的userName，第三個是DB的密碼
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/javawebpracticedb", "kevin",
				"password");

		// 檢查是否有連結成功
		if (c != null) {
			System.out.println("Connecting to the database!");
		} else {
			System.out.println("Can't connecting to the database!");
		}

		// 設定要執行的sql?
		String sql_statement = "Select * From video";
		PreparedStatement pps = c.prepareStatement(sql_statement);

		// 執行sql並將結果存在rs變數裡
		ResultSet rs = pps.executeQuery();

		ArrayList<Video> result = new ArrayList<>();

		while (rs.next()) {
			// ResultSet裡的資料可以透過getString、getInt取出來，參數給db table裡的欄位名稱
			// System.out.println(rs.getString("videoName"));

			Video v = new Video(Integer.parseInt(rs.getString("videoId")), rs.getString("videoName"),
					Integer.parseInt(rs.getString("price")));
			result.add(v);
		}

		for (Video v : result) {
			System.out.println(v.toString());
		}

		// 最後記得要把connection給關起來，不然如果一直開沒關的話會不知不覺吃掉很多電腦資源
		c.close();
	}
}
