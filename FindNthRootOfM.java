package generalPrograms;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

public class FindNthRootOfM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		while(test-->0)

		{

		int d = sc.nextInt();

		int m = sc.nextInt();

		int y = sc.nextInt();

		LocalDate ldate = LocalDate.of(y,m,d);

		DayOfWeek day = ldate.getDayOfWeek();

		String s = day.toString().toLowerCase();

		s = s.substring(0,1).toUpperCase()+s.substring(1);

		System.out.println(s);

		}
		
}
}