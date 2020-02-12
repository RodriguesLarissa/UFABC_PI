public class Aposentadoria
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int sexo;
        int idade;
        int tempoContribuicao;
        
        sexo = scan.nextInt();
        idade = scan.nextInt();
        tempoContribuicao = scan.nextInt();
        
        if(sexo == 0)
        {
            if((idade >= 65 && tempoContribuicao >= 10) || (idade>= 63 && tempoContribuicao >= 15))
            {
                System.out.println("Aposentavel");
            }
            else
            {
                System.out.println("Nao Aposentavel");
            }
        }
        else if(sexo == 1)
        {
            if((idade >= 63 && tempoContribuicao >= 15) || (idade >= 61 && tempoContribuicao >= 15))
            {
                System.out.println("Aposentavel");
            }
            else
            {
                System.out.println("Nao Aposentavel");
            }
        }
        
    }
}