public class MDC
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int valorA, valorB, i, resultado, resultado2, resposta;
        
        i = 1;
        valorA = scan.nextInt();
        valorB = scan.nextInt();
        resposta = 0;
        
        while((i <= valorA) && (i <= valorB))
        {
            resultado = valorA%i;
            resultado2 = valorB%i;
            if((resultado == 0) && (resultado2 == 0))
            {
                resposta = i;
            }
            i++;
        }
        
        System.out.println(resposta);
    }
}