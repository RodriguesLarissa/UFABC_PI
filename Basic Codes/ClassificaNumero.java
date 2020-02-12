public class ClassificaNumero
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numero;
        int resultado;
        
        numero = scan.nextInt();
        
        if(numero%2 != 0)
        {
            resultado = 1;
        }
        else if(numero >= 2 && numero <= 5)
        {
            resultado = 0;
        }
        else if(numero <= 20)
        {
            resultado = 1;
        }
        else
        {
            resultado = 0;
        }
        
        System.out.println(resultado);
    }
}