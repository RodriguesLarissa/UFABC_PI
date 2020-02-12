public class Perfeito
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numero, i, soma;
        
        soma = 0;
        numero = scan.nextInt();
        
        for(i = 1; i < numero; i++)
        {
            if(numero%i == 0)
            {
                soma += i;
            }
        }
        
        if(soma == numero)
        {
            System.out.println("SIM");
        }
        else
        {
            System.out.println("NAO");
        }
    }
}