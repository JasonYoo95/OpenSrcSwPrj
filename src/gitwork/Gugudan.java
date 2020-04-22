package gitwork;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0) {
			for (int i = 2; i < 10; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.print(i+"*"+j+"="+i*j+"\t");
				}
				System.out.println();
			}
			return;
		}
		for (int i = 1; i < 10; i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
}
