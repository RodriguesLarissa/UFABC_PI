public class ElementosUnicos
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int quantidade, i, count=0;
        
        quantidade = scan.nextInt();
        int vet[] = new int[quantidade];
        int vet2[] = new int[quantidade];
        
        for(i=0; i<quantidade; i++)
        {
            vet[i] = scan.nextInt();
        }
        
        for(i=0; i<quantidade-1; i++)
        {
            boolean unico;
            if(vet[i] == vet[i+1])
            {
                unico = false;
            }
            else
            {
                unico = true;
            }
            
            if(i == 0 && unico == false)
            {
                vet2[i] = vet[i];
                count++;
            }
            else if(i == 0 && unico == true)
            {
                vet2[i] = vet[i];
                vet2[i+1] = vet[i+1];
                count += 2;
            }
            else if(unico == true)
            {
                vet2[count] = vet[i+1];
                count++;
            }
        }
        
        if(quantidade == 1)
        {
            vet2[0] = vet[0];
            count++;
        }
        
        for(i=0; i<count; i++)
        {
            System.out.println(vet2[i]);
        }
    }
}