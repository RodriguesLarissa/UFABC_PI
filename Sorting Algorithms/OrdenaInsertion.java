public class OrdenaInsertion
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int quantidade, i, j, conta=0, aux, n;
        
        quantidade = scan.nextInt();
        int vet[] = new int[quantidade];
        
        for(i=0; i<quantidade; i++)
        {
            vet[i] = scan.nextInt();
        }
        
        for(i=0; i<quantidade; i++)
        {
            if(i < quantidade-1)
            {
                System.out.print(vet[i] + " ");
            }
            else
            {
                System.out.println(vet[i]);
            }
        }
        
        for(i=0; i<quantidade; i++)
        {
            for(j=i-1; j>=0 && vet[j] > vet[i]; j--)
            {
                aux = vet[j];
                vet[j] = vet[i];
                vet[i] = aux;
                conta++;
                
                for(n=0; n<quantidade; n++)
            {
                if(n < quantidade-1)
                {
                    System.out.print(vet[n] + " ");
                }
                else
                {
                    System.out.println(vet[n]);
                }
            }
            }
            
            
        }
        
        for(i=0; i<quantidade; i++)
        {
            if(i < quantidade-1)
            {
                System.out.print(vet[i] + " ");
            }
            else
            {
                System.out.println(vet[i]);
            }
        }
        
        System.out.println("Trocas: " + conta);
        
        
    }
}