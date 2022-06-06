package test1;

import java.util.Scanner;
import java.io.*;

public class Q3 {
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
		writefile(data);
		System.out.println("----------------------------\n");
		System.out.println("ReadFile");
		readfile();
		sc.close();
	}
	
	public static void writefile(String[] data) {
		String fileName = "UserCar.txt";
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(fileName));
			for(int i=0;i<data.length;i++) {
				bw.write(data[i]+"\n");
			}
			bw.flush();
			bw.close();
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void readfile() {
		String fileName = "UserCar.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
