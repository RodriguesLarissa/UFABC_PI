public class EliminaRepete
{
    public static void main(String[] main)
    {
        Scanner scan = new Scanner(System.in);
        int quantidade, i, n, count = 0;

        quantidade = scan.nextInt();
        int vet[] = new int[quantidade];

        for(i=0; i < quantidade; i++)
        {
            vet[i] = scan.nextInt();
        }
        
        int vet2[] = new int[quantidade];
        
        
        for(i=0; i < quantidade; i++)
        {
            boolean naoRepetido = true;   
            for(n=0; n< quantidade; n++)
            {
                if(i == 0)
                {
                    naoRepetido = true;
                }
                else if(vet2[n] == vet[i])
                {
                    naoRepetido = false;
                }
            }

            
            n = i;
            
            if(naoRepetido)
            {
                vet2[count] = vet[i];    
                count++;
            }
        }
        
        for(n=0; n < count; n++)
        {
            if(n != count-1)
            {
                System.out.print(vet2[n] + " ");
            }
            else
            {
                System.out.println(vet2[n]);
            }
        } 
    
    }
}
© 2020 GitHub, Inc.