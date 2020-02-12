public class IndicesPares
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int quantidade, i, count=0, pares=0;
        
        quantidade = scan.nextInt();
        int vet[] = new int[quantidade];
        int vet2[] = new int[quantidade];
        
        for(i=0; i<quantidade; i++)
        {
            vet[i] = scan.nextInt();
        }
        
        for(i=0; i<quantidade; i++)
        {
            if(i%2 == 0)
            {
                vet2[count] = vet[i];
                count++;
            }
            if(vet[i]%2 ==0)
            {
                pares++;
            }
        }
        
        for(i=0; i<count; i++)
        {
            System.out.print(vet2[i] + " ");
        }
        
        System.out.println(pares);
    }
}