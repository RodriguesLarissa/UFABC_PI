public class Pares
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numero, resposta;
        
        numero = 1;
        
        while (numero >= 0)
        {
        numero = scan.nextInt();
        System.out.println(resposta(numero));
        }
        
    }
    
    public static int resposta(int numero)
    {
        int n, soma;
        
        soma = 0;
        n = 0;
        
        if(numero == 0)
        {
            soma += 1;
        }
        
        while(numero > 0)
        {
            n = numero%2;
            numero = numero/10;
            
            if(n == 0)
            {
                soma += 1;
            }
            
        }
        
        return soma;

    }
}