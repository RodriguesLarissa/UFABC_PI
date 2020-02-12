public class InverteMaxMin
{
    public static void main(String[] main)
    {
        Scanner scan = new Scanner(System.in);
        int quantidade, i, max = 0, min = 0, aux;

        quantidade = scan.nextInt();
        int vet[] = new int[quantidade];
        
        for(i=0; i< quantidade; i++)
        {
            vet[i] = scan.nextInt();
        }
        
        for(i=0; i < quantidade; i++)
        {
            if(i == 0)
            {
                max = 0;
            }
            else if(vet[max] < vet[i])
            {
                max = i;
            }
            
            if(i == 0)
            {
                min = 0;
            }
            else if(vet[min] > vet[i])
            {
                min = i;
            }
        }
        
        aux = vet[min];
        vet[min] = vet[max];
        vet[max] = aux;
        
        for(i=0; i < quantidade; i++)
        {
            if(i != quantidade-1)
            {
                System.out.print(vet[i] + " ");
            }
            else
            {
                System.out.println(vet[i]);
            }
        }
        
    }
}