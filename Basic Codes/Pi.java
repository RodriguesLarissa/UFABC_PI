public class Pi
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int i, N;
        double X, Y, M = 0, PI;
        N = scan.nextInt();
        
        for(i = 0; i < N; i++)
        {
            X = Math.random();
            Y = Math.random();
            
            if((Math.sqrt((0.5-X)*(0.5-X) + (0.5-Y)*(0.5-Y)) <= 0.5))
            {
                M += 1;
            }
        }
        
        PI = (4*M)/N;
        
        System.out.printf("%f", PI);
    }
}