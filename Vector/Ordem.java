public class Ordem
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int i;
        byte quantidade, soma1 = 0, soma2 = 0;
        
        quantidade = scan.nextByte();
        byte vet[] = new byte[quantidade];
        
        for(i = 0; i < quantidade; i++)
        {
            vet[i] = scan.nextByte();
        }
        
        for(i = 1; i < quantidade; i++)
        {
            if(vet[i] < vet[i-1])
            {
                soma1 += 1;
            }
            else if(vet[i] > vet[i-1])
            {
                soma2 +=1;
            }
            else
            {
                soma1 += 1;
                soma2 += 1;
            }
            
        }
        
        if(soma1 == (quantidade - 1) || soma2 == (quantidade - 1))
        {
            System.out.println("SIM");
        }
        else
        {
            System.out.println("NAO");
        }
        
    }
}