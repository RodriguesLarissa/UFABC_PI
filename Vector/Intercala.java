public class Intercala
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int quantidade1, quantidade2, i, j, n = 0, m = 0;
        
        quantidade1 = scan.nextInt();
        quantidade2 = scan.nextInt();
        
        int vet[] = new int[quantidade1+quantidade2];
        int vet1[] = new int[quantidade1];
        int vet2[] = new int[quantidade2];
        
        for(i=0; i<quantidade1+quantidade2; i++)
        {
            vet[i] = scan.nextInt();
        }
        
        for(i=0; i<quantidade1; i++)
        {
            vet1[i] = vet[i];
        }
        
        for(j=0; j<quantidade2; j++)
        {
            vet2[j] = vet[i];
            i++;
        }
        
        for(i=0; n<quantidade1 && m<quantidade2; i++)
        {
            if(vet1[n] < vet2[m] || (vet1[n] == vet2[m] && quantidade1 > quantidade2))
            {
                vet[i] = vet1[n];
                n++;
            }
            else if(vet2[m] < vet1[n] || (vet1[n] == vet2[m] && quantidade2 > quantidade1))
            {
                vet[i] = vet2[m];
                m++;
            }
        }
        
        while(n != quantidade1)
        {
            vet[i] = vet1[n];
            i++;
            n++;
        }
        
        while(m != quantidade2)
        {
            vet[i] = vet2[m];
            i++;
            m++;
        }
        
        for(i=0; i<quantidade1+quantidade2; i++)
        {
            System.out.println(vet[i]);
        }
        
    }
}