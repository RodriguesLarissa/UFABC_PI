public class ElementosPares
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int quantidade, i, count = 0;
        
        quantidade = scan.nextInt();
        int vet[] = new int[quantidade];
        int vetPar[] = new int[quantidade];
        
        for(i=0; i<quantidade; i++)
        {
            vet[i] = scan.nextInt();
        }
        
        for(i=0; i<quantidade; i++)
        {
            if(vet[i]%2 == 0)
            {
                vetPar[count] = vet[i];
                count++;
            }
        }
        
        for(i=0; i<count; i++)
        {
            System.out.print(vetPar[i] + " ");
        }
        
        System.out.println(count);
     }
}