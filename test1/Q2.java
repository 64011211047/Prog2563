package test1;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of user: ");
		int numUser = sc.nextInt();
		String[] data = new String[numUser];
		for(int i=0;i<numUser;i++) {
			System.out.println("----------------------------");
			sc.nextLine();
			System.out.println("User "+(i+1));
			System.out.print("Input IDcar: ");
			String idcar = sc.nextLine();
			System.out.print("Input cc: ");
			String cc = sc.next();
			data[i] = "IDcar: "+idcar+" , cc: "+cc+" cc";
		}
		System.out.println("----------------------------\n");
		for(int i=0;i<numUser;i++) {
			System.out.println((i+1)+") "+data[i]);
		}
		sc.close();
	}
}
