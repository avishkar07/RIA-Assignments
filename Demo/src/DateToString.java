import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {

	public static void main(String[] args) {

		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateToString = dateFormat.format(date);
		System.out.println(dateToString);
	}
}
