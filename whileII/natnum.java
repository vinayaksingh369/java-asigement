package programingp2;

public class natnum {
	public static void main(String[] args) {
		int sum =getsum(5);
		System.out.println(sum);
	}
	public static int getsum(int n) {
		int sum =0;
		int i=1;
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		return sum;
	}

}
