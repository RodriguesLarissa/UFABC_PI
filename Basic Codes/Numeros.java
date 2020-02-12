public class Numeros
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        short numero;
        
        numero = 0;
        
        while(numero >= 0)
        {
            numero = scan.nextShort();
            if(numero >= 0)
            {
            System.out.println(resultado(numero));
            }
        }
    }
    
    public static String resultado(int numero)
    {
        int i, soma;
        soma = 0;
        i = 1;
        while (numero > i)
        {
            if(numero%i == 0)
            {
                soma += i;
            }
            i++;
        }
        
        if (soma > numero)
        {
            return("abundante");
        }
        else if (soma == numero)
        {
            return("perfeito");
        }
        else
        {
            return("deficiente");
        }
        
    }
}