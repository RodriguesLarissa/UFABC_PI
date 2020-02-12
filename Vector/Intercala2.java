public class Intercala2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int quantidade1, quantidade2, i, n = 0, j= 0;
        
        quantidade1 = scan.nextInt();
        quantidade2 = scan.nextInt();
        
        int vet1[] = new int[quantidade1];
        int vet2[] = new int[quantidade2];
        int vet3[] = new int[quantidade1+quantidade2];
        
        for(i=0; i<quantidade1; i++)
        {
            vet1[i] = scan.nextInt();
        }
        
        for(i=0; i<quantidade2; i++)
        {
            vet2[i] = scan.nextInt();
        }
        
        for(i=0; j<quantidade1 && n<quantidade2; i++)
        {
            if(vet1[j] < vet2[n] || ((vet2[n] == vet1[j]) && (quantidade1 >= quantidade2)))
            {
                vet3[i] = vet1[j];
                j++;
            }
            else if(vet2[n] < vet1[j] || ((vet2[n] == vet1[j]) && (quantidade2 > quantidade1)))
            {
                vet3[i] = vet2[n];
                n++;
            }
        }
        
        if(j != quantidade1)
        {
            while(i< quantidade1 + quantidade2)
            {
                vet3[i] = vet1[j];
                i++;
                j++;
            }
        }
        else if(n != quantidade2)
        {
             while(i <quantidade1 + quantidade2)
            {
                vet3[i] = vet2[n];
                i++;
                n++;
            }
        }
        
        for(i=0; i<quantidade1+quantidade2; i++)
        {
            System.out.println(vet3[i]);
        }
    }
}