package programingp2;

public class sumoddnum {
	public static void main(String[] args) {
		int sum=getSumodd(10);
		System.out.println("= "+sum);
	}
	public static int getSumodd(int n) 
	{
		int sum=0;
		int i=1;
		while(i<=n) {
//		if(i%2!=0) 
//		{
			sum=sum+i;
			System.out.print(i+"  ");
			System.out.println(sum+" , ");
//		}
		i++;
		}
	
	return sum;
	}

}
