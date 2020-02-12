public class OrdenadoDecrescente
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext())
        {
            int quantidade, i, soma =0;
            quantidade = scan.nextInt();
            int vet[] = new int[quantidade];
            
            for(i=0; i<quantidade; i++)
            {
                vet[i] = scan.nextInt();
            }
            
            for(i=0; i<quantidade-1; i++)
            {
                if(vet[i] > vet[i+1])
                {
                    soma++;
                }
            }
            
            if(soma == quantidade-1 || quantidade == 0)
            {
                System.out.println("S");
            }
            else
            {
                System.out.println("N");
            }
        }
    }
}