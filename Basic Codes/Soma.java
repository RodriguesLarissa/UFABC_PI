public class Soma
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a, b, res, i;
        
        a = scan.nextInt();
        b = scan.nextInt();
        
        i = 0;
        res = a;
        
        while(i<b)
        {
            res++;
            i++;
        }
        System.out.println(res);
    }
}