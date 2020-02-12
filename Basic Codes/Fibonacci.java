public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int termo, i, ant, atu, prox;
        
        termo = scan.nextInt();
        ant = 1;
        atu = 0;
        prox = 0;
        
        for(i=1; termo > i;i++)
        {
            prox = ant + atu;
            ant = atu;
            atu = prox; 
        }
        
        System.out.println(atu);
    }
}