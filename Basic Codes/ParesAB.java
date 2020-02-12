public class ParesAB
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a, b, i, temp;
        
        a = scan.nextInt();
        b = scan.nextInt();
        
        
        if(a > b)
        {
            temp = a;
            a = b;
            b = temp;
        }
        
        i = a;

        
        while (i < b)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(b);
    }
}