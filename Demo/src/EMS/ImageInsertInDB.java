package EMS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class ImageInsertInDB {
	public static void main(String[] args) throws SQLException, FileNotFoundException {

		String url = "jdbc:mysql://localhost:3306/Ria_advisory";
		String usr = "root";
		String pass = "root";

		Connection connection = DriverManager.getConnection(url, usr, pass);

		String query = "INSERT INTO image values (?,?,?);";

		PreparedStatement statement = connection.prepareStatement(query);
		String path = "C:\\Users\\AvishkarMulik\\Downloads\\profile.png";
		File file = new File(path);
		FileInputStream fileInputStream = new FileInputStream(file);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the ID :");
		int ID = scanner.nextInt();
		statement.setInt(1, ID);
		statement.setString(2, file.getName());
		statement.setBinaryStream(3, fileInputStream, (int) file.length());

		int update = statement.executeUpdate();
		System.out.println(" file uploaded");
	}
}
