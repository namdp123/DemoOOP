package Hello;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;


public class TheFirst {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Cong 2 so tu nhap
		System.out.println("Day la phep cong cua 2 so");
		double soA = 0;
		double soB = 0;
		int t=0;
		Scanner Nhap = new Scanner(System.in);
		String srt;
		do {
			System.out.println("Vui long nhap so dau tien");
			srt = Nhap.nextLine();
			Pattern pattern = Pattern.compile("[+-]?([0-9]*[.])?[0-9]+");
			Matcher matcher = pattern.matcher(srt);
			if(matcher.matches())
			{
				soA = Double.parseDouble(srt);
				t = 1;
				
			}
			else
			{
				System.out.println("Ban vua nhap khong phai la so, yeu cau nhap lai");
			}
		}while(t != 1);
		do {
			
		System.out.println("Nhap so thu 2");
		srt = Nhap.nextLine();
		Pattern pattern = Pattern.compile("[+-]?([0-9]*[.])?[0-9]+");
		Matcher matcher = pattern.matcher(srt);
		if(matcher.matches())
		{
			soB = Double.parseDouble(srt);
			t=2;
		}
		else
			System.out.println("Ban vua nhap khong phai la so, vui long nhap lai so thu 2");
		}while(t != 2);
		double tong = soA + soB ;
		System.out.println("Tong cua hai so "+soA+" va "+soB+" la:"+tong);
	
	}
	/*public static float Cong() {
		
		
	}*/

}
