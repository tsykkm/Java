package basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTypeLearning {

	public static void main(String[] args) {
		// long
		long milliSec = System.currentTimeMillis();
		System.out.println(milliSec);

		// Date
		Date date = new Date();
		System.out.println("Date：" + date);
		// long値を取得
		System.out.println("getTime：" + date.getTime());
		System.out.println("Date(long)：" + new Date(milliSec));

		// Calendarクラス(abstract)
		//	インスタンス化できないクラス
		//	・抽象クラス(abstract宣言されたクラス)
		//	・publicコンストラクタがないクラス
		Calendar cal = Calendar.getInstance();
		// cal.setTime(date); // or cal.setTimeInMillis(milliSec); setTime()はvoid型
		System.out.println(cal.get(Calendar.YEAR));

		// simpledateformat
		SimpleDateFormat sdf = new SimpleDateFormat();
		String s = sdf.format(date);
		System.out.println(s);
		try {
			System.out.println(sdf.parse("aaaa"));
		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
