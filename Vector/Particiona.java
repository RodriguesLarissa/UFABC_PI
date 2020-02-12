public class Particiona
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int quantidade, i, particiona, aux = 0;
        
        quantidade = scan.nextInt();
        int vet[] = new int[quantidade];
        
        particiona = scan.nextInt();
        
        for(i=0; i<quantidade; i++)
        {
            vet[i] = scan.nextInt();
        }
        
        for(i=0; i<quantidade; i++)
        {
            if((vet[i] > vet[particiona] && i < particiona) || (vet[i] < vet[particiona] && i > particiona)) 
            {
                aux = vet[particiona];
                vet[particiona] = vet[i];
                vet[i] = aux;
                particiona = i;
                i = 0;
            }
        }
        
        for(i=0; i<quantidade; i++)
        {
            System.out.println(vet[i]);
        }

    }
}