public class Caixa
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        long i, quantidade;
        float preco, soma;
        
        quantidade = scan.nextLong();
        i = 0;
        soma = 0;
        
        while(i < quantidade)
        {
            preco = scan.nextFloat();
            soma = soma + preco;
            i++;
        }
        
        System.out.println(new DecimalFormat("0.00").format(soma));
    }
}