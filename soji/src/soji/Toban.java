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
				"6：Fさん", "7：Gさん", "8：Hさん", "9：Iさん", "10：Jさん",
				"11：Kさん", "12：Lさん", "13：Mさん", "14：Nさん", };
		int months = 0;
		int year = 0;
		final int GROUP = 4;
		String team = new String[GROUP];
		int er = 0;
		int er2 = 0;
		

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
		
		for(int i = 0; i < GROUP; i++) {
			team[i] = student[i];
		}
		
		System.out.println("今日の当番は" + Arrays.toString(team));
		
		for(int i = 0; i < student.length; i++) {

			try{student[i] = student[i+GROUP];
			}catch(IndexOutOfBoundsException e) {
				er = i
				for(i = i; i < student.length; i++)
					er2 = i;
					student[i] = student[er2 - er];		
			}
		}
		
		for(int i = 0; i < GROUP; i++) {
			team[i] = student[i];
		}
		
		System.out.println("来週の当番は" + Arrays.toString(team));

	}

}
