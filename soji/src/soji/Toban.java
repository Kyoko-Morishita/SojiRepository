package soji;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Toban {

	public Toban() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] student = { "1：Aさん", "2：Bさん", "3：Cさん", "4：Dさん", "5：Eさん",
				"6：Fさん", "7：Gさん", "8：", "9：", "10：",
				"11：", "12：", "13：", "14：", };
		int months = 0;
		int year = 0;
		final int GROUP = 4;
		

		GregorianCalendar gcalendar = new GregorianCalendar();

		System.out.print("日付： ");
		System.out.print(year = gcalendar.get(Calendar.YEAR));
		System.out.print("年 ");
		System.out.print(months = gcalendar.get(Calendar.MONTH)+1);
		System.out.println("月" + gcalendar.get(Calendar.DATE) + "日");

		System.out.print("現在時刻： ");
		System.out.print(gcalendar.get(Calendar.HOUR) + ":");
		System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
		System.out.println(gcalendar.get(Calendar.SECOND));
		
		for(int i = 0; i < student.length; i++) {
			
		}

	}

}
