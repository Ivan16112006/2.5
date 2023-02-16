import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int hm = 17000000;
		int hz = 35000000;
		double gz = 9.8;
		double gm = 3.7;
		int mz = 1;
		int tz = 100;
		int tm;
		System.out.println("Какая масса груза на марсе?");
		Scanner a = new Scanner(System.in);
		int mm = a.nextInt();
		
		tm = tz*mm*gm*hm/(mz*gz*hz);
		tm = (int)Math.ceil(tm);
		System.out.println("Для поднятия груза массой "+mm+"кг нужно топливо массой "+tm+"кг");
		
	}
}