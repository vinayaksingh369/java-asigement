class fib{
    ;
    public static int getfib(int n) 
    {
        if (n==0)
        return 0;
        int i=1;
        int n0 = 0;
        int n1 = 1;
        int n2 = 1;
        while(i<=n-1){
            n2=n0+n1;
            n0=n1;
            n1=n2;
            i++;
        }
        return n2;
    }
}