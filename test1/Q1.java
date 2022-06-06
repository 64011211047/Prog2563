package test1;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Input cc: ");
			int cc = sc.nextInt();
			if(cc>0 && cc<=600) {
				System.out.println(cc+" cc : "+cc*0.50+" baht");
			}
			else if(cc>600 && cc<=1800) {
				System.out.println(cc+" cc : "+cc*1.50+" baht");
			}
			else if(cc>1800) {
				System.out.println(cc+" cc : "+cc*4.00+" baht");
			}
			else {
				break;
			}
		}
		sc.close();
	}
}
