public class NumeroLouco
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numero, n1, n2, resposta;
        
        numero = scan.nextInt();
        
        n1 = numero/100;
        n2 = numero%100;
        
        resposta = n1 + n2;
        
        if((resposta*resposta) == numero)
        {
            System.out.println("OK");
        }
        else
        {
            System.out.println("NOK");
        }
    }
}