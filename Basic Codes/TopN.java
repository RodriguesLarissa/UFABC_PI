public class TopN
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n, N;
        
        n = scan.nextInt();
        
        if(n == 1)
        {
            N = 1;
        }
        else if(n > 1 && n <=3)
        {
            N = 3;
        }
        else if(n<=5)
        {
            N = 5;
        }
        else if(n<=10)
        {
            N = 10;
        }
        else if(n<=25)
        {
            N = 25;
        }
        else if(n<=50)
        {
            N = 50;
        }
        else
        {
            N = 100;
        }
    
    System.out.println("Top " + N);
    }
}