public class OrdenaBubble
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int quantidade, trocas = 0, i, j, aux, n;
        
        quantidade = scan.nextInt();
        int vet[] = new int[quantidade];
        
        for(i=0; i<quantidade; i++)
        {
            vet[i] = scan.nextInt();
        }
        
        for(i=0; i<quantidade; i++)
        {
            if(i != quantidade-1)
            {
                System.out.print(vet[i] + " ");
            }
            else
            {
                System.out.println(vet[i]);
            }
        }
        
        for(i=0; i<quantidade-1; i++)
        {
            for(j=0; j<quantidade-1-i; j++)
            {
                if(vet[j] > vet[j+1])
                {
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                    
                    for(n=0; n<quantidade; n++)
                    {
                        if(n != quantidade-1)
                        {
                            System.out.print(vet[n] + " ");
                        }
                        else
                        {
                            System.out.println(vet[n]);
                        }
                    }
                    
                    trocas++;
                }
            }
        }
            
            for(i=0; i<quantidade; i++)
            {
                if(i != quantidade-1)
                {
                    System.out.print(vet[i] + " ");
                }
                else
                {
                    System.out.println(vet[i]);
                }
            }
            
        
        System.out.println("Trocas: " + trocas);
    }
}