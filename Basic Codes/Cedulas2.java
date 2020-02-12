public class Cedulas2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        long valor, valor2, n100, n50, n20, n10, n5, n2, n1;

        valor = scan.nextLong();
        valor2 = valor;
        n100 = valor/100;
        valor = valor%100;
        n50 = valor/50;
        valor = valor%50;
        n20 = valor/20;
        valor = valor%20;
        n10 = valor/10;
        valor = valor%10;
        n5 = valor/5;
        valor = valor%5;
        n2 = valor/2;
        n1 = valor%2;
        
        System.out.println("R$" + valor2 + ".00");
        
        if(n100 != 0)
        {
        System.out.println(n100 + " nota(s) de R$100.00");
        }
        if(n50 != 0)
        {
        System.out.println(n50 + " nota(s) de R$50.00");
        }
        if(n20 != 0)
        {
        System.out.println(n20 + " nota(s) de R$20.00");
        }
        if(n10 != 0)
        {
        System.out.println(n10 + " nota(s) de R$10.00");
        }
        if(n5 != 0)
        {
        System.out.println(n5 + " nota(s) de R$5.00");
        }
        if(n2 != 0)
        {
        System.out.println(n2 + " nota(s) de R$2.00");
        }
        if(n1 != 0)
        {
        System.out.println(n1 + " nota(s) de R$1.00");
        }
    }
}