public class PrimeiroMenor
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int vet[] = new int[6];
        
        int i, j, count=0, menorN=0;
        
        for(i=0; i<6; i++)
        {
            vet[i] = scan.nextInt();
        }
        
        for(i=0; i<6; i++)
        {
            boolean menor = false;
            for(j=0; j<6; j++)
            {
                if(vet[i] <= vet[j])
                {
                    menor = true;
                    count++;
                }
                else
                {
                    menor = false;
                }
                
            }
            
            if(count > 5)
            {
                menorN = vet[i];
                break;
            }
            else
            {
                count =0;
            }
        }
        
        System.out.println(menorN);
    }
}