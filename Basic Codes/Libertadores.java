public class Libertadores
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int i, quantidade, time11, time21, time12, time22, time1, time2, saldo;
        String x;

        quantidade = scan.nextInt();

        for(i=0; quantidade > i; i++)
        {
            time11 = scan.nextInt();
            x = scan.next();
            time21 = scan.nextInt();
            
            time22 = scan.nextInt();
            x = scan.next();
            time12 = scan.nextInt();
            
            time1 = time11 + time12;
            time2 = time21 + time22;
            
            saldo = time1 - time2;
            
            if(time1 > time2)
            {
                System.out.println("Time 1");
            }
            else if(time2 > time1)
            {
                System.out.println("Time 2");
            }
            else
            {
                if(saldo > 0)
                {
                    System.out.println("Time 1");
                }
                else if(saldo != 0)
                {
                    System.out.println("Time 2");
                }
                else
                {
                    if(time12 > time21)
                    {
                        System.out.println("Time 1");
                    }
                    else if(time21 > time12)
                    {
                        System.out.println("Time 2");
                    }
                    else
                    {
                        System.out.println("Penaltis");
                    }
                }
            }
        }
    }
}