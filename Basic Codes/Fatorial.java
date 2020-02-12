public class Fatorial
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        long numero, resposta;
        
        resposta = 1;
        numero = scan.nextLong();
        
        while(numero != 0)
        {
            resposta = resposta * numero;
            numero --;
        }
        
        System.out.println(resposta);
    }
}