package programingp2;

public class sumallevennum {

	public static void main(String[] args) {
		int sum = getEvensum(15);
		System.out.println(sum);
		System.out.println();

	}
	public static int getEvensum(int n) {
		int sum =0;
		int i=1;
		while(i<=n) {
			if(i%2==0) {
			//System.out.print(i+ " + ");
				sum=sum+i;
			}
			i++;
		}
//		System.out.println("= " + sum);
		return sum;
	}

}
