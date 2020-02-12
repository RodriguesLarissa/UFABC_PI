public class Ordenado
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext())
        {
            int quantidade, i, soma1 = 0, soma2 = 0;
            quantidade = scan.nextInt();
            int vet[] = new int[quantidade];
            
            for(i=0; i<quantidade; i++)
            {
                vet[i] = scan.nextInt();
            }
            
            for(i=0; i<quantidade-1;i++)
            {
                if(vet[i] > vet[i+1])
                {
                    soma1 += 1;
                }
                else if(vet[i] < vet[i+1])
                {
                    soma2 +=1;
                }
                else
                {
                    soma1 += 1;
                    soma2 += 1;
                }
            }
            
            if(soma1 == quantidade-1 || soma2 == quantidade-1 || quantidade == 0)
            {
                System.out.println("S");
            }
            else{
                System.out.println("N");
            }
        }
    }
}