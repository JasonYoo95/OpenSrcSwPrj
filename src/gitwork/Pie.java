package gitwork;

public class Pie {
	public static void main(String[] args) {
		double result = 0;
		for (int i = 1; i < 10000000; i++) {
			double n = (double)1/(2*i-1);
			if(i%2==0) n*=-1;
			result += n;
		}
		System.out.println("���� / 4 = "+result);
	}
}
