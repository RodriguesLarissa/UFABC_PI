public class Caixa2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int quantidade, i;
        float soma, preco;
        String exclusao;
        
        soma = 0;
        
        quantidade = scan.nextInt();
        
        for(i = 0; i < quantidade; i++)
        {
            exclusao = scan.next();
            preco = scan.nextFloat();
            
            if(exclusao.equals("O"))
            {
                soma = soma + preco;
            }
            else
            {
                soma = soma - preco;
            }
        }
        
        System.out.println(new DecimalFormat("0.00").format(soma));
    }
}