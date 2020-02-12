public class Mediana
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int quantidade, i, med2 = 0, med1 =0, aux=0, j;
        double med = 0;
        
        quantidade = scan.nextInt();
        int Mediana[] = new int[quantidade];
        
        for(i=0; i<quantidade; i++)
        {
            Mediana[i] = scan.nextInt();
        }
        
        for(i=0; i<quantidade-1; i++)
        {
            for(j=0; j<quantidade-1-i; j++)
            if(Mediana[j] > Mediana[j+1])
            {
                aux = Mediana[j];
                Mediana[j] = Mediana[j+1];
                Mediana[j+1] = aux;
            }
        }

        if(quantidade%2 == 0)
        {
            med1 = quantidade/2;
            med2 = med1 + 1;
            
            med = ((double)(Mediana[med1-1]+Mediana[med2-1])/2);
        }
        else
        {
            med1 = quantidade/2 + 1;
            med = Mediana[med1-1];
        }
        
        System.out.printf("%.2f\n" ,med);
    }
}