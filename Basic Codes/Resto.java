public class Resto
{
    public static void main(String[] args)
    {
        int a, b, r, soma;
        Scanner scan = new Scanner(System.in);
        
        a = scan.nextInt();
        b = scan.nextInt();
        r = a;
        
        while(r > b)
        {
            r = r/b;
        }
        
        soma = a - (r*b);
        
        System.out.println(soma);
        System.out.println(a%b);
    }
}