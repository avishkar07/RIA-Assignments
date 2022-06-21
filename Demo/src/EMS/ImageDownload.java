package EMS;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Blob;

public class ImageDownload {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		String url = "jdbc:mysql://localhost:3306/ria_advisory";
		String username = "root";
		String password = "root";

		Connection connection = DriverManager.getConnection(url, username, password);
		String query = "SELECT * from image where id =5 ;";

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(query);

		String fileName = null;
		InputStream binaryStream = null;

		while (resultSet.next()) {
			fileName = resultSet.getString(2);
			Blob blob = (Blob) resultSet.getBlob(3);
			binaryStream = blob.getBinaryStream();
		}
		File file = new File(fileName);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);
		int r = binaryStream.read();
		while (r != -1) {

			bos.write(r);
			r = binaryStream.read();
			System.out.println("file");
		}
		System.out.println("file downloaded");

	}
}
