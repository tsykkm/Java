package business.training;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampMain {

	public static void main(String[] args) {
		long lng = System.currentTimeMillis();
		Date date = new Date();
		System.out.println("LONG = " + lng); // 1523461659849
		System.out.println("DATE = " + date); // Thu Apr 12 00:43:39 JST 2018
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println("DATETIME = " + sdf.format(date)); // 2018/04/12 00:43:39
		Timestamp timestamp = new Timestamp(lng);
		System.out.println("TIMESTAMP = " + timestamp);
	}

}
